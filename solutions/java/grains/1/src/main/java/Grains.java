import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger sum = BigInteger.ZERO;
        if (square > 0 && square < 65) {
            sum = BigInteger.ONE;
            for (int i = 1; i < square; i++) {
                sum = sum.multiply(BigInteger.valueOf(2));
            }
        } else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return sum;
    }
       

    BigInteger grainsOnBoard() {
        BigInteger sum = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            sum = sum.add(current);
            current = current.multiply(BigInteger.TWO);
        }
        return sum;
    }
}
