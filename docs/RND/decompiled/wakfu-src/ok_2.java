/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oK
 */
final class ok_2 {
    private oj_1 Rz = null;
    final /* synthetic */ oh_1 RF;

    ok_2(oh_1 oh_12) {
        this.RF = oh_12;
    }

    public void avW() {
        this.RF.Rz = this.Rz;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10026000) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

