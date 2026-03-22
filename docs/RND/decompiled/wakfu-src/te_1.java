/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tE
 */
public class te_1
implements gs_0 {
    public long aaX = 0L;
    public final ArrayList<tf_1> aaY = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aaX);
        if (this.aaY.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aaY.size());
        for (int i = 0; i < this.aaY.size(); ++i) {
            tf_1 tf_12 = this.aaY.get(i);
            boolean bl = tf_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aaX = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aaY.clear();
        this.aaY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tf_1 tf_12 = new tf_1();
            boolean bl = tf_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aaY.add(tf_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aaX = 0L;
        this.aaY.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 2;
        for (int i = 0; i < this.aaY.size(); ++i) {
            tf_1 tf_12 = this.aaY.get(i);
            n += tf_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bz(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bz(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lastUpdateTime=").append(this.aaX).append('\n');
        stringBuilder.append(string).append("resources=");
        if (this.aaY.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aaY.size()).append(" elements)...\n");
            for (int i = 0; i < this.aaY.size(); ++i) {
                tf_1 tf_12 = this.aaY.get(i);
                tf_12.bA(stringBuilder, string + i + "/ ");
            }
        }
    }
}

