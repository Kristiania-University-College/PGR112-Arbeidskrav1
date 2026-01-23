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
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment Oppgave #1")
    @Order(1)
    @Test()
    public void oppgave01() {
        // Code that tests the assignment goes here

        // enkelt fra 1 opp til 100 ?

    }

    @DisplayName("Assignment Oppgave #2")
    @Order(2)
    @Test()

    public void oppgave02() {
        // Code that tests the assignment goes here

        //middels til 1 million? ?

    }

    @DisplayName("Assignment Oppgave #3")
    @Order(3)
    @Test()

    public void oppgave03() {
        // Code that tests the assignment goes here

        //vanskelig: corner cases perfekt?

    }


}
