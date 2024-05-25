package departamento;

public class WorkerBuilderSecondaryWorker implements WorkerBuilder {
        public Worker secondaryWorker;

        public WorkerBuilderSecondaryWorker(){
            reset();
        }

        public void reset(){
            this.secondaryWorker = new Worker();
        }

        @Override
        public void buildSalary(double salary) {
            secondaryWorker.salary = 750.00;
        }

        @Override
        public void buildRank(String rank) {
            secondaryWorker.rank = "Secondary";
        }

        @Override
        public Worker getWorker() {
            return secondaryWorker;
        }

        public void giveOrder(Worker w, String order){
            System.out.println("Error: You can't give orders");
        }
    }
