package Day14;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class XmlPrintValue extends DefaultHandler {
    public static void main(String[] args) {
     try {
         SAXParserFactory fact=SAXParserFactory.newInstance();
         SAXParser parser=fact.newSAXParser();
         parser.parse(new File("C:\\Users\\anant\\OneDrive\\Documents\\GitHub\\backend\\src\\Example.xml"),new XmlPrintValue());

     } catch (Exception e) {
         throw new RuntimeException(e);
     }
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start Reading...");
    }
    @Override
    public void endDocument() throws SAXException {
        System.out.println("Reading Ended");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element :"+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element :"+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters :"+new String(ch,start,length));
    }
}
