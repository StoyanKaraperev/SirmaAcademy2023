import java.util.*;

public class PartyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> guests = new ArrayDeque<>();
        int count = 0;
        while (!input.equals("END")){
            if (input.equals("PARTY")){
                while (!input.equals("END")){
                    input = scanner.nextLine();
                    if (guests.contains(input)){
                        guests.removeFirstOccurrence(input);
                    }
                    if (input.equals("END")){
                        count++;
                    }
                }
            } else {
                char [] check = input.toCharArray();
                char firstSymbol = check[0];
                if (Character.isDigit(firstSymbol)){
                    guests.offerFirst(input);
                } else if (Character.isLetter(firstSymbol)){
                    guests.offerLast(input);
                } else {
                    System.out.println("Input is not valid!");
                }
            }

            if (count > 0){
                break;
            }

            input = scanner.nextLine();
        }

        int numberGuestNotCumming = guests.size();
        System.out.println(numberGuestNotCumming);
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
