package stack;

public class Student {
	private int rollNo;
	private String name;
	private int markOfPhysics;
	private int markOfMathematics;
	private int markOfChemistry;
	private float percentage;
	private String grade;
	
	public Student(int rollNo, String name, int markOfPhysics, int markOfMathematics, int markOfChemistry) {
		this.rollNo = rollNo;
		this.name = name;
		this.markOfPhysics = markOfPhysics;
		this.markOfMathematics = markOfMathematics;
		this.markOfChemistry = markOfChemistry;
		this.percentage=((float)(markOfChemistry+markOfMathematics+markOfPhysics))/3;
		if(this.percentage>80) {
			this.grade="A1";
		}
		else if(this.percentage<=80 && this.percentage>35) {
			this.grade="B1";
		}
		else {
			this.grade="F";
		}
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarkOfPhysics() {
		return markOfPhysics;
	}
	public void setMarkOfPhysics(int markOfPhysics) {
		this.markOfPhysics = markOfPhysics;
	}
	public int getMarkOfMathematics() {
		return markOfMathematics;
	}
	public void setMarkOfMathematics(int markOfMathematics) {
		this.markOfMathematics = markOfMathematics;
	}
	public int getMarkOfChemistry() {
		return markOfChemistry;
	}
	public void setMarkOfChemistry(int markOfChemistry) {
		this.markOfChemistry = markOfChemistry;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", markOfPhysics=" + markOfPhysics
				+ ", markOfMathematics=" + markOfMathematics + ", markOfChemistry=" + markOfChemistry + ", percentage="
				+ percentage + ", grade=" + grade + "]\n";
	}
}
