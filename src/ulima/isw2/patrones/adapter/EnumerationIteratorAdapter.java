package ulima.isw2.patrones.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator{
	private Enumeration mEnumeration;
	
	public EnumerationIteratorAdapter(Enumeration enumeration) {
		mEnumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return mEnumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return mEnumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
