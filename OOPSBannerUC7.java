/**
 * OOPS Banner App - UC7
 * Demonstrates storing character patterns using Inner Static Class
 * and rendering banner using OOPS principles.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     */
    static class CharacterPattern {

        // Instance variables (Encapsulation)
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character the character
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
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
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to create O pattern
    public static CharacterPattern createO() {
        return new CharacterPattern('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });
    }

    // Utility method to create P pattern
    public static CharacterPattern createP() {
        return new CharacterPattern('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });
    }

    // Utility method to create S pattern
    public static CharacterPattern createS() {
        return new CharacterPattern('S', new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "       *",
                "       *",
                " *****  "
        });
    }

    public static void main(String[] args) {

        // Array of CharacterPattern objects
        CharacterPattern[] characters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        // Build and print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : characters) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}