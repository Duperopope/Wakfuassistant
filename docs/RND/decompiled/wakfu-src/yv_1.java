/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yv
 */
final class yv_1 {
    private final ArrayList<yw_1> alO = new ArrayList(0);
    final /* synthetic */ yu_1 alP;

    yv_1(yu_1 yu_12) {
        this.alP = yu_12;
    }

    public void avW() {
        this.alP.alN.clear();
        this.alP.alN.ensureCapacity(this.alO.size());
        this.alP.alN.addAll(this.alO);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alO.clear();
        this.alO.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yw_1 yw_12 = new yw_1();
            boolean bl = yw_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alO.add(yw_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

