/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vg
 */
final class vg_1 {
    private final yd_2 aeX = new yd_2();

    vg_1(vf_2 vf_22) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl = this.aeX.b(byteBuffer, 10003);
        return bl;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10003) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        return false;
    }
}

