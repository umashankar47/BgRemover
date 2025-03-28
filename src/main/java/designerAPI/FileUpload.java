package designerAPI;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileUpload {
	
	static Logger logger = LogManager.getLogger(FileUpload.class.getName());

    public static String fileUpload(String Url, String Path, String Name, String auth, String sessionID, String dcHint,  String fileToken ) throws IOException, InterruptedException {
        
        String uploadUrl = Url;
        String filePath = Path + Name;	
//        String fileName = Name.substring(0,Name.length()-4) + ".jpeg";
        String fileName = Name.substring(0,Name.length()-5) + "jpeg";
       
        String authToken = auth;
        String responseBody = "";
        String sessionId = sessionID;
      
        
        System.out.println("File Name : " + fileName);
        System.out.println("File Path : " + filePath);
        System.out.println("URL  : " + uploadUrl);
        System.out.println("Auth Token : " + authToken);
        System.out.println("sessionId  : " + sessionId);
        System.out.println("fileToken  : " + fileToken);
     

        
        
        try {
        	
			 responseBody =  UploadAPI.api(uploadUrl, filePath, authToken, sessionId, dcHint, fileToken);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			logger.error("Error : " + e.getMessage());
		}
        

        
        return responseBody;
    }



}
