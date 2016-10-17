public BigInteger calc(int n, int[] powers, int divisor) {
    BigInteger sum = BigInteger.ZERO;
    for(int i = 0; i < powers.length; i++)
      if(powers[i] != 0) {
        BigInteger power = BigInteger.ONE;
        for(int j = 0; j < i; j++)
          power = power.multiply(BigInteger.valueOf(n));
        sum = sum.add(power.multiply(BigInteger.valueOf(powers[i])));
      }
    return sum.divide(BigInteger.valueOf(divisor));
  }
  
  public BigInteger powerSum(int m, int k) {
    BigInteger x = BigInteger.ZERO;
    switch(k) {
      case 0:
        return BigInteger.valueOf(m);
      case 1:
        return calc(m, new int[]{0, 1, 1}, 2);
      case 2:
        return calc(m, new int[]{0, 1, 3, 2}, 6);
      case 3:
        return calc(m, new int[]{0, 0, 1, 2, 1}, 4);
      case 4:
        return calc(m, new int[]{0, -1, 0, 10, 15, 6}, 30);
      case 5:
        return calc(m, new int[]{0, 0, -1, 0, 5, 6, 2}, 12);
      case 6:
        return calc(m, new int[]{0, 1, 0, -7, 0, 21, 21, 6}, 42);
      case 7:
        return calc(m, new int[]{0, 0, 2, 0, -7, 0, 14, 12, 3}, 24);
      case 8:
        return calc(m, new int[]{0, -3, 0, 0, 20, 0, -42, 0, 60, 45, 10}, 90);
      case 9:
        return calc(m, new int[]{0, 0, -3, 0, 10, 0, -14, 0, 15, 10, 2}, 20);
      case 10:
        return calc(m, new int[]{0, 5, 0, -33, 0, 66, 0, -66, 0, 55, 33, 6}, 66);
      
    }
    return BigInteger.ZERO;
  }
