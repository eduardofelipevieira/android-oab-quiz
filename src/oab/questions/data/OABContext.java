package oab.questions.data;

import oab.questions.model.Exam;
import oab.questions.model.Result;

public class OABContext {
	private static OABContext context;
	
	private Exam exam;
	private Result result;
	
	private OABContext() {}
	
	public static OABContext getOABContext() {
		if(context == null) {
			context = new OABContext();
		}
		
		return context;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
