/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from xH
 */
final class xh_2 {
    private long abV = 0L;
    private String abW = null;
    private boolean akl = false;

    xh_2(xg_1 xg_12) {
    }

    public void avW() {
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.abV = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.abW = new String(byArray, Charsets.UTF_8);
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

