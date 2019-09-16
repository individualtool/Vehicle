package vehicle;

import java.util.Arrays;

public class Model {
	private String BodyType;
	private String ModelName;
	private String[] TrimPackage;
	
	Model() {
		BodyType = "Big rig";
		ModelName = "ASSHAULER";
		TrimPackage = new String[] {"Wheels", "10", "Mpg", "13", "Color", "White", "Seats", "2", "Fuelcap", "100", "weight", "3000"};
	}
	
	Model (String Bt, String Mn, String[] tP) {
		BodyType = Bt;
		ModelName = Mn;
		TrimPackage = tP;
	}
	
	@Override
	public String toString() {
		return "Model [BodyType=" + BodyType + ", ModelName=" + ModelName + ", TrimPackage="
				+ Arrays.toString(TrimPackage) + "]";
	}
	
	public String getBodyType() {
		return BodyType;
	}
	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String[] getTrimPackage() {
		return TrimPackage;
	}

	public void setTrimPackage(String[] trimPackage) {
		TrimPackage = trimPackage;
	}

	
	
}
	

