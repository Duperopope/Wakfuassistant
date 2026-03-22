/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sT
 */
final class st_1 {
    private int Zw = 0;
    private final so_1 Zy = new so_1();
    final /* synthetic */ ss_2 Zz;

    st_1(ss_2 ss_22) {
        this.Zz = ss_22;
    }

    public void avW() {
        this.Zz.Zw = this.Zw;
        this.Zz.Zx.Zs = this.Zy.Zs;
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

