import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class Lab9Test {
    Lab9 l;
    @BeforeEach
    void setUp() {
        l=new Lab9();
    }

    @Test
    void doGrahamTest() {
        ArrayList<Point> p=new ArrayList<>();
        p.add(new Point(3,9));
        p.add(new Point(4,7));
        p.add(new Point(5,7));
        assertEquals(2,l.doGraham(p));
    }

    @Test
    void doGrahamTest1() {
        ArrayList<Point> p=new ArrayList<>();
        p.add(new Point(0,0));
        assertEquals(0,l.doGraham(p));
    }

    @Test
    void doGrahamTest2() {
        ArrayList<Point> p=new ArrayList<>();
        p.add(new Point(3,9));
        p.add(new Point(4,7));
        assertEquals(1,l.doGraham(p));
    }
}