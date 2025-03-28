package designerAPI;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveFile {

	
	
	public static String fileSave(String fileURL, String SavePath, String fileName) {
		
		fileName = fileName.substring(0,fileName.length()-3) + "png";
		System.out.println("File URL : " + fileURL);
		System.out.println("Save Path : " + SavePath);
		System.out.println("File Name : " + fileName);
		System.out.println("sving  file ");
		
		
		try {
			
			InputStream in = new URL(fileURL).openStream();
			
			Files.copy(in, Paths.get(SavePath + fileName));
				
			
			
		} catch (Exception e) {
			
			System.out.println("Exception in saving file " + e);
			return "Failed";
			
		}
		
		
	return "Success";	
		

		
	
	}
}
