/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vi
 */
final class vi_2 {
    private final we_1 aeZ = new we_1();
    final /* synthetic */ vh_2 afa;

    vi_2(vh_2 vh_22) {
        this.afa = vh_22;
    }

    public void avW() {
        this.afa.aeY.aeb = this.aeZ.aeb;
        this.afa.aeY.agQ = this.aeZ.agQ;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10037001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

