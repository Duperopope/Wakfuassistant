/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xO
 */
final class xo_1 {
    private int aac = 0;
    private final ArrayList<xn_2> akz = new ArrayList(0);
    private final ArrayList<xq_1> akA = new ArrayList(0);
    private final ArrayList<xk_2> akB = new ArrayList(0);
    private final ArrayList<xl_2> akC = new ArrayList(0);
    private xp_2 akt = null;
    final /* synthetic */ xj_2 akD;

    xo_1(xj_2 xj_22) {
        this.akD = xj_22;
    }

    public void avW() {
        this.akD.aac = this.aac;
        this.akD.akp.clear();
        this.akD.akp.ensureCapacity(this.akz.size());
        this.akD.akp.addAll(this.akz);
        this.akD.akq.clear();
        this.akD.akq.ensureCapacity(this.akA.size());
        this.akD.akq.addAll(this.akA);
        this.akD.akr.clear();
        this.akD.akr.ensureCapacity(this.akB.size());
        this.akD.akr.addAll(this.akB);
        this.akD.aks.clear();
        this.akD.aks.ensureCapacity(this.akC.size());
        this.akD.aks.addAll(this.akC);
        this.akD.akt = this.akt;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

