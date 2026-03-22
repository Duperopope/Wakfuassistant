/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xT
 */
public class xt_2
implements gs_0 {
    public final ArrayList<xu_1> akK = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.akK.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akK.size());
        for (int i = 0; i < this.akK.size(); ++i) {
            xu_1 xu_12 = this.akK.get(i);
            boolean bl = xu_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akK.clear();
        this.akK.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xu_1 xu_12 = new xu_1();
            boolean bl = xu_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akK.add(xu_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.akK.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xw_2 xw_22 = new xw_2(this);
            boolean bl = xw_22.b(byteBuffer, n);
            if (bl) {
                xw_22.avW();
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
        for (int i = 0; i < this.akK.size(); ++i) {
            xu_1 xu_12 = this.akK.get(i);
            n += xu_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eq(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eq(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challenges=");
        if (this.akK.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akK.size()).append(" elements)...\n");
            for (int i = 0; i < this.akK.size(); ++i) {
                xu_1 xu_12 = this.akK.get(i);
                xu_12.er(stringBuilder, string + i + "/ ");
            }
        }
    }
}

