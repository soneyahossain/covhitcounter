import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CloverParser {

    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("output.txt");
            File xmlFile = new File("src/test/resources/joda-time/target/site/clover/clover.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("file");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element fileElement = (Element) nodeList.item(i);
                String fileName = fileElement.getAttribute("path");
                NodeList lineList = fileElement.getElementsByTagName("line");
                for (int j = 0; j < lineList.getLength(); j++) {
                    Element lineElement = (Element) lineList.item(j);
                    int lineNumber = Integer.parseInt(lineElement.getAttribute("num"));

                    if (lineElement.getAttribute("count") == null || lineElement.getAttribute("count").isEmpty())
                        continue;
                    int hits = Integer.parseInt(lineElement.getAttribute("count"));
                    writer.write("File: " + fileName + ", Line: " + lineNumber + ", Hits: " + hits + "\n");

                }
            }
            writer.close();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
