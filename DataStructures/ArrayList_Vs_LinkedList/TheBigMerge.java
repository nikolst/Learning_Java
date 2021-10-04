class ListOperations {
    public static void mergeLists(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        for (String s : arrayList) {
            linkedList.add(s);
        }
        System.out.println("The new size of LinkedList is " + linkedList.size());
    }
}
