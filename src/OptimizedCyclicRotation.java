import java.util.Arrays;

public class OptimizedCyclicRotation {

        public int[] solution(int[] A, int K) {
            // Handle edge case: Empty array
            if (A.length == 0) return A;

            // Optimize: Reduce unnecessary rotations
            K = K % A.length;

            // Create a new array for rotated elements
            int[] rotated = new int[A.length];

            // Place elements in their new positions
            for (int i = 0; i < A.length; i++) {
                rotated[(i + K) % A.length] = A[i];
            }

            return rotated;
        }

        public static void main(String[] args) {
            OptimizedCyclicRotation cyclicRotation = new OptimizedCyclicRotation();

            int[] A = {1, 2, 3, 4};
            int K = 4;

            // Function call
            System.out.println(Arrays.toString(cyclicRotation.solution(A, K)));
        }

}
