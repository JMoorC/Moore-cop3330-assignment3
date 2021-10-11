package ex43;
import java.util.*;
import java.io.*;

import static java.lang.String.format;

public class Website {
    String siteName;
    String author;
    String homeDir;
    Boolean hasJS = false;
    Boolean hasCSS = false;


    public Website(){
        homeDir = System.getProperty("user.dir");
        getInfo();
        createFolder();
        createIndex();
        if (hasJS){
            createFolder("js");
        }
        if (hasCSS){
            createFolder("css");
        }
    }
    public Website(String sN, String a, boolean hasJ, boolean hasC){
        siteName = sN;
        author = a;
        hasJS = hasJ;
        hasCSS = hasC;
        createFolder();
        createIndex();
        if (hasJS){
            createFolder("js");
        }
        if (hasCSS){
            createFolder("css");
        }
    }
    public void getInfo(){
        Scanner inScan = new Scanner(System.in);

        System.out.print("Site name: ");
        siteName = inScan.next();

        System.out.print("Author name: ");
        author = inScan.next();

        System.out.print("Do you want a folder for JavaScript? ");
        String inVal = inScan.next();
        if (inVal.equals("y") || inVal.equals("Y") || inVal.equals("yes") ){
            hasJS = true;
        }

        System.out.print("Do you want a folder for CSS? ");
        inVal = inScan.next();
        if (inVal.equals("y") || inVal.equals("Y") || inVal.equals("yes") ){
            hasCSS = true;
        }
    }

    public void createIndex() {
       try {
            BufferedWriter outWrite = new BufferedWriter(new FileWriter(homeDir + "\\index.html"));
            outWrite.write( formatOutput() );
            System.out.printf("Created ...\\website\\%s\\index.html\n", siteName);
            outWrite.close();
        } catch (Exception exc) {
            System.out.println("Error: write failure");
            exc.printStackTrace();
        }
    }

    public String formatOutput(){
        String s = format("<!DOCTYPE html>\n" +
                "<head>\n<title>%s</title>\n" +
                "<meta name = \"author\" content = \"%s\">\n" +
                "</head>\n<body>\n</body>\n</html>\n", siteName, author);
        return s;
    }

    public void createFolder(){
        homeDir = homeDir + "\\website";
        File file = new File(homeDir);
        if(file.mkdir() ){
            System.out.printf("Created ...\\website\n");
        }

        homeDir = homeDir + "\\" + siteName;
        file = new File(homeDir);
        if(file.mkdir() ){
            System.out.printf("Created ...\\website\\%s\n",siteName);
        }
    }
    public void createFolder(String newDir){
        File file = new File(homeDir + format("\\%s",newDir) );
        if (file.mkdir() ){
            System.out.printf("Created ...\\website\\%s\\%s\n", siteName, newDir);
        }
    }
}
