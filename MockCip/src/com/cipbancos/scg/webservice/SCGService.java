package com.cipbancos.scg.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name="SCGService", targetNamespace="http://webservice.scg.cipbancos.org.br", wsdlLocation="file:/mnt/work/projecTi/documentos/cip/cip.wsdl")
public class SCGService
  extends Service
{
  private static final URL SCGSERVICE_WSDL_LOCATION;
  private static final WebServiceException SCGSERVICE_EXCEPTION;
  private static final QName SCGSERVICE_QNAME = new QName("http://webservice.scg.cipbancos.org.br", "SCGService");
  
  static
  {
    URL url = null;
    WebServiceException e = null;
    try
    {
      url = new URL("file:/mnt/work/projecTi/documentos/cip/cip.wsdl");
    }
    catch (MalformedURLException ex)
    {
      e = new WebServiceException(ex);
    }
    SCGSERVICE_WSDL_LOCATION = url;
    SCGSERVICE_EXCEPTION = e;
  }
  
  public SCGService()
  {
    super(__getWsdlLocation(), SCGSERVICE_QNAME);
  }
  
  public SCGService(WebServiceFeature... features)
  {
    super(__getWsdlLocation(), SCGSERVICE_QNAME, features);
  }
  
  public SCGService(URL wsdlLocation)
  {
    super(wsdlLocation, SCGSERVICE_QNAME);
  }
  
  public SCGService(URL wsdlLocation, WebServiceFeature... features)
  {
    super(wsdlLocation, SCGSERVICE_QNAME, features);
  }
  
  public SCGService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }
  
  public SCGService(URL wsdlLocation, QName serviceName, WebServiceFeature... features)
  {
    super(wsdlLocation, serviceName, features);
  }
  
  @WebEndpoint(name="controleGarantia")
  public ControleGarantia getControleGarantia()
  {
    return (ControleGarantia)super.getPort(new QName("http://webservice.scg.cipbancos.org.br", "controleGarantia"), ControleGarantia.class);
  }
  
  @WebEndpoint(name="controleGarantia")
  public ControleGarantia getControleGarantia(WebServiceFeature... features)
  {
    return (ControleGarantia)super.getPort(new QName("http://webservice.scg.cipbancos.org.br", "controleGarantia"), ControleGarantia.class, features);
  }
  
  private static URL __getWsdlLocation()
  {
    if (SCGSERVICE_EXCEPTION != null) {
      throw SCGSERVICE_EXCEPTION;
    }
    return SCGSERVICE_WSDL_LOCATION;
  }
}
