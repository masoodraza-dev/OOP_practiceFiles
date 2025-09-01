public class LeftTurn implements Command {
    private int angle;

    public LeftTurn(int angle) {
        this.angle = angle;
    }

    @Override
    public void execute(Turtle turtle) {
        turtle.turn(angle);
    }

}
