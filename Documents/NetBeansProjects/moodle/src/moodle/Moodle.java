package moodle;
import java.util.*;


/**
 *
 * @author Abhishek,Rahul
 */


public class Moodle                                             /*this class uses Faculty and Student*/
{
    Moodle()
    {   
        Scanner sc = new Scanner(System.in);
        String choice;
        int iden;
        String date = null;
        int countf=0,counts=0;
        
        
        
        do
        {    
            System.out.println("\n***********************/ Fr.Conceicao Rodrigues College of Engineering /***********************");
            System.out.println();
            System.out.println();
            System.out.println("                                        - : Welcome to Moodle : -                                \n");
        
            System.out.println("Please Choose Your Login Option : \n");
            System.out.println(" * For FACULTY Login press f ");
            System.out.println(" * For STUDENTS Login press s  ");
            System.out.println(" * For Exit Press e ");
            choice = sc.next();
            
            if("f".equals(choice))                                                      /*Faculty Login*/
            {   
                int op;
                Faculty f1;
                f1 = new Faculty();
                f1.ass();
                
                
                do
                {
                     System.out.println("\n******************************/ Welcome To Moodle Faculty Portal /******************************");
                
                    if(countf != 0)
                    {
                        System.out.println("\nLast login : "+date+"\n Succesful Login : "+countf);
                    }
                
                
                    System.out.println("\nEnter Option : ");
                    System.out.println("1. View Upoaded Files  ");
                    System.out.println("2. Upload File ");
                    System.out.println("3. Delete File ");
                    System.out.println("4. View Attendence ");
                    System.out.println("5. Edit Attendence ");
                    System.out.println("6. Logout ");
                    
                
                    op = sc.nextInt();
                
                    switch(op)
                    {
                        case 1 : f1.viewFiles();
                               break;
                        case 2 : f1.upload();
                                break;
                        case 3 :f1.delete();
                                break;
                        case 4 : f1.viewAttend();
                                break;
                        case 5 : f1.editAttend();
                                break;
                        case 6  :   System.out.println("Logged Out !\n");
                                    countf ++;
                                   date =  f1.dateofchange();
                                   break;
                        default : System.out.println("\n Please Enter Valid Option !! ");
                    }
                }while(op != 6);
               
            }    
            
            else if ("s".equals(choice))                                          /*Student Login*/
            {
                int op2;
                Student s1 = new Student();
                if(countf == 0)
                    s1.ass();
                
                do
                {
                    System.out.println("\n***********************/ Welcome To Moodle Students Portal /***********************");
                
                    if(counts != 0)
                    {
                        System.out.println("\nLast login : "+date+"\n Succesful Login : "+counts);
                    }
                    System.out.println("\nEnter Option : ");
                    System.out.println("1. View Downloadable Content ");
                    System.out.println("2. View My Attendence ");
                    System.out.println("3. View Attendence ");
                    System.out.println("4. Logout ");
                
                    op2 = sc.nextInt();
                
                    switch(op2)
                    {
                    
                        case 1 : 
                                 s1.viewFiles();
                                 System.out.println("\nEnter the File Number to Download the File : ");
                                 int d = sc.nextInt();
                                 System.out.println(" File Downloaded Successfully !");
                                 break;
                        case 2 : System.out.println("\n Enter Your Roll No. : ");
                                 int roll = sc.nextInt();
                                 s1.viewAttend(roll);
                                 break;
                        case 3  : s1.viewAttend();
                                  break;
                        case 4  :    System.out.println("Logged Out !\n");
                                     counts ++;
                                     date =  s1.dateofchange();
                                     break;
                        default : System.out.println("\n Please Enter Valid Option !! ");
                                  
                    }
                    
                }while(op2 != 4);
                
            }
            else if(!"e".equals(choice))
                System.out.println("Choose Valid Option !");
        }while(!"e".equals(choice)); 
    }
}


