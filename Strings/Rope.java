import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();
        String numberOfCommands = scanner.nextLine();

        StringBuilder sb = new StringBuilder(givenString);

        for (int i = 0; i < Integer.parseInt(numberOfCommands); i++) {
            String command = scanner.nextLine();
            String[] commands = command.split(" ");

            switch (commands[0]) {
                case "split":
                    splitString(sb, Integer.parseInt(commands[1]));
                    break;
                case "reverse":
                    sb.reverse();
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static StringBuilder splitString(StringBuilder sb, int index) {
        StringBuilder b = new StringBuilder();
        b.append(sb.substring(index, sb.length())).append(sb.substring(0, index));
        sb.setLength(0);
        sb.append(b);
        return sb;
    }
}
