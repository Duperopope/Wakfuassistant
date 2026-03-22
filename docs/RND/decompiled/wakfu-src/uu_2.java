/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uu
 */
public class uu_2
implements gs_0 {
    public final ArrayList<uv_2> adi = new ArrayList(0);
    public int adj = 0;
    public final ud_1 adk = new ud_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        if (this.adi.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adi.size());
        for (n = 0; n < this.adi.size(); ++n) {
            uv_2 uv_22 = this.adi.get(n);
            boolean bl = uv_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putInt(this.adj);
        n = this.adk.aF(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adi.clear();
        this.adi.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adi.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adk.aG(byteBuffer) ? 1 : 0;
        return n != 0;
    }

    @Override
    public void clear() {
        this.adi.clear();
        this.adj = 0;
        this.adk.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ux_1 ux_12 = new ux_1(this);
            boolean bl = ux_12.b(byteBuffer, n);
            if (bl) {
                ux_12.avW();
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
        for (int i = 0; i < this.adi.size(); ++i) {
            uv_2 uv_22 = this.adi.get(i);
            n += uv_22.DN();
        }
        n += 4;
        return n += this.adk.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cd(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cd(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("compartments=");
        if (this.adi.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adi.size()).append(" elements)...\n");
            for (int i = 0; i < this.adi.size(); ++i) {
                uv_2 uv_22 = this.adi.get(i);
                uv_22.ce(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("money=").append(this.adj).append('\n');
        stringBuilder.append(string).append("history=...\n");
        this.adk.ci(stringBuilder, string + "  ");
    }
}

