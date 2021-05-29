public static Set<Integer> getSetFromString(String str) {
        Set<Integer> set = new HashSet<>();
        String[] arrayStr = str.split(" ");
        for (String i : arrayStr) {
            set.add(Integer.parseInt(i));
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(s -> s > 10);
    }
}
