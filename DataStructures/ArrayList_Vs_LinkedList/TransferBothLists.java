class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        ArrayList<String> transfer = new ArrayList<>();
      
        for (String i : arrayList) {
            transfer.add(i);
        }
        
        arrayList.removeAll(arrayList);
        
        for (String k : linkedList) {
            arrayList.add(k);
        }
        
        linkedList.removeAll(linkedList);
        
        for (String s : transfer) {
            linkedList.add(s);
        }
    }
}
