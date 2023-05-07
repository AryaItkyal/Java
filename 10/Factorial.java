package Assignment_10;

class Factorial extends Thread {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int fact = 1;
        int temp = num;
        while(temp > 1) {
            fact *= temp--;
            System.out.println("\nMultiplied factorial with " + (temp + 1));
            // sleep for sometime
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nThe factorial of " + num + " is " + fact);
    }
}

