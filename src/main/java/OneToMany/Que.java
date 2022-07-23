package OneToMany;

import java.util.List;

@Entity
public class Que {
	@Id
	private int id;
	private String question;
	@OneToMany
	private List<Ans> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Ans> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Ans> answers) {
		this.answers = answers;
	}

}
