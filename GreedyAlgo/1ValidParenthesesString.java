class Solution {
    public boolean checkValidString(String s) {
      int right =0,left =0;
        
        for(int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
                left++;
            else
                left--;
            
            if(ch != ')')
                right++;
            else
                right--;
            
            if(right < 0)
                break;
            
            left = Math.max(0 , left);
        }
        
        return left == 0;
            
    }
}
//




// O(N) o(n) solution using stack but easy to understand
class Solution {
    //  public  boolean isvalid(String s){

    // }
//     public boolean checkValidString(String s) {
      
//         Stack<Integer> stack=new Stack<>();
//         Stack<Integer> st=new Stack<>();
//         int count=0;
//         boolean flag=false;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='*'){
               
//                st.push(i);
//             }
//              else if(s.charAt(i)=='('){
//                 stack.push(i);
//             }
           
            
//             else{// toh close hoga toh open ko n pop krdiya 
//              if(!stack.isEmpty()){
//                 stack.pop();//agr woh empty hai then * ko pop krdiya bcz we can replace with the star
//             }
//             else if(!st.isEmpty()){
//                 st.pop();
//             }
//             else {
//                 return false;//agar dono empty retunr false
//             }
//             }
//         }
//         while(!stack.isEmpty()){//means open mai hai braces but replace ke liye star khtm return false
//             if(st.isEmpty()){
//                 return false;
//             }
//             else if(stack.peek()<st.peek()){
//                 stack.pop();
//                 st.pop();
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
        
//     }
// }