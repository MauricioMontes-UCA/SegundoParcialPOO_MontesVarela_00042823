package departamento;

public class WorkerBuilderCEO implements WorkerBuilder {
    public Worker ceo;

    public WorkerBuilderCEO(){
        reset();
    }

    public void reset(){
        this.ceo = new Worker();
    }

    @Override
    public void buildSalary(double salary) {
        ceo.salary = 2500.00;
    }

    @Override
    public void buildRank(String rank) {
        ceo.rank = "CEO";
    }

    @Override
    public Worker getWorker() {
        return ceo;
    }

    public void giveOrder(Worker w, String order){
        System.out.println("Hello, do something for me (it will maximize shareholder's value): " + order);
        System.out.println("btw, bring me coffee");
    }
}
