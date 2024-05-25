package departamento;

public class WorkerBuilderMainWorker implements WorkerBuilder {
    public Worker mainWorker;

    public WorkerBuilderMainWorker(){
        reset();
    }

    public void reset(){
        this.mainWorker = new Worker();
    }

    @Override
    public void buildSalary(double salary) {
        mainWorker.salary = 1000.00;
    }

    @Override
    public void buildRank(String rank) {
        mainWorker.rank = "Main";
    }

    @Override
    public Worker getWorker() {
        return mainWorker;
    }

    public void giveOrder(Worker w, String order){
        if (w.getRank().equals("Secondary")){
            System.out.println("Hey, do something for us: " + order);
        }
        else{
            System.out.println("Error: You can't send orders to main departments nor the CEO");
        }
    }
}
