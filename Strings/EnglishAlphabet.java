class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 65; i <= 90; i++) {
            sb.append((char) i).append(" ");
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}
