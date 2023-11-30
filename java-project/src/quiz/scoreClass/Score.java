package quiz.scoreClass;

public class Score {
	private String name;
	private int[] score;
	private int total;
	private double avg;
	private char grade;

	public Score() {

	}

	public Score(String name) {
		this.name = name;
	}

	public Score(String name, int[] score) {
		this.name = name;
		this.score = score;
		calTotal();
		calAvg();
		calGrade();
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return name;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
	
	public int[] getScore() {
		return score;
	}

	public void calTotal() {
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		this.total = total;
	}

	public int getTotal() {
		return this.total;
	}

	public void calAvg() {
		this.avg = (double) this.total / score.length;
	}

	public double getAvg() {
		return avg;
	}

	public void calGrade() {
		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
	}

	public char getGrade() {
		return grade;
	}

	public void display() {
		System.out.printf("\n\n**********%s님의 성적표**********\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n", score[0], score[1], score[2],
				total, avg, grade);
	}

}
