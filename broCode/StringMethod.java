public class StringMethod {
    public static void main(String[] args) {
        String name = "Mukul";
        String extraSpaceString = "        space     ";

        // boolean result = name.equalsIgnoreCase("muKul");

        int result = name.length();

        char rst = name.charAt(2);

        int idx = name.indexOf("k");

        String resulString = name.toUpperCase();

        String trimString = extraSpaceString.trim();

        String replaceString = name.replace("l", "L");

        System.out.println(result);

        System.out.println(rst);
        System.out.println("the index of k is -----> "+idx);
        System.out.println(resulString);
        System.out.println(trimString);
        System.out.println(replaceString);
    }
}
