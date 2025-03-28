package jsonObj;

import java.util.UUID;

public class Input {
	
	
//	private String img;
	
	//Required
	
	private String documentId;
	private String userId;
	private String containerId;
	private String assetPath;
	private String fileToken;
	private String scenario;
	private int apiVersion;
	private boolean maskResponseEnabled;
	private String backgroundRemovalVersion;
	

	
	public Input() {
		
			this.documentId = getUUID();
			this.userId = getUUID();
			this.containerId = getUUID();
			this.fileToken = getUUID();
			this.scenario = "BackgroundRemoval";
			this.apiVersion = 3;
			this.maskResponseEnabled = false;
			this.backgroundRemovalVersion = "GENAIBGRv1";
			this.assetPath = "";
		
	}
			

	
	
	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public String getAssetPath() {
		return assetPath;
	}

	public Input setAssetPath(String assetPath) {
		
		this.assetPath = assetPath;
		return this;
		
	}

	public String getFileToken() {
		
		return fileToken;
	}

	public Input setFileToken(String fileToken) {
		
		this.fileToken = fileToken;
		return this;
		
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public int getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(int apiVersion) {
		this.apiVersion = apiVersion;
	}

	public boolean isMaskResponseEnabled() {
		return maskResponseEnabled;
	}

	public void setMaskResponseEnabled(boolean maskResponseEnabled) {
		this.maskResponseEnabled = maskResponseEnabled;
	}

	public String getBackgroundRemovalVersion() {
		return backgroundRemovalVersion;
	}

	public void setBackgroundRemovalVersion(String backgroundRemovalVersion) {
		
		this.backgroundRemovalVersion = backgroundRemovalVersion;
		
	}
	
	@Override
	public String toString() {
		
		return "documentId : " + documentId + "\n" +
				"userId : " + userId + "\n" +
				"containerId : " + containerId + "\n" +
				"assetPath : " + assetPath + "\n" +
				"fileToken : " + fileToken + "\n" +
				"scenario : " + scenario + "\n" +
				"apiVersion : " + apiVersion + "\n" +
				"maskResponseEnabled : " + maskResponseEnabled + "\n" +
				"backgroundRemovalVersion : " + backgroundRemovalVersion + "\n";
		
	}
	
	public String getUUID() {	
		
        UUID uuid = UUID.randomUUID();
     
        return  uuid.toString();	
		
	}
	

}
