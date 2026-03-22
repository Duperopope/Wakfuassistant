/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sG
 */
public class sg_1
extends go_0
implements gs_0 {
    public final ArrayList<si_1> Zd = new ArrayList(0);
    private final fi_1 Ze = new sh_2(this);

    @Override
    public fi_1 DM() {
        return this.Ze;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Zd.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.Zd.size());
        for (int i = 0; i < this.Zd.size(); ++i) {
            si_1 si_12 = this.Zd.get(i);
            boolean bl = si_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.Zd.clear();
        this.Zd.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            si_1 si_12 = new si_1();
            boolean bl = si_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.Zd.add(si_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.Zd.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        for (int i = 0; i < this.Zd.size(); ++i) {
            si_1 si_12 = this.Zd.get(i);
            n += si_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aT(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aT(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("unavailableActions=");
        if (this.Zd.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.Zd.size()).append(" elements)...\n");
            for (int i = 0; i < this.Zd.size(); ++i) {
                si_1 si_12 = this.Zd.get(i);
                si_12.aU(stringBuilder, string + i + "/ ");
            }
        }
    }
}

