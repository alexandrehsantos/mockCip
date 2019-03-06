package com.cipbancos.scg.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.cipbancos.scg.webservice.dto.SCGRequest;
import com.cipbancos.scg.webservice.dto.SCGResponse;

@XmlRegistry
public class ObjectFactory
{
  private static final QName _ScgRequest_QNAME = new QName("http://webservice.scg.cipbancos.org.br", "scgRequest");
  private static final QName _ScgResponse_QNAME = new QName("http://webservice.scg.cipbancos.org.br", "scgResponse");
  private static final QName _Confirmation_QNAME = new QName("http://webservice.scg.cipbancos.org.br", "confirmation");
  private static final QName _Id_QNAME = new QName("http://webservice.scg.cipbancos.org.br", "id");
  
  @XmlElementDecl(namespace="http://webservice.scg.cipbancos.org.br", name="scgRequest")
  public JAXBElement<SCGRequest> createScgRequest(SCGRequest value)
  {
    return new JAXBElement(_ScgRequest_QNAME, SCGRequest.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://webservice.scg.cipbancos.org.br", name="scgResponse")
  public JAXBElement<SCGResponse> createScgResponse(SCGResponse value)
  {
    return new JAXBElement(_ScgResponse_QNAME, SCGResponse.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://webservice.scg.cipbancos.org.br", name="confirmation")
  public JAXBElement<String> createConfirmation(String value)
  {
    return new JAXBElement(_Confirmation_QNAME, String.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://webservice.scg.cipbancos.org.br", name="id")
  public JAXBElement<String> createId(String value)
  {
    return new JAXBElement(_Id_QNAME, String.class, null, value);
  }
}
