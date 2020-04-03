/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmUp;

/**
 *
 * @author krist
 */
public class WarmUp {
    
    public static void main (String[] args){    
        System.out.println("Hello World!");
    
        String[] languages = {"C", "C++", "C#", "Python", "GO", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        toString(languages);
        System.out.println(generateInteger(10));
        System.out.println("This summer I will learn " + languages[generateInteger(10)]);
    }
        public static int generateInteger (Integer n){
        n = (int)(Math.random()*1000000);
        System.out.println(n);
        int m = n*3/7;
        System.out.println(m);
        int sum = 0;
        int sumfin = 0;
        int i = 0;
        while (m>0 && i<5){
        sum = m % 10 + sum;
            m = m/10;
            i++;  
        }
        System.out.println(sum);
        while (sum !=0){
            sumfin = sumfin + sum%10;//daca sum e 29, cand aduni 2+9=11, dar el nu mai recalculeaza
            sum=sum/10;//inca o conditie pt sumfin sa nu aiba 2 digits
        }
        return sumfin;
    }

    private static void toString(String[] languages) {
        System.out.println("{\"C\", \"C++\", \"C#\", \"Python\"}"); //To change body of generated methods, choose Tools | Templates.
    }
}
