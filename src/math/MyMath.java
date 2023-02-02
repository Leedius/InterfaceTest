package math;

public class MyMath implements MathUtil{

//    이 경우는 pi값을 얼마든지 바꿀수있지만
//    앞에 final을 붙일시 값 변경이 불가능하다.
//    ex final int PI = 10;
//    int pi = 10;
//    public void aaa(){
//        pi = 20;
//        pi = 30;
//    }

    @Override
    public int getMin(int a, int b) {
        int min;
        min=Math.min(a,b);
        return min;
    }

    @Override
    public double getCircleArea(int radius) {
        if(radius<0){
            return 0;
        }
        //Math.뒤에는 여러가지 수학적 상수가 있다.
        return  2 * Math.PI * radius;
    }

    @Override
    public int getMultiple(int num1, int num2) {
        int result=1;
        for(int i = 0; i<num2; i++){
            result=result*num1;
        }
        return result;
    }
}
