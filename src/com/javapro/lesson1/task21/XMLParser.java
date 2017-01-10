package com.javapro.lesson1.task21;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
/**
 * Created by smith on 10.01.17.
 */
public class XMLParser {

    public static final String path = "/media/smith/FC8C6E888C6E3D70/Java-projects/Learning/src/com/javapro/lesson1/task21/trains.xml";

    public static void main(String[] args) {
        try {
            File xml = new File(path);

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(xml);

            Element root = doc.getDocumentElement();
            System.out.println("File: " + root.getNodeName());
            System.out.println("-----------------");

            NodeList list = root.getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    System.out.println("Train (id = " + element.getAttribute("id") + "):");

                    System.out.println("From: " + element.getElementsByTagName("from").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("To: " + element.getElementsByTagName("to").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("Date: " + element.getElementsByTagName("date").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("Departure: " + element.getElementsByTagName("departure").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("----------------------");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
