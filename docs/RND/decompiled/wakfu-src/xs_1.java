/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xs
 */
public class xs_1
implements gs_0 {
    public final ArrayList<xt_1> ajO = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ajO.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajO.size());
        for (int i = 0; i < this.ajO.size(); ++i) {
            xt_1 xt_12 = this.ajO.get(i);
            boolean bl = xt_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajO.clear();
        this.ajO.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xt_1 xt_12 = new xt_1();
            boolean bl = xt_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajO.add(xt_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajO.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xu_2 xu_22 = new xu_2(this);
            boolean bl = xu_22.b(byteBuffer, n);
            if (bl) {
                xu_22.avW();
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
        for (int i = 0; i < this.ajO.size(); ++i) {
            xt_1 xt_12 = this.ajO.get(i);
            n += xt_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dY(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dY(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("contentsSelection=");
        if (this.ajO.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajO.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajO.size(); ++i) {
                xt_1 xt_12 = this.ajO.get(i);
                xt_12.dZ(stringBuilder, string + i + "/ ");
            }
        }
    }
}

