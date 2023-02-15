package HackerRank;

public class KangarooJump {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int startingPositionFirstKangaroo = x1;
        int startingPositionSecondKangaroo = x2;

        int jumpingDistanceFirst = v1;
        int jumpingDistanceSecond = v2;

        if (startingPositionSecondKangaroo > startingPositionFirstKangaroo && jumpingDistanceSecond > jumpingDistanceFirst) {
            return "NO";
        }

        while (startingPositionFirstKangaroo <= startingPositionSecondKangaroo) {

            if (startingPositionFirstKangaroo == startingPositionSecondKangaroo) {
                return "YES";
            }

            startingPositionFirstKangaroo += jumpingDistanceFirst;
            startingPositionSecondKangaroo += jumpingDistanceSecond;
        }


        return "NO";


    }
}
