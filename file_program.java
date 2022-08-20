import java.io.File;
//import java.io.IOException;
import java.nio.file.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class file_program {
    //all methods of file handling 
    /*canRead(), CanWrite(),CreateNewFile(),Delete(),Exists(),length(),
     * getName(),getAbsolutePath(),mkdir(),List(),Read(),Wreite(),renameTo()
     */
    /*File Handling classes... where File is the supermost class
     * Operation of file 
     *    create file
     *    get file information
     *    read
     *    write
     * THE MAIN THING IS THIS FILE HANDLING PRESENT IN JAVA .IO PACKAGE
     */
    public static void main(String[] args) throws Exception {
        File f= new File("C:\\Users\\beher\\OneDrive\\Desktop\\subha.txt");
        if (f.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("file already exists");
        }
        if(f.exists()){
            System.out.println("filename :"+f.getName());
            System.out.println("file location :"+f.getAbsolutePath());
            System.out.println("file writable:"+f.canWrite());
            System.out.println("file readable:"+f.canRead());
            System.out.println("file size :"+f.length());
            //System.out.println("for remove that file:"+f.delete());
        }
        else{
            System.out.println("file not exists");
        }
        //PROGRAM TO WRITE INTO A FILE
        //SECURITY, CLOSING RELATED CODE WE HAVE TO WRITE IN FINALLIZE BLOCK
        String text="Hello world.\n This is java language and secure and simple to hard programming";//write something on text file
        Path fileName= Path.of("C:\\Users\\beher\\OneDrive\\Desktop\\subha.txt");//then give the path in which  file you want to write
        Files.writeString(fileName, text);// declair this two variables under writeString()
        String file_content =Files.readString(fileName);//for read the add text you should give this readString()
        System.out.println(file_content);// this is what you want to print the text.

        /* THERE ARE MANY MORE WAYS TO WRITE IN A FILE IN JAVA
         * I.E USING writeString()
         * FileWriter Class
         * BufferedWruter Class
         * FileOutputStream Class
         */
        //RENAME A FILE
       
        File h = new File("C:\\Users\\beher\\OneDrive\\Desktop\\candy.txt");

        if(f.exists()){
            System.out.println(f.renameTo(h));
        }
        else{
            System.out.println("file doesnot exists");
        }

        //TO COPY THE CONTENT FROM ONE FILE TO ANOTHER FILE
        FileInputStream x= new FileInputStream("C:\\Users\\beher\\OneDrive\\Desktop\\candy.txt");
        FileOutputStream y= new FileOutputStream("C:\\Users\\beher\\OneDrive\\Desktop\\gagul.txt");
        int i;
         while((i=x.read())!=-1){
            y.wait((char)i);
         }
         System.out.println("data copied sucessfully");

    }


    
}
