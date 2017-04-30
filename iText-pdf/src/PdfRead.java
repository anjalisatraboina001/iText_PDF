import java.io.FileInputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;

/**
 * 
 */

/**
 * @author anjalisatraboina
 *
 */
public class PdfRead {
	
	public static void main(String[] args){
		
		try{
			PdfReader reader = new PdfReader(new FileInputStream("TestFile.pdf"));
			
			System.out.println("Number of Pages: " + reader.getNumberOfPages());	
			System.out.println("File Length: " + reader.getFileLength());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
