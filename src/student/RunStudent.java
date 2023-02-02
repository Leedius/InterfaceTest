package student;

public class RunStudent {
    public static void main(String[] args) {
        //!!중요 StudentTest의 기능 들을 활용하기 위한 객체 s 생성
        StudentTest s = new StudentTest();

        //Student클래스에 저장할 students배열 공간 3칸을 만듬
        Student[] students = new Student[3];
        students[0] = new Student("김", 90, 80, 70);
        students[1] = new Student("이", 95, 70, 88);
        students[2] = new Student("박", 90, 91, 76);


        String result1 = s.getGradeByStudentName(students, "김");
        System.out.println(result1);

        //인터페이스의 메서드가 배열로 리턴됨으로 리턴 자료형은 int[]이되고 매개변수는 배열로받는다
        int[] result2 = s.getTotalScoresToArray(students);
        //배열에 저장된 각 학생들의 총점을 순서대로 출력
        for(int i = 0; i<result2.length; i++){
            System.out.print(result2[i]+ " ");
        }
        System.out.println();

        //새로운 Student클래스에 s1, s2객체 생성하는 동시에 초기화
        Student s1 = new Student("김", 80,80,80);
        Student s2 = new Student("이", 70,70,70);

        //s.getHighScoreStudent메서드가 매개변수를 객체로 받아서 매개변수로 객체 s1,s2를 대입
        Student result3 = s.getHighScoreStudent(s1, s2);
        System.out.print(result3.getName()+" ");
        System.out.print(result3.getKorScore()+" ");
        System.out.print(result3.getEngScore()+" ");
        System.out.print(result3.getMathScore()+" ");


    }
}
