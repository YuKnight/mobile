// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.3 by WSRD Tencent.
// Generated from `SecretBase.jce'
// **********************************************************************

#import "QUANPostSecretRsp.h"

@implementation QUANPostSecretRsp

@synthesize JV2_PROP_NM(o,0,iStatus);

+ (void)initialize
{
    if (self == [QUANPostSecretRsp class]) {
        [super initialize];
    }
}

- (id)init
{
    if (self = [super init]) {
    }
    return self;
}

- (void)dealloc
{
    [super dealloc];
}

+ (NSString*)jceType
{
    return @"QUAN.PostSecretRsp";
}

@end
