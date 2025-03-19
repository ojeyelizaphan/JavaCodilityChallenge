public class OptimizedPermMissingElem {
        public int solution(int[] A) {
            int n = A.length + 1;  // The total number of elements (including missing one)
            int xorAll = 0, xorArray = 0;

            // XOR all numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                xorAll ^= i;
            }

            // XOR all elements in the array
            for (int num : A) {
                xorArray ^= num;
            }

            // The missing number is the difference between full range XOR and array XOR
            return xorAll ^ xorArray;
        }

        public static void main(String[] args) {
            PermMissingElem permMissingElem = new PermMissingElem();
            int[] A = {2, 3, 1, 5};
            System.out.println(permMissingElem.solution(A)); // Output: 4
        }
}

