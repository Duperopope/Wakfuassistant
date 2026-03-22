/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xl
 */
public class xl_1
implements gs_0 {
    public long adP = 0L;
    public final ArrayList<xm_1> ajz = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adP);
        if (this.ajz.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajz.size());
        for (int i = 0; i < this.ajz.size(); ++i) {
            xm_1 xm_12 = this.ajz.get(i);
            boolean bl = xm_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adP = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajz.clear();
        this.ajz.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xm_1 xm_12 = new xm_1();
            boolean bl = xm_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajz.add(xm_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.adP = 0L;
        this.ajz.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            xo_2 xo_22 = new xo_2(this);
            boolean bl = xo_22.b(byteBuffer, n);
            if (bl) {
                xo_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 2;
        for (int i = 0; i < this.ajz.size(); ++i) {
            xm_1 xm_12 = this.ajz.get(i);
            n += xm_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dT(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dT(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.adP).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.ajz.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajz.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajz.size(); ++i) {
                xm_1 xm_12 = this.ajz.get(i);
                xm_12.dU(stringBuilder, string + i + "/ ");
            }
        }
    }
}

