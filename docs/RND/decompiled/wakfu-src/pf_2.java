/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from pF
 */
final class pf_2 {
    private final ArrayList<pg_1> Te = new ArrayList(0);
    final /* synthetic */ pd_1 Tf;

    pf_2(pd_1 pd_12) {
        this.Tf = pd_12;
    }

    public void avW() {
        this.Tf.Tb.clear();
        this.Tf.Tb.ensureCapacity(this.Te.size());
        this.Tf.Tb.addAll(this.Te);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.Te.clear();
        this.Te.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            pg_1 pg_12 = new pg_1();
            boolean bl = pg_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.Te.add(pg_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10040007) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

