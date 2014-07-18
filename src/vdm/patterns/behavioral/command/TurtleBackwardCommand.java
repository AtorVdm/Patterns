package vdm.patterns.behavioral.command;

public class TurtleBackwardCommand extends Command {
	public TurtleBackwardCommand(Turtle turtle) {
		super(turtle);
	}

	@Override
	public void execute() {
		turtle.moveBackward();
		
	}

	@Override
	public void undo() {
		turtle.moveForward();
	}
}