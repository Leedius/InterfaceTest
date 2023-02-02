package array;
//array패키지에 아래의 인터페이스를 구현한 클래스
public interface MyArrayUtil {
    //매개변수로 받은 두 정수형 배열의 모든 요소의 평균을 리턴
    double getTwoArrayAvg(int [] arr1, int[] arr2);

    //매개변수로 받은 배열의 모든 요소가 짝수이면
    //true, 배열 요소 중 하나라도 홀수면 false 리턴
    boolean isEvenArray(int[] array);
}
