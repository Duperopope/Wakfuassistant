/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xj
 */
public class xj_1
implements gs_0 {
    public final ArrayList<xk_1> ajv = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ajv.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ajv.size());
        for (int i = 0; i < this.ajv.size(); ++i) {
            xk_1 xk_12 = this.ajv.get(i);
            boolean bl = xk_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.ajv.clear();
        this.ajv.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xk_1 xk_12 = new xk_1();
            boolean bl = xk_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ajv.add(xk_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ajv.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.ajv.size(); ++i) {
            xk_1 xk_12 = this.ajv.get(i);
            n += xk_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dR(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dR(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("modifiers=");
        if (this.ajv.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ajv.size()).append(" elements)...\n");
            for (int i = 0; i < this.ajv.size(); ++i) {
                xk_1 xk_12 = this.ajv.get(i);
                xk_12.dS(stringBuilder, string + i + "/ ");
            }
        }
    }
}

