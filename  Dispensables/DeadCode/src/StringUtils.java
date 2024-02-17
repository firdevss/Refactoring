public class StringUtils {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    // Dead code: This method is not used anywhere
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", "");
    }



}
