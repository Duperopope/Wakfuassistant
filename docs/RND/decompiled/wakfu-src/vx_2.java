/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vX
 */
final class vx_2 {
    private final ArrayList<vv_1> agx = new ArrayList(0);
    final /* synthetic */ vu_2 agy;

    vx_2(vu_2 vu_22) {
        this.agy = vu_22;
    }

    public void avW() {
        this.agy.agt.clear();
        this.agy.agt.ensureCapacity(this.agx.size());
        this.agy.agt.addAll(this.agx);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.agx.clear();
        this.agx.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            vv_1 vv_12 = new vv_1();
            boolean bl = vv_12.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.agx.add(vv_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

