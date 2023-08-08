//import static java.lang.Integer.toBinaryString;

import java.util.*;

public class BinaryGap {
    public int solution(int N){
        int largestGap = 0;
        //step one: convert the integer to a binary string
        String binaryString = Integer.toBinaryString(N);
        //we store the indices of ones in a list
        List<Integer> indicesList = new ArrayList<Integer>();
        for (int i = 0; i <binaryString.length(); i++){
            if (binaryString.charAt(i) == '0') continue;
            indicesList.add(i);
        }
        //find the difference between consecutive indices and return the largest
        for (int i = 0; i < indicesList.size()-1; i++){
            int gap = indicesList.get(i+1) - indicesList.get(i) -1;
            largestGap = Integer.max(largestGap, gap);
        }
        return largestGap;
    }

}
