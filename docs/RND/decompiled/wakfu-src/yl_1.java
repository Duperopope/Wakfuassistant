/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yL
 */
public class yl_1
implements gs_0 {
    public final ArrayList<ym_2> amq = new ArrayList(0);
    public short amr = 0;
    public long ams = 0L;
    public long amt = 0L;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.amq.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.amq.size());
        for (int i = 0; i < this.amq.size(); ++i) {
            ym_2 ym_22 = this.amq.get(i);
            boolean bl = ym_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putShort(this.amr);
        byteBuffer.putLong(this.ams);
        byteBuffer.putLong(this.amt);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.amq.clear();
        this.amq.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ym_2 ym_22 = new ym_2();
            boolean bl = ym_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.amq.add(ym_22);
        }
        this.amr = byteBuffer.getShort();
        this.ams = byteBuffer.getLong();
        this.amt = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.amq.clear();
        this.amr = 0;
        this.ams = 0L;
        this.amt = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.amq.size(); ++i) {
            ym_2 ym_22 = this.amq.get(i);
            n += ym_22.DN();
        }
        n += 2;
        n += 8;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eO(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eO(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("transactions=");
        if (this.amq.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.amq.size()).append(" elements)...\n");
            for (int i = 0; i < this.amq.size(); ++i) {
                ym_2 ym_22 = this.amq.get(i);
                ym_22.eP(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("newTransactionsCount=").append(this.amr).append('\n');
        stringBuilder.append(string).append("newTransactionsKamas=").append(this.ams).append('\n');
        stringBuilder.append(string).append("lastReadTransactionDate=").append(this.amt).append('\n');
    }
}

