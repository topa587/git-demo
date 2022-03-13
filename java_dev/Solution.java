import java.util.HashSet;
import java.util.Set;

class Solution{

    public int solution(int[] ranks){
        //store all the elements in the set
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<ranks.length;i++){
            set.add(ranks[i]);
        }
        //Loop through all elements in the array
        int ans = 0;
        for(int x : ranks){
            //Check if x+1 is present
            if(set.contains(x+1)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ranks[] = {1,3,4,6,1,2};
        System.out.println(new Solution().solution(ranks));
    }
}