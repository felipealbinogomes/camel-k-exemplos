package com.example.jitpack.cxf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.apache.camel.component.cxf.common.DataFormat;


@Configuration
public class ProduceCxf {

    //    @Bean
//    public CxfEndpoint producerCxf() throws ClassNotFoundException {
//        CxfEndpoint cxfEndpoint = new CxfEndpoint();
//        cxfEndpoint.setAddress("http://localhost:8090/soap/hl7/patientId");
//        cxfEndpoint.setWsdlURL("http://localhost:8090/soap/hl7/patientId?wsdl");
//    //    cxfEndpoint.setServiceClass("PatientIdService");
//        return cxfEndpoint;
//    }
    @Bean
    public CxfEndpoint producerCxf() throws ClassNotFoundException {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
    //    cxfEndpoint.setAddress("http://localhost:8090/soap/hl7/patientId");
        cxfEndpoint.setWsdlURL("http://localhost:8090/soap/hl7/patientId?wsdl");
        cxfEndpoint.setDataFormat(DataFormat.MESSAGE);
        return cxfEndpoint;
    }
}