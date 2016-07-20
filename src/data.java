
public class data {

	
	String[] storedData;
	
	public data(String[] data) {
		
		int dataAmount = data.length;
		storedData = new String[dataAmount];
		
		for (int i = 0; i < dataAmount; i++) {
			storedData[i] = data[i];
		}
		
	}
	
	public String getData(int i) {
		return storedData[i];
	}
	
}
