import java.text.DecimalFormat;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner input= new Scanner(System.in);

//              Exercise (Java Basics)
/*1. Develop a program that takes the weight (in kilograms) and height (in meters) as
input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86

*/

        //-------------------------------Exercise 1-----------------------------------
        System.out.println("//---------------------------------------Exercise 1------------------------------------");

        System.out.println("Calculator the BMI");
        System.out.println("Please Enter your weight");
        float weight = input.nextFloat();
        System.out.println("Please Enter your height");
        float height = input.nextFloat();
        float bmi= weight/(height*height);
        // here i want take two decimal only from bmi
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        bmi=Float.valueOf(decimalFormat.format(bmi));
        System.out.println("Your  BMI = "+bmi);

/////////////////////////////////////////////////////////////////////////////////////////
/*
2. Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0%

 */
        //-------------------------------Exercise 2-----------------------------------
       System.out.println("//---------------------------------------Exercise 2------------------------------------");

        System.out.println("Please Enter your Obtained Marks ");
        float obtainedMarks =input.nextFloat();
       float percentage = (obtainedMarks/100)*100;
        DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
        percentage=Float.valueOf(decimalFormat2.format(percentage));
        System.out.println("Percentage is  "+percentage+"%");
/////////////////////////////////////////////////////////////////////////////////////////////
        //-------------------------------Exercise 3-----------------------------------

        /*3. Create a program that takes an amount in one currency and an exchange rate as
input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0
        System.out.println("//---------------------------------------Exercise 3------------------------------------");
*/

        System.out.println("Enter  a amount in USD currency");
        float amount = input.nextFloat();
        float exchange = amount*0.85f;
        DecimalFormat decimalFormat3 = new DecimalFormat("#.##");
        exchange=Float.valueOf(decimalFormat3.format(exchange));
        System.out.println("Exchange Rate (USD to EUR) ="+exchange);
////////////////////////////////////////////////////////////////////////////////////////////
        //-------------------------------Exercise 4-----------------------------------

 /*4 Create a program that takes a string as input, calculates its length, and then reverses
        the string using the StringBuilder class, finally printing both the length and reversed
        string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
*/
/*
        System.out.println("//---------------------------------------Exercise 4------------------------------------");

        System.out.println("Please Enter any word to calculate its length, and then reverse it");
        String strLengthAReverse=input.nextLine();
       strLengthAReverse=strLengthAReverse.replaceAll("\\s","");
        int lengthString=strLengthAReverse.length();
        strLengthAReverse=strLengthAReverse.replace(" ","");
        StringBuilder strObj= new StringBuilder(strLengthAReverse);
        System.out.println("Length of the word is : "+lengthString);
        System.out.println("The reverse word is :"+strObj.reverse());*/
///////////////////////////////////////////////////////////////////////////////////////////


      //-------------------------------Exercise 5-----------------------------------
    System.out.println("//---------------------------------------Exercise 5 in separate file with name Exercise5basics  ------------------------------------");

/*5. Develop a program that takes a sentence as input and extracts a substring from it,
then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox"*/
     /*System.out.println("Please write any sentence you want :");
        String strextract=input.nextLine();
        strextract=strextract.substring(10,20);
        System.out.println("the extracted substring is  :"+strextract);
*/
///////////////////////////////////////////////////////////////////////////////////////////////

/*6. Write a program that takes a sentence and a keyword as input, then check if the
keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence*/
     //System.out.println("//---------------------------------------Exercise 6------------------------------------");

        //-------------------------------Exercise 6-----------------------------------
        System.out.println("//-------------------------------Exercise 6-----------------------------------\n");

        System.out.println("Please write any sentence with a keyword :");
       String sentence=input.nextLine();
       System.out.println("Please write keyword :");
       String keyword=input.nextLine();

       if (sentence.contains(keyword))
                System.out.println(": Keyword "+keyword+" is present in the sentence.");
       else  System.out.println(": Keyword "+keyword+" is not present in the sentence.");

//////////////////////////////////////////////////////////////////////////////////////////////


//---------------------------------------Exercise 7------------------------------------
        /*7. Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"
*/
      System.out.println("//---------------------------------------Exercise 7------------------------------------");

        System.out.println("Please Enter sentence ");
        String sentRep=input.nextLine();
        System.out.println("Please Enter word you want replace  it ");
        String replaceWord= input.nextLine();

        System.out.println("Please Enter word you want replace with it ");
        String replaceWithWord= input.nextLine();
        sentRep=sentRep.replace(replaceWord,replaceWithWord);
        System.out.println(" The Result is  "+ sentRep);

///////////////////////////////////////////////////////////////////////////////////////////

//---------------------------------------Exercise 8------------------------------------

        /*8. Write a program that takes two strings as input and check if they are equal, ignoring
the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).*/

        System.out.println("//---------------------------------------Exercise 8------------------------------------");

     System.out.println("Please Enter word 1");
        String eqWord=input.next();
        System.out.println("Please Enter word 2");

        String eqWord2=input.next();
        boolean equals=eqWord.equals(eqWord2);
        if(equals)
            System.out.println(" Two word equal are so result is? " +equals);
        else
            System.out.println("Two word equal are not so result is  ? " +equals);



    }

}