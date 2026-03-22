/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xd
 */
public class xd_1
implements gs_0 {
    public final ArrayList<xe_1> ajl = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ajl.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajl.size());
        for (int i = 0; i < this.ajl.size(); ++i) {
            xe_1 xe_12 = this.ajl.get(i);
            boolean bl = xe_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajl.clear();
        this.ajl.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xe_1 xe_12 = new xe_1();
            boolean bl = xe_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajl.add(xe_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajl.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xg_2 xg_22 = new xg_2(this);
            boolean bl = xg_22.b(byteBuffer, n);
            if (bl) {
                xg_22.avW();
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
        for (int i = 0; i < this.ajl.size(); ++i) {
            xe_1 xe_12 = this.ajl.get(i);
            n += xe_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dN(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dN(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("taxValues=");
        if (this.ajl.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajl.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajl.size(); ++i) {
                xe_1 xe_12 = this.ajl.get(i);
                xe_12.dO(stringBuilder, string + i + "/ ");
            }
        }
    }
}

