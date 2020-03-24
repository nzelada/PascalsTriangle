package NickZelada;

/**
 * This is the PascalsTriangle class, in which would make the Pascals Triangle.
 *
 * @author Nick Zelada
 * @version October 1, 2018
 */
public class PascalsTriangle {

    int num[][]; // 2d array for the numbers
    int row; // number of rows

    /**
     * The PascalsTriangle constructor that would call for the number of rows
     * and creation of the triangle
     *
     * @param row , the number input by the user
     */
    public PascalsTriangle(int row) {
        this.row = row;
        createPascals();

    }

    /**
     * This method will create the triangle by calling the constructor
     */
    private void createPascals() {
        num = new int[row + 1][]; // starting at one instead of 0, since we are using real life numbers
        num[1] = new int[1 + 2]; // first row

        num[1][1] = 1; // 1 row by 1 column

        for (int i = 2; i <= row; i++) { // for row 2 and beyond
            num[i] = new int[i + 2];
            for (int j = 1; j < num[i].length - 1; j++) {
                num[i][j] = num[i - 1][j - 1] + num[i - 1][j]; // number in the row before and column before + number in the row before and next column
            }
        }
    }
/**
 * 
 * @return the string that shows the representation of Pascals Triangle by the number of row requested
 */
    public String toString() {

        int spaces = 3; // number of spaces
        String output = "";

        for (int i = 1; i <= row; i++) { // adding the numbers before the spaces
            for (int k = row; k > i; k--) { 
                output += String.format("%" + spaces + "s", " ");
            }
            for (int j = 1; j < num[i].length - 1; j++) { // adding numbers to the string
                output += String.format("%" + (2 * spaces) + "s",
                        num[i][j]);
            }
            output += "\n";
        }
        return output;
    }
}
