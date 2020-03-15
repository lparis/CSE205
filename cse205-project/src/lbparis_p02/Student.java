package lbparis_p02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Student implements Comparable<Student> 
{

   private int mCredits;
   private String mFname;
   private String mLname;
   private String mId;
   private double mTution;
   
   public Student(String mid,String mFname,String mLname)
   {
       this.mId=mid;
       this.mFname=mFname;
         
   }
   public String getId()
   {
       return mId;
   }
   public void calcTuition()
   {
         
   }
   //Overridden method
   @Override
   public int compareTo(Student obj)
   {
       if(this.mId.equals(obj.mId))
           return 0;
       return this.mId.compareTo(obj.mId);
   }
   public String getFirstname()
   {
       return this.mFname;
   }
   public void setFirstname(String Firstname)
   {
       this.mFname=Firstname;
   }
   public void setLastname(String Lastname)
   {
       this.mLname=Lastname;
   }
   public String getLastname()
   {
       return this.mLname;
   }
     
   public int getCredits()
   {
       return mCredits;
   }
     
   public void setCredits(int credit)
   {
       this.mCredits=credit;
   }
   public double getTution()
   {
       return this.mTution;
   }
     
   public void setTution(double Tution)
   {
       this.mTution=Tution;
   }
}

