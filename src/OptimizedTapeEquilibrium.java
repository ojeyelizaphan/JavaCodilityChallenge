public class OptimizedTapeEquilibrium {
    public int solution(int[] A){
        int total= 0;
        for(int value: A){
           total += value;
        }
        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        for(int i = 0; i<A.length; i++){
            leftSum += A[i];
            int rightSum = total - leftSum;
            int currentDiff =  Math.abs(leftSum - rightSum);
            minDiff = Math.min(minDiff,currentDiff);
        }

        return minDiff;
    }

    public static void main(String[] args){
        OptimizedTapeEquilibrium optimizedTapeEquilibrium = new OptimizedTapeEquilibrium();
        int[] A = {3,1,2,4,3};
        System.out.println(optimizedTapeEquilibrium.solution(A));
    }
}
