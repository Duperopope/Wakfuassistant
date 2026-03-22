/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vJ
 */
final class vj_2 {
    private final tt_1 aga = new tt_1();
    final /* synthetic */ vi_1 agb;

    vj_2(vi_1 vi_12) {
        this.agb = vi_12;
    }

    public void avW() {
        this.agb.afZ.YH = this.aga.YH;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10030002) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

