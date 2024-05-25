package departamento;

public class Worker {
    protected String rank;
    protected double salary;

    public Worker() {}

    public Worker(String superior, double salary) {
        this.rank = superior;
        this.salary = salary;
    }

    public String getRank() {
        return rank;
    }

    public double getSalary() {
        return salary;
    }
}
