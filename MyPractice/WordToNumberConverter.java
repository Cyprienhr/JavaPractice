import java.util.*;

public class WordToNumberConverter {

    static Map<String, Integer> units = new HashMap<>();
    static Map<String, Integer> tens = new HashMap<>();
    static Map<String, Integer> multipliers = new HashMap<>();

    static {
        units.put("zero", 0);
        units.put("one", 1);
        units.put("two", 2);
        units.put("three", 3);
        units.put("four", 4);
        units.put("five", 5);
        units.put("six", 6);
        units.put("seven", 7);
        units.put("eight", 8);
        units.put("nine", 9);
        units.put("ten", 10);
        units.put("eleven", 11);
        units.put("twelve", 12);
        units.put("thirteen", 13);
        units.put("fourteen", 14);
        units.put("fifteen", 15);
        units.put("sixteen", 16);
        units.put("seventeen", 17);
        units.put("eighteen", 18);
        units.put("nineteen", 19);

        tens.put("twenty", 20);
        tens.put("thirty", 30);
        tens.put("forty", 40);
        tens.put("fifty", 50);
        tens.put("sixty", 60);
        tens.put("seventy", 70);
        tens.put("eighty", 80);
        tens.put("ninety", 90);

        multipliers.put("hundred", 100);
        multipliers.put("thousand", 1000);
        multipliers.put("million", 1000000);
        multipliers.put("billion", 1000000000);
    }

    public static long convertWordsToNumber(String input) {
        input = input.toLowerCase().replaceAll("-", " ");
        String[] words = input.split("\\s+");
        long total = 0, current = 0;

        for (String word : words) {
            if (units.containsKey(word)) {
                current += units.get(word);
            } else if (tens.containsKey(word)) {
                current += tens.get(word);
            } else if (word.equals("hundred")) {
                current *= 100;
            } else if (multipliers.containsKey(word)) {
                current *= multipliers.get(word);
                total += current;
                current = 0;
            }
        }

        return total + current;
    }

    public static void main(String[] args) {
        System.out.println(convertWordsToNumber("Three hundred million"));     // 300000000
        System.out.println(convertWordsToNumber("Five Hundred Thousand"));     // 500000
        System.out.println(convertWordsToNumber("One Thousand Two Hundred"));  // 1200
    }
}
