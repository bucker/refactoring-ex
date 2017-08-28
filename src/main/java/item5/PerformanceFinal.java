package item5;

public class PerformanceFinal {
    private String[] row = new String[3];
//    private String name;
//    private int wins;
//    private int loses;

    public void setName(String name) {
        row[0] = name;
    }

    public String getName() {
        return row[0];
    }

    public void setWins(String wins) {
        row[1] = wins;
    }

    public int getWins() {
        return Integer.parseInt(row[1]);
    }


}
