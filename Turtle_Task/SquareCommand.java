public class SquareCommand implements Command {
    private int side;

    public SquareCommand(int side) {
        this.side = side;
    }

    @Override
    public void execute(Turtle turtle) {
        for (int i = 0; i < 4; i++) {
            turtle.forward(side); // draw straight line to current angle
            turtle.turn(90); // angle is updating
        }

    }

}
