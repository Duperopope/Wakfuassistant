/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qD
 */
final class qd_1 {
    private final ArrayList<qe_2> Vb = new ArrayList(0);
    final /* synthetic */ qb_2 Vc;

    qd_1(qb_2 qb_22) {
        this.Vc = qb_22;
    }

    public void avW() {
        this.Vc.UY.clear();
        this.Vc.UY.ensureCapacity(this.Vb.size());
        this.Vc.UY.addAll(this.Vb);
    }

    private boolean dB(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Vb.clear();
        this.Vb.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            qe_2 qe_22 = new qe_2();
            boolean bl = qe_22.b(byteBuffer, 10021);
            if (!bl) {
                return false;
            }
            this.Vb.add(qe_22);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10021) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.dB(byteBuffer);
            return bl;
        }
        return false;
    }
}

