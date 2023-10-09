import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstDeck = new ArrayDeque<>();
        ArrayDeque<Integer> secondDeck = new ArrayDeque<>();
        fillTheDeck(scanner, firstDeck);
        fillTheDeck(scanner, secondDeck);

        for (int i = 0; i <= 50; i++) {
            if (firstDeck.isEmpty()) {
                break;
            } else if (secondDeck.isEmpty()) {
                break;
            } else {
                int firstCard = firstDeck.poll();
                int secondCard = secondDeck.poll();
                if (firstCard > secondCard){
                    firstDeck.offerLast(firstCard);
                    firstDeck.offerLast(secondCard);
                } else if (firstCard < secondCard) {
                    secondDeck.offerLast(secondCard);
                    secondDeck.offerLast(firstCard);
                } else {
                    firstDeck.offerLast(firstCard);
                    secondDeck.offerLast(secondCard);
                }
            }

        }

        if (firstDeck.size() < secondDeck.size()){
            System.out.println("Second player wins!");
        } else if (firstDeck.size() > secondDeck.size()){
            System.out.println("First player wints!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static void fillTheDeck(Scanner scanner, ArrayDeque<Integer> deck) {
        int [] input = Arrays
                .stream(scanner.nextLine()
                        .trim()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < input.length; i++) {
            if (!deck.contains(input[i])){
                deck.offer(input[i]);
            }
        }
    }
}
