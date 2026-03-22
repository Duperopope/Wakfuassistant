/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.util.internal.logging.InternalLogLevel
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.internal.logging.InternalLogLevel;
import java.net.SocketAddress;

/*
 * Renamed from aXi
 */
public class axi_0
extends LoggingHandler {
    public axi_0() {
        super(LogLevel.INFO);
    }

    public void channelRegistered(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.channelRegistered(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelRegistered();
        }
    }

    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.channelUnregistered(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelUnregistered();
        }
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.channelActive(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelActive();
        }
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.channelInactive(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelInactive();
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        if (this.logger.isEnabled(InternalLogLevel.WARN)) {
            super.exceptionCaught(channelHandlerContext, throwable);
        } else {
            channelHandlerContext.fireExceptionCaught(throwable);
        }
    }

    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.userEventTriggered(channelHandlerContext, object);
        } else {
            channelHandlerContext.fireUserEventTriggered(object);
        }
    }

    public void bind(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.bind(channelHandlerContext, socketAddress, channelPromise);
        } else {
            channelHandlerContext.bind(socketAddress, channelPromise);
        }
    }

    public void connect(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.connect(channelHandlerContext, socketAddress, socketAddress2, channelPromise);
        } else {
            channelHandlerContext.connect(socketAddress, socketAddress2, channelPromise);
        }
    }

    public void disconnect(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.disconnect(channelHandlerContext, channelPromise);
        } else {
            channelHandlerContext.disconnect(channelPromise);
        }
    }

    public void close(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.INFO)) {
            super.close(channelHandlerContext, channelPromise);
        } else {
            channelHandlerContext.close(channelPromise);
        }
    }

    public void deregister(ChannelHandlerContext channelHandlerContext, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.deregister(channelHandlerContext, channelPromise);
        } else {
            channelHandlerContext.deregister(channelPromise);
        }
    }

    public void channelReadComplete(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.channelReadComplete(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelReadComplete();
        }
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        if (this.logger.isEnabled(InternalLogLevel.DEBUG)) {
            super.channelRead(channelHandlerContext, object);
        } else {
            channelHandlerContext.fireChannelRead(object);
        }
    }

    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        if (this.logger.isEnabled(InternalLogLevel.DEBUG)) {
            super.write(channelHandlerContext, object, channelPromise);
        } else {
            channelHandlerContext.write(object, channelPromise);
        }
    }

    public void channelWritabilityChanged(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.channelWritabilityChanged(channelHandlerContext);
        } else {
            channelHandlerContext.fireChannelWritabilityChanged();
        }
    }

    public void flush(ChannelHandlerContext channelHandlerContext) {
        if (this.logger.isEnabled(InternalLogLevel.TRACE)) {
            super.flush(channelHandlerContext);
        } else {
            channelHandlerContext.flush();
        }
    }
}

