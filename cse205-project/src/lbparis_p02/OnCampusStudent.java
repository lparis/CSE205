package lbparis_p02;

public class OnCampusStudent extends Student 
{
	private int mResident;
	private double mProgramFee;
	
	// Constructor
	public OnCampusStudent(String mid, String mFname, String mLname) 
	{
		// Leverage superclass constructor
		super(mid, mFname, mLname);
	}
	
	// Method to calculate the tuition
	public void calcTuition()
	{
	   double t;
	   if(getResidency()==1)
	   {
	       t=TutionConstants.ONCAMP_RES_BASE;
	   }
	   else
	       t=TutionConstants.ONCAMP_NONRES_BASE;
	   t=t+getProgramFee();
	   if(getCredits()>TutionConstants.ONCAMP_MAX_CREDITS)
	   {
	       t=t+(getCredits()-TutionConstants.ONCAMP_MAX_CREDITS)*TutionConstants.ONCAMP_ADD_CREDITS;
	      
	   }

	setTution(t);
	}
	   public double getProgramFee()
	   {
	       return this.mProgramFee;
	   }
	   public void setProgramFee(double mProgramFee)
	   {
	       this.mProgramFee=mProgramFee;
	   }
	   public void setResidency(int pResident)
	   {
	       mResident=pResident;
	   }
	   public int getResidency()
	   {
	   return mResident;
	   }
	}