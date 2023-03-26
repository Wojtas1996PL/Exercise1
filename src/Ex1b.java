import java.util.Arrays;

public class Ex1b {
    public void method1b(){
        String[][] arr = new String[10][10];
        String[] letter = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for(int i = 0; i <= 9; i++) {
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
        System.out.println(Arrays.toString(arr[arr.length-1]).replace(",","").replace("[","").replace("]",""));
    }
}
