/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xX
 */
public class xx_1
implements gs_0 {
    public final ArrayList<xz_2> akQ = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.akQ.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akQ.size());
        for (int i = 0; i < this.akQ.size(); ++i) {
            xz_2 xz_22 = this.akQ.get(i);
            boolean bl = xz_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akQ.clear();
        this.akQ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xz_2 xz_22 = new xz_2();
            boolean bl = xz_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akQ.add(xz_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.akQ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xy_2 xy_22 = new xy_2(this);
            boolean bl = xy_22.b(byteBuffer, n);
            if (bl) {
                xy_22.avW();
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
        for (int i = 0; i < this.akQ.size(); ++i) {
            xz_2 xz_22 = this.akQ.get(i);
            n += xz_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.es(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void es(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("scenarii=");
        if (this.akQ.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akQ.size()).append(" elements)...\n");
            for (int i = 0; i < this.akQ.size(); ++i) {
                xz_2 xz_22 = this.akQ.get(i);
                xz_22.et(stringBuilder, string + i + "/ ");
            }
        }
    }
}

