/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodle;

import java.util.Vector;

/**
 *
 * @author Abhishek,Rahul
 */
abstract public class User                                                          /*Abstract Parent class for Faculty and Student*/
{
    static int[][] attend;
    static Vector files;
    
    void ass()                                                                      /*Predefined Attachments*/
    {
        attend = new int[70][2];
        files = new Vector();
        files.addElement("Experiment no. 1");
        files.addElement("Experiment no. 2");
        files.addElement("Experiment no. 3");
        files.addElement("Rubrics Sheet");
        files.addElement("Assignment 1");
        
         int i,j; 
        for(i=0;i<70;i++)
        {
            j=0;
            attend[i][j] = 7300+i;
            attend[i][j+1] = 100;
        }
    }
    
    abstract String dateofchange();                                                 /*Abstract Method*/
    
    public void viewAttend()                                                        /*display Attendance*/
    {
        int i,j;
        System.out.println("******************************/ Attendence Record /*******************************");
        System.out.println("Roll No.                Attendence (%)");
        for(i=0;i<70;i++)
        {
            j=0;
            System.out.println(attend[i][j]+"                        "+attend[i][j+1]);
        }
    }
    
    public void viewFiles()                                                         /*Display Files*/
    {
        int i;
        
        System.out.println("\nUPLOADED Files : ");
        if(!files.isEmpty())
        {
            for(i=0;i<files.size();i++)
            {
                 System.out.println(i+1+"."+files.get(i));
            }
        }
        else
            System.out.println("Sorry ! Files list is Empty !");
    }
    
}
