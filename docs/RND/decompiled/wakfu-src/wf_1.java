/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wf
 */
public class wf_1
implements gs_0 {
    public final ArrayList<wg_1> agR = new ArrayList(0);
    public final ArrayList<wh_2> agS = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.agR.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agR.size());
        for (n = 0; n < this.agR.size(); ++n) {
            gs_02 = this.agR.get(n);
            bl = ((wg_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.agS.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agS.size());
        for (n = 0; n < this.agS.size(); ++n) {
            gs_02 = this.agS.get(n);
            bl = ((wh_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agR.clear();
        this.agR.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wg_1 wg_12 = new wg_1();
            boolean bl = wg_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agR.add(wg_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.agS.clear();
        this.agS.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            wh_2 wh_22 = new wh_2();
            boolean bl = wh_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agS.add(wh_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.agR.clear();
        this.agS.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 2;
        for (n = 0; n < this.agR.size(); ++n) {
            gs_02 = this.agR.get(n);
            n2 += ((wg_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.agS.size(); ++n) {
            gs_02 = this.agS.get(n);
            n2 += ((wh_2)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.df(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void df(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("alignments=");
        if (this.agR.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agR.size()).append(" elements)...\n");
            for (n = 0; n < this.agR.size(); ++n) {
                gs_02 = this.agR.get(n);
                ((wg_1)gs_02).dg(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("alignmentRequests=");
        if (this.agS.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agS.size()).append(" elements)...\n");
            for (n = 0; n < this.agS.size(); ++n) {
                gs_02 = this.agS.get(n);
                ((wh_2)gs_02).dh(stringBuilder, string + n + "/ ");
            }
        }
    }
}

