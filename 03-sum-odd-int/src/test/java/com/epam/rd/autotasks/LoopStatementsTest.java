package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopStatementsTest {

    @Test
    public void test1SimpleCase() {

        assertEquals(4, LoopStatements.task1(1234));
        assertEquals(0, LoopStatements.task1(246));
        assertEquals(3, LoopStatements.task1(111));

        
    }

    


}
