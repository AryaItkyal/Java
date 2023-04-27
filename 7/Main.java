package Assignment_7;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Please provide four numbers as command line arguments and specify the operator");
            }

            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int den2 = Integer.parseInt(args[3]);
            int operator = Integer.parseInt(args[4]);

            rationalNum rational1 = new rationalNum(num1, den1);

            rationalNum rational2 = new rationalNum(num2, den2); // Example second rational number

            System.out.println("Rational Number 1: " + rational1.toString());
            System.out.println("Rational Number 2: " + rational2.toString());
            switch(operator){
                case 1:
                    rationalNum sum = rational1.add(rational2);
                    System.out.println("Sum: " + sum.toString());
                    break;
                case 2:
                    rationalNum difference = rational1.subtract(rational2);
                    System.out.println("Difference: " + difference.toString());
                    break;
                case 3:
                    rationalNum product = rational1.multiply(rational2);
                    System.out.println("Product: " + product.toString());
                    break;
                case 4:
                    rationalNum quotient = rational1.divide(rational2);
                    System.out.println("Quotient: " + quotient.toString());
                    break;
                case 5:
                    boolean isEqual = rational1.isEqualTo(rational2);
                    System.out.println("Is Equal? " + isEqual);
                    break;
                case 6:
                    double floatingPointValue = rational1.toFloatingPoint();
                    System.out.println("Floating Point Value: " + floatingPointValue);
                    break;
                case 7:
                    rationalNum absoluteValue = rational1.getAbsoluteValue();
                    System.out.println("Absolute Value: " + absoluteValue.toString());
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please provide valid integers as command line arguments.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
