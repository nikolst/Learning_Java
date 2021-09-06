class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
      // Write your code here
      long sum = 0;
    
    
      for (Integer k : arr) {
        sum += k;
      }
    
      long min = sum;
      long max = 0;
    
      for (Integer t : arr) {
        if (t < min) {
            min = t;
          }
        if (t > max) {
            max = t;
        }
      }
    
      System.out.println((sum - max) + " " + (sum - min));
  }
}
