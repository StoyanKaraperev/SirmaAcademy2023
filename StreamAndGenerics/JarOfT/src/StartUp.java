public class StartUp {
    public static void main(String[] args) {
        Jar greenJar = new Jar();
        String greenBall = "green";
        String yellowBall = "yellow";
        greenJar.add(greenBall);
        greenJar.add(yellowBall);
        greenJar.print();
        System.out.println("--------------------");
        greenJar.remove();
        greenJar.print();
    }
}
