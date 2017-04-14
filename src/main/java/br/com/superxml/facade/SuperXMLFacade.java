package br.com.superxml.facade;

import br.com.superxml.utils.Utils;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SuperXMLFacade {
    private static final SuperXMLFacade INSTANCE = new SuperXMLFacade();

    private SuperXMLFacade() { }

    public static SuperXMLFacade getInstance() {
        return INSTANCE;
    }

    public BeanReader getBeanReaderByFileName(StreamFactory factory, String configFileName, String dataFileName) throws IOException {
        factory.load(Utils.getInstance().getResourceAsStream(configFileName));

        // use a StreamFactory to create a BeanReader
        Reader reader = new InputStreamReader(Utils.getInstance().getResourceAsStream(dataFileName));
        return factory.createReader("employeeFile", reader);
    }
}
