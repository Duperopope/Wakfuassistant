/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vF
 */
final class vf_1 {
    private byte Us = 0;
    private long afQ = 0L;
    private boolean afO = false;
    final /* synthetic */ ve_1 afR;

    vf_1(ve_1 ve_12) {
        this.afR = ve_12;
    }

    public void avW() {
        this.afR.Us = this.Us;
        this.afR.afO = this.afO;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Us = byteBuffer.get();
        this.afQ = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10045010) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

