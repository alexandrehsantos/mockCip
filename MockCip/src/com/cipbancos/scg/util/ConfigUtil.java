package com.cipbancos.scg.util;

public class ConfigUtil
{
  private static final String PROPERTY_OS_NAME = "os.name";
  
  public static SystemOS detectOperatingSystem()
  {
    String os = System.getProperty("os.name").toLowerCase();
    if (isWindows(os)) {
      return SystemOS.WINDOWS;
    }
    if (isUnix(os)) {
      return SystemOS.UNIX;
    }
    if (isMac(os)) {
      return SystemOS.MAC;
    }
    return null;
  }
  
  public static boolean isWindows(String os)
  {
    return os.indexOf("win") >= 0;
  }
  
  public static boolean isMac(String os)
  {
    return os.indexOf("mac") >= 0;
  }
  
  public static boolean isUnix(String os)
  {
    return (os.indexOf("nix") >= 0) || (os.indexOf("nux") >= 0) || (os.indexOf("aix") > 0);
  }
  
  public static enum SystemOS
  {
    WINDOWS,  UNIX,  MAC;
  }
}
