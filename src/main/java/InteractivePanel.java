package main.java;

import java.util.Scanner;

public class InteractivePanel {

    private Scanner act = new Scanner(System.in);
    private NuclearSubmarine ns = new NuclearSubmarine();
    private String action;

    public void action() {
        boolean isOn = true;

        System.out.println("Input your command: \ne - Start/turn off the engine;\nw - move forward;\ns - move back;" +
                "\na - move left;\nd - move right;\nq - quit;");


        while (isOn) {
            action = act.next();
            if (action.equals("q")) {
                isOn = false;
            }
            ns.move(action);

        }
    }
}
