/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Class called ReclamationProject.
 */

public class ReclamationProject {
    /**
     * Method called doit.
     * @param a string
     * @param b string
     * @return string
     */

    public static String doit(final String a, final String b) {
        String aTemp = a;
        String bTemp = b;
        if (a.length() > b.length()) {
            String c = a;
            aTemp = b;
            bTemp = c;
        }
        String r;
        if (a.equals(b)) {
            r = "";
        } else {
            r = "";
        }

        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    } else {
                        r = r;
                    }
                }
            } // Ah yeah
        }
        return r;
    }
}
