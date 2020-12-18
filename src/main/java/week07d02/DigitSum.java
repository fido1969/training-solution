package week07d02;

public class DigitSum {
//Mai Junior/Mid-level feladat:
//Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metóódus mely visszaadja a paraméterül
// kapott szám számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6.


   public int sumOfDigits(int x){

      String number=String.valueOf(x);
       int sum=0;
       for (int i=0;i< number.length();i++){
           sum+=Integer.parseInt(number.substring(i,i+1));
       }
       return sum;
   }

    public static void main(String[] args) {
        DigitSum digitSum= new DigitSum();
        System.out.println(digitSum.sumOfDigits(1345));

    }

}
