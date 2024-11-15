// Prints a crowd cheering output.

import java.util.Arrays;
import java.util.List;

public class Cheers {
        public static void main(String[] args) {
                String[] wordArray = args[0].split("");
                int wordLength = wordArray.length;
                List<String> specialCherecters = Arrays.asList("A", "E", "F", "H", "I", "L", "M", "N", "O", "R",
                                "S", "X");
                for (int i = 0; i < wordLength; i++) {
                        if (specialCherecters.contains(wordArray[i])) {
                                System.out.println("Give me an " + wordArray[i] + ": " + wordArray[i] + "!");
                        } else {
                                System.out.println("Give me a  " + wordArray[i] + ": " + wordArray[i] + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < Integer.parseInt(args[1]); i++) {
                        System.out.println(args[0] + "!!!");
                }
        }
}
