public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int moves = 0;

        while (n != 0){

            boolean isEven = n % 2 == 0;

            if (isEven){
                n = n / 2;
            } else {
                n--;
            }

            moves++;
        }

        System.out.println(moves);
    }
}
