package day24_wrapper_classes_arraylist;
/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */
public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
/*
        String str = "JAVA java";
        int upper =0;
        int lower =0;

        for (char strChar : str.toCharArray()) {
            if (Character.isUpperCase(strChar)){
                upper++;
            }
            if (Character.isLowerCase(strChar)){
                lower++;
            }
            }
            boolean isequals = upper == lower;
        System.out.println(isequals);
*/
        System.out.println( UpperCaseAndLowerCase("JAVA java"));


    }

    public static boolean UpperCaseAndLowerCase(String str) {

        int upper = 0;
        int lower = 0;

        for (char strChar :str.toCharArray()) {
            if (Character.isUpperCase(strChar)) {
                upper++;
            }else if (Character.isLowerCase(strChar)) {
                lower++;
            }
        }

        return upper == lower;
    }
}
