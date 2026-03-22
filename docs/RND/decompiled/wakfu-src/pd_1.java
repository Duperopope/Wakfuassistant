/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from pD
 */
public class pd_1
extends go_0
implements gs_0 {
    public final ArrayList<pg_1> Tb = new ArrayList(0);
    private final fi_1 Tc = new pe_2(this);

    @Override
    public fi_1 DM() {
        return this.Tc;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Tb.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.Tb.size());
        for (int i = 0; i < this.Tb.size(); ++i) {
            pg_1 pg_12 = this.Tb.get(i);
            boolean bl = pg_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        this.Tb.clear();
        this.Tb.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            pg_1 pg_12 = new pg_1();
            boolean bl = pg_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Tb.add(pg_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Tb.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10040007) {
            pf_2 pf_22 = new pf_2(this);
            boolean bl = pf_22.b(byteBuffer, n);
            if (bl) {
                pf_22.avW();
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
        for (int i = 0; i < this.Tb.size(); ++i) {
            pg_1 pg_12 = this.Tb.get(i);
            n += pg_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.z(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void z(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=");
        if (this.Tb.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Tb.size()).append(" elements)...\n");
            for (int i = 0; i < this.Tb.size(); ++i) {
                pg_1 pg_12 = this.Tb.get(i);
                pg_12.A(stringBuilder, string + i + "/ ");
            }
        }
    }
}

