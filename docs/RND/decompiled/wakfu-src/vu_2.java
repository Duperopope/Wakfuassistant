/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from vU
 */
public class vu_2
implements gs_0 {
    public final ArrayList<vv_1> agt = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.agt.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agt.size());
        for (int i = 0; i < this.agt.size(); ++i) {
            vv_1 vv_12 = this.agt.get(i);
            boolean bl = vv_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.agt.clear();
        this.agt.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            vv_1 vv_12 = new vv_1();
            boolean bl = vv_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agt.add(vv_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.agt.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            vx_2 vx_22 = new vx_2(this);
            boolean bl = vx_22.b(byteBuffer, n);
            if (bl) {
                vx_22.avW();
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
        for (int i = 0; i < this.agt.size(); ++i) {
            vv_1 vv_12 = this.agt.get(i);
            n += vv_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cZ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cZ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("locks=");
        if (this.agt.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agt.size()).append(" elements)...\n");
            for (int i = 0; i < this.agt.size(); ++i) {
                vv_1 vv_12 = this.agt.get(i);
                vv_12.da(stringBuilder, string + i + "/ ");
            }
        }
    }
}

