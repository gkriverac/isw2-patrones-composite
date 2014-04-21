package ulima.isw2.patrones.observer;

public class Boton {
	private int mId;
	
	OnClickListener mListener;
	
	public Boton(int id) {
		mId = id;
	}
	
	public void setOnClickListener(OnClickListener listener){
		mListener = listener;
	}
	
	public void onClick(){
		mListener.onClick(mId);
	}
}
