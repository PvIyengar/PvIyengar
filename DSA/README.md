This README document maintains the one common point of truth regarding the problems solved and learnings learnt.

**Java Language**

**Imports**
Syntax - 
"import java.utils.*" where instead of * the specific collections can be mentioned.
For ex:- If we want to use ArrayList, then the import will be "java.utils.ArrayList", in case of List usage "*" will get replaced by "List".
Link for different UTILs that can be used - https://chatgpt.com/c/676c5980-03c0-800c-bf04-1ee478a584e1

**Manual Inputs using Scanner class**
In Java to make the code capable of giving Input Scanner Class is used
Import - java.util.Scanner
Syntax - 
Scanner var=new Scanner(System.in);
System.out.print("Print statement for the user")
DataType var=scanner.nextInt/Line/Doube/()
TO read single characters use
scanner.next().charAt(0)
After done with using Scanner class, close the scanner class
scanner.close()

*Problems*
Pr1FizzBuzz
-> This problem executes the Word Game FizzBuzz, where numbers are iterated N times and if the number is divisible by 3 and 5, then instead of the number "FizzBuzz" is to be stored, if divisible by 3, "Fizz", if divisble by 5, "Buzz" and else the input number itself.
Base Conditions
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