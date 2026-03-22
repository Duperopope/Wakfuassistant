/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wR
 */
public class wr_1
implements gs_0 {
    public final ArrayList<ws_2> aiG = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.aiG.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aiG.size());
        for (int i = 0; i < this.aiG.size(); ++i) {
            ws_2 ws_22 = this.aiG.get(i);
            boolean bl = ws_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.aiG.clear();
        this.aiG.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ws_2 ws_22 = new ws_2();
            boolean bl = ws_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aiG.add(ws_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aiG.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.aiG.size(); ++i) {
            ws_2 ws_22 = this.aiG.get(i);
            n += ws_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dE(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dE(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("targets=");
        if (this.aiG.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aiG.size()).append(" elements)...\n");
            for (int i = 0; i < this.aiG.size(); ++i) {
                ws_2 ws_22 = this.aiG.get(i);
                ws_22.dF(stringBuilder, string + i + "/ ");
            }
        }
    }
}

