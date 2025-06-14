package org.example;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        String input = numbers;

        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2);
            input = parts[1];
        }

        String[] tokens = input.split(delimiter + "|\\n");
        int sum = 0;

        for (String token : tokens) {
            int num = Integer.parseInt(token.trim());
            if (num < 0) {
                throw new IllegalArgumentException("Negatives not allowed: " + num);
            }
            if (num <= 1000) {
                sum += num;
            }
        }

        return sum;
    }
}
