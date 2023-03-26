public class Ex1i {
    public void method1i(){
        String keyword = "F0";
        String[][] arr = new String[10][10];
        String[] letter = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i <= 9; i++) {
            arr[i][0] = letter[i] + 0;
            arr[i][1] = letter[i] + 1;
            arr[i][2] = letter[i] + 2;
            arr[i][3] = letter[i] + 3;
            arr[i][4] = letter[i] + 4;
            arr[i][5] = letter[i] + 5;
            arr[i][6] = letter[i] + 6;
            arr[i][7] = letter[i] + 7;
            arr[i][8] = letter[i] + 8;
            arr[i][9] = letter[i] + 9;
        }
        int[] result = findIndex(arr, keyword);
        int[] tab = result;
        int G4one = tab[0];
        int G4two = tab[1];
        System.out.println("F0 surronding values are: ");

        if(G4one <= 0){
        for (int i = G4one; i <= G4one + 1; i++) {
            for (int j = G4two - 1; j <= G4two + 1; j++) {
                if (i != G4one || j != G4two){
                    System.out.println(arr[i][j]);
                }
            }
        }
        }
        else if(G4two <= 0){
            for (int i = G4one - 1; i <= G4one + 1; i++) {
                for (int j = G4two; j <= G4two + 1; j++) {
                    if (i != G4one || j != G4two){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        else if(G4one <= 0 || G4two <= 0){
            for (int i = G4one; i <= G4one + 1; i++) {
                for (int j = G4two; j <= G4two + 1; j++) {
                    if (i != G4one || j != G4two){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        else{
            for (int i = G4one - 1; i <= G4one + 1; i++) {
                for (int j = G4two - 1; j <= G4two + 1; j++) {
                    if (i != G4one || j != G4two){
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
    }

    public int[] findIndex(String stringArr[][],
                           String keyString)
    {
        // initialising result array to -1 in case keyString
        // is not found
        int result[] = { -1, -1 };
        // iteration over all the elements of the 2-D array
        // rows
        for (int i = 0; i < stringArr.length; i++) {
            // columns
            for (int j = 0; j < stringArr[i].length; j++) {
                // if keyString is found
                if (stringArr[i][j].equals(keyString)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        // if keyString is not found then -1 is returned
        return result;
    }
}

