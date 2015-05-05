package oab.questions.model;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	private Integer id;
	private String title;
	private List<Question> questions;
	
	public Exam(Integer id, String title, List<Question> questions) {
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Question> getQuestions() {
		if(this.questions == null) {
			this.questions = new ArrayList<Question>();
		}
		
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public void startExam() {
		
	}
}
