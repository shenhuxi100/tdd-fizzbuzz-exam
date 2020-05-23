package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_say_self_number_when_reporting_given_number_is_not_multiple_by_3_5_7 () {
        assertEquals("1", FizzBuzz.getReportedFigure(1));
        assertEquals("4", FizzBuzz.getReportedFigure(4));
    }

}
