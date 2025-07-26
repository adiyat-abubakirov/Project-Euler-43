public class p27 {
  public static void main(String[] args) {
    /*
     * This approach uses a theory that a must be negative odd and b must be odd
     * prime starting from 41
     * it uses specific formulas for a and b derived from
     * n^2-79n+1601=(n-40)^2+(n-40)+41
     */
    int a = 0;
    int b = 0;
    int k = 0;
    while (true) {
      k++;
      int an = -k * 2 + 1;
      int bn = (int) Math.pow(k, 2) - k + 41;
      if (Math.abs(an) >= 1000 || Math.abs(bn) > 1000)
        break;
      a = an;
      b = bn;
    }
    System.out.println(a * b);
  }
}
