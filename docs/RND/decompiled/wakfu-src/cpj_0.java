/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpJ
 */
public class cpj_0
extends nr_0 {
    private int iBx;
    private int eIx;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iBx = byteBuffer.getInt();
        this.eIx = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13346;
    }

    public int exx() {
        return this.iBx;
    }

    public int rX() {
        return this.eIx;
    }
}

