/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ub
 */
final class ub_1 {
    private int ach = 0;
    private final xd_2 aci = new xd_2();

    ub_1(ua_1 ua_12) {
    }

    public void avW() {
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.ach = byteBuffer.getInt();
        boolean bl = this.aci.b(byteBuffer, 1);
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
        if (n < 10014) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

