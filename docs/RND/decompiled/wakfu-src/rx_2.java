/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rX
 */
final class rx_2 {
    private final yu_1 XJ = new yu_1();
    final /* synthetic */ rv_2 XK;

    rx_2(rv_2 rv_22) {
        this.XK = rv_22;
    }

    public void avW() {
        this.XK.XG.alN.clear();
        this.XK.XG.alN.ensureCapacity(this.XJ.alN.size());
        this.XK.XG.alN.addAll(this.XJ.alN);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.XJ.b(byteBuffer, 1);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

