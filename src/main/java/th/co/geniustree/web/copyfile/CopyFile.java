package th.co.geniustree.web.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jasin007
 */
public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        int b = 0;
        char c = 0;
        String FilePath = "C:\\Users\\Jasin007\\Desktop\\fileIn\\Input.txt";
        File file = new File(FilePath);
        // This is session of reading file .txt
        InputStream in = new FileInputStream(file);
        InputStreamReader inReader = new InputStreamReader(in, "UTF-8");
        // ตรงนี้ก๊อปปี้ไฟล์นะ
        
        //create folder
        File MakeFolder  = new File("C:\\Users\\Jasin007\\Desktop\\fileIn\\tt");
        if(!MakeFolder.exists()){ // เช็คว่ามี หรือยัง
            MakeFolder.mkdir();   
        } 
        //String FileDest = "C:\\Users\\Jasin007\\Desktop\\fileIn\\Output.txt";
        OutputStream out = new FileOutputStream(MakeFolder+"\\Output.txt");
        OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");    
        while(true){ 
             b = inReader.read();
             if(b == -1){
                break;
            }
             outWriter.write(b);
        }     
        outWriter.close();
    }    
}
