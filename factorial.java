
// CREATED A CLASS
class FactorialExample2{    
 static int factorial(int n){      
  if (n == 0)      
    return 1;      
  else      
    return(n * factorial(n-1));      
  
 } 
 //CREATED A MAIN METHOD
 public static void main(String args[]){    
  int fact=1;    
  int number=16;//It is the number to calculate factorial      
  fact = factorial(number);     
  System.out.println("Factorial of "+number+" is: "+fact);      
 }    
}    
