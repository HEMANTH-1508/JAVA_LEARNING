public class FizzBuzz {
    public static void main(String[] args){
        String arr[]={"", "fizz","buzz","fizz buzz"};
        for(int i=0;i<=15;i++) {
            int in=((i%3==0)? 1 : 0)+((i%5==0)? 2 : 0);
            System.out.println(arr[in].isEmpty() ? i : arr[in]);
        }
    }
}
