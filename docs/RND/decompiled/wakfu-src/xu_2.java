/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xu
 */
final class xu_2 {
    private final ArrayList<xt_1> ajQ = new ArrayList(0);
    final /* synthetic */ xs_1 ajR;

    xu_2(xs_1 xs_12) {
        this.ajR = xs_12;
    }

    public void avW() {
        this.ajR.ajO.clear();
        this.ajR.ajO.ensureCapacity(this.ajQ.size());
        this.ajR.ajO.addAll(this.ajQ);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajQ.clear();
        this.ajQ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xt_1 xt_12 = new xt_1();
            boolean bl = xt_12.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.ajQ.add(xt_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

