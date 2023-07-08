public class Main
{
	    int array[] =new int[5];
	    int top=-1;
	    public boolean push(int x)
	    {
	        top++;
	        array[top]=x;
	        System.out.println("element pushed in "+x);
	        return true;
	    }
	    public int pop()
	    {
	       int x=array[top--];
	       System.out.println("element poped from");
	       int x;
	    }
		public int peek(){
		    return array[top];
		}
	  public static void main(String[] args) {
	      Stack stack= new Stack();
	      stack.push(10);
	      stack.push(20);
	      stack.push(30);
	      stack.push(40);
	      stack.push(50);
	      stack.pop();
	}
}