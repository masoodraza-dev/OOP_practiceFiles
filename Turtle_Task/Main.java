import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 1. Turtle banao
        Turtle turtle = new Turtle();
        turtle.moveTo(new Point(100, 100));

        // 2. Square draw karna
        turtle.forward(100);
        turtle.turn(90);
        turtle.forward(100);
        turtle.turn(90);
        turtle.forward(100);
        turtle.turn(90);
        turtle.forward(100);

        // 3. Panel banao
        Canvas panel = new Canvas(turtle);

        // 4. Frame banao
        JFrame frame = new JFrame("Turtle Graphics Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
