public class Recursion {
    public static void main(String[] args) {
    //   fact(5, 1);
    //   evenOdd(100, 0, 0);
      printTable(10, 5,"");
    }
    static void fact(int n,int result){
        if(n==1){
          result*=1;
          System.out.println(result);
          return;
        }
        result*=n;
        fact(n-1, result);
    }
    static void evenOdd(int n,int even,int odd){
        if(n==1){
            odd+=1;
            System.out.println("Even Number " + even + " Odd Number " + odd);
            return ;
        }
        if(n%2==0)even++;
        else odd++;
        evenOdd(n-1,even,odd);
    }
    static void printTable(int n,int number,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
       String st=number + " X " + n + " = " + n*number;
       printTable(n - 1, number,  st + "\n" + str  );
    }
    
}
