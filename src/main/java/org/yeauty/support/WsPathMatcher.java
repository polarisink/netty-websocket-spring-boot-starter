package org.yeauty.support;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.QueryStringDecoder;


public interface WsPathMatcher {

    String pattern();

    boolean matchAndExtract(QueryStringDecoder decoder, Channel channel);
}
