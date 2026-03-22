/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.log4j.Logger;

/*
 * Renamed from cvq
 */
public class cvq_0
extends nr_0 {
    private static final Logger mjZ = Logger.getLogger(cvq_0.class);
    private yy_2 mka = yy_2.awO();

    @Override
    public boolean dn(byte[] byArray) {
        try {
            this.mka = yy_2.cw(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mjZ.error((Object)"Problem parsing ProtoResourcePartition", (Throwable)invalidProtocolBufferException);
        }
        return true;
    }

    @Override
    public int d() {
        return 12544;
    }

    public yy_2 eDU() {
        return this.mka;
    }
}

