public class java_string_case {
    public static void main(String[] args){
        // String = a reference data type that can store one or more characters
        //          referance data type have access to useful methods

        String name = "  Sujan  ";
        // boolean result = name.equals("Sujan"); //comparire string
        // boolean result = name.equalsIgnoreCase("Sujan");// make True
        
        // int result = name.length(); // for name char count
        // char result = name.charAt(0); //retrive name letter by array position
        // int result = name.indexOf("a"); // check position based on letter
        // boolean result = name.isEmpty(); // if blank, true otherwise false.
        // String result = name.toUpperCase(); // for uppercase
        // String result = name.toLowerCase(); //for lowercase
        // String result = name.trim(); // remove all space
        String result = name.replace('j', 'z'); //replace letter from old to new


        System.out.println(result);


    }
}
