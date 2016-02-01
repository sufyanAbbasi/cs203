public class SimpleProgram{

	private static final int MEANING_OF_LIFE = 42;

	private static final String THE_QUESTION = "Simply, what is 6 * 7?";

	public String answerTheQuestion(){
		return "The Answer Is: " + MEANING_OF_LIFE;
	}

	public String stateTheQuestion(){
		return THE_QUESTION;
	}

	public static void main(String[]args){
		SimpleProgram life = new SimpleProgram(); 
		System.out.println(life.answerTheQuestion() + "\n...");
		System.out.println("What is the question, you ask?\n...");
		System.out.println(life.stateTheQuestion());
	}

}

