import java.io.IOException;
import java.io.CharArrayWriter;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter convertWriter = new CharArrayWriter();
        for (String i : words) {
            convertWriter.write(i);
        }
        char[] array = convertWriter.toCharArray();
        convertWriter.close();
        return array;
    }
}
