/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oE
 */
final class oe_1 {
    private byte[] Rq = null;
    private boolean Rr = false;
    final /* synthetic */ oc_1 Ru;

    oe_1(oc_1 oc_12) {
        this.Ru = oc_12;
    }

    public void avW() {
        this.Ru.Rq = this.Rq;
        this.Ru.Rr = this.Rr;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Rq = new byte[n];
            byteBuffer.get(this.Rq);
        } else {
            this.Rq = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10064001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

