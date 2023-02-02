package student;

import java.io.ObjectOutputStream;

public class StudentTest implements StudentUtil {

    @Override
    public String getGradeByStudentName(Student[] students, String name) {
        String grade = "";
        for(int i = 0; i < students.length; i++){
            //i번의 학생의 이름을 get해서 매개변수로 들어온 이름이랑 같은지 비교한다
            if(students[i].getName().equals(name)){
                int totalScore = students[i].getEngScore()+
                        students[i].getKorScore()+
                        students[i].getMathScore();
                double avgScore = totalScore / 3.0;
                if(avgScore>90 && avgScore <= 100){
                    grade="A";
                }
                else if(avgScore>=80){
                    grade="B";
                }
                else if(avgScore>=70){
                    grade="C";
                }
                else {
                    grade="D";
                }
            }
            //그레이드라는 문자열이 빈글자면
            //최초에 빈문자가 들어있었기떄문에
            if(grade.equals("")){
                grade="등급없음";
            }
        }
        return grade;

    }

    @Override
    public int[] getTotalScoresToArray(Student[] students) {
        //Student[] students가 매개변수로 들어오기때문에 배열의 길이는 students.length
        int[] resultArr = new int[students.length];
        for(int i = 0; i<students.length; i++){
            int totalScore = students[i].getKorScore()+
                    students[i].getEngScore()+
                    students[i].getMathScore();
            resultArr[i]=totalScore;
        }
        return resultArr;
    }

    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        int max = 0;
        int totalstu1, totalstu2;
        totalstu1 = stu1.getMathScore()+stu1.getEngScore()+ stu1.getKorScore();
        totalstu2 = stu2.getKorScore()+stu2.getEngScore()+stu2.getMathScore();
        if(totalstu1>totalstu2){
            //학생객체를 리턴하라고 했으니 stu1객체 자체를 리턴
            return stu1;
        }
        else {
            return stu2;
        }
    }
}
