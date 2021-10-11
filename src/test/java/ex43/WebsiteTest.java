package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {
    Website mySite = new Website("shotput", "Alberto", true, true);
    @Test
    void formatOutput() {
        String s =
                "<!DOCTYPE html>\n" +
                "<head>\n" + "<title>shotput</title>\n" +
                "<meta name = \"author\" content = \"Alberto\">\n" +
                "</head>\n<body>\n</body>\n</html>\n";
        assertEquals(s, mySite.formatOutput() );
    }
    @Test
    void createFolder(){
        String s = System.getProperty("user.dir") + "\\website\\shotput";
        mySite.homeDir = System.getProperty("user.dir");
        mySite.createFolder();
        assertEquals(s, mySite.homeDir);
    }
}