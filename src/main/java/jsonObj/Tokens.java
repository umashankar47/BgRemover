package jsonObj;

public class Tokens {
	

	private String sessionId;
	private String authToken;
	private String outputFolder;
	private String inputFolder;
	private String removeBGAPI;
	private String dChint;
	private String uploadUrl;
	private String fileName;
	private String fileToken;
	
	public Tokens setSessionId(String sessionId) {
		this.sessionId = sessionId;
		return this;
	}
	
	public Tokens setAuthToken(String authToken) {
		this.authToken = authToken;
		return this;
	}
	
	public Tokens setOutputFolder(String outputFolder) {
		this.outputFolder = outputFolder;
		return this;
	}
	
	public Tokens setInputFolder(String inputFolder) {
		this.inputFolder = inputFolder;
		return this;
	}
	
	public Tokens setRemoveBGAPI(String removeBGAPI) {
		this.removeBGAPI = removeBGAPI;
		return this;
	}
	
	public Tokens setDChint(String dChint) {
		this.dChint = dChint;
		return this;
	}
	
	public Tokens setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
		return this;
	}
	
	public Tokens setFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}
	
	public Tokens fileToken(String fileToken) {
		this.fileToken = fileToken;
		return this;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public String getAuthToken() {
		return authToken;
	}
	
	public String getOutputFolder() {
		return outputFolder;
	}
	
	public String getInputFolder() {
		return inputFolder;
	}
	
	public String getRemoveBGAPI() {
		return removeBGAPI;
	}
	
	public String getDChint() {
		return dChint;
	}
	
	public String getUploadUrl() {
		return uploadUrl;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String getFileToken() {
		return fileToken;
	}

	@Override
	public String toString() {
		return "Tokens [sessionId=" + sessionId + ", authToken=" + authToken + ", outputFolder=" + outputFolder
				+ ", inputFolder=" + inputFolder + ", removeBGAPI=" + removeBGAPI + ", dChint=" + dChint
				+ ", uploadUrl=" + uploadUrl + ", fileName=" + fileName + ", fileToken=" + fileToken + "]";
	}
	
	

}
