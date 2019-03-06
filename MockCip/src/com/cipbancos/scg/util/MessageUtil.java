package com.cipbancos.scg.util;

import java.io.PrintStream;
import java.util.Date;

public class MessageUtil
{
  private static final String HTTP_LOCALHOST_9080_WEBSERVICE_SCG_SCG_SERVICE = "http://localhost:9080/webservice-scg/SCGService";
  
  public static void startMessages()
  {
    System.out.println("---------------started----------");
    System.out.println("Service Running on: http://localhost:9080/webservice-scg/SCGService");
    System.out.println("http://localhost:9080/webservice-scg/SCGService?wsdl");
  }
  
  public static void resquestMessages(String fileContent)
  {
    System.out.println("\n Requisi??o recebida as..." + new Date());
    System.out.println("-----------Inicio do conte?do -----------");
    System.out.println(fileContent);
    System.out.println("----------T?rmino do conte?do -----------");
  }
}
