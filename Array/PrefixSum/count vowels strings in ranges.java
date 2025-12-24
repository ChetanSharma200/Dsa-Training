class Solution {
   private static boolean isVowel(char ch) {
    switch (ch) {
        case 'a', 'e', 'i', 'o', 'u' -> {
            return true;
        }
        default -> {
            return false;
        }
    }
}

    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] vowel = new int[words.length];
        int count = 0 ;
      
        for(int i=0;i<words.length;i++){
            String st = words[i]; 
            if(isVowel(st.charAt(0)) && isVowel(st.charAt(st.length()-1))){
                count+=1;
            }
            vowel[i] = count;
        }
int ans[]= new int[queries.length];

  for(int j =0;j<queries.length;j++){
    int l = queries[j][0];
    int r = queries[j][1];
    if(l==0){
        ans[j]=vowel[r];
    }else{
   ans[j] = vowel[r] -vowel[l-1];
  }
  }
  return ans;
    }
}
