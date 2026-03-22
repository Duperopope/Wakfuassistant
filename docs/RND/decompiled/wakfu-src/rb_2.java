/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rB
 */
final class rb_2 {
    private rc_1 Xb = null;
    final /* synthetic */ rz_1 Xe;

    rb_2(rz_1 rz_12) {
        this.Xe = rz_12;
    }

    public void avW() {
        this.Xe.Xb = this.Xb;
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

