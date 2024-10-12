public class StringLab 
{
    //this is my main method 
    public static void main(String[] args)
    { 
        System.out.println(" Welcome to the Java String Lab! ");
        String sentence1 = "My name is Java";
        String sentence2 = "This is my lab";
        String sentence3 = "Java Lab";
        System.out.println(sentence.contains("Lab")); 
        
       
        System.out.println("The lengt of the first String is equal to" + sentence1.length());
        System.out.println("The lengt of the second String is equal to" + sentence2.length());
        
        String str = "String Lab";
        char ch = str.charAt(7);
        System.out.println(ch); // Output: W
        System.out.println(str.substring("java")); //Outputs "String Lab"
        String x = "java";
        
        System.out.println("Found Index : " + x.indexOf(x));

        Let text = "Jaba Lab";
        Let result = text.replace("Java", "Java Programming");
         String str = "Java Programming Lab";
                String [] arrOfStr = str.split(" ");
                for (String a : arrOfStr)
               System.out.println(a); 

        System.out.println("Original: ' " + str + "'");
        System.out.println("Original: ' " + str.trim() + "'");

        String s1 = "java string lab!";
        String s2 =" Wellcome to the Java String Lab!"
        String s3 = new String("Wellcome to the Java String Lab!");

        System.out.println(s1 == s2); // false, because s1 dont reflect the same object in the string pool 
        System.out.println(s2 == s3); // true, because s2 reflectate the new operator
        

            
    }
           
    
} 
