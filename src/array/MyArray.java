package array;

public class MyArray implements MyArrayUtil{
    @Override
    //ex)1 2 3   4 5 6
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        for(int i = 0; i<arr1.length; i++){
            sumArr1 += arr1[i];
        }
        for (int i = 0; i<arr2.length; i++){
            sumArr2 += arr2[i];
        }
        return (double) (sumArr1+sumArr2)/(arr1.length+arr2.length);
    }

    @Override
    public boolean isEvenArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            if(array[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}
