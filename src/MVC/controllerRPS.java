package MVC;

public class controllerRPS {
    modelRPS modelRPSs;
    viewRPS viewRPSs;
    public controllerRPS(modelRPS modelRPSs , viewRPS viewRPSs){
        this.modelRPSs=modelRPSs;
        this.viewRPSs=viewRPSs;
    }
    public void play(){
        while (true){
            modelRPSs.setClientChoice(viewRPSs.clientchoice());
            modelRPSs.generateSystemRandom();
            String resultt = modelRPSs.winner();
            viewRPSs.Result(resultt);
            break;
        }
    }

    public static void main(String[] args) {
        modelRPS model = new modelRPS();
        viewRPS view = new viewRPS();
        controllerRPS controller = new controllerRPS(model,view);
        controller.play();
    }
}
