public class OddOccurrencesInArray {
    public int solution (int[] A){
        //step one: loop through the array
        for (int i = 0; i < A.length; i++){
            //step two: Initialize a counter to track occurrences of the current element
            int count = 0;
            //step three: Compare the current element with every other element in the array
            for (int j= 0; j < A.length; j++){
                if (A[i] == A[j]){
                    ++ count ;
                }
            }
            //step four: Check if the count of occurrences is odd
            if(count % 2 != 0){
                //step five: Return the element with an odd count
                return A[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(oddOccurrencesInArray.solution(A));
    }
}
