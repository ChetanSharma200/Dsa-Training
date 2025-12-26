// Fully optimized
class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
    int hours =0;
    int prev = Integer.MAX_VALUE;
    int countOfNo = 0 ;
     for(int i =0;i<n;i++){
        int panalty = countOfNo;
        if(panalty < prev){
            hours = i;
            prev = panalty;
        }
        if(customers.charAt(i) =='N')countOfNo++;
         if(customers.charAt(i)== 'Y')countOfNo --;
     }
     int panalty = countOfNo;
     if(panalty < prev) hours = n;
      return hours;
    }
}


// By Two Variables
class Solution {
    public int bestClosingTime(String customers) {
        
        int n = customers.length();
        int countOfYes = 0;
        for (int i = 0; i < n; i++) {
            if(customers.charAt(i) == 'Y'){
              countOfYes ++;
            }
        }

       

    int hours =0;
    int prev = Integer.MAX_VALUE;
    int countOfNo = 0 ;
     for(int i =0;i<n;i++){
       
        int panalty = countOfYes + countOfNo;
        if(panalty < prev){
            hours = i;
            prev = panalty;
        }
        if(customers.charAt(i) =='N')countOfNo++;
         if(customers.charAt(i)== 'Y')countOfYes --;
     }
     int panalty = countOfNo;
     if(panalty < prev) hours = n;
      return hours;
    }
}

//  By Using Prefix and Suffix
class Solution {
    public int bestClosingTime(String customers) {
        int [] prefix = new int[customers.length() + 1];
        int suffix [] = new int[customers.length()+1];
        int yes =0;
        int no =0;
        int n = customers.length();
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (customers.charAt(i) == 'N' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }

    int hours =0;
    int prev = Integer.MAX_VALUE;
     System.out.println(prefix[0] + " " + suffix[0]);
     for(int i =0;i<=n;i++){
        int panalty = 0;
        panalty = prefix[i] + suffix[i];
       
        if(panalty < prev){
            hours = i;
            prev = panalty;
        }
     }
      return hours;
    }
}
