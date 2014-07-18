package vdm.patterns.behavioral.command;

public class TurtleLeftCommand extends Command {
	public TurtleLeftCommand(Turtle turtle) {
		super(turtle);
	}

	@Override
	public void execute() {
		turtle.moveLeft();
		
	}

	@Override
	public void undo() {
		turtle.moveRight();
	}
}