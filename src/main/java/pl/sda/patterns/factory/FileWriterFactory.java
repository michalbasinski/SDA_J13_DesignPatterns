package pl.sda.patterns.factory;

public class FileWriterFactory {

    public FileWriter produce(String path) {
        if (path.endsWith(".xml")) {
            return new XmlWriter();
        }
        if (path.endsWith(".json")) {
            return new JsonWriter();
        }
        if (path.endsWith(".pdf")) {
            return new PdfWriter();
        }
        if (path.endsWith(".csv")) {
            return new CsvWriter();
        }
        if (path.endsWith(".xlsx")) {
            return new ExcelWriter();
        }
        return null;
    }

    public FileWriter producev2(String path) {
        FileWriter fileWriter = null;

        if (path.endsWith(".xml")) {
            fileWriter = new XmlWriter();
        }
        if (path.endsWith(".json")) {
            fileWriter = new JsonWriter();
        }
        if (path.endsWith(".pdf")) {
            fileWriter = new PdfWriter();
        }
        if (path.endsWith(".csv")) {
            fileWriter = new CsvWriter();
        }
        if (path.endsWith(".xlsx")) {
            fileWriter = new ExcelWriter();
        }
        return fileWriter;
    }
}
