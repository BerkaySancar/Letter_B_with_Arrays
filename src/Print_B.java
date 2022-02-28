public class Print_B {
    public static void main(String[] args) {

        String[][] letter = new String[7][3];

        // i -> row
        // j -> column

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 2) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "    ";
                }
            }

        }
        for (String[] row : letter) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
