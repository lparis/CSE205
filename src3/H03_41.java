// CLASS: 	H03_41.java
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

//package hp3;

package homework3;

import java.util.ArrayList;

public class H03_41 
{
	public int recLinearSearch(ArrayList<String> pList, String pKey, int pBeginIdx, int pEndIdx)
	{
		if(pBeginIdx > pEndIdx)
		{
			return -1;
		}
		else if(pList.get(pBeginIdx).equals(pKey))
		{
			return pBeginIdx;
		}
		else
		{
			return recLinearSearch(pList, pKey, pBeginIdx + 1, pEndIdx);
		}
	}
}
