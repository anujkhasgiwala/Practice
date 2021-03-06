package arrayAndString;

public class StringRotation {

	public static void main(String[] args) {
		//Pass strings to areRotation
		if (areRotations("", ""))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
	}

	static boolean areRotations(String str1, String str2) {
        // There lengths must be same and str2 must be a substring of str1 concatenated with str1.  
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
}