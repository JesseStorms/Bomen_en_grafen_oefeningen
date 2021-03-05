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
        if(s == null){
            throw new IllegalArgumentException("null obj");
        }
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            if(s.equalsIgnoreCase("x")){
                return 1;
            }
            return 0;
        }
        return countX(s.substring(0, s.length()-1))+countX(s.substring(s.length()-1,s.length()));

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
    public static int tweelog(int getal) {
        if(getal<=0){
            throw new IllegalArgumentException("nega num??");
        }
        if(getal<2){
            return 0;
        }
        return 1+tweelog(getal/2);
    }

    // oefening 9;
    public static double findMaximum(List<Double> lijst) {
        if(lijst == null){
            throw new IllegalArgumentException("empty list?");
        }
        if(lijst.isEmpty()){
            throw new IllegalArgumentException("empty list?");
        }
        if(lijst.size()==1){
            return lijst.get(0);
        }
        if(lijst.size()==2){
            return Math.max(lijst.get(1),lijst.get(0));
        }
        List<Double> first = lijst.subList(0, 2);
        List<Double> second = lijst.subList(3, lijst.size());
        return Math.max(findMaximum(first),findMaximum(second));

    }

    // oefening 10;
    public static ArrayList<String> findSubstrings(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}