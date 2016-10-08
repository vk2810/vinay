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
public final class Faculty extends User implements IdPass   
{
    String p;
    int id;
    boolean b;
    
    Faculty()                                                                       /*Accepts Login Credentials*/
    {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n****************************************/ LOGIN PORTAL /****************************************");
        System.out.println("Enter ID        : ");
        id = sc.nextInt();
        System.out.println("Enter Password  : ");
        p = sc.next();
        
        b = isidpassequal(p,id);
        
        if(b != true)
            System.exit(0);
        
    }
    
    public void upload()                                                            /*Uploads a file*/
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Path of File to upload : ");
        String str = sc.nextLine();
        System.out.println("accepted");
        files.addElement(str);
        System.out.println("Uploaded Successfully ! ");
    }
    
    public void delete()                                                            /*delete File*/
    {
        int ct=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter File Number to Delete : ");
        int no = sc.nextInt();
        boolean e = files.isEmpty();
        if(e != true)
        {    
            for(int i=0;i<files.size();i++)
            {
                if((i+1) == no)
                {
                    System.out.println("File Deleted : "+files.elementAt(i));
                    files.removeElementAt(i);
                    System.out.println("Deleted Successfully ! ");
                    ct = 1;
                    break;
                }
            }
        }
        else
        {
            System.out.println("Sorry Cant Delete ! File list is Empty !");
        }
        if(ct == 0)
            System.out.println("File not Found !");
    }
    

    
     public void editAttend()                                                       /*Edit Attendance*/
    {
        int n,i,j,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Roll Number of Student : ");
        n = sc.nextInt();
        System.out.println("accepted");
        for(i=0;i<70;i++)
        {
            if(attend[i][0] == n)
            {
                System.out.println("Enter Revised Attendence : ");
                int a = sc.nextInt(); 
                attend[i][1] = a;
                System.out.println("\n Record Updated !");
                k=1;
            } 
         
        }
        if(k == 0)
            System.out.println("Roll no not found !");
    }

    @Override
    public boolean isidpassequal(String pass, int id)                               /*Checks Login Credentials*/
    {
        String prepass = "faculty";
        int preid = 1000; 
        
        if(pass.equals(prepass) && id == preid )
            return true;
        else
        {
            System.out.println("Sorry ! ID and PASSWORD are not Matching !");
            
        return false;
        }
            
        
    }
    
    
    @Override
    String dateofchange()                                                           /*Returns Last Login Date and time*/
    {
            Date dNow = new Date( );
            SimpleDateFormat ft;
            ft = new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

            String d = String.valueOf( ft.format(dNow) ); 
            return d;
    }
    
}
