/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wZ
 */
public class wz_1
implements gs_0 {
    public final ArrayList<xa_1> ajf = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ajf.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajf.size());
        for (int i = 0; i < this.ajf.size(); ++i) {
            xa_1 xa_12 = this.ajf.get(i);
            boolean bl = xa_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajf.clear();
        this.ajf.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_1 xa_12 = new xa_1();
            boolean bl = xa_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajf.add(xa_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajf.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.ajf.size(); ++i) {
            xa_1 xa_12 = this.ajf.get(i);
            n += xa_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dJ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("targets=");
        if (this.ajf.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajf.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajf.size(); ++i) {
                xa_1 xa_12 = this.ajf.get(i);
                xa_12.dK(stringBuilder, string + i + "/ ");
            }
        }
    }
}

