package ulima.isw2.patrones.command;

import ulima.isw2.patrones.command.thirdparties.Television;

public class TelevisionOffCommand implements Command{

	private Television mTelevision;
	
	public TelevisionOffCommand(Television television) {
		mTelevision = television;
	}
	
	@Override
	public void execute() {
		mTelevision.off();
	}

}
