/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cxO
extends nr_0 {
    private byte kIf;
    private long mlb;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        this.mlb = byteBuffer.getLong();
        return true;
    }

    public byte evi() {
        return this.kIf;
    }

    public long eFf() {
        return this.mlb;
    }

    @Override
    public int d() {
        return 1048;
    }
}

