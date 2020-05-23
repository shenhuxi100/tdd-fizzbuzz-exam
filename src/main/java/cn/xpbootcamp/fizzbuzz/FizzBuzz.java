package cn.xpbootcamp.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {
    private static HashMap<Integer, String> numberMapper = new HashMap<>();

    static {
        numberMapper.put(3, "Fizz");
        numberMapper.put(5, "Buzz");
    }

    public static String getReportedFigure(int number) {
        if (number % 3 == 0)
            return numberMapper.get(3);
        if (number % 5 == 0)
            return numberMapper.get(5);

        return String.valueOf(number);
    }
}
