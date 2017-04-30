
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * 
 */

/**
 * @author anjalisatraboina
 *
 */
public class Pdfwrite {
	
	public static void main(String[] args){
		
		Document doc=new Document();
		try{
			PdfWriter.getInstance(doc,new FileOutputStream("TestFile.pdf"));
			
			doc.open();
				Paragraph par=new Paragraph();

				Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(20);
				 				
				doc.add(new Paragraph("Hi there, this is a test file", f));
				doc.add(par);
				
	            
	            PdfPTable table = new PdfPTable(8);
	            
			        for(int aw = 0; aw < 16; aw++){
			            table.addCell("Anjali");
			        }
			    doc.add(table);
			        
		        doc.close();
		
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
		
	}

}
