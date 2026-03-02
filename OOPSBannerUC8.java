import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Demonstrates storing character patterns using HashMap
 * and rendering banner using modular functions.
 */
public class OOPSBannerUC8 {

    /**
     * Builds and returns a HashMap containing
     * character patterns for O, P, S.
     *
     * @return Map of character to 7-line pattern
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        map.put('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });

        map.put('S', new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "       *",
                "       *",
                " *****  "
        });

        return map;
    }

    /**
     * Renders the banner word using the provided map
     *
     * @param word the banner word
     * @param map character pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Step 1: Build character map
        Map<Character, String[]> characterMap = buildCharacterMap();

        // Step 2: Render OOPS
        renderBanner("OOPS", characterMap);
    }
}