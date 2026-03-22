/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xF
 */
final class xf_2 {
    private int akk = 0;
    private boolean akl = false;

    xf_2(xe_2 xe_22) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.akk = byteBuffer.getInt();
        this.akl = byteBuffer.get() == 1;
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10014) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

