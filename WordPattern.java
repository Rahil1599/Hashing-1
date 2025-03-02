//Time Complexity- O(mk) where k is the no of letters in the word and m is length of the pattern
//Space Complexity- O(nk)
//Successfully ran on leetcode

import java.util.HashMap;

class WordPattern {
 public boolean wordPattern(String pattern, String s) {
     String[] strArray= s.split(" ");
     if(pattern.length()!= strArray.length) return false;
     
     HashMap<Character, String> pMap= new HashMap();
     HashMap<String, Character> sMap= new HashMap();
     
     for(int i=0; i< pattern.length(); i++){
         
         char pChar= pattern.charAt(i);
         String str= strArray[i];
         
         if(pMap.containsKey(pChar)){
             
             if(!str.equals(pMap.get(pChar))){
                 return false;
             }   
         }
         else {
             pMap.put(pChar, str);
         }
         
         if(sMap.containsKey(str)){
             
             if(sMap.get(str)!= pChar){
                 return false;
             }
         }
         
         else sMap.put(str, pChar);
     }
     
     return true;
}
}