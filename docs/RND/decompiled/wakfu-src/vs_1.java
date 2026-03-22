/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vs
 */
final class vs_1 {
    private long afq = 0L;

    vs_1(vr_1 vr_12) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.afq = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048000) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

