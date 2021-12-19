package Lab10;

import java.math.BigInteger;

public class MaxInGinger {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        bigNum.add(BigInteger.ONE);

        System.out.println("before loop: " + bigNum);
        int Count = 1;
        while (Count <= 10) {
            if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
                    || bigNum.divide(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                Count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);

        }
    }
}
