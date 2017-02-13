// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.2 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/renjunyi/MTT.jce'
// **********************************************************************

#import "MttBrokerRequestParam.h"

@implementation MttBrokerRequestParam

@synthesize JV2_PROP_NM(r,0,cConcurrency);
@synthesize JV2_PROP_NM(r,1,sUrl);
@synthesize JV2_PROP_NM(r,2,sUserHttpHeader);
@synthesize JV2_PROP_NM(r,3,sPageEncodeName);
@synthesize JV2_PROP_NM(r,4,cZipType);
@synthesize JV2_PROP_NM(o,5,cContentType);
@synthesize JV2_PROP_NM(o,6,cPostEncrypted);
@synthesize JV2_PROP_NM(o,7,cImgQualityType);
@synthesize JV2_PROP_NM(o,8,wPageSizeKB);
@synthesize JV2_PROP_NM(o,9,wMaxPageSizeKB);
@synthesize JV2_PROP_NM(o,10,cBrand);
@synthesize JV2_PROP_NM(o,11,stDisplayInfo);
@synthesize JV2_PROP_EX(o,12,vImgCacheFNV,VONSNumber);
@synthesize JV2_PROP_NM(o,13,iEntry);
@synthesize JV2_PROP_NM(o,14,iEntryType);
@synthesize JV2_PROP_NM(o,15,cReqEncrypted);
@synthesize JV2_PROP_NM(o,16,wVersion);
@synthesize JV2_PROP_NM(o,17,cHttpsForceProxy);
@synthesize JV2_PROP_NM(o,18,cLzmaDictOffset);
@synthesize JV2_PROP_NM(o,19,cReqType);
@synthesize JV2_PROP_NM(o,20,stPushReq);
@synthesize JV2_PROP_NM(o,21,cSecuritySwitch);
@synthesize JV2_PROP_NM(o,22,cReqOriginalPage);

+ (void)initialize
{
    if (self == [MttBrokerRequestParam class]) {
        [MttBrokerDisplayInfo initialize];
        [MttBrokerPushRequest initialize];
        [super initialize];
    }
}

- (id)init
{
    if (self = [super init]) {
        JV2_PROP(sUrl) = DefaultJceString;
        JV2_PROP(sUserHttpHeader) = DefaultJceString;
        JV2_PROP(sPageEncodeName) = DefaultJceString;
        JV2_PROP(cImgQualityType) = 3;
        JV2_PROP(wPageSizeKB) = 50;
        JV2_PROP(wMaxPageSizeKB) = 200;
        JV2_PROP(iEntryType) = 6;
        JV2_PROP(wVersion) = 1;
        JV2_PROP(cLzmaDictOffset) = 17;
    }
    return self;
}

- (void)dealloc
{
    JV2_PROP(sUrl) = nil;
    JV2_PROP(sUserHttpHeader) = nil;
    JV2_PROP(sPageEncodeName) = nil;
    JV2_PROP(stDisplayInfo) = nil;
    JV2_PROP(vImgCacheFNV) = nil;
    JV2_PROP(stPushReq) = nil;
    [super dealloc];
}

+ (NSString*)jceType
{
    return @"MTT.BrokerRequestParam";
}

@end