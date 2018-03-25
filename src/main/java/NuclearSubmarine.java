package main.java;

import java.util.Scanner;

public class NuclearSubmarine {

    private int depth;
    /**
     * Class is responsible for the movement of the submarine.
     *
     *  @param x Responsible for the movement along the x axis.
     *  @param y Responsible for the movement along the y axis.
     *  @param speed Responsible for the speed of movement along the axis.
     *  @param e Is engine ( Turn on or turn off ).
     *  @author Rostislav Blatman
     *
     */
    private int x;
    private int y;
    private int speed;
    private Scanner act = new Scanner(System.in);
    private Engine e = new Engine();

    public NuclearSubmarine() {
        x = 0;
        y = 0;
        speed = 7;
    }

    public NuclearSubmarine(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move(String move) {
        String m = move.toLowerCase();

        switch (m) {
            case "e":
                e.isEngineOn = !e.isEngineOn;
                break;
            case "w":
                if (e.isEngineOn) {
                    y += speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "s":
                if (e.isEngineOn) {
                    y -= speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "a":
                if (e.isEngineOn) {
                    x -= speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "d":
                if (e.isEngineOn) {
                    x += speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "h":
                if (e.isEngineOn) {
                    System.out.println("Input new depth");
                    depth = act.nextInt();
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "q":
                break;

            default:
                System.out.println("Please, input correct command");
                break;

        }
        System.out.println("Your coordinate is: \nx = " + x + "\ny = " + y + "\ndepth = " + depth);
    }

    class Engine {
        boolean isEngineOn = false;
    }

    public int getX (){return x;}
    public int getY (){return y;}
    public int getSpeed (){return speed;}
    public int getDepth (){return depth;}
    public Engine getE (){return e;}
    public boolean getStateOfEngine (){return e.isEngineOn;}
}
