package week5;

public class MirrorImage {
    static String getMirrorImage(String str) {
        StringBuilder mirroredStr = new StringBuilder(str);
        return mirroredStr.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "srmist";
        System.out.println("Original String: " + input);
        System.out.println("Mirror Image: " + getMirrorImage(input));
    }
}

