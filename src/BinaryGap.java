import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryGap {
    public int solution(int N){
        //step one: convert the integer to binary
        String binaryN = Integer.toBinaryString(N);
        System.out.println("Binary: "+binaryN);

        //step two: store the indices of ones in a list
        List<Integer> indexList = new ArrayList<>();
        for(int i=0; i<binaryN.length(); i++){
            if (binaryN.charAt(i) == '0') continue;
            indexList.add(i);
        }

        //step three: find the difference in indices and return the longest gap
        int longestGap = 0;
        for (int i=0; i<indexList.size()-1; i++){
            int indexDifference = indexList.get(i+1) - indexList.get(i) - 1;
            longestGap = Math.max(longestGap, indexDifference);
        }

        return longestGap;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BinaryGap binaryGap = new BinaryGap();

        System.out.println("Enter Number: ");
        int N = scanner.nextInt();
        // Function call
        System.out.println(binaryGap.solution(N));
    }
}
