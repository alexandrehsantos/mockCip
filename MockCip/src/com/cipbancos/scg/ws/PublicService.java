package com.cipbancos.scg.ws;

import java.util.Date;

import javax.xml.ws.Endpoint;

import com.cipbancos.scg.util.MessageUtil;

public class PublicService
{
  private static final String HTTP_LOCALHOST_9080_WEBSERVICE_SCG_SCG_SERVICE = "http://localhost:9080/webservice-scg/SCGService";
  
  public static void main(String[] args)
  {
    MockCip mockCip = new MockCip();
    
    Endpoint.publish("http://localhost:9080/webservice-scg/SCGService", mockCip);
    
    MessageUtil.startMessages();
  }
  
  public static void resquestMessages(String fileContent)
  {
    System.out.println("\n Requisi??o recebida as..." + new Date());
    System.out.println("-----------Inicio do conte?do -----------");
    System.out.println(fileContent);
    System.out.println("----------T?rmino do conte?do -----------");
  }
}
