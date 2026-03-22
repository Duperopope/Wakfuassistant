/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yy
 */
@Deprecated
public class yy_1
implements gs_0 {
    public final ArrayList<yz_1> alU = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.alU.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alU.size());
        for (int i = 0; i < this.alU.size(); ++i) {
            yz_1 yz_12 = this.alU.get(i);
            boolean bl = yz_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alU.clear();
        this.alU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alU.add(yz_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.alU.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            yb_2 yb_22 = new yb_2(this);
            boolean bl = yb_22.b(byteBuffer, n);
            if (bl) {
                yb_22.avW();
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
        for (int i = 0; i < this.alU.size(); ++i) {
            yz_1 yz_12 = this.alU.get(i);
            n += yz_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("compartments=");
        if (this.alU.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alU.size()).append(" elements)...\n");
            for (int i = 0; i < this.alU.size(); ++i) {
                yz_1 yz_12 = this.alU.get(i);
                yz_12.eI(stringBuilder, string + i + "/ ");
            }
        }
    }
}

