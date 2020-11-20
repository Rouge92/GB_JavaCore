package Lesson5;

import java.util.List;

public class Val {
    private String[] header;
    private int[][] data;

    public Val(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHedaer() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

}
