// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.3 by WSRD Tencent.
// Generated from `MsgBase.jce'
// **********************************************************************

#import "JceObjectV2.h"
#import "QUANSecretInfo.h"

@interface QUANPushMsgRsp : JceObjectV2

@property (nonatomic, assign, JV2_PROP_GS_V2(iNextBeginId,setINextBeginId:)) JceInt32 JV2_PROP_NM(o,0,iNextBeginId);
@property (nonatomic, retain, JV2_PROP_GS_V2(vSecrets,setVSecrets:)) NSArray* JV2_PROP_EX(o,1,vSecrets,VOQUANSecretInfo);

@end