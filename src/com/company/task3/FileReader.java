package com.company.task3;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ira on 19.01.2016.
 */
public class FileReader {

    public String readFile(String fileName) {
        String fileBuffer = null;
        File file = new File(fileName);
        if(file.exists()){
            try (java.io.FileReader fileReader = new java.io.FileReader(file)) {

                char[] buffer = new char[(int) file.length()];
                fileReader.read(buffer);
                fileBuffer = new String(buffer);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return fileBuffer;
    }


}
