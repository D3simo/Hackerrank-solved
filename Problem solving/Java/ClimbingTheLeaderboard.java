import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> listWithoutDuplicates = ranked.stream()
        .distinct()
        .collect(Collectors.toList());
        
        List<Integer> res = new ArrayList<>();
        Integer currentRank = listWithoutDuplicates.size() + 1;
        
        for (Integer current : player) {
            while (currentRank > 1 && current >= listWithoutDuplicates.get(currentRank - 2)) {
                currentRank = currentRank -1;
            }
            res.add(currentRank);
        }

        return res;
    }
}
