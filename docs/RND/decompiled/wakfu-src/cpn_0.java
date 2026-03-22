/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpN
 */
public class cpn_0
extends nr_0 {
    private int iBx;
    private long mej;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iBx = byteBuffer.getInt();
        this.mej = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13891;
    }

    public int exx() {
        return this.iBx;
    }

    public long exF() {
        return this.mej;
    }
}

