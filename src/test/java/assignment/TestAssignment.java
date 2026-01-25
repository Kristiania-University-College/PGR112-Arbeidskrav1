package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static assignment.NumberConverter.MAXNUMBER;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static assignment.testing.framework.Utilities.*;

import java.io.PrintStream;
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
    private final PrintStream originalOut = System.out;
    @DisplayName("Del #1 - test oppretting av klasse, variabel og methode")
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



    @DisplayName("Noen tester for utregning .. opp til 100")
    @Order(2)
    @Test()

   /* doesnt work with parameter int */
    public void oppgave02() {

        // Code that tests the assignment goes here
        // tester ord
        testClass("assignment.NumberConverter", () -> {


            int inputNumber = 11;
            var nc = classCreateInstance();

            assumeTrue(MAXNUMBER < 101);


            classInstanceInvokeMethod(nc, "printInNorwegian", inputNumber);
            var norwegianText = "Elleve";
            // tester sout , tillatter upper og lower cases, med og uten "og", med og uten whitespaces
            assertStandardOutputEqualsSpecial(norwegianText, "og" );

        });

    }

    @DisplayName("Noen tester for utregning .. opp til 1000")
    @Order(2)
    @Test()
    public void oppgave03() {

        // Code that tests the assignment goes here
        // tester ord
        testClass("assignment.NumberConverter", () -> {


            int inputNumber = 101;
            var nc1 = classCreateInstance();

            assumeTrue(MAXNUMBER > 100);
            assumeTrue(MAXNUMBER < 1001);



            classInstanceInvokeMethod(nc1, "printInNorwegian", inputNumber);
            var norwegianText = "Ett hundre og en";
            // tester sout , tillatter upper og lower cases, med og uten "og", med og uten whitespaces
            assertStandardOutputEqualsSpecial(norwegianText, "og" );
        });

    }

    @DisplayName("Noen tester for utregning .. opp til 1 mio")
    @Order(2)
    @Test()
    public void oppgave04() {

        // Code that tests the assignment goes here
        // tester ord
        testClass("assignment.NumberConverter", () -> {


            int inputNumber = 1010;
            var nc = classCreateInstance();
            assumeTrue(MAXNUMBER > 1000);
            assumeTrue(MAXNUMBER < 1000001);


            classInstanceInvokeMethod(nc, "printInNorwegian", inputNumber);
            var norwegianText = "Ett tusen og ti";
            // tester sout , tillatter upper og lower cases, med og uten "og", med og uten whitespaces
            assertStandardOutputEqualsSpecial(norwegianText, "og" );
        });

    }

    @DisplayName("Noen tester for utregning .. meir en 1 mio")
    @Order(2)
    @Test()
    public void oppgave05() {

        // Code that tests the assignment goes here
        // tester ord
        testClass("assignment.NumberConverter", () -> {


            int inputNumber = 10101010;
            var nc = classCreateInstance();

            assumeTrue(MAXNUMBER > 1000000);


            classInstanceInvokeMethod(nc, "printInNorwegian", inputNumber);
            var norwegianText = "ti millioner hundre Ett tusen og ti";
            // tester sout , tillatter upper og lower cases, med og uten "og", med og uten whitespaces
            assertStandardOutputEqualsSpecial(norwegianText, "og" );
        });

    }





}
