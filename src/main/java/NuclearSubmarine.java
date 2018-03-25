package main.java;

import java.util.Scanner;


public class NuclearSubmarine {
    /**
     * Class is responsible for the movement of the submarine.
     *
     * @param xCoordinate Responsible for the movement along the x axis.
     * @param yCoordinate Responsible for the movement along the y axis.
     * @param speed Responsible for the speed of movement along the axis.
     * @param engine Is engine ( Turn on or turn off ).
     * @author Rostislav Blatman
     */
    private int depth;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;
    private Scanner act = new Scanner(System.in); //Used when entering the depth of a dive in "h" switch case.
    private Engine engine = new Engine();

    public NuclearSubmarine() {
        xCoordinate = 0;
        yCoordinate = 0;
        speed = 7;
    }

    public NuclearSubmarine(int xCoordinate, int yCoordinate, int speed) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public void move(String move) {
        String m = move.toLowerCase();

        switch (m) {
            case "e":
                engine.isEngineOn = !engine.isEngineOn;
                break;
            case "w":
                if (engine.isEngineOn) {
                    yCoordinate += speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "s":
                if (engine.isEngineOn) {
                    yCoordinate -= speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "a":
                if (engine.isEngineOn) {
                    xCoordinate -= speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "d":
                if (engine.isEngineOn) {
                    xCoordinate += speed;
                } else {
                    System.out.println("Please, start engine");
                }
                break;
            case "h":
                if (engine.isEngineOn) {
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
        System.out.println("Your coordinate is: \nx = " + xCoordinate + "\ny = " + yCoordinate + "\ndepth = " + depth);
    }

    class Engine {
        boolean isEngineOn = false;

        public void goDeeper() {
            xCoordinate += 100;
        }
    }

    public int getXcoordinate() {
        return xCoordinate;
    }

    public int getYcoordinate() {
        return yCoordinate;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDepth() {
        return depth;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean getStateOfEngine() {
        return engine.isEngineOn;
    }

    public void changeStateOfEngine(){
        engine.isEngineOn = !engine.isEngineOn;
    }
}
