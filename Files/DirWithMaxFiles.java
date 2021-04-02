package planet;

import java.io.File;

public class Main {

    public static void main(String[] args) throws NullPointerException {
        int max = 0;
        String name = null;
        File fileOnUnix = new File("----PATH_TO_BASE_FILE------");
        String[] list = fileOnUnix.list();
        for (int i = 0; i < list.length; i++) {
            File file2 = new File("----PATH_TO_BASE_FILE------" + list[i]);
            String[] list2 = file2.list();
            if (list2 != null) {
                if (list2.length > max) {
                    max = list2.length;
                    name = list[i];
                }
            }
        }
        System.out.println(name + " " + max);
    }
}
