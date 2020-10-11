package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        char spaceChar = ' ';
        int length = message.length();

        shift = shift%26;

        for(int i = 0; i < length; i++) {
            currentChar = message.charAt(i);
            if (currentChar == spaceChar) {
                sb.append(currentChar);
            } else {
                if (currentChar > 'z' || currentChar < 'a') {
                    return "invalid";
                } else if ((char) (currentChar + shift) > 'z') {
                    currentChar = (char) (currentChar - 26);
                } else if ((char) (currentChar + shift) < 'a') {
                    currentChar = (char) (currentChar + 26);
                }
                sb.append((char) (currentChar + shift));
            }
        }

        return sb.toString();
    }
}
