package dsaPractice;
import java.util.*;

public class prisonCellsAfterNdays{
    public static void main(String arsg[]){
        int[] cells = new int[10];
        int n = 8;
        Solution2 obj= new Solution2();
        obj.prisonAfterNDays(cells,n);
    }
}

class Solution2 {
    public int[] prisonAfterNDays(int[] cells, int n) {
        // Keep track of the state of cells for each day
        Map<String, Integer> seenStates = new HashMap<>();

        // Iterate over each day
        for (int day = 0; day < n; day++) {
            // Convert cells to a string representation
            String state = Arrays.toString(cells);

            // Check if we have already seen this state
            if (seenStates.containsKey(state)) {
                // We have seen this state before, so we can fast-forward to the final state
                int cycleLength = day - seenStates.get(state);
                int remainingDays = (n - day) % cycleLength;
                return prisonAfterNDays(cells, remainingDays);
            } else {
                // We have not seen this state before, so add it to the map
                seenStates.put(state, day);
            }

            // Update the cells according to the rules
            int[] nextCells = new int[cells.length];
            for (int i = 1; i < cells.length - 1; i++) {
                if (cells[i - 1] == cells[i + 1]) {
                    nextCells[i] = 1;
                } else {
                    nextCells[i] = 0;
                }
            }

            // Update cells for the next day
            cells = nextCells;
        }

        return cells;
    }
}
