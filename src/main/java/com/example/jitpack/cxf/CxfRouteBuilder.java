package com.example.jitpack.cxf;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.jaxws.CxfEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CxfRouteBuilder extends RouteBuilder {

    @Autowired
    private CxfEndpoint producerCxf;

    @Override
    public void configure() throws Exception {
        from("direct:start")
            .to("cxf:bean:producerCxf");
    }
}