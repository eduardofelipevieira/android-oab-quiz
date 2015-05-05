package oab.questions.model;

import java.util.HashMap;
import java.util.Map;

public class Result {
	private Exam exam;
	private String candidate;
	private Map<Question, Answer> answers;
	
	public Result() {
		answers = new HashMap<Question, Answer>();
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public Map<Question, Answer> getAnsweredQuestionList() {
		return answers;
	}

	public void chooseAnswer(Question question, Answer.Code code) {
		answers.put(question, question.getAnswerByCode(code));
	}
}
