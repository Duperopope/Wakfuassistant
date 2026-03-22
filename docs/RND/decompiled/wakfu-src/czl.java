/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class czl
extends nr_0 {
    private long mnc;
    private long mnd;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mnc = byteBuffer.getLong();
        this.mnd = byteBuffer.getLong();
        return false;
    }

    @Override
    public int d() {
        return 23247;
    }

    @Generated
    public long eGc() {
        return this.mnc;
    }

    @Generated
    public long eGd() {
        return this.mnd;
    }
}

