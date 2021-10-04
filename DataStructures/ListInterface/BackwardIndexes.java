public static <T> T getElementByIndex(List<T> lst, int index) {
        // write your code here
        T value = lst.get(0);
        for (T x : lst) {
            if (index >= 0 && index < lst.size()) {
                if (lst.indexOf(x) == index) {
                    value = x;
                    break;
                }
            } else if (index >= lst.size()) {
                throw new IndexOutOfBoundsException("");
            } else if (index < 0 && Math.abs(index) <= lst.size()) {
                if (lst.indexOf(x) == lst.size() + index) {
                    value = x;
                    break;
                }
            } else if (index < 0 && Math.abs(index) > lst.size()) {
                throw new IndexOutOfBoundsException("");
            }
        }
        return value;
    }
