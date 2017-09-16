import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by wilson on 16/09/2017.
 */
@RunWith(JUnit4.class)
public abstract class BaseAlgorithmTest {

    protected int [] array;

    protected void setUp() {
        array = new int[]{4, 9, 1, 98, 45, 38, 208, 23};
    }

}
