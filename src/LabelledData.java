
// ===========================================================
/**
 * Title: Labelled Data
 * 
 * Description: 
 * 
 * Version: 1.0
 * Author: Nathaniel Hoefer
 */
// ===========================================================

public class LabelledData extends data {
	
// ===========================================================
// Constants
// ===========================================================

	
	
// ===========================================================
// Fields
// ===========================================================

	public int dataCount = 0;
	private String[] storedData;
	private String label;

// ===========================================================
// Constructors
// ===========================================================

	public LabelledData() {
		super(new String[] {"empty"});
		label = "default";		
		dataCount += 1;
	}
	
	public LabelledData(String enteredLabel, String[] data) {
		super(data);
		label = enteredLabel;
		dataCount += 1;

	}

	
// ===========================================================
// Methods for/from SuperClass/Interfaces
// ===========================================================

// ===========================================================
// Methods
// ===========================================================

	
	
// ===========================================================
// Accessors & Mutators
// ===========================================================

	/**
	 * @return the storedData
	 */
	public String[] getStoredData() {
		return storedData;
	}

	/**
	 * @param storedData the storedData to set
	 */
	public void setStoredData(String[] storedData) {
		this.storedData = storedData;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the dataCount
	 */
	public int getDataCount() {
		return dataCount;
	}

	/**
	 * @param dataCount the dataCount to set
	 */
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	
// ===========================================================
// Inner and Anonymous Classes
// ===========================================================
}
