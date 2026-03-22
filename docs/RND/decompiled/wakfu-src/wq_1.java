/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wq
 */
public class wq_1
implements gs_0 {
    public final ArrayList<wr_2> ahn = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ahn.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ahn.size());
        for (int i = 0; i < this.ahn.size(); ++i) {
            wr_2 wr_22 = this.ahn.get(i);
            boolean bl = wr_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ahn.clear();
        this.ahn.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wr_2 wr_22 = new wr_2();
            boolean bl = wr_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ahn.add(wr_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ahn.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.ahn.size(); ++i) {
            wr_2 wr_22 = this.ahn.get(i);
            n += wr_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dq(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dq(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("governmentOpinions=");
        if (this.ahn.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ahn.size()).append(" elements)...\n");
            for (int i = 0; i < this.ahn.size(); ++i) {
                wr_2 wr_22 = this.ahn.get(i);
                wr_22.dr(stringBuilder, string + i + "/ ");
            }
        }
    }
}

