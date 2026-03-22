/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sX
 */
public class sx_2
implements gs_0 {
    public final ArrayList<sy_2> ZI = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ZI.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ZI.size());
        for (int i = 0; i < this.ZI.size(); ++i) {
            sy_2 sy_22 = this.ZI.get(i);
            boolean bl = sy_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ZI.clear();
        this.ZI.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            sy_2 sy_22 = new sy_2();
            boolean bl = sy_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ZI.add(sy_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ZI.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090003) {
            ta_1 ta_12 = new ta_1(this);
            boolean bl = ta_12.b(byteBuffer, n);
            if (bl) {
                ta_12.avW();
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
        for (int i = 0; i < this.ZI.size(); ++i) {
            sy_2 sy_22 = this.ZI.get(i);
            n += sy_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bd(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bd(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bags=");
        if (this.ZI.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ZI.size()).append(" elements)...\n");
            for (int i = 0; i < this.ZI.size(); ++i) {
                sy_2 sy_22 = this.ZI.get(i);
                sy_22.be(stringBuilder, string + i + "/ ");
            }
        }
    }
}

