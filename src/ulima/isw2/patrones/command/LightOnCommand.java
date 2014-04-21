package ulima.isw2.patrones.command;

import ulima.isw2.patrones.command.thirdparties.Light;

// Concrete Command
public class LightOnCommand implements Command{
	
	//Receiver object
	Light mLight;
	
	public LightOnCommand(Light light){
		mLight = light;
	}
	
	@Override
	public void execute() {
		mLight.on();
	}

}
