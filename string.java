import java.util.*;

class Kdu_String
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        int len1 = str1.length();
        int len2 = str2.length();

        System.out.println("The length of the first string is" + len1);
        System.out.println("The length of the second string is" + len2);
        
        if(len1==len2) System.out.println("The length of the two strings are the same"); 
        else System.out.println("The length of the two strings is not the same");
        
        if(str1.equals(str2))System.out.println("Two strings are equal");
        else System.out.println("Two strings are not equal");
    }
}