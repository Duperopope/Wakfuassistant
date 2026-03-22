/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sP
 */
final class sp_2 {
    private sq_1 Zs = null;
    final /* synthetic */ so_1 Zt;

    sp_2(so_1 so_12) {
        this.Zt = so_12;
    }

    public void avW() {
        this.Zt.Zs = this.Zs;
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

