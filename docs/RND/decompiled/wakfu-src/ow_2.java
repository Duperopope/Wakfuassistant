/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oW
 */
final class ow_2 {
    private final yg_2 RX = new yg_2();
    final /* synthetic */ ov_2 RY;

    ow_2(ov_2 ov_22) {
        this.RY = ov_22;
    }

    public void avW() {
        this.RY.RW.amg.clear();
        this.RY.RW.amg.ensureCapacity(this.RX.amg.size());
        this.RY.RW.amg.addAll(this.RX.amg);
        this.RY.RW.amh = this.RX.amh;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.RX.b(byteBuffer, 1);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10013) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

