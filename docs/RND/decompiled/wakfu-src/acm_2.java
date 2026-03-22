/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.ssl.SslContext
 *  io.netty.handler.ssl.SslContextBuilder
 *  io.netty.handler.ssl.util.InsecureTrustManagerFactory
 *  io.netty.handler.ssl.util.SelfSignedCertificate
 */
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.handler.ssl.util.SelfSignedCertificate;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Renamed from aCM
 */
public final class acm_2 {
    private static final long dBY = 255L;
    private static final String dBZ = ".com";
    private static final String dCa = ".corp";

    private acm_2() {
    }

    public static SslContext bXR() {
        SelfSignedCertificate selfSignedCertificate = new SelfSignedCertificate();
        SslContextBuilder sslContextBuilder = SslContextBuilder.forServer((File)selfSignedCertificate.certificate(), (File)selfSignedCertificate.privateKey());
        return sslContextBuilder.build();
    }

    public static SslContext bXS() {
        SslContextBuilder sslContextBuilder = SslContextBuilder.forClient();
        sslContextBuilder.trustManager(InsecureTrustManagerFactory.INSTANCE);
        return sslContextBuilder.build();
    }

    public static long dJ(byte[] byArray) {
        if (byArray.length != 4) {
            return -1L;
        }
        long l = 0L;
        l |= (0xFFL & (long)byArray[0]) << 24;
        l |= (0xFFL & (long)byArray[1]) << 16;
        l |= (0xFFL & (long)byArray[2]) << 8;
        return l |= 0xFFL & (long)byArray[3];
    }

    public static boolean gZ(String string) {
        try {
            URL uRL = new URL(string);
            return uRL.getHost().endsWith(dBZ) || uRL.getHost().endsWith(dCa);
        }
        catch (MalformedURLException malformedURLException) {
            return string.endsWith(dBZ) || string.endsWith(dCa);
        }
    }
}

