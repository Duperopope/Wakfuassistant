/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from re
 */
final class re_1 {
    private rf_2 Wg = null;
    final /* synthetic */ rc_2 Wj;

    re_1(rc_2 rc_22) {
        this.Wj = rc_22;
    }

    public void avW() {
        this.Wj.Wg = this.Wg;
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

