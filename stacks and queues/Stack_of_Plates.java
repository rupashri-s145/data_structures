import java.util.*;
	public class setofstacks
	{
	    ArrayList<Stack> setofplates = new ArrayList<Stack>();
		int cnt = 0;
		Stack<Integer> stack;
	

		void push(int i,int cp) {
			if (cnt == cp || cnt== 0) {
				cnt = 0;
				stack = new Stack<>();
				setofplates.add(stack);
			}
			stack.push(i);
			cnt++;
		}
	

		int pop(int cp) {
			if(cnt == 1)
			{
				cnt = cp;
			}
			else
			  cnt--;
			return (Integer) setofplates.get(setofplates.size() - 1).pop();
		}
		public static void main(String[] args) {
			setofstacks m=new setofstacks();
			Scanner sc=new Scanner(System.in);
			int cp=sc.nextInt();
			int len=sc.nextInt("enter the size of list: ");
			int j=0;
			int k[]=new int[len];
			for(int i=0;i<len;i++)
			{
			    String action=sc.next();
			    
			    if(action.equals("push"))
			    {
			        int num=sc.nextInt();
			         m.push(num,cp);
			    }
			     
			    else if(action.equals("pop"))
			      {
			      k[j]=m.pop(cp);
			      j++;
			      }
			}
			for(int i=0;i<m.setofplates.size();i++)
			{
			    System.out.print(m.setofplates.get(i));
			}
			
		}
	}
