// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.2 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/renjunyi/MTT.jce'
// **********************************************************************

#import "JceObjectV2.h"
#import "MttBrokerPicParam.h"
#import "MttBrokerRequestParam.h"
#import "MttBrokerUserInfo.h"

@interface MttBrokerPicRequest : JceObjectV2

@property (nonatomic, retain, JV2_PROP_GS_V2(stUserInfo,setStUserInfo:)) MttBrokerUserInfo* JV2_PROP_NM(r,0,stUserInfo);
@property (nonatomic, retain, JV2_PROP_GS_V2(stRequestParam,setStRequestParam:)) MttBrokerRequestParam* JV2_PROP_NM(r,1,stRequestParam);
@property (nonatomic, assign, JV2_PROP_GS_V2(iContentTimeStamp,setIContentTimeStamp:)) JceInt32 JV2_PROP_NM(r,2,iContentTimeStamp);
@property (nonatomic, retain, JV2_PROP_GS_V2(sReferer,setSReferer:)) NSString* JV2_PROP_NM(r,3,sReferer);
@property (nonatomic, retain, JV2_PROP_GS_V2(vUrlList,setVUrlList:)) NSArray* JV2_PROP_EX(r,4,vUrlList,VONSString);
@property (nonatomic, retain, JV2_PROP_GS_V2(vstPicParam,setVstPicParam:)) NSArray* JV2_PROP_EX(o,5,vstPicParam,VOMTTBrokerPicParam);

@end