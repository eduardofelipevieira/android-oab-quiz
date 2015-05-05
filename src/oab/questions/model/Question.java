package oab.questions.model;

import java.util.ArrayList;
import java.util.List;

import oab.questions.model.Answer.Code;

public class Question {
	private String title;
	private List<Answer> answers;
	private String explanation;
	private String subject;
	private Code correctAnswer;
	
	public Question(String title, List<Answer> answers, String explanation, String subject, Code correctAnswer) {
		this.title = title;
		this.answers = answers;
		this.explanation = explanation;
		this.subject = subject;
		this.correctAnswer = correctAnswer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Answer> getAnswers() {
		if(this.answers == null) {
			this.answers = new ArrayList<Answer>();
		}
		
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Answer getAnswerByCode(Code code) {
		for(Answer a : answers) {
			if(a.getCode().equals(code)) {
				return a;
			}
		}
		
		throw new IllegalArgumentException("Code not found!");
	}
	
	public Code getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Code correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}
