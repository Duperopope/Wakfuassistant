/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wI
 */
public class wi_1
implements gs_0 {
    public final ArrayList<wj_1> aic = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.aic.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aic.size());
        for (int i = 0; i < this.aic.size(); ++i) {
            wj_1 wj_12 = this.aic.get(i);
            boolean bl = wj_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aic.clear();
        this.aic.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wj_1 wj_12 = new wj_1();
            boolean bl = wj_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aic.add(wj_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aic.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.aic.size(); ++i) {
            wj_1 wj_12 = this.aic.get(i);
            n += wj_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dw(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dw(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("properties=");
        if (this.aic.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aic.size()).append(" elements)...\n");
            for (int i = 0; i < this.aic.size(); ++i) {
                wj_1 wj_12 = this.aic.get(i);
                wj_12.dx(stringBuilder, string + i + "/ ");
            }
        }
    }
}

