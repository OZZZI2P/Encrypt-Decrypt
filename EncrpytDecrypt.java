import java.util.Scanner;   
   
public class Main   
{   
    public static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";   
      
    public static String encryptData(String inputData, int shiftKey)   
    {   
        inputData = inputData.toLowerCase();   
          
        String encryptData = "";   
          
        for (int i = 0; i < inputData.length(); i++)   
        {   
            int pos = LETTERS.indexOf(inputData.charAt(i));   
              
            int encryptPos = (shiftKey + pos) % 26;   
            char encryptChar = LETTERS.charAt(encryptPos);   
              
            encryptData += encryptChar;   
        }   
          
        return encryptData;   
    }   
      
      public static void LetterBasicOrder(String encryptDatas){
            
     encryptDatas = encryptDatas.toLowerCase();   
        String encryptLOB = ""; 
        String encryptLS = ""; 
        for (int i = 0; i < encryptDatas.length(); i++)   
        {   
            int poss = LETTERS.indexOf(encryptDatas.charAt(i));   
            poss = poss + 1;
            int position = poss;
            char encryptChar = LETTERS.charAt(position);
            encryptLS += encryptChar;
            encryptLOB += poss;
          
        }   
       System.out.println("Letter Basic Order ===> "+ encryptLOB); 
       System.out.println("Letter Swap ===> "+ encryptLS); 

     }
     
    public static String decryptData(String inputData, int shiftK)   
    {   
        inputData = inputData.toLowerCase();   
          
        String decryptData = "";   
          
        for (int i = 0; i < inputData.length(); i++)   
        {   
              
            int pos = LETTERS.indexOf(inputData.charAt(i));   
              
            int decryptPos = (pos - shiftK) % 26;   
              
            if (decryptPos < 0){   
                decryptPos = LETTERS.length() + decryptPos;   
            }   
            char decryptChar = LETTERS.charAt(decryptPos);   
              
            decryptData += decryptChar;   
        }   
        return decryptData;   
    }   
      
    public static void main(String[] args)   
    {   
        // create an instance of Scanner class   
        Scanner sc = new Scanner(System.in);   
       int choice;
       System.out.println("Enter a String for encryption or decryption: ");   
        String inputData = sc.nextLine();   
          
        System.out.println("Enter the shifted value for encryption or decryption:: ");   
        int shiftKey = Integer.valueOf(sc.nextLine());   
        
                

       do
        {
              System.out.println("Enter 1 for Encryption \nEnter 2 for decryption\nOther number to exit program: "); 
              System.out.println("Enter a Your choice: ");  
        choice = Integer.valueOf(sc.nextLine()); 
            switch (choice) {
            
             case 1:
                 
          
         System.out.println("Encrypted Data ===> "+encryptData(inputData, shiftKey));  
        LetterBasicOrder(encryptData(inputData, shiftKey));
         
            break;
            
            case 2 :
  
         System.out.println("Decrypted Data ===> "+ decryptData(encryptData(inputData, shiftKey), shiftKey));   
          break;
        }
        } while (choice< 2);
        sc.close();   
    }   
}   