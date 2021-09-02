public class Main {

    public static void main(String[] args) {
   
        Secret[] secrets = Secret.values();
        int counter = 0;
        for (Secret s : secrets) {
            String str = s.toString();
            if (str.startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/
