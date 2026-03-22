/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpI
 */
public class cpi_0
extends nr_0 {
    private int iBx;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iBx = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13465;
    }

    public int exx() {
        return this.iBx;
    }
}

