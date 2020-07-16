/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.designpatternstest.aidl;
// Declare any non-default types here with import statements

public interface IBankAIDL extends android.os.IInterface
{
  /** Default implementation for IBankAIDL. */
  public static class Default implements IBankAIDL
  {
    /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
    //            double aDouble, String aString);

    @Override public String openAccount(String name, String password) throws android.os.RemoteException
    {
      return null;
    }
    @Override public String saveMoney(int money, String account) throws android.os.RemoteException
    {
      return null;
    }
    @Override public String takeMoney(int money, String account, String password) throws android.os.RemoteException
    {
      return null;
    }
    @Override public String closeAccount(String account, String password) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IBankAIDL
  {
    private static final String DESCRIPTOR = "com.example.designpatternstest.IBankAIDL";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.designpatternstest.IBankAIDL interface,
     * generating a proxy if needed.
     */
    public static IBankAIDL asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IBankAIDL))) {
        return ((IBankAIDL)iin);
      }
      return new Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_openAccount:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          String _arg1;
          _arg1 = data.readString();
          String _result = this.openAccount(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_saveMoney:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          String _arg1;
          _arg1 = data.readString();
          String _result = this.saveMoney(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_takeMoney:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          String _arg1;
          _arg1 = data.readString();
          String _arg2;
          _arg2 = data.readString();
          String _result = this.takeMoney(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_closeAccount:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          String _arg1;
          _arg1 = data.readString();
          String _result = this.closeAccount(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IBankAIDL
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Demonstrates some basic types that you can use as parameters
           * and return values in AIDL.
           *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
      //            double aDouble, String aString);

      @Override public String openAccount(String name, String password) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeString(password);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openAccount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().openAccount(name, password);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public String saveMoney(int money, String account) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(money);
          _data.writeString(account);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveMoney, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveMoney(money, account);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public String takeMoney(int money, String account, String password) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(money);
          _data.writeString(account);
          _data.writeString(password);
          boolean _status = mRemote.transact(Stub.TRANSACTION_takeMoney, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().takeMoney(money, account, password);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public String closeAccount(String account, String password) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(account);
          _data.writeString(password);
          boolean _status = mRemote.transact(Stub.TRANSACTION_closeAccount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().closeAccount(account, password);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static IBankAIDL sDefaultImpl;
    }
    static final int TRANSACTION_openAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_saveMoney = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_takeMoney = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_closeAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(IBankAIDL impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static IBankAIDL getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Demonstrates some basic types that you can use as parameters
       * and return values in AIDL.
       *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
  //            double aDouble, String aString);

  public String openAccount(String name, String password) throws android.os.RemoteException;
  public String saveMoney(int money, String account) throws android.os.RemoteException;
  public String takeMoney(int money, String account, String password) throws android.os.RemoteException;
  public String closeAccount(String account, String password) throws android.os.RemoteException;
}
