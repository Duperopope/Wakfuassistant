/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ts
 */
final class ts_1 {
    private final ArrayList<tq_2> aaB = new ArrayList(0);
    final /* synthetic */ tp_1 aaC;

    ts_1(tp_1 tp_12) {
        this.aaC = tp_12;
    }

    public void avW() {
        this.aaC.aau.clear();
        this.aaC.aau.ensureCapacity(this.aaB.size());
        this.aaC.aau.addAll(this.aaB);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aaB.clear();
        this.aaB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_2 tq_22 = new tq_2();
            boolean bl = tq_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.aaB.add(tq_22);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

