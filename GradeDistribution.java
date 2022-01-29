import java.util.TreeMap;
import java.util.Map;

public class GradeDistribution {
    private static final int MIN = 0, MAX = 60;
    private static final int[] RANGE_STARTS = {0, 30, 35, 40, 45, 50};

    private TreeMap<Integer, Integer> rangeCount = new TreeMap<Integer,Integer>();
    private int totalScores = 0, acceptedScores = 0;

    public GradeDistribution(){
        for (int s : RANGE_STARTS) {
            rangeCount.put(s, 0);
        }
    }

    public void add(int grade) {
        if (grade < MIN || grade > MAX) {
            return;
        }

        Map.Entry<Integer,Integer> e = rangeCount.floorEntry(grade);
        rangeCount.put(e.getKey(), e.getValue() + 1);

        totalScores++;
        if (e.getKey() > MIN) {
            acceptedScores++;
        }
    }

    public void print(){
        int rangeNum = 1;
        for (int count : rangeCount.tailMap(MIN, false).values()) {
            System.out.printf("%d: ", rangeNum++);
            for (; count > 0; count--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public double getAcceptedPercent(){
        return (100.0 * acceptedScores) / totalScores;
    }
}