import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A){
        //step one: sort the array in ascending order
        Arrays.sort(A);
        int missingElem = 0;
        //step two: continue if the number exists or is N+1
        for (int i = 0; i < A.length; i++){
            if ((i+1) == A[i])
                continue;
            else
                missingElem = i+1;
        }

        return missingElem;
    }

    public static void main(String[] args){
        PermMissingElem permMissingElem = new PermMissingElem();

        int[] A = {2,3,1,5};

        System.out.println(permMissingElem.solution(A));
    }
}
