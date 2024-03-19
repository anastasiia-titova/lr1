import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataGeneratorFactory factory = new DataGeneratorFactory();
        DataGenerator generator = factory.createGenerator("string");
        List<Object> data = generator.generateData(5);
        Logger.getInstance().log("Generated data: " + data);
    }
}

