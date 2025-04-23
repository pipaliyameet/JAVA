import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("FileDemo.java");
        try {
            f1.createNewFile();
        } catch (IOException ex) {}

        System.out.println("file name : "+f1.getName());//1.
        System.out.println("Path : "+f1.getPath());//2.
        System.out.println("Abs path : "+f1.getAbsolutePath());//3.
        System.out.println("Parent : "+f1.getParent());//4.
        System.out.println(f1.exists() ?"exist":"dose not exist");//5.
        System.out.println(f1.canWrite() ?"is write":"is not werite");//6.
        // System.out.println(f1.canRead ? "is readable" : "is not readable");//7.
        System.out.println("is "+(f1.isDirectory()? "":"not" + "a directory"));//8.
        System.out.println(f1.isFile()?"is normal file" : "might be a named pipe");//9.
        System.out.println(f1.isAbsolute()?"is absolute" : "is not absolute");//10.
        System.out.println("File last modified : "+f1.lastModified());//11.
        System.out.println("File Size : " + f1.length() + " Bytes");//12.
    }
}
