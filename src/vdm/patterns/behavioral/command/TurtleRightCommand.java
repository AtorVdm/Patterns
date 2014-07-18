package vdm.patterns.behavioral.command;

public class TurtleRightCommand extends Command {
	public TurtleRightCommand(Turtle turtle) {
		super(turtle);
	}

	@Override
	public void execute() {
		turtle.moveRight();
		
	}

	@Override
	public void undo() {
		turtle.moveLeft();
	}
}