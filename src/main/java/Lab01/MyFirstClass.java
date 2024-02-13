package Lab01;

public class MyFirstClass {
    public static void main(String[] args) {

        String paratlan = "";
        StringBuilder builder = new StringBuilder();

        for (int i=1; i<=9; i+=2) {
            //paratlan += i + " ";
            builder.append(" " + i);
        }

        System.out.println(builder);

        String[][] myTable = new String[10][20];

        for (int i =0; i<myTable.length; i++) {
            for (int j=0; j<myTable[i].length; j++) {
                myTable[i][j] = i + "x" + j;
                System.out.print(myTable[i][j] + " ");
            }
            System.out.println();
        }


    }
}
