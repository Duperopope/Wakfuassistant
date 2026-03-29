package com.wakfuassistant.agent;

import net.bytebuddy.asm.Advice;

/**
 * NettyReleaseAdvice v1.0
 * 
 * Se branche en OnMethodExit sur aDj.channelRead0.
 * Apres que le client a traite le message, on verifie si c'est
 * un ReferenceCounted (ByteBuf) et on le release si refCnt > 0.
 * 
 * Cela corrige la fuite de 6M+ DirectByteBuffer.
 */
public class NettyReleaseAdvice {

    @Advice.OnMethodExit(suppress = Throwable.class, onThrowable = Throwable.class)
    public static void onExit(@Advice.Argument(1) Object msg) {
        try {
            // Verifier si le message implemente ReferenceCounted (ByteBuf, etc.)
            // On utilise la reflection pour eviter les problemes de classloader
            java.lang.reflect.Method refCntMethod = null;
            java.lang.reflect.Method releaseMethod = null;
            
            Class<?> cls = msg.getClass();
            // Chercher refCnt() et release() dans la hierarchie
            while (cls != null) {
                try {
                    refCntMethod = cls.getMethod("refCnt");
                    releaseMethod = cls.getMethod("release");
                    break;
                } catch (NoSuchMethodException e) {
                    // Chercher dans les interfaces
                    for (Class<?> iface : cls.getInterfaces()) {
                        try {
                            refCntMethod = iface.getMethod("refCnt");
                            releaseMethod = iface.getMethod("release");
                            break;
                        } catch (NoSuchMethodException ignored) {}
                    }
                    if (refCntMethod != null) break;
                    cls = cls.getSuperclass();
                }
            }
            
            if (refCntMethod != null && releaseMethod != null) {
                int refCnt = (int) refCntMethod.invoke(msg);
                if (refCnt > 0) {
                    releaseMethod.invoke(msg);
                }
            }
        } catch (Exception e) {
            // Silent - on ne veut pas crasher le client
        }
    }
}
