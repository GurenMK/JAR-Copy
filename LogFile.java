//Alexander Urbanyak
//CS 1302
//File Handling
//Driver - main() class
//BinaryFile - reads .jar (binary format) file and creates a copy in the same format (.jar), 
//with a different name, in the same directory 
//.jar file is read from the same progect folder as the .java files accessing it 
//LogFile - creates .txt log file with a time stamp

package assignment_4;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;

public class LogFile {
    
    LogFile() {
    }
    
    LogFile(String f) {
     String l = "Log_" + "'" + f + "'";
     //log file object
     File log = new File(l + ".txt");
     
     if (log.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

     File file = new File("hello.jar");
     Date date = new Date(file.lastModified());  
     //Create Log file
     try {
     PrintWriter output = new PrintWriter(log);
     output.println("Log File");
     output.println("Time stamp: " + date);
     output.close();
     System.out.println(date);
     }
     catch (Exception e) {
       e.printStackTrace();
     }
    }   
}
 