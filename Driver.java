//Alexander Urbanyak
//CS 1302
//File Handling
//Driver - main() class
//BinaryFile - reads .jar (binary format) file and creates a copy in the same format (.jar), 
//with a different name, in the same directory 
//.jar file is read from the same progect folder as the .java files accessing it 
//LogFile - creates .txt log file with a time stamp

package assignment_4;

public class Driver {

    public static void main(String[] args) {
        String file = "hello.jar";
        BinaryFile f = new BinaryFile(file);
        LogFile log = new LogFile(file);
    }
    
}
