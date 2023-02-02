package array;

public class MyArrayTest {
    public static void main(String[] args) {
        //우선 MyArray클래스에 객체 생성
        //인터페이스는 객체는 못만들지만 MyArray의 생성자로 인터페이스의 객체 생성은 가능하다.
        MyArrayUtil myArray1 = new MyArray();

        MyArray myArray = new MyArray();

        //!!중요 우선 매개변수 배열을 먼저 만든다
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        double result1 = myArray.getTwoArrayAvg(a,b);
        System.out.println(result1);

        //!!우선 매개변수 배열 생성!
        int[] c = {2,2,2,2,2};
        //기능을 만든 MyArray에서 isEvenArray메소드가 boolean이기 때문에 boolean으로 설정
        boolean result2 =myArray.isEvenArray(c);
        System.out.println(result2);

    }
}
