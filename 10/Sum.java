package Assignment_10;

class Sum extends Thread {
    private int num;

    public Sum(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            sum += temp--;
            System.out.println("Added " + (temp + 1) + " to sum.");
            // sleep for sometime
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nThe sum of all natural numbers till " + num + " is " + sum);
    }
}
