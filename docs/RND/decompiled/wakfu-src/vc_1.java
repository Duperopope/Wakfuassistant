/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vc
 */
final class vc_1 {
    private final tt_1 aeR = new tt_1();
    final /* synthetic */ vb_1 aeS;

    vc_1(vb_1 vb_12) {
        this.aeS = vb_12;
    }

    public void avW() {
        this.aeS.aeQ.YH = this.aeR.YH;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10029000) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

