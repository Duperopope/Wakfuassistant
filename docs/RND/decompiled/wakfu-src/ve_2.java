/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ve
 */
final class ve_2 {
    private final vg_2 aeU = new vg_2();
    final /* synthetic */ vd_2 aeV;

    ve_2(vd_2 vd_22) {
        this.aeV = vd_22;
    }

    public void avW() {
        this.aeV.aeT.afS = this.aeU.afS;
        this.aeV.aeT.afT = this.aeU.afT;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10036004) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

