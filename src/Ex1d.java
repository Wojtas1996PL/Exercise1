import java.util.Arrays;

public class Ex1d {
    public void method1d(){
        String[][] arr = new String[10][10];
        String[] letter = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0, j = 9; i >= 0 && j >= 0; i++, j--) {
            arr[i][0] = letter[j] + 0;
            arr[i][1] = letter[j] + 1;
            arr[i][2] = letter[j] + 2;
            arr[i][3] = letter[j] + 3;
            arr[i][4] = letter[j] + 4;
            arr[i][5] = letter[j] + 5;
            arr[i][6] = letter[j] + 6;
            arr[i][7] = letter[j] + 7;
            arr[i][8] = letter[j] + 8;
            arr[i][9] = letter[j] + 9;
        }
        for (String[] element : arr) {
            System.out.println(Arrays.toString(element).replace(",", "").replace("[", "").replace("]", ""));
        }
    }
}

