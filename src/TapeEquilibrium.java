public class TapeEquilibrium {
    public int solution(int[] A){
        if(A.length == 0) return 0;


        int minDiff =Integer.MAX_VALUE;
        //take i as our P which should be 0< P < A.length
        for (int i = 1; i< A.length; i++){
            int firstSum = 0;
            int secondSum = 0;
            //find the first sum
            for(int j=0; j<i; j++){
                firstSum += A[j];
            }

            //find the second sum
            for(int k=i; k<A.length; k++){
                secondSum += A[k];
            }

            int currentDiff = Math.abs(firstSum - secondSum);
            minDiff = Math.min(minDiff, currentDiff);

        }

        return Math.abs(minDiff);
    }

    public static void main(String[] args){
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = {3,1,2,4,3};
        System.out.println(tapeEquilibrium.solution(A));
    }
}
