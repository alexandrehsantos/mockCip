package com.cipbancos.scg.webservice.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SCGRequest", propOrder={"timeOut", "request"})
public class SCGRequest
{
  protected int timeOut;
  @XmlElement(required=true, type=String.class)
  @XmlJavaTypeAdapter(HexBinaryAdapter.class)
  @XmlSchemaType(name="hexBinary")
  protected byte[] request;
  
  public int getTimeOut()
  {
    return this.timeOut;
  }
  
  public void setTimeOut(int value)
  {
    this.timeOut = value;
  }
  
  public byte[] getRequest()
  {
    return this.request;
  }
  
  public void setRequest(byte[] value)
  {
    this.request = value;
  }
}
