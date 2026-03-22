/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uk
 */
public class uk_1
implements gs_0 {
    public final ArrayList<ul_2> acG = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.acG.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.acG.size());
        for (int i = 0; i < this.acG.size(); ++i) {
            ul_2 ul_22 = this.acG.get(i);
            boolean bl = ul_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.acG.clear();
        this.acG.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ul_2 ul_22 = new ul_2();
            boolean bl = ul_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.acG.add(ul_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.acG.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.acG.size(); ++i) {
            ul_2 ul_22 = this.acG.get(i);
            n += ul_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bV(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bV(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("participants=");
        if (this.acG.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.acG.size()).append(" elements)...\n");
            for (int i = 0; i < this.acG.size(); ++i) {
                ul_2 ul_22 = this.acG.get(i);
                ul_22.bW(stringBuilder, string + i + "/ ");
            }
        }
    }
}

