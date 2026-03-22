/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vQ
 */
final class vq_2 {
    private final vr_2 agk = new vr_2();
    final /* synthetic */ vp_1 agl;

    vq_2(vp_1 vp_12) {
        this.agl = vp_12;
    }

    public void avW() {
        this.agl.agj.WB = this.agk.WB;
        this.agl.agj.YH = this.agk.YH;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 314) {
            return false;
        }
        if (n < 10024001) {
            boolean bl = this.cH(byteBuffer);
            return bl;
        }
        return false;
    }
}

