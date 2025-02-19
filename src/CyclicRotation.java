import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K){
        int placeHolder = 0;
        //step one: loop through the array k times
        for (int i = 0; i < K; i++){
            //step two: store the last element in the placeholder
            placeHolder = A[A.length-1];

            //step three: loop through the array, replace each element with previous value
            for (int j = A.length-2; j >= 0; j--){
                A[j+1] = A[j];
            }

            //step four: replace value of first index with placeholder
            A[0] = placeHolder;
        }

        return A;
    }

    public static void main(String[] args) {


        CyclicRotation cyclicRotation = new CyclicRotation();

        int[] A = {1, 2, 3, 4};

        // Function call
        System.out.println(Arrays.toString(cyclicRotation.solution(A, 4)));
    }
}
