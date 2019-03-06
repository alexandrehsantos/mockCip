package com.cipbancos.scg.webservice.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="SCGResponse", propOrder={"status", "confirmation", "response"})
public class SCGResponse
{
  protected int status;
  @XmlElement(required=true)
  protected String confirmation;
  @XmlElement(required=true, type=String.class)
  @XmlJavaTypeAdapter(HexBinaryAdapter.class)
  @XmlSchemaType(name="hexBinary")
  protected byte[] response;
  
  public int getStatus()
  {
    return this.status;
  }
  
  public void setStatus(int value)
  {
    this.status = value;
  }
  
  public String getConfirmation()
  {
    return this.confirmation;
  }
  
  public void setConfirmation(String value)
  {
    this.confirmation = value;
  }
  
  public byte[] getResponse()
  {
    return this.response;
  }
  
  public void setResponse(byte[] value)
  {
    this.response = value;
  }
}
