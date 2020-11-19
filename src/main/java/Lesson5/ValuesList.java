package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ValuesList {
    public static void writeFile(Val vallist) {
        try (PrintWriter out = new PrintWriter("w_values.csv")) {
            for (String v : vallist.getHedaer()) {
                out.print(v + ";");
            }
            out.println();

            int[][] vallistData = vallist.getData();
            for (int i = 0; i < vallistData.length; i++) {
                for (int j = 0; j < vallistData[i].length; j++) {
                    out.print(vallistData[i][j] + ";");
                }
                out.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Val readFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("values.csv"));
        List<int[]> dataArr = new ArrayList<>();
        String[] dataHeader = in.readLine().split(";");
        String readLine = null;
        while ((readLine = in.readLine()) != null) {
            List<Integer> lineArr = new ArrayList<>();
            String[] tokens = readLine.split(";");
            for (int i = 0; i < tokens.length; i++) {
                lineArr.add(Integer.parseInt(tokens[i]));
            }
            dataArr.add(lineArr.stream().mapToInt(i -> i).toArray());
        }
        Val vallist2 = new Val(dataHeader, dataArr.toArray(new int[0][]));
        int[][] tt = vallist2.getData();
        return vallist2;
    }

    public static void main(String args[]) throws IOException {
        String[] header = {"Val1", "Val2", "Val3"};
        int[][] data = {{500, 700, 300}, {700, 100, 100}, {800, 100, 200},{111, 1111, 111} };
        Val vallist = new Val(header, data);
        writeFile(vallist);

        try {
            Val readedCsv = readFile();
            for (String v : readedCsv.getHedaer()) {
                System.out.print(v + ";");
            }
            System.out.println();
            int[][] readedCsvData = readedCsv.getData();
            for (int i = 0; i < readedCsvData.length; i++) {
                for (int j = 0; j < readedCsvData[i].length; j++) {
                    System.out.print(readedCsvData[i][j] + ";");
                }
                System.out.print("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




