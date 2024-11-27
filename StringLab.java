public class StringLab{
    public static void main(String[] args) {
        
        //task 1//
        String str = "Welcome to the Java String Lab!";
      
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring 'Java': " + str.substring(15, 19));

        System.out.println("Uppercase:" + str.toUpperCase());
        System.out.println("Lowercase:" + str.toLowerCase());
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Contains 'Lab': " + str.contains("Lab"));
        System.out.println("Replace 'Java': " + str.replace("Java", "Java Programming"));

        String[] words = str.split(" ");
        for (String word : words) {
          System.out.println("Word: " + word);
        }

        System.out.println("Equals: " + str.equals(" Java String Lab!"));
        System.out.println("Equal Ignore Case: " + str.equalsIgnoreCase("Java String Laba!"));

        //task 2//
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb);

        int start = sb.indexOf("Learning");
        sb.delete(start, start + "Learning".length() + 1); 
        System.out.println("After delete: " + sb); 
        sb.reverse();
        System.out.println("Reversed: " + sb);

        //Task 3 //
         StringBuffer sbf = new StringBuffer("Multithreading Lab");
       
        sbf.append(" - Learning Java");
        System.out.println("After append: " + sbf);
        
       
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sbf);
        
        start = sbf.indexOf("Learning");
        sbf.delete(start, start + "Learning".length() + 1); 
        System.out.println("After delete: " + sbf);
        
        sbf.reverse();
        System.out.println("Reversed: " + sbf);
    }   

}