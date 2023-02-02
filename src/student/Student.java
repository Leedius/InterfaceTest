package student;

public class Student {
    //이름
    private String name;

    //국어점수
    private int korScore;

    //수학점수
    private int mathScore;

    //영어점수
    private int engScore;

    public Student(String name, int korScore, int mathScore, int engScore) {
        this.name = name;
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    @Override
    public String toString() {
        return "Student {" +
                "이름='" + name + '\'' +
                ", korScore=" + korScore +
                ", mathScore=" + mathScore +
                ", engScore=" + engScore +
                '}';
    }
}