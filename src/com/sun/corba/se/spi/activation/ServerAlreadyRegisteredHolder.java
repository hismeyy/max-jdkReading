package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerAlreadyRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/wsjdk/Corretto8Src/installers/windows/zip/corretto-build/buildRoot/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, January 18, 2024 8:57:23 PM UTC
*/

public final class ServerAlreadyRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerAlreadyRegistered value = null;

  public ServerAlreadyRegisteredHolder ()
  {
  }

  public ServerAlreadyRegisteredHolder (com.sun.corba.se.spi.activation.ServerAlreadyRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerAlreadyRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerAlreadyRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerAlreadyRegisteredHelper.type ();
  }

}
