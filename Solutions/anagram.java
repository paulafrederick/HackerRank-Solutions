import java.util.*;
class anagram{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int count1=0,count2=0,k=0;
        String str1=sr.nextLine();
        String str2=sr.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                char test=str1.charAt(i);
                count1=0;count2=0;
                for(int j=0;j<arr1.length;j++){
                    if(test==arr1[j]){
                        count1++; 
                    }
                    if(test==arr2[j]){
                        count2++;
                    }
                }
                if(count1!=count2){
                    System.out.println("Not Anagrams");
                    k++;
                    break;
                }
            }
            if(k==0){System.out.println("Anagrams");}    
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}