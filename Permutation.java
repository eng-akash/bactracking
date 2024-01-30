package backtraking;

public class Permutation{
    public static void findPermutation(String str,String ans){
//        my base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
//        recursion
        for (int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1); //"abcde" =>"ab"+"de"=abde
            //            recursion call
            findPermutation(newStr , ans+currChar);
        }


//        output       ===========>     abc,acb,bac,bca,cab,cba


    }
//    main function
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }
}
