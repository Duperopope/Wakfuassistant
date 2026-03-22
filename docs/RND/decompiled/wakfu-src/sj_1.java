/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sJ
 */
public class sj_1
extends go_0
implements gs_0 {
    public long Zi = 0L;
    public final ArrayList<sl_2> Zj = new ArrayList(0);
    private final fi_1 Zk = new sk_2(this);

    @Override
    public fi_1 DM() {
        return this.Zk;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Zi);
        if (this.Zj.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Zj.size());
        for (int i = 0; i < this.Zj.size(); ++i) {
            sl_2 sl_22 = this.Zj.get(i);
            boolean bl = sl_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Zi = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Zj.clear();
        this.Zj.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sl_2 sl_22 = new sl_2();
            boolean bl = sl_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Zj.add(sl_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Zi = 0L;
        this.Zj.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 2;
        for (int i = 0; i < this.Zj.size(); ++i) {
            sl_2 sl_22 = this.Zj.get(i);
            n += sl_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aV(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aV(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("groupId=").append(this.Zi).append('\n');
        stringBuilder.append(string).append("members=");
        if (this.Zj.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Zj.size()).append(" elements)...\n");
            for (int i = 0; i < this.Zj.size(); ++i) {
                sl_2 sl_22 = this.Zj.get(i);
                sl_22.aW(stringBuilder, string + i + "/ ");
            }
        }
    }
}

