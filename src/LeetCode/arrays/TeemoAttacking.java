package LeetCode.arrays;

import java.util.ArrayList;
import java.util.List;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonedTime = 0;
        int previousAttackEndTime = -1;

        for (int attackTime : timeSeries) {
            int attackEndTime = attackTime + duration - 1;

            int poisonTime = duration;
            if (previousAttackEndTime >= attackTime) {
                poisonTime = attackEndTime - previousAttackEndTime;
            }

            totalPoisonedTime += poisonTime;
            previousAttackEndTime = attackEndTime;
        }

        return totalPoisonedTime;

    }
}
