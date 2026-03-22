/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xf
 */
final class xf_1 {
    private final yk_1 ajn = new yk_1();
    final /* synthetic */ xe_1 ajo;

    xf_1(xe_1 xe_12) {
        this.ajo = xe_12;
    }

    public void avW() {
        this.ajo.ajm.amn = this.ajn.amn;
        this.ajo.ajm.amo = this.ajn.amo;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        boolean bl = this.ajn.b(byteBuffer, 0);
        return bl;
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

