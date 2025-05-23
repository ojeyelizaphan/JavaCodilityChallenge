import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        if(A.length == 0){
            return -1;
        }

        Set<Integer> positions = new HashSet<>();

        for (int i = 0; i<A.length; i++){
            positions.add(A[i]);
            if (positions.size() == X) {
                return i;
            }
        }

        return -1;
    }

    public static void main (String[] args){
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;
        System.out.println(frogRiverOne.solution(X, A));
    }
}
