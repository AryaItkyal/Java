package Assignment_7;

public class rationalNum {
    private int numerator;
    private int denominator;

    public rationalNum(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public rationalNum add(rationalNum other) {
        int lcm = getLeastCommonMultiple(this.denominator, other.denominator);
        int numeratorSum = this.numerator * (lcm / this.denominator) + other.numerator * (lcm / other.denominator);
        return new rationalNum(numeratorSum, lcm);
    }

    public rationalNum subtract(rationalNum other) {
        int lcm = getLeastCommonMultiple(this.denominator, other.denominator);
        int numeratorDiff = this.numerator * (lcm / this.denominator) - other.numerator * (lcm / other.denominator);
        return new rationalNum(numeratorDiff, lcm);
    }

    public rationalNum multiply(rationalNum other) {
        int numeratorProd = this.numerator * other.numerator;
        int denominatorProd = this.denominator * other.denominator;
        return new rationalNum(numeratorProd, denominatorProd);
    }

    public rationalNum divide(rationalNum other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int numeratorQuot = this.numerator * other.denominator;
        int denominatorQuot = this.denominator * other.numerator;
        return new rationalNum(numeratorQuot, denominatorQuot);
    }

    public boolean isEqualTo(rationalNum other) {
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }

    public double toFloatingPoint() {
        return (double) this.numerator / this.denominator;
    }

    public rationalNum getAbsoluteValue() {
        int absNumerator = Math.abs(this.numerator);
        return new rationalNum(absNumerator, this.denominator);
    }

    private int getLeastCommonMultiple(int a, int b) {
        return (a * b) / getGreatestCommonDivisor(a, b);
    }

    private int getGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGreatestCommonDivisor(b, a % b);
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
