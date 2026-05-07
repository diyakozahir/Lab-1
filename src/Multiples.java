public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i <= 1000){

            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;

            if (divisibleByThree || divisibleByFive){
                count++;
            }

            i++;
        }

        System.out.println(count);
    }
}
