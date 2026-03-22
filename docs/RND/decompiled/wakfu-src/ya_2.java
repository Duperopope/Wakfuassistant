/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ya
 */
final class ya_2 {
    private final xj_2 akU = new xj_2();
    final /* synthetic */ xz_2 akV;

    ya_2(xz_2 xz_22) {
        this.akV = xz_22;
    }

    public void avW() {
        this.akV.akT.aac = this.akU.aac;
        this.akV.akT.akp.clear();
        this.akV.akT.akp.ensureCapacity(this.akU.akp.size());
        this.akV.akT.akp.addAll(this.akU.akp);
        this.akV.akT.akq.clear();
        this.akV.akT.akq.ensureCapacity(this.akU.akq.size());
        this.akV.akT.akq.addAll(this.akU.akq);
        this.akV.akT.akr.clear();
        this.akV.akT.akr.ensureCapacity(this.akU.akr.size());
        this.akV.akT.akr.addAll(this.akU.akr);
        this.akV.akT.aks.clear();
        this.akV.akT.aks.ensureCapacity(this.akU.aks.size());
        this.akV.akT.aks.addAll(this.akU.aks);
        this.akV.akT.akt = this.akU.akt;
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

