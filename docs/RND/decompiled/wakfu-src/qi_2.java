/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qI
 */
public class qi_2
extends go_0
implements gs_0 {
    public final ArrayList<ql_2> Vn = new ArrayList(0);
    public final ArrayList<qm_1> Vo = new ArrayList(0);
    private final fi_1 Vp = new qj_1(this);

    @Override
    public fi_1 DM() {
        return this.Vp;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.Vn.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Vn.size());
        for (n = 0; n < this.Vn.size(); ++n) {
            gs_02 = this.Vn.get(n);
            bl = ((ql_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.Vo.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Vo.size());
        for (n = 0; n < this.Vo.size(); ++n) {
            gs_02 = this.Vo.get(n);
            bl = ((qm_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.Vn.clear();
        this.Vn.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ql_2 ql_22 = new ql_2();
            boolean bl = ql_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Vn.add(ql_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.Vo.clear();
        this.Vo.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            qm_1 qm_12 = new qm_1();
            boolean bl = qm_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Vo.add(qm_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Vn.clear();
        this.Vo.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10053002) {
            qk_1 qk_12 = new qk_1(this);
            boolean bl = qk_12.b(byteBuffer, n);
            if (bl) {
                qk_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.Vn.size(); ++n) {
            gs_02 = this.Vn.get(n);
            n2 += ((ql_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.Vo.size(); ++n) {
            gs_02 = this.Vo.get(n);
            n2 += ((qm_1)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.Z(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void Z(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("nationCitizenScores=");
        if (this.Vn.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Vn.size()).append(" elements)...\n");
            for (n = 0; n < this.Vn.size(); ++n) {
                gs_02 = this.Vn.get(n);
                ((ql_2)gs_02).aa(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("offendedNations=");
        if (this.Vo.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Vo.size()).append(" elements)...\n");
            for (n = 0; n < this.Vo.size(); ++n) {
                gs_02 = this.Vo.get(n);
                ((qm_1)gs_02).ab(stringBuilder, string + n + "/ ");
            }
        }
    }
}

