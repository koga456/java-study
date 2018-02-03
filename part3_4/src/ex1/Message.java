package ex1;

public abstract class Message {
	private String name;
	
	public Message(String name){
		this.name=name;
	}
	public void pipe(){
		input();
		output();
	}
	public String getName(){return name;}
	protected abstract void input();
	protected abstract void output();
}
