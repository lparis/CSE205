package lbparis_p02;

public class OnlineStudent extends Student{

	   private boolean mTechFee;
	   public OnlineStudent(String mid, String mFname, String mLname) {
	       super(mid, mFname, mLname);
	       // TODO Auto-generated constructor stub
	   }
	   @Override
	   public void calcTuition()
	   {
	       double t=getCredits()*TutionConstants.ONLINE_CREDIT_RATE;
	       if(getTechFee())
	       {
	           t=t+TutionConstants.ONLINE_TECH_FEE;
	       }
	       setTution(t);
	   }
	   public boolean getTechFee()
	   {
	       return mTechFee;
	   }
	   public void setTechFee(boolean isTechFee)
	   {
	   mTechFee=isTechFee;
	   }
	}