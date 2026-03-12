/**
 * OOPSBannerApp - UC8
 * Final version using Map<Character, String[]> for pattern lookup
 * Demonstrates separation of pattern storage and rendering logic
 * 
 * @author Soorya Siju
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Creates and returns character pattern map
     * @return map of characters and banner patterns
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return patterns;
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = createCharacterPatterns();

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = characterPatterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
