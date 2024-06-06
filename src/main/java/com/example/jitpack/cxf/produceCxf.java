package com.example.jitpack.cxf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;

@Configuration
public class produceCxf {

    @Bean
    public CxfEndpoint producerCxf() {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8090/soap/hl7/patientId");
        cxfEndpoint.setWsdlURL("http://localhost:8090/soap/hl7/patientId?wsdl");
        return cxfEndpoint;
    }
}