package MVC;

import java.util.Random;

public class modelRPS {
    String[] choice = {"Rock", "paper", "scissors"};
    private String clientChoice;
    private String SystemRandom;

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public String getClientChoice() {
        return clientChoice;
    }

    public void setClientChoice(String clientChoice) {
        this.clientChoice = clientChoice;
    }

    public String getSystemRandom() {
        return SystemRandom;
    }

    public void setSystemRandom(String systemRandom) {
        SystemRandom = systemRandom;
    }

    public void generateSystemRandom() {
        Random random = new Random();
        int x = random.nextInt(3);
        this.SystemRandom = choice[x];
    }

    public String winner() {
        if (clientChoice.equals(SystemRandom)) {
            return "not good please play again";
        }
        if (clientChoice.equals("Rock") && SystemRandom.equals("scissors")) {
            return "my choice was scissors result =>  rock winner";
        }
        if (clientChoice.equals("paper") && SystemRandom.equals("Rock")) {
            return "my chice was Rock result => paper winner";
        }
        if (clientChoice.equals("scissors") && SystemRandom.equals("paper")) {
            return "my choice was paper result => scissors winner";
        }
        return "please play again";
    }
}
