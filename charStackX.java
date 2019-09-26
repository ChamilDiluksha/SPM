package complexity_measure_tool;

public class charStackX {

		private int top;
		private int maxSize;
		private char stackArray[];
		
		public charStackX(int maxSize) {
			super();
			this.maxSize = maxSize;
			stackArray = new char[maxSize];
			this.top = -1;
		}
		
		public void push(char value)
		{
			if(top == maxSize - 1)
			{
				System.out.println("Stack is full");
			}
			else
			{	
				stackArray[++top] = value;
			}
		}
		
		public char pop()
		{
			if(top == -1)
			{
				System.out.println("Stack is empty");
				return 'w';
			}
			else {
				return stackArray[top--];
			}
			
		}
		
		
		public char peek()
		{
			if(top == -1)
			{
				System.out.println("Stack is empty");
				return 'w';
			}
			else {
				return stackArray[top];
			}
		}
		
		public boolean isEmptu()
		{
			return(top == -1);
		}
		
		public boolean iEmpty()
		{
			return(top == maxSize - 1);
		}
		
		public int getCount()
		{
			return top - 1 ;
		}
	}


