import java.util.*;
import javax.swing.*;

public class Runner {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Turtle turtle = new Turtle();
        turtle.moveTo(new Point(100, 100));

        System.out.println("Select option:");
        System.out.println("1 = Square");
        System.out.println("2 = Zigzag");
        System.out.println("3 = Both (Square + Zigzag)");
        System.out.println("4 = Turn Right");
        System.out.println("5 = Turn Left");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Square
                System.out.print("Enter side length for Square: ");
                int side = sc.nextInt();
                Command square = new SquareCommand(side);
                square.execute(turtle);
                break;

            case 2:
                // Zigzag
                System.out.print("Enter length for Zigzag step: ");
                int length = sc.nextInt();
                System.out.print("Enter number of steps: ");
                int steps = sc.nextInt();
                Command zigzag = new ZigzagCommand(length, steps);
                zigzag.execute(turtle);
                break;

            case 3:
                // Square + Zigzag
                System.out.print("Enter side length for Square: ");
                int side2 = sc.nextInt();
                Command square2 = new SquareCommand(side2);
                square2.execute(turtle);

                System.out.print("Enter length for Zigzag step: ");
                int length2 = sc.nextInt();
                System.out.print("Enter number of steps: ");
                int steps2 = sc.nextInt();
                Command zigzag2 = new ZigzagCommand(length2, steps2);
                zigzag2.execute(turtle);
                break;

            case 4:
                Command right = new RightTurn(90);
                right.execute(turtle);

                break;

            case 5:
                Command left = new LeftTurn(90);
        }

        Canvas panel = new Canvas(turtle);

        JFrame frame = new JFrame("TURTLE GRAPHICS TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
