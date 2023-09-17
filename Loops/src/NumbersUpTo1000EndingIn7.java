public class NumbersUpTo1000EndingIn7 {
    public static void main(String[] args) {
        int remainder = 0;
        for (int i = 1; i <= 1000; i++){
            remainder = i % 10;
            if (remainder == 7){
                System.out.printf("%d %n", i);
            }
        }

    }
}
