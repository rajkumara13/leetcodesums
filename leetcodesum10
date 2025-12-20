package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean RegularExpressionMatching10(String s,String p) {
        int a = s.length();
        int b = p.length();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i != a && j != b) {
            System.out.println(i+";"+j);
            if (s.charAt(i) == p.charAt(j)) {
                if (p.charAt(j) == '*') {
                    j--;
                    System.out.println("j--");
                }
                i++;
                j++;
                count++;
            }
            else if (p.charAt(j) == '.'){
                i++;
                j++;
                count++;
            }
            else if (s.charAt(i) == p.charAt(j + 1)) {
                    j += 2;
                    i++;
                    count++;
                }
            System.out.println(count);
            if (count == a) {
                return true;

            }
        }
        return false;
    }
public static void main(String[] args) {
    System.out.println(RegularExpressionMatching10("aabc","a*bc"));
}
}
