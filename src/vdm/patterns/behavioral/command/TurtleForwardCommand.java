package vdm.patterns.behavioral.command;

public class TurtleForwardCommand extends Command {
	public TurtleForwardCommand(Turtle turtle) {
		super(turtle);
	}

	@Override
	public void execute() {
		turtle.moveForward();
		
	}

	@Override
	public void undo() {
		turtle.moveBackward();
	}
}