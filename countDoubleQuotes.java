/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassesNew;

/**
 *
 * @author User
 */
public class countDoubleQuotes {
    
    public int checkNoOfTextInDoubleCode(String code) { // get the complexity of text inside a pair of double quotes
        char chr;
        int count = 0;
        
        Stack sk = new Stack(code.length());
        for(int i = 0; i < code.length(); i++) {
            chr = code.charAt(i);
            sk.push(chr);         
        }
        
        while(!sk.isEmpty()) {
           char poppedlettr = sk.pop();
           if(poppedlettr == '\"') {
               count++;
           }
        }
        count++;
                
        return (count / 2);
    }    
    
}
