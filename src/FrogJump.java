public class FrogJump {
    public int solution(int X, int Y, int D){
        int diff = Y -X;
        if (diff% D == 0){
            return diff/ D;
        }
        else {
            return (diff/D) + 1;
        }
    }

    public static void main(String[] args){
        FrogJump frogJump = new FrogJump();

        System.out.println(frogJump.solution(10, 85, 30));
    }
}
