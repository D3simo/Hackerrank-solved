import java.util.ArrayList;
import java.util.List;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        Integer size = grid.size();
        List<String> tab = new ArrayList<>();
        ;;
        tab.addAll(grid);
        // only if more than 2 depths
        if(size > 2) {
            // ? included condition if(i != 0 || i != size - 1)
            for(int i = 1; i < size - 1; i ++) {        
                // ? loop do not go through edges
                for(int j = 1; j < grid.get(i).length() - 1; j ++) { 
                    // j = character of grid[i]
                    // * check adjacents in the same depth
                    if((grid.get(i).charAt(j) > grid.get(i).charAt(j - 1)) &&
                        (grid.get(i).charAt(j) > grid.get(i).charAt(j + 1)) &&
                            // * check columns in adjacent depths
                        (grid.get(i).charAt(j) > grid.get(i - 1).charAt(j)) &&
                        (grid.get(i).charAt(j) > grid.get(i + 1).charAt(j))) {
                            grid.set(i, grid.get(i).substring(0, j) + "X" + grid.get(i).substring(j + 1));
                        }
                }
            }
        }
        return grid;
    }
}


