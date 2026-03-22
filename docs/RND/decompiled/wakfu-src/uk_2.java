/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uK
 */
public class uk_2
implements gs_0 {
    public final ArrayList<ul_1> adW = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.adW.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adW.size());
        for (int i = 0; i < this.adW.size(); ++i) {
            ul_1 ul_12 = this.adW.get(i);
            boolean bl = ul_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adW.clear();
        this.adW.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ul_1 ul_12 = new ul_1();
            boolean bl = ul_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adW.add(ul_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.adW.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.adW.size(); ++i) {
            ul_1 ul_12 = this.adW.get(i);
            n += ul_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cn(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cn(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("buildings=");
        if (this.adW.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adW.size()).append(" elements)...\n");
            for (int i = 0; i < this.adW.size(); ++i) {
                ul_1 ul_12 = this.adW.get(i);
                ul_12.co(stringBuilder, string + i + "/ ");
            }
        }
    }
}

