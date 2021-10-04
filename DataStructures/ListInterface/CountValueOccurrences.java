class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int count1 = 0;
        int count2 = 0;
        
        for (int l1 : list1) {
            if (l1 == elem) {
                count1++;
            }
        }
        
        for (int l2 : list2) {
            if (l2 == elem) {
                count2++;
            }
        }
        
        if (count1 == count2) return true;
        
        return false;
    }
}
