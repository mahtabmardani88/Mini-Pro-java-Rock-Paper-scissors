package MVC;

import java.util.Random;
import java.util.Scanner;

public class viewRPS {
    public String clientchoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1 : Rock");
        System.out.println("2 : paper");
        System.out.println("3 : scissors");
        return scanner.nextLine();
    }
    public void Result(String result){
        System.out.println(result);
    }
    }



