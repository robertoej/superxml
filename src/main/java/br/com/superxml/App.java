package br.com.superxml;

import br.com.superxml.bean.Employee;
import br.com.superxml.facade.SuperXMLFacade;
import br.com.superxml.utils.Utils;
import org.beanio.*;

import java.io.*;

public class App {

    private static final String EMPLOYEE_CSV_CONFIG_FILE_NAME = "employees_beanio_csv_config.xml";

    private static final String EMPLOYEE_XML_CONFIG_FILE_NAME = "employees_beanio_xml_config.xml";

    private static final String EMPLOYEE_DATA_CSV_FILE_NAME = "employees.csv";

    private static final String EMPLOYEE_DATA_XML_FILE_NAME = "employees.xml";

    public static void main(String[] args) throws Exception {
        // create a StreamFactory
        StreamFactory factory = StreamFactory.newInstance();

        // load the mapping file
        BeanReader in = SuperXMLFacade.getInstance().getBeanReaderByFileName(factory, EMPLOYEE_XML_CONFIG_FILE_NAME, EMPLOYEE_DATA_XML_FILE_NAME);

        Employee employee;

        while ((employee = (Employee) in.read()) != null) {
            System.out.println(employee);
        }

        in.close();
    }

}
