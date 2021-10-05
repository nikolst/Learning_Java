class Main {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
 
        private Object[] list;
        private int size;
        
        private final int DEFAULT_CAPACITY = 10;
        private final int SCALLING_FACTOR = 1.5;
        
        public Main() {
            this.list = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }
        
        int n = input.nextInt(); // total number of commands
        String command = input.nextLine();
        
        
    }
    
    private void tryIncrease() {
        if (list.length == size) {
            list = Arrays.copyOf(list, (int) (list.length * SCALLING_FACTOR));
        }
    }
    
    public void add() {
        tryIncrease();
        list[size++] = value;
    }
}
