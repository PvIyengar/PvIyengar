package DSA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr1FizzBuzz{
    static String[] solve(int n){
        List<String> answer=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if((i%3)==0 && (i%5)==0){
                answer.add("FizzBuzz");
            }
            else if((i%3)==0){
                answer.add("Fizz");
            }
            else if((i%5)==0){
                answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(i));
            }
        }
        System.out.println("Final List:"+answer);
        return answer.toArray(new String[0]);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        String[] result=solve(n);
        // System.out.print(result);
        for(String s:result){
            System.out.println(s);
    }
    scanner.close();
}
}