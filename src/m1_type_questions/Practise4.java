package m1_type_questions;

import java.util.Scanner;

interface Exam {

	double calculateScore();

	public static String evaluvateResult(double percentage) {
		if (percentage >= 85) {
			return "Merit";
		} else if (percentage >= 60 && percentage < 85) {
			return "Pass";
		}

		return "Fail";
	}
}

class OnlineTest implements Exam {

	private String studentName;
	private int totalQuestions;
	private int correctAnswers;
	private int wrongAnswers;
	private String questionType;

	OnlineTest(String studentName, int totalQuestions, int correctAnswers, int wrongAnswers, String questionType) {
		this.studentName = studentName;
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
		this.questionType = questionType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public int getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public int getWrongAnswers() {
		return wrongAnswers;
	}

	public void setWrongAnswers(int wrongAnswers) {
		this.wrongAnswers = wrongAnswers;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	@Override
	public double calculateScore() {

		double marksPerQuestion = 0;

		if (questionType.equals("MCQ")) {
			marksPerQuestion = 2;
		} else if (questionType.equals("Coding")) {
			marksPerQuestion = 5;
		}

		double totalScore = (correctAnswers * marksPerQuestion) - (wrongAnswers * marksPerQuestion * 0.10);

		double percentage = (totalScore / (totalQuestions * marksPerQuestion)) * 100;

		return Math.round(percentage);
	}
}

public class Practise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Exam Details:");
		System.out.println("Student Name:");
		String name = sc.nextLine();

		System.out.println("Question Type (MCQ/Coding):");
		String type = sc.nextLine();

		System.out.println("Total Questions:");
		int total = sc.nextInt();

		System.out.println("Correct Answers:");
		int correct = sc.nextInt();

		System.out.println("Wrong Answers:");
		int wrong = sc.nextInt();

		OnlineTest onlineTest = new OnlineTest(name, total, correct, wrong, type);
		
		double percentage = onlineTest.calculateScore();

		System.out.println("\nExam Summary:");
		System.out.println(onlineTest.getQuestionType() + " Test:" + onlineTest.getStudentName() + ", Total Score:"
				+ onlineTest.calculateScore() + ", Result:" + Exam.evaluvateResult(percentage));

		sc.close();
	}

}
