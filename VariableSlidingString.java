import java.util.HashMap;

public class VariableSlidingString {
    public static void main(String...args){
        String s="abcdeabceed";
        int k=2;
        String[] arr=s.split("");
        HashMap<String, Integer> m=new HashMap<>();
        int i=0,j=0, maxLength=0, startIndex=0;
        while(i< arr.length){
            String a=arr[i];
            m.put(a, m.getOrDefault(a,0)+1);
            i++;

            while(m.size()> k){
                String l=arr[j];
                m.put(l, m.get(l)-1);
                if(m.get(l)==0){
                    m.remove(l);
                }
                j++;
            }
            if(i-j>maxLength){
                maxLength=i-j;
                startIndex=j;
            }
        }
        String result="";
        for(int n=startIndex; n<startIndex+maxLength; n++){
            result=result+arr[n];
        }
        System.out.println(maxLength);
        System.out.println(result);

    }
}
