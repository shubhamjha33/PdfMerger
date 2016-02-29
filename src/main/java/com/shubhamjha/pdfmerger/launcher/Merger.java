package com.shubhamjha.pdfmerger.launcher;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.util.PDFMergerUtility;

/**
 *
 * @author shubham
 */
public class Merger {
        
        public static void main(String[] args){
            PDFMergerUtility pdfMerger=new PDFMergerUtility();
            pdfMerger.addSource("./src/main/resources/Header.pdf");
            pdfMerger.addSource("./src/main/resources/Content.pdf");
            pdfMerger.setDestinationFileName("./src/main/resources/Final.pdf");
            try {
                pdfMerger.mergeDocuments();
            } catch (IOException ex) {
                Logger.getLogger(Merger.class.getName()).log(Level.SEVERE, null, ex);
            } catch (COSVisitorException ex) {
                Logger.getLogger(Merger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
}
