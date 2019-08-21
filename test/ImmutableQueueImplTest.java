import com.paypay.sdechallenge.ImmutableQueueImpl;
import com.paypay.sdechallenge.Queue;
import org.junit.Test;

public class ImmutableQueueImplTest {
    @Test
    public void testQueue() {
        Queue<Integer> obj1 = new ImmutableQueueImpl<>();
        Queue<Integer> obj2;
        Queue<Integer> obj3;
        Queue<Integer> obj4;
        assert obj1.isEmpty();
        obj2 = obj1.enQueue(1);
        assert obj2.head() == 1;
        assert !obj2.isEmpty();
        obj3 = obj2.deQueue();
        assert obj3.head() == null;
        obj4 = obj3.deQueue();
        assert obj4.isEmpty();
    }
}