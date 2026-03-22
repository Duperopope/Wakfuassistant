/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csJ
 */
public class csj_0
extends nr_0 {
    private ejv_0 mhx;
    private lt_1 mhE;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhx = ejv_0.eU(byteBuffer.get());
        if (this.mhx != ejv_0.qzL) {
            return true;
        }
        byte[] byArray2 = new byte[byteBuffer.remaining()];
        byteBuffer.get(byArray2);
        this.mhE = lt_1.bS(byArray2);
        return true;
    }

    public lt_1 eBz() {
        return this.mhE;
    }

    public ejv_0 eBn() {
        return this.mhx;
    }

    @Override
    public int d() {
        return 12075;
    }
}

