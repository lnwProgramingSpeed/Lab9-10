package Lab10;

import java.math.BigInteger;

public class BigInGinger {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("10000000000000000000");
        bigNum.add(BigInteger.ONE);

        System.out.println("before loop: " + bigNum);
        int Count = 1;
        while (Count <= 10) {
            if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
                    || bigNum.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                Count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);

        }

    }
}