/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tp
 */
public class tp_1
implements gs_0 {
    public final ArrayList<tq_2> aau = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.aau.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aau.size());
        for (int i = 0; i < this.aau.size(); ++i) {
            tq_2 tq_22 = this.aau.get(i);
            boolean bl = tq_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aau.clear();
        this.aau.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_2 tq_22 = new tq_2();
            boolean bl = tq_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aau.add(tq_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aau.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            ts_1 ts_12 = new ts_1(this);
            boolean bl = ts_12.b(byteBuffer, n);
            if (bl) {
                ts_12.avW();
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
        for (int i = 0; i < this.aau.size(); ++i) {
            tq_2 tq_22 = this.aau.get(i);
            n += tq_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.br(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void br(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("characteristics=");
        if (this.aau.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aau.size()).append(" elements)...\n");
            for (int i = 0; i < this.aau.size(); ++i) {
                tq_2 tq_22 = this.aau.get(i);
                tq_22.bs(stringBuilder, string + i + "/ ");
            }
        }
    }
}

