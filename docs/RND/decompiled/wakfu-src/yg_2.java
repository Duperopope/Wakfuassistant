/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yG
 */
public class yg_2
implements gs_0 {
    public final ArrayList<yh_1> amg = new ArrayList(0);
    public byte amh = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.amg.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.amg.size());
        for (int i = 0; i < this.amg.size(); ++i) {
            yh_1 yh_12 = this.amg.get(i);
            boolean bl = yh_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.put(this.amh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.amg.clear();
        this.amg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yh_1 yh_12 = new yh_1();
            boolean bl = yh_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.amg.add(yh_12);
        }
        this.amh = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.amg.clear();
        this.amh = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            yj_1 yj_12 = new yj_1(this);
            boolean bl = yj_12.b(byteBuffer, n);
            if (bl) {
                yj_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        for (int i = 0; i < this.amg.size(); ++i) {
            yh_1 yh_12 = this.amg.get(i);
            n += yh_12.DN();
        }
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eL(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eL(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("capturedCreatures=");
        if (this.amg.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.amg.size()).append(" elements)...\n");
            for (int i = 0; i < this.amg.size(); ++i) {
                yh_1 yh_12 = this.amg.get(i);
                yh_12.eM(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("currentCreatureIndex=").append(this.amh).append('\n');
    }
}

