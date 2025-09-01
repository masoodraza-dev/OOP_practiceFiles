public class RightTurn implements Command {
    private int angle;

    public RightTurn(int angle) {
        this.angle = angle;
    }

    @Override
    public void execute(Turtle turtle) {
        turtle.turn(-angle);
    }

}
