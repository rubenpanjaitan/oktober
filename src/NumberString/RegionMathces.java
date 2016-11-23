/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

/**
 *
 * @author Hita Do
 */
public class RegionMathces {
    
    public static void main(String[] args){
        String searchMe = "Green Eggs and Ham Eg";
        String findMe ="Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt =false;
        for(int i= 0;i<=(searchMeLength);i++){
            if(searchMe.regionMatches(i, findMe, 0, findMeLength)){
                foundIt=true;
                
                //get the 
                System.out.println("index : "+i+searchMe.substring(i, i+findMeLength));
            }else{
                System.out.println("not found");
            }
        }
    }
    
}
