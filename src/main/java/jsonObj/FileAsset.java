package jsonObj;

public class FileAsset {
	
	

	
	private String FileCacheAssetId;
	private String PersistedAssetId;
	private String AssetUrl;
	private String ThumbnailUrl;
	private String Name;
	private String MimeType;
	private String ErrorCode;
	private String AssetType;
	private int Width;
	private int Height;
	
	
	
	
	public String getFileCacheAssetId() {
		return FileCacheAssetId;
	}
	
	public String getAssetUrl() {
		
		return AssetUrl;
	}

	public String getErrorCode() {
		return ErrorCode;
	}

	@Override
	public String toString() {
		return "FileAsset [FileCacheAssetId=" + FileCacheAssetId + ", PersistedAssetId=" + PersistedAssetId + ", AssetUrl="
				+ AssetUrl + ", ThumbnailUrl=" + ThumbnailUrl + ", Name=" + Name + ", MimeType=" + MimeType
				+ ", ErrorCode=" + ErrorCode + ", AssetType=" + AssetType + ", Width=" + Width + ", Height=" + Height + "]";
	}
	

}
