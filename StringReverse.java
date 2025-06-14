class StringReverse{

    /*String rev(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        return reversed;
    }*/
    public static void main(String[]args){
        String str="Hello World";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        /*StringReverse obj=new StringReverse();
        String out=obj.rev(str);
        System.out.println(out);*/
    }
}