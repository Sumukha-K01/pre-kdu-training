import java.util.*;

class Coll_Kdu
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        System.out.println("Enter number of strings");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            String str = sc.next();
            set.add(str);
            list.add(str);
            if(map.containsKey(str)){
                int val = map.get(str);
                map.put(str,val+1);
            }
            else map.put(str,1);
        }
        sc.close();

        System.out.println("List Contains:");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("Set Contains:");
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("Frequency of the words:");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Word" +entry.getKey() + "Frequency" +entry.getValue());
        }
    }
}