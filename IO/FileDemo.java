import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("FileDemo.java");
        try {
            f1.createNewFile();
        } catch (IOException ex) {
        }
        System.out.println("file name : "+f1.getName());
        System.out.println("Path : "+f1.getPath());
        System.out.println("Abs path : "+f1.getAbsolutePath());
        System.out.println("Parent : "+f1.getParent());
        System.out.println(f1.exists() ?"exist":"dose not exist");
        System.out.println(f1.canWrite() ?"is write":"is not werite");
        // System.out.println(f1.canRead ? "is readable" : "is not readable");
        System.out.println("is "+(f1.isDirectory()? "":"not" + "a directory"));
        System.out.println(f1.isFile()?"is normal file" : "might be a named pipe");
        System.out.println(f1.isAbsolute()?"is absolute" : "is not absolute");
        System.out.println("File last modified : "+f1.lastModified());
        System.out.println("File Size : " + f1.length() + " Bytes");
    }
}
