public class two_d_array{
    public static void main(String[] args){
        // 2D array = an array of arrays
        String [][] brands = new String[3][3];

        brands [0][0] = "SAMSUNG";
        brands [0][1] = "LG";
        brands [0][2] = "SONY";
        brands [1][0] = "TCL";
        brands [1][1] = "HISENSE";
        brands [1][2] = "CHIQ";
        brands [2][0] = "PANASONIC";
        brands [2][1] = "HITACHI";
        brands [2][2] = "TOSIBA";

        //second methods
        String[][] brand = {{"SAMSUNG", "LG", "SONY"},
                            {"TCL", "HISENSE", "CHIQ"},
                            {"PANASONIC", "HITACHI", "TOSIBA"}};

        for (int i = 0; i<brand.length;i++){
            System.out.println();
            for(int j=0; j<brand[i].length;j++){
                System.out.println(brand[i][j]+" ");
            }
        }

    }
}
