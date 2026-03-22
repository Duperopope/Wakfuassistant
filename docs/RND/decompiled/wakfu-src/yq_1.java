/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yq
 */
public class yq_1
implements gs_0 {
    public final ArrayList<yr_1> alH = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.alH.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.alH.size());
        for (int i = 0; i < this.alH.size(); ++i) {
            yr_1 yr_12 = this.alH.get(i);
            boolean bl = yr_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alH.clear();
        this.alH.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yr_1 yr_12 = new yr_1();
            boolean bl = yr_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.alH.add(yr_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.alH.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            yt_1 yt_12 = new yt_1(this);
            boolean bl = yt_12.b(byteBuffer, n);
            if (bl) {
                yt_12.avW();
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
        for (int i = 0; i < this.alH.size(); ++i) {
            yr_1 yr_12 = this.alH.get(i);
            n += yr_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eD(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eD(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("contents=");
        if (this.alH.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.alH.size()).append(" elements)...\n");
            for (int i = 0; i < this.alH.size(); ++i) {
                yr_1 yr_12 = this.alH.get(i);
                yr_12.eE(stringBuilder, string + i + "/ ");
            }
        }
    }
}

