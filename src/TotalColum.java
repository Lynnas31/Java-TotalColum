public class TotalColum {
    public static void main(String[] args) {
        int[][] Array = {{743, 414, 2341, 42138, 412329, 43128, 6577}, {3214, 3202, 438, 320, 1231, 1, 0},{1,2,3,4,5,6,7}};
        for (int i = 0; i < Array[0].length; i++) {
            int total = 0;
            for (int j = 0; j < Array.length; j++) {
                total += Array[j][i];
                System.out.println("Sum for column " + i + " is " + total);
            }
        }
    }
}
