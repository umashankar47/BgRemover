package bgRemover;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import designerAPI.FileUpload;
import designerAPI.SaveFile;
import designerAPI.removeBg;
import jsonObj.FileAsset;
import jsonObj.Result;
import jsonObj.Tokens;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args ) throws IOException{

		
		
		String propFilePath = System.getProperty("user.dir");;
		Properties properties = null;
		FileInputStream fileInputStream = null;
		Tokens token = new Tokens();
		
		
		try {
			
			properties = new Properties();
			fileInputStream= new FileInputStream(propFilePath + "\\Config.properties");
			properties.load(fileInputStream);
			
		} catch (Exception e) {
			
			System.out.println("Exception in reading properties file  " + e);
			logger.error("Exception in reading properties file  " + e);
		}
		finally {
			
			
			
			token.setAuthToken(properties.getProperty("authToken"))
				 .setSessionId(properties.getProperty("sessionId"))
				 .setOutputFolder(properties.getProperty("outputFolder"))
				 .setInputFolder(properties.getProperty("inputFolder"))
				 .setRemoveBGAPI(properties.getProperty("removeBGAPI"))
				 .setDChint(properties.getProperty("dChint"))
				 .setUploadUrl(properties.getProperty("uploadUrl"))
				 .setFileName(properties.getProperty("fileName"))
				 .fileToken(properties.getProperty("fileToken"));
			
		fileInputStream.close();
		
			
		}
		
	

	//--------------------------------------------------------------------	
		
		
		
		System.out.println("tokens : " + token.toString());
		logger.info("tokens : " + token.toString());
		String responseBody = "";
	    FileAsset fileAsset = new FileAsset();   
	    Gson gson = new Gson();    
	    
	    
		try {
			
			System.out.println("Uploading File");
			responseBody = FileUpload.fileUpload(token.getUploadUrl(), token.getInputFolder(), token.getFileName(), token.getAuthToken(), token.getSessionId(), token.getDChint(), token.getFileToken());
			
		 
		    fileAsset = gson.fromJson(responseBody, FileAsset.class);
		        
		    logger.info("File Asset : " + fileAsset.toString());
		    System.out.println("File Asset : " + fileAsset.toString());	
			
		} catch (Exception e) {
			
			System.out.println("Exception uploading  " + e);
			logger.error("Exception uploading " + e);
			
		}
		
		if(responseBody.startsWith("Error") || responseBody.isEmpty()) {	
			
			System.out.println("File not uploaded");
		}
		else
			System.out.println("File Uploaded");
		
		
		
//        FileAsset fileAsset = new FileAsset();
//        
//        Gson gson = new Gson();
//        
//        fileAsset = gson.fromJson(responseBody, FileAsset.class);
//        
//        logger.info("File Asset : " + fileAsset.toString());
        
        //--------------------------------------------------------------------
        
        responseBody = "";
        Result result = new Result(); 
        gson.newBuilder();
        
        try {
			
			System.out.println("Removing Background");
			
			responseBody = removeBg.removebg(token.getRemoveBGAPI(), token.getDChint(), fileAsset.getAssetUrl(), token.getFileToken(), token.getSessionId());
			
			result = gson.fromJson(responseBody, Result.class);
		        
			logger.info("File URL  : " + result.getAssetPath());
			System.out.println("File URL  : " + result.getAssetPath());
			
        }
        catch (Exception e) {
        	
        	System.out.println("Exception in removing background  " + e);
			logger.error("Exception in removing background  " + e);
        }
			
		if(responseBody.startsWith("Error") || responseBody.isEmpty()) {	
				
				System.out.println("Background not Removed");
			}
		else
	        System.out.println("Background Removed");
	        
        
        //--------------------------------------------------------------------
        
        String saveResult = SaveFile.fileSave(result.getAssetPath(), token.getOutputFolder(), token.getFileName());
        
        System.out.println("Save Result : " + saveResult);
        
	
	
    }
}
