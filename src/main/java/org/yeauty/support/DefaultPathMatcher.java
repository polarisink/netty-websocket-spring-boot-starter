package org.yeauty.support;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.QueryStringDecoder;


public record DefaultPathMatcher(String pattern) implements WsPathMatcher {

    @Override
    public boolean matchAndExtract(QueryStringDecoder decoder, Channel channel) {
        return pattern.equals(decoder.path());
    }
}
