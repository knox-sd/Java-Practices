public class Array {
    public static void main(String[] args){
        
        //array = used to store multipule values in a single variable
        String[] brands = {"Samsung", "SONY", "LG", "TCL"};

        brands[0]  = "TOSIBA"; // change data of array list

        System.out.println(brands[3]); //return data based on calling variable

        // second way to access data from array
        String[] brand = new String[3];
        brand[0] = "SAMSUNG";
        brand[1] = "SONY";
        brand[2] = "LG";

        System.out.println(brand[2]);

    }

}
