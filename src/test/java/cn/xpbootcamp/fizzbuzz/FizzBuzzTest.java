package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_say_self_number_when_reporting_given_number_is_not_multiple_by_3_5_7() {
        assertEquals("1", FizzBuzz.getReportedFigure(1));
        assertEquals("4", FizzBuzz.getReportedFigure(4));
    }

    @Test
    void should_say_Fizz_when_reporting_given_number_is_not_multiple_by_3() {
        assertEquals("Fizz", FizzBuzz.getReportedFigure(6));
        assertEquals("Fizz", FizzBuzz.getReportedFigure(12));
    }

    @Test
    void should_say_Buzz_when_reporting_given_number_is_not_multiple_by_5() {
        assertEquals("Buzz", FizzBuzz.getReportedFigure(10));
        assertEquals("Buzz", FizzBuzz.getReportedFigure(20));
    }

    @Test
    void should_say_Whizz_when_reporting_given_number_is_not_multiple_by_7() {
        assertEquals("Whizz", FizzBuzz.getReportedFigure(7));
        assertEquals("Whizz", FizzBuzz.getReportedFigure(14));
    }

    @Test
    void should_say_Whizz_when_reporting_given_number_is_multiple_by_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.getReportedFigure(60));
        assertEquals("FizzBuzz", FizzBuzz.getReportedFigure(90));
    }
}
