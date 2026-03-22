/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tD
 */
final class td_2 {
    private byte[] SY = null;

    td_2(tc_2 tc_22) {
    }

    public void avW() {
    }

    private boolean dm(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.SY = new byte[n];
            byteBuffer.get(this.SY);
        } else {
            this.SY = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10051000) {
            return false;
        }
        if (n < 10086002) {
            boolean bl = this.dm(byteBuffer);
            return bl;
        }
        return false;
    }
}

