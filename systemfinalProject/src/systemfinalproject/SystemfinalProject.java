/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemfinalproject;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author HP
 */
public class SystemfinalProject {
 static int nfa = 0;
    static char Epsilon = 'e';

    static void q0(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e' ) {
                q1(x, i + 1);
                q23(x, i + 1);
        } else {
            q0(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q1(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q2(x, i + 1);
                q3(x, i + 1);
            } else {
               q1(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q2(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q5(x, i + 1);
            } else {
                q2(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q3(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'b') {
                q4(x, i + 1);
            } else {
                q3(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q4(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q5(x, i + 1);
            } else  {
                q4(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q5(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q6(x, i + 1);
                q10(x, i + 1);
            } else {
                q5(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q6(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q7(x, i + 1);
        } else {
            q6(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q7(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q8(x, i + 1);
        } else {
            q7(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q8(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q9(x, i + 1);
        } else {
            q8(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q9(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q6(x, i + 1);
            q10(x, i + 1);
        } else {
            q9(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q10(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q11(x, i + 1);
        } else {
            q10(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q11(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q12(x, i + 1);
        } else {
            q11(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q12(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q13(x, i + 1);
        } else {
            q12(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q13(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q14(x, i + 1);
        } else {
            q13(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q14(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q15(x, i + 1);
            q19(x, i + 1);
        } else {
            q14(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q15(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q16(x, i + 1);
        } else {
            q15(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q16(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q17(x, i + 1);
        } else {
            q16(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q17(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q18(x, i + 1);
        } else {
            q17(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q18(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q15(x, i + 1);
            q19(x, i + 1);
        } else {
            q18(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q19(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q20(x, i + 1);
            q21(x, i + 1);
        } else {
            q19(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q20(String x, int i) {
        nfa = 1;
        try {
            q12(x, i + 1);
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q21(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q22(x, i + 1);
        } else {
            q21(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q22(String x, int i) {
        nfa = 1;
        try {
            q22(x, i + 1);
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q23(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q24(x, i + 1);
                q25(x, i + 1);
            } else {
               q23(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q24(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q27(x, i + 1);
            } else {
                q24(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q25(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'a') {
                q26(x, i + 1);
            } else {
                q25(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    
    
    static void q26(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q27(x, i + 1);
            } else  {
                q26(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q27(String x, int i) {
        nfa = -1;
        try {
            if (x.charAt(i) == 'e') {
                q28(x, i + 1);
                q32(x, i + 1);
            } else {
                q27(x, i + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q28(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q29(x, i + 1);
        } else {
            q28(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q29(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q30(x, i + 1);
        } else {
            q29(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q30(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q31(x, i + 1);
        } else {
            q30(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q31(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q28(x, i + 1);
            q32(x, i + 1);
        } else {
            q31(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q32(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q33(x, i + 1);
        } else {
            q32(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q33(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q34(x, i + 1);
        } else {
            q33(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q34(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q35(x, i + 1);
        } else {
            q34(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q35(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q36(x, i + 1);
        } else {
            q35(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q36(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q37(x, i + 1);
            q41(x, i + 1);
        } else {
            q36(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q37(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q38(x, i + 1);
        } else {
            q37(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q38(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q39(x, i + 1);
        } else {
            q38(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q39(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'b') {
            q40(x, i + 1);
        } else {
            q39(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q40(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q37(x, i + 1);
            q41(x, i + 1);
        } else {
            q40(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    static void q41(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'e') {
            q42(x, i + 1);
            q43(x, i + 1);
        } else {
            q41(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q42(String x, int i) {
        nfa = 1;
        try {
            q42(x, i + 1);
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q43(String x, int i) {
        nfa = -1;
        try {
        if (x.charAt(i) == 'a') {
            q44(x, i + 1);
        } else {
            q43(x, i + 1);
        }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    static void q44(String x, int i) {
        nfa = 1;
        try {
            q44(x, i + 1);
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
    
    
    
    
    static int dfa = 0; 
 
    static void q0d(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q1d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q2d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
 
    } 
 
    static void q1d(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q4d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q3d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
        } 
    } 
 
    static void q2d(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q5d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q6d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
 
    } 
 
    static void q3d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                Qd(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q7d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q4d(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q5d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q6d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q5d(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q3d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q4d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q6d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q8d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                Qd(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q7d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q9d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                Qd(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q8d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                Qd(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q10d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q9d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                Qd(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                q7d(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void q10d(String x, int i) { 
        dfa = 1; 
        try { 
            if (x.charAt(i) == 'a') { 
                q8d(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                Qd(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
 
    static void Qd(String x, int i) { 
        dfa = -1; 
        try { 
            if (x.charAt(i) == 'a') { 
                Qd(x, i + 1); 
            } else if (x.charAt(i) == 'b') { 
                Qd(x, i + 1); 
            } 
 
        } catch (StringIndexOutOfBoundsException e) { 
 
        } 
    } 
    
    
    
    
    static int np = 0;
    //Insert grammer here
    static String grammer[][] = {{"S", "S", "S'"}, {"S", "abS", "aA", "b",""},
        {"A", "aB"}, {"B", "baB", "b", ""}, {"S'", "baS'", "bC", "a", " "},
        {"C", "bD"}, {"D", "abD", "a", " "}};

    //Checks if the passed string can be achieved for the grammer
    static String check(String a) {

        String to_ret = "";

        int count = 0;
        for (int i = 0; i < np; i++) {
            for (count = 0; count < grammer[i].length; count++) {
                if (grammer[i][count].equals(a)) {
                    to_ret += grammer[i][0];

                }
            }
        }
        return to_ret;
    }

    //Makes all possible combinations out of the two string passed
    static String combinat(String a, String b) {
        String to_ret ="", temp = "";
        
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                temp = "";
                temp += a.charAt(i) + "" + b.charAt(j);
                to_ret += check(temp);

            }
        }
        return to_ret;
    }
    
    
    
  
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("TO check RE press 1\n"
                +"TO check NFA press 2\n"
                +"TO check DFA press 3\n"
        +"TO check CFG press 4\n");
        int M=s.nextInt();
        switch(M){
        case 1:
              System.out.println("Enter  Regular Expression for First case ");
          String m=s.next();
          System.out.println(Pattern.matches("[b]?(ab)*[a]{2}(ba)*[b]?", m));
          System.out.println("Enter  Regular Expression for Second case ");
          String K=s.next();
          System.out.println(Pattern.matches("[a]?(ba)*[b]{2}(ab)*[a]?", K)); 
          break;
          case 2:
             System.out.println("Enter String: "); 
        String y = s.next(); 
        q0(y, 0); 
        if (dfa > 0) {
            System.out.println("not Accepted"); 
        } else { 
            System.out.println(" Accepted"); 
        } 
          break;
          case 3:
             System.out.println("Enter String: "); 
        String g = s.next(); 
        q0d(g, 0); 
        if (dfa > 0) {
            System.out.println("Accepted"); 
        } else { 
            System.out.println("Not Accepted"); 
        }    
          break;
          case 4:
            String start;
        int n = 0;
        Scanner in = new Scanner(System.in);
        //Start symbol is generally "S"
        start = "S";
        //np = no of productions
        np = grammer.length;
        String temp;
        System.out.println("Enter the string to be checked >>");
        String str = in.nextLine(), st = "", r = "";
        int count;
        String ans_mat[][] = new String[10][10];

        //Fill the diagnol of the matrix (first iteration of algorithm)
        for (int i = 0; i < str.length(); i++) {
            r = "";
            st = "" + str.charAt(i);
            for (int j = 0; j < np; j++) {
                for (count = 1; count < grammer[j].length; count++) {
                    if (grammer[j][count].equals(st)) {
                        r += grammer[j][0];
                    }
                }
            }
            ans_mat[i][i] = r;
        }

        //Fill the rest of the matrix
        for (int i = 1; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                r = "";
                for (int k = j - i; k < j; k++) {
                    r += combinat(ans_mat[j - i][k], ans_mat[k + 1][j]);
                }
                ans_mat[j - i][j] = r;
            }
        }

        //The last column of first row should have the start symbol
       /* if (ans_mat[0][str.length() - 1].indexOf(start) >= 0) {
            accept();
        } else {
            reject();*/
       System.out.println(Pattern.matches("(ab)+[a]{2}(ba)+[b]", str));//true
        System.out.println(Pattern.matches("(ab)+[a]{2}(ba)+[b]", "ababaaabab"));//false
System.out.println(Pattern.matches("(ba)+[b]{2}(ab)+[a]?", str));//true
/* public static void accept() {
        System.out.println("String is accepted");
        System.exit(0);
    }

    public static void reject() {
        System.out.println("String is rejected");
        System.exit(0);
    }*/
          break;
          default:
              System.out.println("wrong input");
        }
    }
    
}
