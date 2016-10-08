/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Abhishek,Rahul
 */
public final class Student extends User implements IdPass
{
    int id;
    String p;
    boolean b;
    Student()                                                                       /*Accepts Login Credentials*/
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n************************************/ LOGIN PORTAL /************************************");
        System.out.println("Enter ID        : ");
        id = sc.nextInt();
        System.out.println("Enter Password  : ");
        p = sc.next();
        
        b = isidpassequal(p,id);
        
        if(b != true)
            System.exit(0);
    }

    @Override
    public boolean isidpassequal(String pass, int id)                               /*Checks Login Credentials*/
    {   
        String prepass = "student";
        int preid = 7000; 
        
        if(pass.equals(prepass) && id == preid )
            return true;
        else
        {
            System.out.println("Sorry ! ID and PASSWORD are not Matching !");
            
        return false;
        }
        
    }
    
    
    public void viewAttend(int r)                                                        /*display Attendance*/
    {
        int i,j,flag=0;
        
        
        for(i=0;i<70;i++)
        {
            j=0;
            if(attend[i][j] == r)
            {
                System.out.println("******************************/ Attendence Record Found /*******************************");
                System.out.println("Roll No.                Attendence (%)");
                System.out.println(attend[i][j]+"                        "+attend[i][j+1]);
                System.out.println();
                if(attend[i][j+1]<65)
                {
                    System.out.println("-----------------------------* Notice *----------------------------");
                    System.out.println("Since your Attendane is below 65 % , You are in the DEFAULTERS !");
                     System.out.println("Contact Your Mentor for Furthur Details !");
                }
                flag=1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("\n 404 ! Record not Found !");
        
    }
    

    @Override
    String dateofchange()                                                           /*Rturns Last Login date and time*/
    {
            Date dNow = new Date( );
            SimpleDateFormat ft;
            ft = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
            String d = String.valueOf( ft.format(dNow) ); 
            return d;
              
            
    }

    
    
}
