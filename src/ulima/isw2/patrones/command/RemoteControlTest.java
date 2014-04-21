package ulima.isw2.patrones.command;

import ulima.isw2.patrones.command.thirdparties.Light;
import ulima.isw2.patrones.command.thirdparties.Television;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		
		Light light = new Light();
		Command command = new LightOnCommand(light); 
		
		remoteControl.setCommand(command);
		remoteControl.buttonWasPressed();
	}*/
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		Command commandLightOn = new LightOnCommand(light);
		Command commandLightOff = new LightOffCommand(light);
		
		Television television = new Television();
		Command commandTelevisionOn = new TelevisionOnCommand(television);
		Command commandTelevisionOff = new TelevisionOffCommand(television);
		
		remoteControl.setCommand(0, commandLightOn, commandLightOff);
		remoteControl.setCommand(1, commandTelevisionOn, commandTelevisionOff);
		
		System.out.println("RemoteContol: " + remoteControl);
		
		remoteControl.onButtonOnWasPushed(0);
		remoteControl.onButtonOnWasPushed(1);
		remoteControl.onButtonOffWasPushed(0);
		remoteControl.onButtonOffWasPushed(1);
	}

}
