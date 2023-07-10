package CodeWars;

public class VowelCount {

    public static int getCount(String str) {
        char[] vowels = str.toCharArray();
        int count = 0;

        for (int i = 0; i <= vowels.length - 1; i++) {
            char current = str.toLowerCase().charAt(i);

            switch (current) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;

            }
        }

        return count;
    }
}
