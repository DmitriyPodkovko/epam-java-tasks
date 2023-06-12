package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopStatementsTest {

    @Test
    public void test3SimpleCase() {

        assertEquals(33, LoopStatements.task3(8));
        assertEquals(143, LoopStatements.task3(11));

       
    }

    


}
