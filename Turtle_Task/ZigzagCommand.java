public class ZigzagCommand implements Command {
    private int length;
    private int steps;

    ZigzagCommand(int length, int steps) {
        this.length = length;
        this.steps = steps;
    }

    @Override
    public void execute(Turtle turtle) {
        for (int i = 0; i < steps; i++) {
            // move forward of (length) time pixels
            turtle.forward(length);
            // this loop is for zigzag
            if (i % 2 == 0) {
                turtle.turn(30);
            } else {
                turtle.turn(-30);
            }
        }

    }
}
