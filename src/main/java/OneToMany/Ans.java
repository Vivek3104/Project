package OneToMany;


@Entity
public class Ans {
	@Id
	private int id;
	private String answer;
	@ManyToOne
	private Que question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Que getQuestion() {
		return question;
	}
	public void setQuestion(Que question) {
		this.question = question;
	}

}
