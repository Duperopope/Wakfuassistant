/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uM
 */
public class um_2
implements gs_0 {
    public final ArrayList<un_1> adY = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.adY.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adY.size());
        for (int i = 0; i < this.adY.size(); ++i) {
            un_1 un_12 = this.adY.get(i);
            boolean bl = un_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adY.clear();
        this.adY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            un_1 un_12 = new un_1();
            boolean bl = un_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adY.add(un_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.adY.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.adY.size(); ++i) {
            un_1 un_12 = this.adY.get(i);
            n += un_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cp(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cp(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("buildings=");
        if (this.adY.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adY.size()).append(" elements)...\n");
            for (int i = 0; i < this.adY.size(); ++i) {
                un_1 un_12 = this.adY.get(i);
                un_12.cq(stringBuilder, string + i + "/ ");
            }
        }
    }
}

