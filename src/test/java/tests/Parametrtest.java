package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("simpletest")
public class Parametrtest {
    @Test
    @Tag("appletest")
    void positiveTest() {
        String a = "apple";
        String b = System.getProperty("bbb"); //from terminal/ gradle appletest -Dbbb=apple
        assertEquals(a, b);
    }
}

