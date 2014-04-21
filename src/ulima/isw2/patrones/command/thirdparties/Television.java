package ulima.isw2.patrones.command.thirdparties;

public class Television {
	private int mVolumen;
	private int mChannel;
	
	public void on(){
		System.out.println("TV ON");
	}
	
	public void setVolumen(int volumen){
		mVolumen = volumen;
		System.out.println("TV Volumen : " + mVolumen);
	}
	
	public void setChannel(int channel){
		mChannel = channel;
		System.out.println("TV Channel : " + mChannel);
	}
	
	public void off(){
		System.out.println("TV OFF");
	}
	
}
