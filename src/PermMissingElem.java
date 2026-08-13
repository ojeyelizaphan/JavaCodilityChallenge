
public class PermMissingElem {
    public int solution(int[] A){
        //solution: Expected sum of the elements - actual sum of the elements
        //step one: find the expected sum of elements
        //n/2 * (n + 1)
        int n = A.length + 1;
        int expectedSum = (n * (n+1))/2;

        //step two: find actual sum of elements
        int actualSum = 0;
        for (int i = 0; i < A.length; i++){
            actualSum += A[i];

        }
        //step three: return difference
        return  expectedSum - actualSum;


    }

    public static void main(String[] args){
        PermMissingElem permMissingElem = new PermMissingElem();

        int[] A = {2,3,1,5};

        System.out.println(permMissingElem.solution(A));
    }
}