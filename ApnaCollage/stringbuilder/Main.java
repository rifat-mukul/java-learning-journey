package stringbuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //character at index 0
        System.out.println(sb.charAt(0));

        // set character at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert a character
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete any character
        sb.delete(0, 1);
        System.out.println(sb);

        // append add on the last
        sb.append('v');
        sb.append('v');
        System.out.println(sb);

        // reverse 
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontCharacter = sb.charAt(front);
            char backCharacter = sb.charAt(back);

            sb.setCharAt(front, backCharacter);
            sb.setCharAt(back, frontCharacter);
        }

        System.out.println(sb);
    }
}
