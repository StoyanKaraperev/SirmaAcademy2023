import java.util.Scanner;

public class GalacticSenatorsVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] votes = scanner.nextLine()
                .trim()
                .split(", ");
        int countYes = 0;
        int countNo = 0;
        int countAbstain = 0;
        String resultMessage = "";
        for (String vote : votes) {
            if (vote.equals("Yes")){
                countYes++;
            } else if (vote.equals("No")){
                countNo++;
            } else if (vote.equals("Abstain")){
                countAbstain++;
            }
        }

        if (countYes != 0 && countYes > countNo){
            resultMessage = "Yes";
        } else if (countNo != 0 && countNo > countYes) {
            resultMessage = "No";
        } else if (countNo != 0 && countYes != 0 && countYes == countNo){
            resultMessage = "Tie";
        } else if (countNo == 0 && countYes == 0 && countAbstain != 0){
            resultMessage = "Abstain";
        }

        System.out.println(resultMessage);
    }
}
