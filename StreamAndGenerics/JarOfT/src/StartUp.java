public class StartUp {
    public static void main(String[] args) {
        Jar<String> greenJar = new Jar();
        String greenBall = "green";
        String yellowBall = "yellow";
        greenJar.add(greenBall);
        greenJar.add(yellowBall);
        greenJar.print();
        System.out.println("--------------------");
        greenJar.remove();
        greenJar.print();
        System.out.println("--------------------");
        int one = 1;
        Jar<Integer> digits = new Jar<>();
        digits.add(one);
        digits.print();
    }
}
