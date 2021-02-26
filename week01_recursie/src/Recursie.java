import java.util.ArrayList;
import java.util.List;

public class Recursie {


    // Oefening 1: n-de Fibonacci-getal

    public static int fibonacci(int getal) {
        if(getal<=0){
            throw new IllegalArgumentException("bad num");
        }
        if(getal <= 2){
            return 1;
        }
            return fibonacci(getal-1)+fibonacci(getal-2);
        
    }

    // Oefening 2 : som van cijfers

    public static int somVanCijfers(int getal) {
        if(Math.abs(getal)==0){
            return 0;
        }
        return Math.abs(getal)%10 + somVanCijfers(Math.abs(getal)/10);
    }

    // Oefening 3: keer een string om
    public static String keerOm(String s) {
        if(s == null){
            throw new IllegalArgumentException("empty?");
        }
        if(s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        return s.charAt(s.length()-1)+keerOm(s.substring(0,s.length()-1));
    }

    //oefening 4: countX

    public static int countX(String s) {
        if (s == null){
            throw new IllegalArgumentException("Cannot be null");
        }
        if (s.length() <= 0) {
            return 0;
        } else{
            String first_element = s.substring(0,1);
            String rest_string = s.substring(1);
            if (first_element.equals("x")){
                return 1 + countX(rest_string);
            } else
            {
                return countX(rest_string);
            }
        }
    }

    //oefening 5 : countHi
    public static int countHi(String s) {
        if(s == null){
            throw new IllegalArgumentException("null obj");
        }
        if(s.length()<2){
            return 0;
        }
        if(s.length()==2){
            if(s.equalsIgnoreCase("hi")){
                return 1;
            }
            return 0;
        }
        return countHi(s.substring(0, s.length()-1))+countHi(s.substring(s.length()-2,s.length()));
        
    }

    // oefening 6
    public static String changeXY(String s) {
        if(s == null){
            throw new IllegalArgumentException("null obj");
        }
        if(s.length()==0){
            return s;
        }
        if(s.length()==1){
            if(s.equalsIgnoreCase("x")){
                return "y";
            }
            if(s.equalsIgnoreCase("y")){
                return "x";
            }
            return s;
        }
        return changeXY(s.substring(0, s.length()-1))+changeXY(s.substring(s.length()-1,s.length()));
        
    }

    // oefening 7
    public static String changePi(String s) {
        if(s == null){
            throw new IllegalArgumentException("null obj");
        }
        System.out.println(s);
        if(s.length()<=1){
            return s;
        }else{
            if ((s.substring(0, 2)).equals("pi")){
                return "3.14"+changePi(s.substring(2));
        }else{
            return s.charAt(0)+changePi(s.substring(1));
        }
        }
    }

    // oefening 8:
    // public static int tweelog(int getal) {
    //     if(getal<=1){
    //         return (int) 0;
    //     }
    // }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}