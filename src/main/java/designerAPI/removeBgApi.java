package designerAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class removeBgApi {
		
	private static final Logger logger = LogManager.getLogger(removeBgApi.class.getName());
	
	public static String api(String url , String jsonReq ,String sessionId, String dcHint ) throws Exception{
		
		try {
			
				HttpClient client = HttpClient.newHttpClient();	
			
				HttpRequest request = HttpRequest.newBuilder()
						.uri(new URI(url))
						.POST(
				    		 BodyPublishers.ofString(jsonReq)	
				    		)
				    .setHeader("accept", "application/json, text/plain, */*")
				    .setHeader("accept-language", "en-GB,en-US;q=0.9,en;q=0.8")
				    .setHeader("audiencegroup", "Production")
				    .setHeader("caller", "DesignerApp")
				    .setHeader("clientbuild", "1.0.20250321.9")
				    .setHeader("clientname", "DesignerApp")
				    .setHeader("content-type", "application/json")
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
				    .setHeader("traceparent", "00-e3fa4e67d4444913bdad4d6ff69fc25c-aed5e920964472c6-01")
				    .setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
				    .setHeader("usertype", "MSA")
				    .setHeader("x-correlation", "2e8c4cf9-c922-4b12-ba4a-05dccac03933")
				    .setHeader("x-correlation-id", "2e8c4cf9-c922-4b12-ba4a-05dccac03933")
				    .setHeader("x-dc-hint", dcHint)
				    .setHeader("x-req-start", "54439.10000002384")
				    .build();
			
				logger.info("Request Headers : " + request.headers());	
			
				HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			
			
				logger.info("Status Code : " + response.statusCode());
				logger.info("Response Headers : " + response.headers());
				logger.info("Response Body : " + response.body());
			
				System.out.println("Status Code: " + response.statusCode());
				System.out.println("Response Body: " + response.body());
				
			
				if(response.statusCode() != 200) {
		    	
					return "Error : Status Code : " + response.statusCode();
		    	
				}
			
		
			
				return response.body();
			
			
			} catch (Exception e) {
			
				System.out.println("Error in api method"+ e.getMessage());
					}
	

		return "Error in removingBGAPI";
		
	}	
		

}
