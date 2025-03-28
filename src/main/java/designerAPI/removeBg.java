package designerAPI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;

import jsonObj.Input;

public class removeBg{
	
	 private static final Logger logger = LogManager.getLogger(removeBg.class.getName());
	
	
	public static String removebg(String bgUrl, String dcHint, String file, String fileToken, String sessionID) throws Exception{
		
		
			
		String url = bgUrl;

		
		Input input =  new Input();
		
		input.setAssetPath(file).setFileToken(fileToken);
		
		logger.info("Input : " + input.toString());

		Gson gson = new Gson();
		String jsonReq = gson.toJson(input);
		
		logger.info("JSON Request :" + jsonReq);
		
		String responseBody = "";
		
		try {
			
			
			responseBody = removeBgApi.api(url, jsonReq, sessionID, dcHint);
			
			
		} catch (Exception e) {

			System.out.println("Exception removing BG " + e);
			logger.error("Error : " + e.getMessage());
		}
		

		
	
		return responseBody;
		
	}
	
	
	

	

}
