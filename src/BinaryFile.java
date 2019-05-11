//Alexander Urbanyak
//CS 1302
//File Handling
//Driver - main() class
//BinaryFile - reads .jar (binary format) file and creates a copy in the same format (.jar), 
//with a different name, in the same directory 
//.jar file is read from the same progect folder as the .java files accessing it 
//LogFile - creates .txt log file with a time stamp

import java.io.*;

public class BinaryFile {
    String fileName;
    
    BinaryFile() {
    }
    BinaryFile(String f) {
        // The name of the file to open
        fileName = f;
        //create a copy file
        String copy = "MyCopy_" + fileName;

        try {
            //reading the data
            //read up to  a 1000 items per line?
            byte[] buffer = new byte[1000];

            FileInputStream inputStream = new FileInputStream(fileName);

            int nRead = 0;
            String text;
            //while there is something to read
            while((nRead = inputStream.read(buffer)) > 0) {
                text = new String(buffer);
                System.out.println(text);
                try {
                 String bytes = text;
                 byte[] buffer1 = bytes.getBytes();

                 FileOutputStream outputStream = new FileOutputStream(copy);

                 // write as many bytes as from the buffer
                 outputStream.write(buffer1);

                 //close copy file
                 outputStream.close();       
                }
                catch(IOException e) {
                System.out.println("Error writing file '" + copy + "'");
                //or e.printStackTrace();
                }
            }   

            //close main file
            inputStream.close();        
        }
        catch(FileNotFoundException e) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException e) {
            System.out.println("Error reading file '" + fileName + "'");                  
            // or e.printStackTrace();
        }
    }
}

