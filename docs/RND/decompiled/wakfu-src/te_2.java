/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from te
 */
public class te_2
implements gs_0 {
    public final ArrayList<tf_2> ZW = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ZW.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ZW.size());
        for (int i = 0; i < this.ZW.size(); ++i) {
            tf_2 tf_22 = this.ZW.get(i);
            boolean bl = tf_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ZW.clear();
        this.ZW.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tf_2 tf_22 = new tf_2();
            boolean bl = tf_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ZW.add(tf_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ZW.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.ZW.size(); ++i) {
            tf_2 tf_22 = this.ZW.get(i);
            n += tf_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bi(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bi(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bookRefIds=");
        if (this.ZW.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ZW.size()).append(" elements)...\n");
            for (int i = 0; i < this.ZW.size(); ++i) {
                tf_2 tf_22 = this.ZW.get(i);
                tf_22.bj(stringBuilder, string + i + "/ ");
            }
        }
    }
}

