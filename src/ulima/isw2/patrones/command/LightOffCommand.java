package ulima.isw2.patrones.command;

import ulima.isw2.patrones.command.thirdparties.Light;

public class LightOffCommand implements Command{
	Light mLight;
	
	public LightOffCommand(Light light){
		mLight = light;
	}
	
	@Override
	public void execute() {
		mLight.off();
	}
}
