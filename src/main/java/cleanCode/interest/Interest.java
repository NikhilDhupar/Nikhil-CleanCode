package cleanCode.interest;

public class Interest {

    int principal, time;
    double rate, interest;

    public Interest(int principal, double rate, int time) {

        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.interest = 0;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void printInterest() {
        System.out.format("%s", "Interest :");
        System.out.format("%s\n", this.interest);
    }
}