package ulima.isw2.patrones.command;

//Invoker
public class RemoteControl {
	Command[] mOnCommands;
	Command[] mOffCommands;
	Command mUndoCommand;
	
	public RemoteControl(){
		mOnCommands = new Command[7]; // Tenemos 7 slots disponibles
		mOffCommands = new Command[7]; // Tenemos 7 slots disponibles
		
		//Inicializamos con un commando que no haga nada (Null Pattern)
		Command noCommand = new NoCommand();
		for (int i=0; i<mOnCommands.length; i++){
			mOnCommands[i] = noCommand;
			mOffCommands[i] = noCommand;
		}
		mUndoCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, 
			Command offCommand){
		mOnCommands[slot] = onCommand;
		mOffCommands[slot] = offCommand;
	}
	
	public void onButtonOnWasPushed(int slot){
		mOnCommands[slot].execute();
		mUndoCommand = mOnCommands[slot];
	}
	
	public void onButtonOffWasPushed(int slot){
		mOffCommands[slot].execute();
		mUndoCommand = mOnCommands[slot];
	}
	
	public void onUndoButtonWasPushed(){
		mUndoCommand.execute();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Control Remoto -------\n");
		for (int i=0; i<mOnCommands.length; i++){
			stringBuff.append("\n[Slot " + i + "] " + mOnCommands[i].getClass().getName() +
					 "\t\t" + mOffCommands[i].getClass().getName());
		}
		return stringBuff.toString();
	}
	
}
