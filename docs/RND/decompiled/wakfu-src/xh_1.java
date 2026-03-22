/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xh
 */
public class xh_1
implements gs_0 {
    public int ajr = 0;
    public final ArrayList<xi_2> ajs = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.ajr);
        if (this.ajs.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajs.size());
        for (int i = 0; i < this.ajs.size(); ++i) {
            xi_2 xi_22 = this.ajs.get(i);
            boolean bl = xi_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajs.clear();
        this.ajs.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xi_2 xi_22 = new xi_2();
            boolean bl = xi_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajs.add(xi_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajr = 0;
        this.ajs.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 2;
        for (int i = 0; i < this.ajs.size(); ++i) {
            xi_2 xi_22 = this.ajs.get(i);
            n += xi_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dP(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("cashAmount=").append(this.ajr).append('\n');
        stringBuilder.append(string).append("contexts=");
        if (this.ajs.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajs.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajs.size(); ++i) {
                xi_2 xi_22 = this.ajs.get(i);
                xi_22.dQ(stringBuilder, string + i + "/ ");
            }
        }
    }
}

