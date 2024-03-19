import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringDataGenerator implements DataGenerator {
    @Override
    public List<Object> generateData(int n) {
        List<Object> data = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            data.add(generateRandomString(random));
        }
        return data;
    }

    private String generateRandomString(Random random) {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        int length = random.nextInt(6) + 5; // Random length between 5 and 10
        for (int i = 0; i < length; i++) {
            stringBuilder.append(letters.charAt(random.nextInt(letters.length())));
        }
        return stringBuilder.toString();
    }
}
