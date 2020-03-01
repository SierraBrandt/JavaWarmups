
package javawarmup;


public class JavaWarmup {
    
    public static void main(String[] args) {
        warmup1();
        warmup2();
    }
    
//prints str, n times
//Febuary 29 2020
    public static void warmup1() {
        int n = 2;
        String str = "Hi";
        String result = "";
        for (int i=0; i<n; i++) {
            result += str;
        }
        System.out.println (result);
    }
    
//adds up all values in an array
//March 1 2020
    public static void warmup2() {
        int array[]={-3, 5, 6, 10};
        int result = 0;
        for(int i=0; i < array.length; i++){
             result+=array[i];
        }
        System.out.println(result);
    }


}
