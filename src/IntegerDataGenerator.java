import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerDataGenerator implements DataGenerator {
    @Override
    public List<Object> generateData(int n) {
        List<Object> data = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            data.add(random.nextInt(100) + 1);
        }
        return data;
    }
}
