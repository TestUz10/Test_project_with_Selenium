package hw20_Serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import hw20_Serialization.json.Employee;
import hw20_Serialization.json.Role;
import hw20_Serialization.xml.Person;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        //JSON
        System.out.println("Reading employee from json file... ");
        ObjectMapper jsonMapper = new ObjectMapper();
        Employee employee = jsonMapper.readValue(new File("example.json"), Employee.class);
        System.out.println("employee = " + employee);

        System.out.println("Updating employee...");
        employee.setRole(Role.QA);
        employee.getProperties().setSalary("$5000 USD");

        String employeeAsJson = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println("employeeAsJson = " + employeeAsJson);

        String fileName = "exampleUpdated.json";
        System.out.println("Writing to " + fileName + " file...");
        jsonMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), employee);
        System.out.println("Done!");

        //XML
        System.out.println("Reading person from xml file... ");
        ObjectMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(new File("HometaskXML.xml"), Person.class);
        System.out.println("person = " + person);

        System.out.println("Updating person...");
        person.setFirstName("Mike");
        person.getPhoneNumbers().add("+380631122233");
        person.getAddresses().get(0).setCity("London");

        String personAsXml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println("personAsXml = " + personAsXml);

        String xmlFileName = "HometaskXMLUpdated.xml";
        System.out.println("Writing to " + xmlFileName + " file...");
        xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(xmlFileName), person);
        System.out.println("Done!");

    }
}
