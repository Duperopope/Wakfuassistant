/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xg
 */
final class xg_2 {
    private final ArrayList<xe_1> ajp = new ArrayList(0);
    final /* synthetic */ xd_1 ajq;

    xg_2(xd_1 xd_12) {
        this.ajq = xd_12;
    }

    public void avW() {
        this.ajq.ajl.clear();
        this.ajq.ajl.ensureCapacity(this.ajp.size());
        this.ajq.ajl.addAll(this.ajp);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajp.clear();
        this.ajp.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xe_1 xe_12 = new xe_1();
            boolean bl = xe_12.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.ajp.add(xe_12);
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

