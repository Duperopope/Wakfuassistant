/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import org.jetbrains.annotations.NotNull;

public abstract class eIz {
    protected long aXv;
    protected String p;
    protected short aZk;
    protected byte aZm;
    protected long aDL;
    protected String aFF;
    protected dR mmE;

    protected eIz() {
    }

    protected eIz(long l, String string, short s, byte by, long l2, String string2, @NotNull dR dR2) {
        this.aXv = l;
        this.p = string;
        this.aZk = s;
        this.aZm = by;
        this.aDL = l2;
        this.aFF = string2;
        this.mmE = dR2;
    }

    public long Sn() {
        return this.aXv;
    }

    public String getName() {
        return this.p;
    }

    public short aWP() {
        return this.aZk;
    }

    public byte aWO() {
        return this.aZm;
    }

    public long Ya() {
        return this.aDL;
    }

    public String HR() {
        return this.aFF;
    }

    public void my(String string) {
        this.aFF = string;
    }

    public dR fwD() {
        return this.mmE;
    }

    protected static dR eA(byte[] byArray) {
        try {
            return dR.ad(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new RuntimeException("Error when unserializing appearance", invalidProtocolBufferException);
        }
    }
}

