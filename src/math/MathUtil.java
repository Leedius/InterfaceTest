package math;

public interface MathUtil {
    //매개변수로 받은 두 수 중 작은 수를 리턴.
    int getMin(int a, int b);

    //매개변수로 받은 반지름을 가진 원의 둘레 리턴.
    //단, 매개변수로 들어온 반지름이 음수라면
    //둘레는 0이 되어야 함.
    double getCircleArea(int radius);

    //첫번째 매개변수로 받은 num1수의 num2제곱 값을 리턴
    //첫번째 매개변수 : 3
    //두번째 매개변수 : 2
    // 3^2 = ?
    int getMultiple(int num1, int num2);

}
