/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csF
 */
public class csf_0
extends nr_0 {
    private ejv_0 mhx;
    private lx_0 mhC;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhx = ejv_0.eU(byteBuffer.get());
        if (this.mhx != ejv_0.qzL) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.mhC = lx_0.bT(byArray2);
        return false;
    }

    public lx_0 eBs() {
        return this.mhC;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    @Override
    public int d() {
        return 12764;
    }
}

