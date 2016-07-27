
public class LabelledData extends data {
	
// ===========================================================
// Constants
// ===========================================================

	
	
// ===========================================================
// Fields
// ===========================================================

	private String[] storedData;
	private String label;

// ===========================================================
// Constructors
// ===========================================================

	public LabelledData() {
		super(new String[] {"empty"});
		label = "default";		
	}
	
	public LabelledData(String enteredLabel, String[] data) {
		super(data);
		label = enteredLabel;
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
	
// ===========================================================
// Inner and Anonymous Classes
// ===========================================================
}
