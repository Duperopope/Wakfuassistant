/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bjO
 */
public abstract class bjo_2
extends ein_0 {
    protected final fqy_0 ipI;
    protected final int ipJ;
    private final boolean ipK;

    bjo_2(int n, byte by, ang_2 ang_22, boolean bl, fqy_0 fqy_02, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, ang_22, bl, bl3, l, bl4);
        this.ipI = fqy_02;
        this.ipJ = n2;
        this.ipK = bl2;
    }

    public void i(bhx_0 bhx_02) {
        if (this.ipK) {
            aue_0.cVJ().cVK().dcM().lF(this.qxE);
        }
    }

    public boolean j(bhx_0 bhx_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = this.qxC ? bhx_02 : bgt_02;
        bgy bgy3 = this.qxC ? bgt_02 : bhx_02;
        return this.qxB == null || this.qxB.b(bgy2, bgy3, this, bgy2.bdV());
    }

    public fqy_0 drR() {
        return this.ipI;
    }

    public int cbt() {
        return this.ipJ;
    }

    protected void jU(long l) {
        cjs cjs2 = new cjs(l, this);
        aue_0.cVJ().etu().d(cjs2);
        this.clear();
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Pas de d\u00e9s\u00e9rialization dans le Client");
    }
}

