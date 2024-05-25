package departamento;

public interface WorkerBuilder {
    public void buildSalary(double salary);
    public void buildRank(String rank);
    public Worker getWorker();
    public void giveOrder(Worker w, String order);
}
