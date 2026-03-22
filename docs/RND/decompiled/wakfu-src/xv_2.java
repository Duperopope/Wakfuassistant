/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xV
 */
final class xv_2 {
    private final ti_1 akM = new ti_1();
    final /* synthetic */ xu_1 akN;

    xv_2(xu_1 xu_12) {
        this.akN = xu_12;
    }

    public void avW() {
        this.akN.akL.aac = this.akM.aac;
        this.akN.akL.aad.clear();
        this.akN.akL.aad.ensureCapacity(this.akM.aad.size());
        this.akN.akL.aad.addAll(this.akM.aad);
        this.akN.akL.aae.clear();
        this.akN.akL.aae.ensureCapacity(this.akM.aae.size());
        this.akN.akL.aae.addAll(this.akM.aae);
        this.akN.akL.aaf.clear();
        this.akN.akL.aaf.ensureCapacity(this.akM.aaf.size());
        this.akN.akL.aaf.addAll(this.akM.aaf);
        this.akN.akL.aag.clear();
        this.akN.akL.aag.ensureCapacity(this.akM.aag.size());
        this.akN.akL.aag.addAll(this.akM.aag);
        this.akN.akL.aah = this.akM.aah;
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

