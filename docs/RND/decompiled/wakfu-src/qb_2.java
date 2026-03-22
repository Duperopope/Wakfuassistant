/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from qB
 */
public class qb_2
extends go_0
implements gs_0 {
    public final ArrayList<qe_2> UY = new ArrayList(0);
    private final fi_1 UZ = new qc_1(this);

    @Override
    public fi_1 DM() {
        return this.UZ;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.UY.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.UY.size());
        for (int i = 0; i < this.UY.size(); ++i) {
            qe_2 qe_22 = this.UY.get(i);
            boolean bl = qe_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.UY.clear();
        this.UY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            qe_2 qe_22 = new qe_2();
            boolean bl = qe_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.UY.add(qe_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.UY.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            qd_1 qd_12 = new qd_1(this);
            boolean bl = qd_12.b(byteBuffer, n);
            if (bl) {
                qd_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.UY.size(); ++i) {
            qe_2 qe_22 = this.UY.get(i);
            n += qe_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.W(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void W(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=");
        if (this.UY.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.UY.size()).append(" elements)...\n");
            for (int i = 0; i < this.UY.size(); ++i) {
                qe_2 qe_22 = this.UY.get(i);
                qe_22.X(stringBuilder, string + i + "/ ");
            }
        }
    }
}

