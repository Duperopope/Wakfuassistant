/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.log4j.Logger;

public class cvn
extends nr_0 {
    private static final Logger mjX = Logger.getLogger(cvn.class);
    private zc_1 mjY = zc_1.axk();

    @Override
    public boolean dn(byte[] byArray) {
        try {
            this.mjY = zc_1.cx(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mjX.error((Object)"Problem parsing ProtoResourcePartition", (Throwable)invalidProtocolBufferException);
        }
        return true;
    }

    public zc_1 eDT() {
        return this.mjY;
    }

    @Override
    public int d() {
        return 13408;
    }
}

