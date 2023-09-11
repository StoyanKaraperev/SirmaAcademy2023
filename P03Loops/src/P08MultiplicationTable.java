public class P08MultiplicationTable {
    public static void main(String[] args) {
        for (int firstNumber = 1; firstNumber <= 10; firstNumber++){
            for (int secondNumber = 1; secondNumber <= 10; secondNumber++){
                int totalSum = firstNumber * secondNumber;
                System.out.printf("%d * %d = %d %n", firstNumber, secondNumber, totalSum);
            }
        }

    }
}
