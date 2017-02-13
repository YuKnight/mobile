// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.3 by WSRD Tencent.
// Generated from `Notify.jce'
// **********************************************************************

package com.qq.taf;

public final class NotifyItem extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "taf.NotifyItem";
    }

    public String fullClassName()
    {
        return "com.qq.taf.NotifyItem";
    }

    public String sTimeStamp = "";

    public String sServerId = "";

    public int iLevel = 0;

    public String sMessage = "";

    public String getSTimeStamp()
    {
        return sTimeStamp;
    }

    public void  setSTimeStamp(String sTimeStamp)
    {
        this.sTimeStamp = sTimeStamp;
    }

    public String getSServerId()
    {
        return sServerId;
    }

    public void  setSServerId(String sServerId)
    {
        this.sServerId = sServerId;
    }

    public int getILevel()
    {
        return iLevel;
    }

    public void  setILevel(int iLevel)
    {
        this.iLevel = iLevel;
    }

    public String getSMessage()
    {
        return sMessage;
    }

    public void  setSMessage(String sMessage)
    {
        this.sMessage = sMessage;
    }

    public NotifyItem()
    {
        setSTimeStamp(sTimeStamp);
        setSServerId(sServerId);
        setILevel(iLevel);
        setSMessage(sMessage);
    }

    public NotifyItem(String sTimeStamp, String sServerId, int iLevel, String sMessage)
    {
        setSTimeStamp(sTimeStamp);
        setSServerId(sServerId);
        setILevel(iLevel);
        setSMessage(sMessage);
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        NotifyItem t = (NotifyItem) o;
        return (
            com.qq.taf.jce.JceUtil.equals(sTimeStamp, t.sTimeStamp) && 
            com.qq.taf.jce.JceUtil.equals(sServerId, t.sServerId) && 
            com.qq.taf.jce.JceUtil.equals(iLevel, t.iLevel) && 
            com.qq.taf.jce.JceUtil.equals(sMessage, t.sMessage) );
    }

    public int hashCode()
    {
        try
        {
            throw new Exception("Need define key first!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    public java.lang.Object clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        _os.write(sTimeStamp, 1);
        _os.write(sServerId, 2);
        _os.write(iLevel, 3);
        _os.write(sMessage, 4);
    }


    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        setSTimeStamp( _is.readString(1, true));

        setSServerId( _is.readString(2, true));

        setILevel((int) _is.read(iLevel, 3, true));

        setSMessage( _is.readString(4, true));

    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(sTimeStamp, "sTimeStamp");
        _ds.display(sServerId, "sServerId");
        _ds.display(iLevel, "iLevel");
        _ds.display(sMessage, "sMessage");
    }

}
