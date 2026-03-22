/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yu
 */
public class yu_1
implements gs_0 {
    public final ArrayList<yw_1> alN = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.alN.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alN.size());
        for (int i = 0; i < this.alN.size(); ++i) {
            yw_1 yw_12 = this.alN.get(i);
            boolean bl = yw_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alN.clear();
        this.alN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yw_1 yw_12 = new yw_1();
            boolean bl = yw_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alN.add(yw_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.alN.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            yv_1 yv_12 = new yv_1(this);
            boolean bl = yv_12.b(byteBuffer, n);
            if (bl) {
                yv_12.avW();
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
        for (int i = 0; i < this.alN.size(); ++i) {
            yw_1 yw_12 = this.alN.get(i);
            n += yw_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eF(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eF(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("effects=");
        if (this.alN.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alN.size()).append(" elements)...\n");
            for (int i = 0; i < this.alN.size(); ++i) {
                yw_1 yw_12 = this.alN.get(i);
                yw_12.eG(stringBuilder, string + i + "/ ");
            }
        }
    }
}

