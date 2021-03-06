// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.3 by WSRD Tencent.
// Generated from `AdminReg.jce'
// **********************************************************************

package com.qq.taf;

public interface AdminRegPrx
{
    public int batchPatch(com.qq.taf.PatchRequest req, com.qq.taf.holder.JceStringHolder result);

    public int batchPatch(com.qq.taf.PatchRequest req, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_batchPatch(com.qq.taf.AdminRegPrxCallback callback, com.qq.taf.PatchRequest req);

    public void async_batchPatch(com.qq.taf.AdminRegPrxCallback callback, com.qq.taf.PatchRequest req, java.util.Map __ctx);


    public java.util.ArrayList<String> getAllApplicationNames(com.qq.taf.holder.JceStringHolder result);

    public java.util.ArrayList<String> getAllApplicationNames(com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getAllApplicationNames(com.qq.taf.AdminRegPrxCallback callback);

    public void async_getAllApplicationNames(com.qq.taf.AdminRegPrxCallback callback, java.util.Map __ctx);


    public java.util.ArrayList<String> getAllNodeNames(com.qq.taf.holder.JceStringHolder result);

    public java.util.ArrayList<String> getAllNodeNames(com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getAllNodeNames(com.qq.taf.AdminRegPrxCallback callback);

    public void async_getAllNodeNames(com.qq.taf.AdminRegPrxCallback callback, java.util.Map __ctx);


    public java.util.ArrayList<java.util.ArrayList<String>> getAllServerIds(com.qq.taf.holder.JceStringHolder result);

    public java.util.ArrayList<java.util.ArrayList<String>> getAllServerIds(com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getAllServerIds(com.qq.taf.AdminRegPrxCallback callback);

    public void async_getAllServerIds(com.qq.taf.AdminRegPrxCallback callback, java.util.Map __ctx);


    public int getGroupId(String ip, com.qq.taf.holder.JceIntHolder groupId, com.qq.taf.holder.JceStringHolder result);

    public int getGroupId(String ip, com.qq.taf.holder.JceIntHolder groupId, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getGroupId(com.qq.taf.AdminRegPrxCallback callback, String ip);

    public void async_getGroupId(com.qq.taf.AdminRegPrxCallback callback, String ip, java.util.Map __ctx);


    public int getNodeVesion(String name, com.qq.taf.holder.JceStringHolder version, com.qq.taf.holder.JceStringHolder result);

    public int getNodeVesion(String name, com.qq.taf.holder.JceStringHolder version, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getNodeVesion(com.qq.taf.AdminRegPrxCallback callback, String name);

    public void async_getNodeVesion(com.qq.taf.AdminRegPrxCallback callback, String name, java.util.Map __ctx);


    public int getPatchPercent(String application, String serverName, String nodeName, com.qq.taf.PatchInfoHolder tPatchInfo);

    public int getPatchPercent(String application, String serverName, String nodeName, com.qq.taf.PatchInfoHolder tPatchInfo, java.util.Map __ctx);

    public void async_getPatchPercent(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_getPatchPercent(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int getProfileTemplate(String profileName, com.qq.taf.holder.JceStringHolder profileTemplate, com.qq.taf.holder.JceStringHolder resultDesc);

    public int getProfileTemplate(String profileName, com.qq.taf.holder.JceStringHolder profileTemplate, com.qq.taf.holder.JceStringHolder resultDesc, java.util.Map __ctx);

    public void async_getProfileTemplate(com.qq.taf.AdminRegPrxCallback callback, String profileName);

    public void async_getProfileTemplate(com.qq.taf.AdminRegPrxCallback callback, String profileName, java.util.Map __ctx);


    public int getServerProfileTemplate(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder profileTemplate, com.qq.taf.holder.JceStringHolder resultDesc);

    public int getServerProfileTemplate(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder profileTemplate, com.qq.taf.holder.JceStringHolder resultDesc, java.util.Map __ctx);

    public void async_getServerProfileTemplate(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_getServerProfileTemplate(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int getServerState(String application, String serverName, String nodeName, com.qq.taf.ServerStateDescHolder state, com.qq.taf.holder.JceStringHolder result);

    public int getServerState(String application, String serverName, String nodeName, com.qq.taf.ServerStateDescHolder state, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_getServerState(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_getServerState(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int loadServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result);

    public int loadServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_loadServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_loadServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int notifyServer(String application, String serverName, String nodeName, String command, com.qq.taf.holder.JceStringHolder result);

    public int notifyServer(String application, String serverName, String nodeName, String command, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_notifyServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, String command);

    public void async_notifyServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, String command, java.util.Map __ctx);


    public int patchServer(String application, String serverName, String nodeName, boolean shutdown, String version, String user, com.qq.taf.holder.JceStringHolder result);

    public int patchServer(String application, String serverName, String nodeName, boolean shutdown, String version, String user, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_patchServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, boolean shutdown, String version, String user);

    public void async_patchServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, boolean shutdown, String version, String user, java.util.Map __ctx);


    public int patchSubborn(String application, String serverName, String nodeName, String sSrcFile, String sDstFile, com.qq.taf.holder.JceStringHolder result);

    public int patchSubborn(String application, String serverName, String nodeName, String sSrcFile, String sDstFile, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_patchSubborn(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, String sSrcFile, String sDstFile);

    public void async_patchSubborn(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, String sSrcFile, String sDstFile, java.util.Map __ctx);


    public boolean pingNode(String name, com.qq.taf.holder.JceStringHolder result);

    public boolean pingNode(String name, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_pingNode(com.qq.taf.AdminRegPrxCallback callback, String name);

    public void async_pingNode(com.qq.taf.AdminRegPrxCallback callback, String name, java.util.Map __ctx);


    public int restartServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result);

    public int restartServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_restartServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_restartServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int shutdownNode(String name, com.qq.taf.holder.JceStringHolder result);

    public int shutdownNode(String name, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_shutdownNode(com.qq.taf.AdminRegPrxCallback callback, String name);

    public void async_shutdownNode(com.qq.taf.AdminRegPrxCallback callback, String name, java.util.Map __ctx);


    public int startServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result);

    public int startServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_startServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_startServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


    public int stopServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result);

    public int stopServer(String application, String serverName, String nodeName, com.qq.taf.holder.JceStringHolder result, java.util.Map __ctx);

    public void async_stopServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName);

    public void async_stopServer(com.qq.taf.AdminRegPrxCallback callback, String application, String serverName, String nodeName, java.util.Map __ctx);


}
