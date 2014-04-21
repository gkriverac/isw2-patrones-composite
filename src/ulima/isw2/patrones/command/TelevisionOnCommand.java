package ulima.isw2.patrones.command;

import ulima.isw2.patrones.command.thirdparties.Television;

public class TelevisionOnCommand implements Command{
	private Television mTelevision;
	
	public TelevisionOnCommand(Television television) {
		mTelevision = television;
	}

	@Override
	public void execute() {
		mTelevision.on();
		mTelevision.setChannel(45);
		mTelevision.setVolumen(30);
	}
	
}
