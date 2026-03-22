/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wi
 */
public class wi_2
implements gs_0 {
    public final ArrayList<wk_1> agW = new ArrayList(0);
    public final ArrayList<wj_2> agX = new ArrayList(0);
    public wl_2 agY = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        if (this.agW.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agW.size());
        for (n = 0; n < this.agW.size(); ++n) {
            gs_02 = this.agW.get(n);
            bl = ((wk_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.agX.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agX.size());
        for (n = 0; n < this.agX.size(); ++n) {
            gs_02 = this.agX.get(n);
            bl = ((wj_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.agY != null) {
            byteBuffer.put((byte)1);
            n = this.agY.aF(byteBuffer) ? 1 : 0;
            if (n == 0) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.agW.clear();
        this.agW.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            wk_1 wk_12 = new wk_1();
            boolean bl = wk_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agW.add(wk_12);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.agX.clear();
        this.agX.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            wj_2 wj_22 = new wj_2();
            boolean bl = wj_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agX.add(wj_22);
        }
        int n4 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.agY = new wl_2();
            boolean bl = this.agY.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.agY = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.agW.clear();
        this.agX.clear();
        this.agY = null;
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
        for (n = 0; n < this.agW.size(); ++n) {
            gs_02 = this.agW.get(n);
            n2 += ((wk_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.agX.size(); ++n) {
            gs_02 = this.agX.get(n);
            n2 += ((wj_2)gs_02).DN();
        }
        ++n2;
        if (this.agY != null) {
            n2 += this.agY.DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.di(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void di(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("spentCash=");
        if (this.agW.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agW.size()).append(" elements)...\n");
            for (n = 0; n < this.agW.size(); ++n) {
                gs_02 = this.agW.get(n);
                ((wk_1)gs_02).dk(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("accumulatedTaxes=");
        if (this.agX.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agX.size()).append(" elements)...\n");
            for (n = 0; n < this.agX.size(); ++n) {
                gs_02 = this.agX.get(n);
                ((wj_2)gs_02).dj(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("totalCash=");
        if (this.agY == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.agY.dl(stringBuilder, string + "  ");
        }
    }
}

