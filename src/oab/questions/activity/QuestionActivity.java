package oab.questions.activity;

import static oab.questions.data.OABContext.getOABContext;

import java.util.List;
import java.util.Map;

import oab.questions.R;
import oab.questions.activity.animation.ResizeAnimation;
import oab.questions.model.Answer.Code;
import oab.questions.model.Exam;
import oab.questions.model.Question;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnClick;

public class QuestionActivity extends Activity {
	private static final int QUESTION_HEIGHT = 160;
	private static final int ANIMATION_LENGHT = 800;
	private static final int MIN_HEIGHT_ANSWER = 525;
	private static final int MAX_HEIGHT_ANSWER = 1080;
	private static final String CLEAR = "clear";
	private static final String INDEX = "index";
	
	@InjectViews({R.id.answer_A, R.id.answer_B, R.id.answer_C, R.id.answer_D})
	List<Button> answers;
	
	@InjectViews({R.id.btn_expand_answer_A, R.id.btn_expand_answer_B, R.id.btn_expand_answer_C, R.id.btn_expand_answer_D})
	List<ImageButton> expandAnswers;
	
	@InjectViews({R.id.container_A, R.id.container_B, R.id.container_C, R.id.container_D})
	List<RelativeLayout> containersAnswers;
	
	@InjectView(R.id.question)
	ScrollView question;
	
	@InjectView(R.id.btn_expand)
	Button btnExpand;
	
	@InjectView(R.id.txt_question)
	TextView txtQuestion;
	
	@InjectView(R.id.container_main)
	RelativeLayout containerMain;
	
