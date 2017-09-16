import com.wilson.study.sort.Insertion;
import com.wilson.study.sort.Selection;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wilson on 16/09/2017.
 */
public class InsertionTest extends BaseAlgorithmTest {

    private Insertion insertion;

    @Before
    public void setUp() {
        super.setUp();
        this.insertion = new Insertion();
    }

    @Test
    public void testSort() {
        this.insertion.sort(this.array);
        this.insertion.printArr(this.array);
    }
}
