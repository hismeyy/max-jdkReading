package org.omg.IOP.CodecFactoryPackage;


/**
* org/omg/IOP/CodecFactoryPackage/UnknownEncoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/wsjdk/Corretto8Src/installers/windows/zip/corretto-build/buildRoot/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, January 18, 2024 8:57:23 PM UTC
*/

public final class UnknownEncoding extends org.omg.CORBA.UserException
{

  public UnknownEncoding ()
  {
    super(UnknownEncodingHelper.id());
  } // ctor


  public UnknownEncoding (String $reason)
  {
    super(UnknownEncodingHelper.id() + "  " + $reason);
  } // ctor

} // class UnknownEncoding
