/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

/*
 * Renamed from NQ
 */
public class nq_1
extends nr_0 {
    private eZ aZd;

    @Override
    public boolean dn(byte[] byArray) {
        try {
            this.aZd = eZ.ar(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dwV.error((Object)"Error unserializing chat friend lists. Reseting lists.", (Throwable)invalidProtocolBufferException);
            this.aZd = eZ.yW().zc();
        }
        return true;
    }

    @Override
    public int d() {
        return 744;
    }

    public eZ aWF() {
        return this.aZd;
    }
}

