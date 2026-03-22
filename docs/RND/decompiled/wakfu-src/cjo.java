/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cjo
extends nr_0 {
    private long aDh;
    private byte lWh;
    private boolean oW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.lWh = byteBuffer.get();
        this.oW = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 13113;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public byte evu() {
        return this.lWh;
    }

    @Generated
    public boolean aHz() {
        return this.oW;
    }
}

