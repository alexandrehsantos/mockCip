package com.cipbancos.scg.util;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import com.cipbancos.scg.ws.PublicService;

public class FileUtil
{
//  /* Error */
//  public static StringBuilder convertToHex(File file)   throws java.io.IOException
//  {
//    // Byte code:
//    //   0: new 19	java/lang/StringBuilder
//    //   3: dup
//    //   4: invokespecial 21	java/lang/StringBuilder:<init>	()V
//    //   7: astore_1
//    //   8: aconst_null
//    //   9: astore_2
//    //   10: aconst_null
//    //   11: astore_3
//    //   12: new 22	java/io/FileInputStream
//    //   15: dup
//    //   16: aload_0
//    //   17: invokespecial 24	java/io/FileInputStream:<init>	(Ljava/io/File;)V
//    //   20: astore 4
//    //   22: iconst_0
//    //   23: istore 5
//    //   25: iconst_0
//    //   26: istore 6
//    //   28: goto +44 -> 72
//    //   31: iload 5
//    //   33: iconst_m1
//    //   34: if_icmpeq +28 -> 62
//    //   37: aload_1
//    //   38: ldc 27
//    //   40: iconst_1
//    //   41: anewarray 3	java/lang/Object
//    //   44: dup
//    //   45: iconst_0
//    //   46: iload 5
//    //   48: invokestatic 29	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
//    //   51: aastore
//    //   52: invokestatic 35	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
//    //   55: invokevirtual 41	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
//    //   58: pop
//    //   59: iinc 6 1
//    //   62: iload 6
//    //   64: bipush 16
//    //   66: if_icmpne +6 -> 72
//    //   69: iconst_0
//    //   70: istore 6
//    //   72: aload 4
//    //   74: invokevirtual 45	java/io/InputStream:read	()I
//    //   77: dup
//    //   78: istore 5
//    //   80: iconst_m1
//    //   81: if_icmpne -50 -> 31
//    //   84: aload 4
//    //   86: ifnull +56 -> 142
//    //   89: aload 4
//    //   91: invokevirtual 51	java/io/InputStream:close	()V
//    //   94: goto +48 -> 142
//    //   97: astore_2
//    //   98: aload 4
//    //   100: ifnull +8 -> 108
//    //   103: aload 4
//    //   105: invokevirtual 51	java/io/InputStream:close	()V
//    //   108: aload_2
//    //   109: athrow
//    //   110: astore_3
//    //   111: aload_2
//    //   112: ifnonnull +8 -> 120
//    //   115: aload_3
//    //   116: astore_2
//    //   117: goto +13 -> 130
//    //   120: aload_2
//    //   121: aload_3
//    //   122: if_acmpeq +8 -> 130
//    //   125: aload_2
//    //   126: aload_3
//    //   127: invokevirtual 54	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
//    //   130: aload_2
//    //   131: athrow
//    //   132: astore_2
//    //   133: new 60	javax/xml/ws/WebServiceException
//    //   136: dup
//    //   137: aload_2
//    //   138: invokespecial 62	javax/xml/ws/WebServiceException:<init>	(Ljava/lang/Throwable;)V
//    //   141: athrow
//    //   142: aload_1
//    //   143: areturn
//    // Line number table:
//    //   Java source line #21	-> byte code offset #0
//    //   Java source line #23	-> byte code offset #8
//    //   Java source line #25	-> byte code offset #22
//    //   Java source line #26	-> byte code offset #25
//    //   Java source line #28	-> byte code offset #28
//    //   Java source line #29	-> byte code offset #31
//    //   Java source line #30	-> byte code offset #37
//    //   Java source line #31	-> byte code offset #59
//    //   Java source line #34	-> byte code offset #62
//    //   Java source line #35	-> byte code offset #69
//    //   Java source line #28	-> byte code offset #72
//    //   Java source line #38	-> byte code offset #84
//    //   Java source line #39	-> byte code offset #133
//    //   Java source line #42	-> byte code offset #142
//    // Local variable table:
//    //   start	length	slot	name	signature
//    //   0	144	0	file	File
//    //   7	136	1	conteudoHex	StringBuilder
//    //   9	1	2	localObject1	Object
//    //   97	15	2	localObject2	Object
//    //   116	15	2	localObject3	Object
//    //   132	6	2	e	Exception
//    //   11	1	3	localObject4	Object
//    //   110	17	3	localThrowable	Throwable
//    //   20	84	4	is	java.io.InputStream
//    //   23	56	5	i	int
//    //   26	45	6	cnt	int
//    // Exception table:
//    //   from	to	target	type
//    //   22	84	97	finally
//    //   12	110	110	finally
//    //   8	132	132	java/lang/Exception
//  }
//  
  public static File getParentPath()
    throws URISyntaxException
  {
    Class<?> referenceClass = PublicService.class;
    URL url = referenceClass.getProtectionDomain().getCodeSource().getLocation();
    File jarPath = null;
    
    jarPath = new File(url.toURI()).getParentFile();
    return jarPath;
  }
}
