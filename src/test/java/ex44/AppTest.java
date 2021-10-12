package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void hasProd() {
        ArrayList<Products> list = new ArrayList<>();
        Products prod1 = new Products("zip", 5.0, 2);
        Products prod2 = new Products("zap", 2.0, 3);
        Products prod3 = new Products("zop", 7.0, 1);
        list.add(prod1);
        list.add(prod2);
        list.add(prod3);
        assertEquals(-1, App.hasProd("gun",list) );
        assertEquals(2, App.hasProd("zop", list) );
    }
}