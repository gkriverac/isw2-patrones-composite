package ulima.isw2.patrones.command;

// Invoker
public class SimpleRemoteControl {
	Command mSlot;
	
	public void setCommand(Command command){
		mSlot = command;
	}
	
	public void buttonWasPressed(){
		mSlot.execute();
	}
}
