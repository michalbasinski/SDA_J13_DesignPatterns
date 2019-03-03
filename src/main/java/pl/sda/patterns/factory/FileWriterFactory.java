package pl.sda.patterns.factory;

public class FileWriterFactory {

    public FileWriter produce(String path) {
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
