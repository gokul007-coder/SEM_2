public class PrintBanner {
    /**
     * Prints a hard‑coded 7‑line ASCII art banner spelling "OOPS".
     *
     * This implementation emphasises manual concatenation and sequential
     * println calls rather than loops or arrays so that beginners can
     * clearly see how the output is built line by line.
     */
    public static void displayBanner() {
        // individual components for each letter, fixed width = 7
        String o1 = " ***** ";
        String o2 = "*     *";
        String o3 = "*     *";
        String o4 = "*     *";
        String o5 = "*     *";
        String o6 = "*     *";
        String o7 = " ***** ";

        String p1 = "*****  ";
        String p2 = "*    * ";
        String p3 = "*    * ";
        String p4 = "*****  ";
        String p5 = "*      ";
        String p6 = "*      ";
        String p7 = "*      ";

        String s1 = " ***** ";
        String s2 = "*      ";
        String s3 = "*      ";
        String s4 = " ***** ";
        String s5 = "      *";
        String s6 = "      *";
        String s7 = " ***** ";

        String sep = "  "; // gap between letters

        // print each of the seven rows by concatenating pieces
        System.out.println(o1 + sep + o1 + sep + p1 + sep + s1);
        System.out.println(o2 + sep + o2 + sep + p2 + sep + s2);
        System.out.println(o3 + sep + o3 + sep + p3 + sep + s3);
        System.out.println(o4 + sep + o4 + sep + p4 + sep + s4);
        System.out.println(o5 + sep + o5 + sep + p5 + sep + s5);
        System.out.println(o6 + sep + o6 + sep + p6 + sep + s6);
        System.out.println(o7 + sep + o7 + sep + p7 + sep + s7);
    }

    public static void main(String[] args) {
        // allow this class to be run standalone
        displayBanner();
    }
}