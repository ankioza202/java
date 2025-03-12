/* 
* From given string, find number of occurrence of 'Awesome' 
* */
package org.example;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String s= "XYZ is awesome, work environment is awesome";
        String[] s2 = s.split(" ");
        int count=0;
        for(int i=0;i<s2.length;i++){
            String new_s= s2[i].replace(",","").toLowerCase();
            System.out.println(new_s);
            if(new_s.equals("awesome")) {
                count +=1;
            }
        }
        System.out.println(count);

    }
}
