package oab.questions.model;

public class Answer {
	private String description;
	private Code code;
	
	public Answer(String description, Code code) {
		this.description = description;
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public static enum Code {
		A(0), B(1), C(2), D(3);
		
		public int code;
		
		private Code(int code) {
			this.code = code;
		}
	}
}
