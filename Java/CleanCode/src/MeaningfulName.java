import java.util.ArrayList;
import java.util.List;

public class MeaningfulName {
    private static final int FLAGGED = 1;
    private static final int STATUS_VALUE = 0;

    public List< int [] > getThem() { // What is "Them"? improper name NOT GOOD
        List<int []> list1 = new ArrayList<>();
        for (int[] x : list1)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Better name
    public List< int [] > getFlaggedCells() {
        List<int []> flaggedCells = new ArrayList<>();
        for (int[] cell : flaggedCells)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

//    If names must be different, then they should also mean something different.

//    The length of a name should correspond to the size of its scope.

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
