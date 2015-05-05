package oab.questions.activity;

import static oab.questions.data.OABContext.getOABContext;

import java.util.Collections;

import oab.questions.R;
import oab.questions.data.Exam20143T1Builder;
import oab.questions.data.ExamEthicsBuilder;
import oab.questions.model.Exam;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
	private static final String CLEAR = "clear";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		ButterKnife.inject(this);
	}
	
	@OnClick(R.id.btn_2014_3_T1)
	void onClickBtn2014_3_T1() {
		getOABContext().setExam(Exam20143T1Builder.create());
		start();		
	}
	
	@OnClick(R.id.btn_ethics)
	void onClickBtnEthics() {
		Exam exam = ExamEthicsBuilder.create();
		Collections.shuffle(exam.getQuestions());
		getOABContext().setExam(exam);
		start();		
	}
	
	private void start() {
		Intent intent = new Intent(MainActivity.this, QuestionActivity.class);
		intent.putExtra(CLEAR, true);
		startActivity(intent);
		
		finish();
	}
}
