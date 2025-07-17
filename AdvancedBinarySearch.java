import java.util.*;

public class AdvancedBinarySearch {
    public static void main(String... args) {
        int[] pages={12, 34, 67, 90};
        int students=2;

        if(students > pages.length){
            System.out.println("Allocation is not possible");
            return;
        }
        int lowerEnd=0;
        int higherEnd=0;
        for(int num : pages){
            lowerEnd=Math.max(lowerEnd, num);
            higherEnd+=num;
        }
        int answer=higherEnd;
        while(lowerEnd <= higherEnd){
            int mid=lowerEnd+(higherEnd-lowerEnd)/2;
            int requiredStudents=1;
            int currentSum=0;
            boolean isPossible=true;

            for(int p : pages){
                if(p>mid){
                    isPossible=false;
                    break;
                }

                if(currentSum+p>mid){
                    requiredStudents++;
                    currentSum=p;
                    if (requiredStudents > students) {
                        isPossible = false;
                        break;
                    }
                }else{
                    currentSum+=p;
                }
            }

            if(isPossible){
                answer=mid;
                higherEnd=mid-1;
            }else{
                lowerEnd=mid+1;
            }
        }

        System.out.println(answer);
    }
}
