/**
 * OOPSBannerApp - UC7
 * Demonstrates use of Static Inner Class and Object-Oriented design
 * to store character patterns and render banner output.
 *
 * @author Soorya Siju
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Static Inner Class that stores character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character represented
         * @param pattern ASCII banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a character
     * @param ch character to search
     * @param map array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] map) {

        for (CharacterPatternMap entry : map) {
            if (entry.getCharacter() == ch) {
                return entry.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CharacterPatternMap[] characterPatterns = {

            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "    *",
                    "    *",
                    "**** "
            })
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, characterPatterns);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
