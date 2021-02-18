public class TotalColum {
    public static void main(String[] args) {
        int[][] Array = {{787, 214, 0, 888, 1549, 1548, 1627}, {714, 1102, 888, 0, 661, 781, 810},{1,2,3,4,5,6,7}};
        for (int i = 0; i < Array[0].length; i++) {
            int total = 0;
            for (int j = 0; j < Array.length; j++) {
                total += Array[j][i];
                System.out.println("Sum for column " + i + " is " + total);
            }
        }
    }
}
