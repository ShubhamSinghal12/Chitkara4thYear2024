package Lec17;

import java.util.ArrayList;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void gp(int n,int op,int clo,String ans,ArrayList<String> l)
    {
        if(op==n && clo==op)
        {
            l.add(ans);
        }
        else if(clo > op || op > n)
        {
        	return;
        }
        else
        {
        	gp(n, op+1, clo, ans+"(", l);
        	gp(n, op, clo+1, ans+")", l);
        }        
    }

}
