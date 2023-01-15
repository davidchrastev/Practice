package CodeWars;

public class isValid {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        } else {
            int north = 0;
            int south = 0;
            int east = 0;
            int west = 0;
            for (char direction : walk) {
                switch (direction) {
                    case 'n':
                        north++;
                        break;
                    case 's':
                        south++;
                        break;
                    case 'e':
                        east++;
                        break;
                    case 'w':
                        west++;
                        break;
                }
            }
            return north == south && east == west;
        }
    }
}
