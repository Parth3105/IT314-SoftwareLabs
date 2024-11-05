import java.util.ArrayList;

public class Lab9 {
    public int doGraham(ArrayList<Point> p) {
        int i, j, min, M;

        Point t;
        min = 0;

        // search for minimum:
        for (i = 1; i < p.size(); ++i) {
            if (p.get(i).y < p.get(min).y) {
                min = i;
            }
        }

        // continue along the values with same y component
        for (i = 0; i < p.size(); ++i) {
            if ((p.get(i).y == p.get(min).y) && (p.get(i).x > p.get(min).x)) {
                min = i;
            }
        }

        return min;
    }
}
