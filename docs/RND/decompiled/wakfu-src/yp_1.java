/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yp
 */
final class yp_1 {
    private int alG = 0;

    yp_1(yo_1 yo_12) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.alG = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10056001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

