public class DataGeneratorFactory {
    public DataGenerator createGenerator(String dataType) {
        if (dataType.equals("integer")) {
            return new IntegerDataGenerator();
        } else if (dataType.equals("string")) {
            return new StringDataGenerator();
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
}
