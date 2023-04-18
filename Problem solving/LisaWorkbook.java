import java.util.ArrayList;
import java.util.List;

public class LisaWorkbook {
    public static int workbook(int problemsPerPage, List<Integer> arr) {
    
        int specialCount = 0;
        int page = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int problems = arr.get(i);
            for(int j = 1; j <= problems; j++){
                if(j % problemsPerPage == 1 || problemsPerPage == 1){
                   page++; 
                } 
                if(j == page){
                   specialCount++; 
                } 
            }
        }
        return specialCount;
    }

    
    public static void main(String[] args) {

    }
}
