import java.util.*;

public class NearestTemp {
    public  static void main(String...args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[] parts=s.split(" ");
        List<Double> temp=new LinkedList<>();
        for(String tem:parts){
            if(tem.equalsIgnoreCase("nan")){
                continue;
            }else{
                temp.add(Double.parseDouble(tem));
            }
        }
        double required = in.nextDouble();
        if(!temp.isEmpty()){
            System.out.println(temp);
            Collections.sort(temp);
            System.out.println(temp);
            double near1, near2;
            int ind = 0;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i) > required) {
                    ind = i;
                    break;
                }
            }
            near2 = temp.get(ind);
            ind--;
            near1 = temp.get(ind);

            if ((required - near1) < (near2 - required)) {
                System.out.println(near1);
                for (int i = 0; i < parts.length; i++) {
                    if (near1 == Double.parseDouble(parts[i])) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println(near2);
                for (int i = 0; i < parts.length; i++) {
                    if (near2 == Double.parseDouble(parts[i])) {
                        System.out.println(i);
                    }
                }
            }
        }else{
            System.out.println("NaN\n0");
        }
    }
}

//12.5 NaN 19.8 NaN 25.0 NaN --20
//23.4 33.56 NaN 25.43 NaN 10.92
//NaN NaN NaN --15