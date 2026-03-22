/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sR
 */
public class sr_1
implements gs_0 {
    public final ArrayList<ss_2> Zv = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Zv.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Zv.size());
        for (int i = 0; i < this.Zv.size(); ++i) {
            ss_2 ss_22 = this.Zv.get(i);
            boolean bl = ss_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Zv.clear();
        this.Zv.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ss_2 ss_22 = new ss_2();
            boolean bl = ss_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Zv.add(ss_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Zv.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            su_2 su_22 = new su_2(this);
            boolean bl = su_22.b(byteBuffer, n);
            if (bl) {
                su_22.avW();
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
        for (int i = 0; i < this.Zv.size(); ++i) {
            ss_2 ss_22 = this.Zv.get(i);
            n += ss_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ba(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ba(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("actions=");
        if (this.Zv.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Zv.size()).append(" elements)...\n");
            for (int i = 0; i < this.Zv.size(); ++i) {
                ss_2 ss_22 = this.Zv.get(i);
                ss_22.bb(stringBuilder, string + i + "/ ");
            }
        }
    }
}

