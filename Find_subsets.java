package backtraking;

public class Find_subsets{
    public static void printSubsets(String str,String ans,int i){
//base case
        if (i==str.length()){
            if (ans.length()==0){
                System.out.println("null");
            }else {
            System.out.println(ans);

        }
            return;
        }
//        if my letter choose yes condition
        printSubsets(str, ans+str.charAt(i), i+1);

//       if my letter choose no condition
        printSubsets(str,ans,i+1);
    }


//    main function
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str ," ",0);
    }
}
