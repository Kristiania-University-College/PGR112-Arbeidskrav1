package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Arbeidskrav 1")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Del #1")
    @Order(1)
    @Test()
    public void oppgave01() {
        // Code that tests the assignment goes here
        testClass("assignment.NumberConverter", () -> {
            provideHintIfAssertionFails(
                    "Finner ikke felt MAXNUMBER. Har du skrevet og deklarert den riktig?"
                    ,
                    () -> {
                        assertTrue(fieldExists("MAXNUMBER"));
                    }
            );

            provideHintIfAssertionFails(
                    "Feil i metode deklarering. Har du skrevet riktig navn og riktig parameter type?"
                    ,
                    () -> {
                        assertTrue(methodExists("printInNorwegian", int.class));
                    }
            );
        });

    }

    @DisplayName("Del #2")
    @Order(2)
    @Test()

    public void oppgave02() {
        // Code that tests the assignment goes here
        //Hvordan tester sin og sout ?

    }

    @DisplayName("Noen tester for utregning")
    @Order(3)
    @Test()

    public void oppgave03() {
        // Code that tests the assignment goes here
        testClass("assignment.NumberConverter", () -> {


            int inputNumber = 101;
            var nc = classCreateInstance();

            classInstanceInvokeMethod(nc, "printInNorwegian", inputNumber);
            var norwegianText = "Ett hundre og en";
            assertStandardOutputEquals(norwegianText);
        });

    }


}