	@InjectView(R.id.container_answers)
	LinearLayout containerAnswers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_question);
		
		ButterKnife.inject(this);
		
		if(getIntent().getBooleanExtra(CLEAR, false)) {
			SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
			sharedPref.edit().clear().commit();
		}
		
		buildUI();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.question, menu);
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		
		if (id == R.id.action_reset) {
			return terminate();
		} else if(id == R.id.action_next) {
			return next();
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	@OnClick(R.id.btn_expand)
	void onClickBtnExpand() {
		RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) question.getLayoutParams();
		ResizeAnimation a = new ResizeAnimation(question);
		a.setDuration(ANIMATION_LENGHT);
		
		int original = Float.valueOf(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, QUESTION_HEIGHT, 
				getResources().getDisplayMetrics())).intValue();
		
		if(lp.height == original) {
			a.setParams(original, containerMain.getHeight());
			question.startAnimation(a);
			btnExpand.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_collapse, 0, 0, 0);
		} else {
			a.setParams(lp.height, original);
			question.startAnimation(a);
			btnExpand.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_expand, 0, 0, 0);
		}
	}
	
	@OnClick(R.id.btn_expand_answer_A)
	void onClickBtnExpandAnswerA() {
		RelativeLayout containerA = containersAnswers.get(Code.A.code);
		ImageButton expandAnswerA = expandAnswers.get(Code.A.code);
		
		ResizeAnimation a = new ResizeAnimation(containerA);
		a.setDuration(ANIMATION_LENGHT);
		
		if(expandAnswerA.getDrawable().getConstantState()
				.equals(getResources().getDrawable(R.drawable.ic_action_expand).getConstantState())) {
			a.setParams(MIN_HEIGHT_ANSWER, MAX_HEIGHT_ANSWER);
			containerA.startAnimation(a);
			expandAnswerA.setImageResource(R.drawable.ic_action_collapse);
		} else {
			a.setParams(MAX_HEIGHT_ANSWER, MIN_HEIGHT_ANSWER);
			containerA.startAnimation(a);
			expandAnswerA.setImageResource(R.drawable.ic_action_expand);
		}
	}
	
	@OnClick(R.id.btn_expand_answer_B)
	void onClickBtnExpandAnswerB() {
		RelativeLayout containerB = containersAnswers.get(Code.B.code);
		ImageButton expandAnswerB = expandAnswers.get(Code.B.code);
		
		ResizeAnimation a = new ResizeAnimation(containerB);
		a.setDuration(ANIMATION_LENGHT);
		
		if(expandAnswerB.getDrawable().getConstantState()
				.equals(getResources().getDrawable(R.drawable.ic_action_expand).getConstantState())) {
			a.setParams(MIN_HEIGHT_ANSWER, MAX_HEIGHT_ANSWER);
			containerB.startAnimation(a);
			expandAnswerB.setImageResource(R.drawable.ic_action_collapse);
		} else {
			a.setParams(MAX_HEIGHT_ANSWER, MIN_HEIGHT_ANSWER);
			containerB.startAnimation(a);
			expandAnswerB.setImageResource(R.drawable.ic_action_expand);
		}
	}
	
	@OnClick(R.id.btn_expand_answer_C)
	void onClickBtnExpandAnswerC() {
		RelativeLayout containerC = containersAnswers.get(Code.C.code);
		ImageButton expandAnswerC = expandAnswers.get(Code.C.code);
		
		ResizeAnimation a = new ResizeAnimation(containerC);
		a.setDuration(ANIMATION_LENGHT);
		
		if(expandAnswerC.getDrawable().getConstantState()
				.equals(getResources().getDrawable(R.drawable.ic_action_expand).getConstantState())) {
			a.setParams(MIN_HEIGHT_ANSWER, MAX_HEIGHT_ANSWER);
			containerC.startAnimation(a);
			expandAnswerC.setImageResource(R.drawable.ic_action_collapse);
		} else {
			a.setParams(MAX_HEIGHT_ANSWER, MIN_HEIGHT_ANSWER);
			containerC.startAnimation(a);
			expandAnswerC.setImageResource(R.drawable.ic_action_expand);
		}
	}
	
	@OnClick(R.id.btn_expand_answer_D)
	void onClickBtnExpandAnswerD() {
		RelativeLayout containerD = containersAnswers.get(Code.D.code);
		ImageButton expandAnswerD = expandAnswers.get(Code.D.code);
		
		ResizeAnimation a = new ResizeAnimation(containerD);
		a.setDuration(ANIMATION_LENGHT);
		
		if(expandAnswerD.getDrawable().getConstantState()
				.equals(getResources().getDrawable(R.drawable.ic_action_expand).getConstantState())) {
			a.setParams(MIN_HEIGHT_ANSWER, MAX_HEIGHT_ANSWER);
			containerD.startAnimation(a);
			expandAnswerD.setImageResource(R.drawable.ic_action_collapse);
		} else {
			a.setParams(MAX_HEIGHT_ANSWER, MIN_HEIGHT_ANSWER);
			containerD.startAnimation(a);
			expandAnswerD.setImageResource(R.drawable.ic_action_expand);
		}
	}
	
	@OnClick(R.id.answer_A)
	void onClickAnswerA() {
		chooseAnswer(Code.A);
	}
	
	@OnClick(R.id.answer_B)
	void onClickAnswerB() {
		chooseAnswer(Code.B);
	}
	
	@OnClick(R.id.answer_C)
	void onClickAnswerC() {
		chooseAnswer(Code.C);
	}
	
	@OnClick(R.id.answer_D)
	void onClickAnswerD() {
		chooseAnswer(Code.D);
	}
	
	private void buildUI() {
		Exam exam = getExam();
		List<Question> questions = exam.getQuestions();
		
		int index = getIndex();
		int totalQuestions = getTotalQuestions();
		int questionNumber = index + 1;
		
		if(questionNumber <= totalQuestions) {
			getActionBar().setSubtitle(String.format("Questão %d de %d", questionNumber, totalQuestions));
			
			Question question = questions.get(index);
			btnExpand.setText(exam.getTitle() + (!question.getSubject().equals("") ? " (" + question.getSubject() + ")" : ""));
			txtQuestion.setText(question.getTitle());
			
			resetAnswers();
			
			String[] txtAnswers = new String[] {
				question.getAnswers().get(Code.A.code).getDescription(),
				question.getAnswers().get(Code.B.code).getDescription(),
				question.getAnswers().get(Code.C.code).getDescription(),
				question.getAnswers().get(Code.D.code).getDescription()
			};
			
			for(int i = 0; i < txtAnswers.length; i++) {
				answers.get(i).setText(txtAnswers[i]);
			}
		} else {
			getResults();
		}
	}
	
	private void chooseAnswer(Code answer) {
		int correctCode = getQuestion().getCorrectAnswer().code;
		
		Button btnChoosed = answers.get(answer.code);
		Button btnCorrect = answers.get(correctCode);
		
		if(answer.code == correctCode) {
			Toast.makeText(QuestionActivity.this, "VOCÊ ACERTOU! :)", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(QuestionActivity.this, "Você errou :(", Toast.LENGTH_LONG).show();
		}
		
		SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit();
		editor.putInt("Q-" + (getIndex() + 1), answer.code);
		editor.commit();
		
		lockAnswers();
		
		btnChoosed.setTextColor(Color.parseColor("#FF5252"));
		btnChoosed.setTypeface(Typeface.create("sans-serif-condensed", Typeface.BOLD));
		btnChoosed.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_action_favorite, 0);
		
		btnCorrect.setTextColor(Color.parseColor("#23F053"));
		btnCorrect.setTypeface(Typeface.create("sans-serif-condensed", Typeface.BOLD));
		btnCorrect.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_check, 0);
	}
	
	private void lockAnswers() {
		for(Button answer : answers) {
			answer.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_action_remove, 0);
			answer.setTextColor(Color.parseColor("#777777"));
			answer.setTypeface(Typeface.create("sans-serif-condensed", Typeface.NORMAL));
			answer.setClickable(false);
		}
	}
	
	private void resetAnswers() {
		answers.get(Code.A.code).setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_answer_a, 0, 0, 0);
		answers.get(Code.B.code).setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_answer_b, 0, 0, 0);
		answers.get(Code.C.code).setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_answer_c, 0, 0, 0);
		answers.get(Code.D.code).setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_answer_d, 0, 0, 0);
		
		for(Button answer : answers) {
			answer.setTextColor(Color.parseColor("#FFFFFF"));
			answer.setTypeface(Typeface.create("sans-serif-condensed", Typeface.NORMAL));
			answer.setClickable(true);
		}
	}
	
	private int getIndex() {
		SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
		return sharedPref.getInt(INDEX, 0);
	}
	
	private boolean next() {
		boolean choosed = !answers.get(0).isClickable();
		
		if(choosed) {
			int index = getIndex();
			
			SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPref.edit();
			editor.putInt(INDEX, ++index);
			
			editor.commit();
			
			buildUI();
		} else {
			Toast.makeText(QuestionActivity.this, "Escolha uma alternativa antes de prosseguir", Toast.LENGTH_LONG).show();
		}
		
		return choosed;
	}
	
	private boolean terminate() {
		SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
		sharedPref.edit().clear().commit();
		
		finish();
		
		startActivity(new Intent(QuestionActivity.this, MainActivity.class));
		
		return true;
	}
	
	private int getTotalQuestions() {
		Exam exam = getExam();
		List<Question> questions = exam.getQuestions();
		
		return questions.size();
	}
	
	private void getResults() {
		ContextThemeWrapper themedContext = 
				new ContextThemeWrapper(QuestionActivity.this, 
						android.R.style.Theme_Holo_Dialog);
		
		SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
		
		int points = 0;

		Map<String, ?> prefs = sharedPref.getAll();
		for(String s : prefs.keySet()) {
			if(s.startsWith("Q")) {
				String[] tokens = s.split("-");
				int index = Integer.valueOf(tokens[1]) - 1;
				Question q = getExam().getQuestions().get(index);
				int choosed = Integer.valueOf(prefs.get(s).toString());
				if(choosed == q.getCorrectAnswer().code) {
					points++;
				}
			}
		}
		
		AlertDialog.Builder builder = new AlertDialog.Builder(themedContext)
			.setTitle("Exame da Ordem")
			.setMessage(String.format("\nA prova acabou :)\n\nVocê acertou %d de %d questões\n", 
				points, 
					getExam().getQuestions().size()))
			.setIcon(R.drawable.ic_action_favorite)
			.setPositiveButton("Reiniciar", new OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					terminate();
				}
			});
		
		builder.create().show();
	}
	
	private Exam getExam() {
		return getOABContext().getExam();
	}
	
	private Question getQuestion() {
		return getExam().getQuestions().get(getIndex());
	}
}
