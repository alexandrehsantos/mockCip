package com.cipbancos.scg.webservice.dto;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory
{
  public SCGRequest createSCGRequest()
  {
    return new SCGRequest();
  }
  
  public SCGResponse createSCGResponse()
  {
    return new SCGResponse();
  }
}
