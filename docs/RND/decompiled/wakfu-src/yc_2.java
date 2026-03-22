/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yC
 */
@Deprecated
public class yc_2
implements gs_0 {
    public int adr = 0;
    public final ArrayList<yd_1> ama = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.adr);
        if (this.ama.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ama.size());
        for (int i = 0; i < this.ama.size(); ++i) {
            yd_1 yd_12 = this.ama.get(i);
            boolean bl = yd_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.adr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ama.clear();
        this.ama.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yd_1 yd_12 = new yd_1();
            boolean bl = yd_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ama.add(yd_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.adr = 0;
        this.ama.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            yf_2 yf_22 = new yf_2(this);
            boolean bl = yf_22.b(byteBuffer, n);
            if (bl) {
                yf_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 2;
        for (int i = 0; i < this.ama.size(); ++i) {
            yd_1 yd_12 = this.ama.get(i);
            n += yd_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eJ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.adr).append('\n');
        stringBuilder.append(string).append("items=");
        if (this.ama.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ama.size()).append(" elements)...\n");
            for (int i = 0; i < this.ama.size(); ++i) {
                yd_1 yd_12 = this.ama.get(i);
                yd_12.eK(stringBuilder, string + i + "/ ");
            }
        }
    }
}

