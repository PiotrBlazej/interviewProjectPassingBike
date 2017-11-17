/**
 * Created by Piotr on 2017-11-17.
 */
public class Solution {
    private static final int LIMIT =1000000000;

    public int solution(int[] A){
        int goEast=0;
       int pairs=0;

        for(int counter : A){
            if(counter ==1){
                pairs+=goEast;
            }
            else{
                goEast++;
            }
        }
        if(pairs>LIMIT )
            return -1;
return pairs;

    }
}
