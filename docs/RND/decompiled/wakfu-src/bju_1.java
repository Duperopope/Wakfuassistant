/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bjU
 */
class bju_1
extends bjo_2 {
    bju_1(int n, byte by, ang_2 ang_22, boolean bl, fqy_0 fqy_02, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, bl4);
    }

    @Override
    public void i(bhx_0 bhx_02) {
        super.i(bhx_02);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && !bgt_02.i(false, true)) {
            return;
        }
        this.jU(bhx_02.Sn());
        cdb.lQg.a(new bkv_1(czc_2.eYH()));
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public int DN() {
        return 0;
    }

    @Override
    public void clear() {
    }
}

