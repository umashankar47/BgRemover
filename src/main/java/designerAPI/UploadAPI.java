package designerAPI;

import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UploadAPI {
	
	private static final Logger logger = LogManager.getLogger(removeBgApi.class.getName());
	
	public static String api(String url , String filePath, String authToken, String sessionId, String dcHint, String fileToken ) throws Exception{
	
			System.out.println("File Path : " + filePath);
			

			File file = new File(filePath);
						        
			if (!file.exists()) {
						        	
						   String s = "File not found: " + filePath ;
						   System.err.println(s);
						   logger.error(s);
						            
						            return s;
						        		
						        }
        
			 try {
				 			
						    System.out.println("Finvoking - upload - API ");  
						    
						    HttpClient client = HttpClient.newHttpClient();
								    
							HttpRequest request = HttpRequest.newBuilder()
							    		
							    	    .uri(
							    	    		URI.create(url))
					
							    	    .POST(HttpRequest.BodyPublishers.ofFile(Paths.get(filePath)))
							    	    .setHeader("accept", "*/*")
							    	    .setHeader("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
							    	    .setHeader("api-version", "2.0")
							    	    .setHeader("audiencegroup", "Production")
							    	    .setHeader("authorization", authToken)
							    	    .setHeader("caller", "DesignerApp")
							    	    .setHeader("clientbuild", "1.0.20250321.9")
							    	    .setHeader("clientname", "DesignerApp")
							    	    .setHeader("containerid", "91106d2c-a64e-4d20-8b80-19eea10c0b81")
							//    	    .setHeader("content-length", "197646")
							    	    .setHeader("content-type", "application/x-www-form-urlencoded")
							    	    .setHeader("contenttype", "image/*")
							    	    .setHeader("filetoken", fileToken)
							    	    .setHeader("hostapp", "DesignerApp")
							    	    .setHeader("issignedinuser", "true")
							    	    .setHeader("locale", "en-GB")
							    	    .setHeader("origin", "https://designer.microsoft.com")
							    	    .setHeader("platform", "Web")
							    	    .setHeader("priority", "u=1, i")
							    	    .setHeader("referer", "https://designer.microsoft.com/")
							    	    .setHeader("releasechannel", "")
							    	    .setHeader("sec-ch-ua", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
							    	    .setHeader("sec-ch-ua-mobile", "?0")
							    	    .setHeader("sec-ch-ua-platform", "\"Windows\"")
							    	    .setHeader("sec-fetch-dest", "empty")
							    	    .setHeader("sec-fetch-mode", "cors")
							    	    .setHeader("sec-fetch-site", "cross-site")
							    	    .setHeader("sessionid", sessionId)
							    	    .setHeader("traceparent", "00-fd72cabe484c4386854c740b2ca9f0cc-86f42f747fc901e3-01")
							    	    .setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
							    	    .setHeader("usertype", "MSA")
							    	    .setHeader("x-correlation", "f678be70-d45e-45fe-9fd1-d4e0140bec31")
							    	    .setHeader("x-correlation-id", "f678be70-d45e-45fe-9fd1-d4e0140bec31")
							    	    .setHeader("x-dc-hint", dcHint)
							    	    .setHeader("x-req-start", "5153176.200000048")
							    	    .build();
							
								logger.info("Rrequest  Body : " + request.headers());
							    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
							    
							    System.out.println("Status Code: " + response.statusCode());
						        System.out.println("Response Body: " + response.body());
							    
							    logger.info("Response Headers : " + response.headers());
							    logger.info("Response Status Code : " + response.statusCode());
							    logger.info("Response Body : " + response.body());
							    
							    if(response.statusCode() != 200) {
							    	
							    	return "Error : Status Code : " + response.statusCode();
							    	
							    }
							    return response.body();
						      
								
							} catch (Exception e) {
								
								System.out.println("Error in file upload API : " + e);
								logger.error("Error in file upload API : " + e);
								
							}
						     
	
	
	
	return "Error in uploadAPI";

	
}

}
