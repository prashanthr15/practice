package project1;

public class NumIncrement {
    public static void main(String[] args) {
        //int num = 93845;
        int num = 44945;
        
        System.out.println("initial  Result: " + num);  
        int addToDigit = 8;  

       
        int d1 = num / 10000;       
        int d2 = (num / 1000) % 10; 
        int d3 = (num / 100) % 10;  
        int d4 = (num / 10) % 10;   
        int d5 = num % 10;          

        
        int sum = d4 + addToDigit;  
        int carry = sum / 10;       
        int newD4 = sum % 10;       
        d3 += carry;                

        
        int newNum = d1 * 10000 + d2 * 1000 + d3 * 100 + newD4 * 10 + d5;

       
        System.out.println("Final Result: " + newNum);  

       
}}
