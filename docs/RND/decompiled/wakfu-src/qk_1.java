/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qK
 */
final class qk_1 {
    private final ArrayList<ql_2> Vr = new ArrayList(0);
    private final ArrayList<qm_1> Vs = new ArrayList(0);
    final /* synthetic */ qi_2 Vt;

    qk_1(qi_2 qi_22) {
        this.Vt = qi_22;
    }

    public void avW() {
        this.Vt.Vn.clear();
        this.Vt.Vn.ensureCapacity(this.Vr.size());
        this.Vt.Vn.addAll(this.Vr);
        this.Vt.Vo.clear();
        this.Vt.Vo.ensureCapacity(this.Vs.size());
        this.Vt.Vo.addAll(this.Vs);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Vr.clear();
        this.Vr.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ql_2 ql_22 = new ql_2();
            boolean bl = ql_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.Vr.add(ql_22);
        }
        return true;
    }

    private boolean dC(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.Vr.clear();
        this.Vr.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ql_2 ql_22 = new ql_2();
            boolean bl = ql_22.b(byteBuffer, 222);
            if (!bl) {
                return false;
            }
            this.Vr.add(ql_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.Vs.clear();
        this.Vs.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            qm_1 qm_12 = new qm_1();
            boolean bl = qm_12.b(byteBuffer, 222);
            if (!bl) {
                return false;
            }
            this.Vs.add(qm_12);
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 222) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10053002) {
            boolean bl = this.dC(byteBuffer);
            return bl;
        }
        return false;
    }
}

