package jsonObj;

public class Result {

	
	private String DocumentId;
	private String AssetPath;
	private String IsBGRSuppressed;
	private Object Metadata;
	private String ImageURL;
	private String Thumbnail;
	
	
	
	public String getAssetPath() {
		return AssetPath;
	}
	
	@Override
	public String toString() {
		return "UploadAPI [DocumentId=" + DocumentId + ", AssetPath=" + AssetPath + ", IsBGRSuppressed=" + IsBGRSuppressed + ", Metadata=" + Metadata + "]";
	}
	
	
	
}
