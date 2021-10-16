import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] url = scanner.nextLine().split("\\?");
        String[] parts = url[1].split("\\&");
        boolean flag = false; //presents if there is a "pass" parameter
        String code = ""; //save the value of the parameter "pass"

        for (String parameters : parts) {
            String[] parameter = parameters.split("=");
            if (parameter.length == 1) {
                System.out.println(parameter[0] + " : " + "not found");
            } else {
                System.out.println(parameter[0] + " : " + parameter[1]);
                if ("pass".equals(parameter[0])) {
                    flag = true;
                    code = parameter[1];
                }
            }
        }
        if (flag) {
            System.out.println("password : " + code);
        }
    }
}
