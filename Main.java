import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Main{

     public static void main(String []args){
        
        //String s = "L2R3F1F4B1B4L2R3";
        System.out.println("Please enter your string here: ");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int length = s.length();
        int si = 0;
        int i =0;
        int FL = 0,FR = 0;
        int D = 0;
        int FV=1,FH=0;
        int v=0,h=0;
        int TD=0;
        
        //System.out.println(" String length "+ length);
        //char c=s.charAt(1);
        //int a=Character.getNumericValue(c);  
        //System.out.println(" character to integer convert value: "+a);
        //System.out.println(" String Value "+ s.charAt(si));
       
        //System.out.println(" int val "+ si);

       if(testAllUpperCase(s) && !isStringOnlyAlphabet(s))
       {

       
          for(i = 0; i < length; i++)
          {
              //System.out.println(" int val "+ si);
              if(si < length)
              {
                    switch(s.charAt(si)) {
                    
                    case  'F':
                        
                        //System.out.println("IN F int "+ si);
                        //System.out.println(" String Value "+ s.charAt(si));
                        si++;
                        int ftemp = 0;
                        ftemp = Character.getNumericValue(s.charAt(si));
                        //System.out.println(" int val "+ ftemp);
                        if(FV == 1)
                        {
                            if(D == 0)
                            {
                              v = v + ftemp;   
                            }else
                            {
                              v = v - ftemp;
                            }
                        }else if(FH == 1)
                        {
                            if(D == 0)
                            {
                              h = h + ftemp;   
                            }else
                            {
                              h = h - ftemp;
                            }
                        }
                        
                        si++;
                        break;
                    case  'B' :
                        //System.out.println("IN B int "+ si);
                        //System.out.println(" String Value "+ s.charAt(si));
                        si++;
                        int btemp = 0;
                        btemp = Character.getNumericValue(s.charAt(si));
                        //System.out.println(" int val "+ temp);
                        if(FV == 1)
                        {
                            if(D == 0)
                            {
                              v = v - btemp;   
                            }else
                            {
                              v = v + btemp;
                            }
                        }else if(FH == 1)
                        {
                            if(D == 0)
                            {
                              h = h - btemp;   
                            }else
                            {
                              h = h + btemp;
                            }
                        }
                        
                        si++;
                        break;
                    case  'R' :
                        //System.out.println("IN R int "+ si);
                        //System.out.println(" String Value "+ s.charAt(si));
                        si++;
                        int rtemp = 0;
                        rtemp = Character.getNumericValue(s.charAt(si));
                        if(rtemp == 1 || rtemp == 3)
                        {
                            if(FV == 0 && FH == 1)
                            {
                                FV = 1;
                                FH = 0;
                            }else if(FV == 1 && FH == 0)
                            {
                                FV = 0;
                                FH = 1;
                            }
                            
                            if(FL == 0 && FR == 1)
                            {
                                if(D == 0)
                                {
                                    D = 1;
                                }else
                                {
                                    D = 0;
                                }
                            }
                        }else if(rtemp == 2)
                        {
                            if(D == 0)
                                {
                                    D = 1;
                                }else
                                {
                                    D = 0;
                                }
                        }
                        FR = 1;
                        FL = 0;
                        
                        
                        si++;
                        break;
                    case  'L' :
                        //System.out.println("IN L int "+ si);
                        //System.out.println(" String Value "+ s.charAt(si));
                        si++;
                        int ltemp = 0;
                        ltemp = Character.getNumericValue(s.charAt(si));
                        if(ltemp == 1 || ltemp == 3)
                        {
                            if(FV == 0 && FH == 1)
                            {
                                FV = 1;
                                FH = 0;
                            }else if(FV == 1 && FH == 0)
                            {
                                FV = 0;
                                FH = 1;
                            }
                            
                            if(FL == 1 && FR == 0)
                            {
                                if(D == 0)
                                {
                                    D = 1;
                                }else
                                {
                                    D = 0;
                                }
                            }
                        }else if(ltemp == 2)
                        {
                            if(D == 0)
                                {
                                    D = 1;
                                }else
                                {
                                    D = 0;
                                }
                        }
                        FR = 0;
                        FL = 1;
                        
                        
                        
                        si++;
                        break;
                    
                    default :
                        //System.out.println(" Error!! Please check your input");
                        break;
                        
                    }
              }
          }
          
         // System.out.println(" Vertical "+Math.abs(v));
        //System.out.println(" Horizontal "+Math.abs(h));

          if(si == length)
          {
            TD = Math.abs(v) + Math.abs(h);
            System.out.println("Final Distance = "+ TD);
          }else{
              System.out.println("Error!! Please check your input ( Start with alphabet or please follow the input pattern or All Alphabets should be in uppercase) ");
          }
          
       }else{
           System.out.println("Error!! Please check your input ( Start with alphabet or please follow the input pattern or All Alphabets should be in uppercase) ");
       }
      }

      public static boolean testAllUpperCase(String str){
          for(int i=0; i<str.length(); i++){
          char c = str.charAt(i);
          if(c >= 97 && c <= 122) {
          return false;
          }
          }
          //str.charAt(index)
          return true;
      }

      public static boolean isStringOnlyAlphabet(String str) 
        { 
            return ((!str.equals("")) 
                    && (str != null) 
                    && (str.matches("^[a-zA-Z]*$"))); 
        }
        
     
}