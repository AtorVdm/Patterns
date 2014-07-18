package patterns.gof.behavioral.command;

public abstract class Command {
	protected Turtle turtle;
	public abstract void execute();
	public abstract void undo();
	
	public Command(Turtle turtle) {
		this.turtle = turtle;
	}
}