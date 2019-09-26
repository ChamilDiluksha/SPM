/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexity_measure_tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Programmer
 */
public class checkComlexity {
    
    
    	String code_text , allCode, code, Scode;
              charStackX stack; 
        
               public checkComlexity(String fcode) {
		super();
		this.code_text = fcode;
                
                             allCode = code_text.replaceAll("\".*\"","");//remove double quotes
                             Scode = allCode.replaceAll("\\'.*?\\'","");// remove single quotes
//                           code = code.replaceAll("\\s","");  //remove white space

                             code = removeComment.deleteComments(Scode); //remove comments
                             
                             stack = new charStackX(code.length());
	}
	
     
	public int getIfCount()
	{
            
                             String fCode = code.replaceAll("\\s","");  //remove white space
		int count = 0;
		
		Pattern ifPattern = Pattern.compile("if");
		
		Matcher ifmatch = ifPattern.matcher(fCode);
		
		while(ifmatch.find())
		{
                                           if(fCode.charAt(ifmatch.end()) == '(')
                                                   count++;
			
			int no = ifmatch.end();
			
			while(no != fCode.length())
			{
				char ch = fCode.charAt(no);
				
				stack.push(ch);
				
				no++;
			}
			
			while(!stack.isEmptu())
			{
				char ch = stack.pop();
                                
				if(ch == '&')
				{
					if(stack.peek() == '&')
					{
						count++;
						stack.pop();
					}
					else
						count++;
				}
				
                                                          else if(ch == '|')
				{
					if(stack.peek() == '|')
					{
						count++;
						stack.pop();
					}
					else
						count++;
				}
				
			}
		}
	
		return count;
	}
	
	public int getForCount()
	{
            
                            String fCode = code.replaceAll("\\s",""); //remove white space
                            
		int count = 0;
		
		Pattern ifPattern = Pattern.compile("for");
		
		Matcher ifmatch = ifPattern.matcher(fCode);
		
		while(ifmatch.find())
		{
			  if(fCode.charAt(ifmatch.end()) == '(')
                                                   count++;
		}
	
		return count;
	}
	
	
	public int getWhileCount()
	{
            
                             String fCode = code.replaceAll("\\s",""); //remove white space
                             
		int count = 0;
		
		Pattern ifPattern = Pattern.compile("while");
		
		Matcher ifmatch = ifPattern.matcher(fCode);
		
		while(ifmatch.find())
		{
			  if(fCode.charAt(ifmatch.end()) == '(')
                                                   count++;
			
			int no = ifmatch.end();
			
			while(no != fCode.length())
			{
				char ch = fCode.charAt(no);
				
				stack.push(ch);
				
//				if(ch == '{' | ch == ';' )
//				{
//					break;
//				}

				no++;
			}
			
			while(!stack.isEmptu())
			{
				char ch = stack.pop();
                                
				if(ch == '&')
				{
					if(stack.peek() == '&')
					{
						count++;
						stack.pop();
					}
					else
						count++;
				}
				
                                                          else if(ch == '|')
				{
					if(stack.peek() == '|')
					{
						count++;
						stack.pop();
					}
					else
						count++;
				}
				
			}
		}
	
		return count;
	}
        
        
            public int getSwitchCaseCount()
            {
                    int count = 0;

                    Pattern ifPattern = Pattern.compile("case ");

                    Matcher ifmatch = ifPattern.matcher(code);

                    while(ifmatch.find())
                    {
                     //     if(code.charAt(ifmatch.end()) == ':')
                            count++;
                    }

                    return count;
            }
            
            
            public int getCatchCount()
            {
                
                     String fCode = code.replaceAll("\\s",""); //remove white space
                     
                    int count = 0;

                    Pattern ifPattern = Pattern.compile("catch");

                    Matcher ifmatch = ifPattern.matcher(fCode);

                    while(ifmatch.find())
                    {
                              if(fCode.charAt(ifmatch.end()) == '(')
                                                   count++;
                    }

                    return count;
            }
}
