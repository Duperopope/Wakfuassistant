/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vo
 */
final class vo_1 {
    private final xy_1 afl = new xy_1();

    vo_1(vn_1 vn_12) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl = this.afl.b(byteBuffer, 10028000);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10028000) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.cM(byteBuffer);
            return bl;
        }
        return false;
    }
}

