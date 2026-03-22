/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ue
 */
public class ue_1
implements gs_0 {
    public int acq = 0;
    public int acr = 0;
    public byte[] RG = null;
    public byte acs = 0;
    public final yq_1 act = new yq_1();
    public final tp_1 acu = new tp_1();
    public final ArrayList<uf_2> acv = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.acq);
        byteBuffer.putInt(this.acr);
        if (this.RG != null) {
            if (this.RG.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.RG.length);
            byteBuffer.put(this.RG);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.acs);
        boolean bl = this.act.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.acu.aF(byteBuffer);
        if (!bl2) {
            return false;
        }
        if (this.acv.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.acv.size());
        for (int i = 0; i < this.acv.size(); ++i) {
            uf_2 uf_22 = this.acv.get(i);
            boolean bl3 = uf_22.aF(byteBuffer);
            if (bl3) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acq = byteBuffer.getInt();
        this.acr = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.RG = new byte[n];
            byteBuffer.get(this.RG);
        } else {
            this.RG = null;
        }
        this.acs = byteBuffer.get();
        boolean bl = this.act.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.acu.aG(byteBuffer);
        if (!bl2) {
            return false;
        }
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.acv.clear();
        this.acv.ensureCapacity(n2);
        for (int i = 0; i < n2; ++i) {
            uf_2 uf_22 = new uf_2();
            boolean bl3 = uf_22.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
            this.acv.add(uf_22);
        }
        return true;
    }

    @Override
    public void clear() {
        this.acq = 0;
        this.acr = 0;
        this.RG = null;
        this.acs = 0;
        this.act.clear();
        this.acu.clear();
        this.acv.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            ug_1 ug_12 = new ug_1(this);
            boolean bl = ug_12.b(byteBuffer, n);
            if (bl) {
                ug_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 4;
        n += 2;
        n += this.RG != null ? this.RG.length : 0;
        ++n;
        n += this.act.DN();
        n += this.acu.DN();
        n += 2;
        for (int i = 0; i < this.acv.size(); ++i) {
            uf_2 uf_22 = this.acv.get(i);
            n += uf_22.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bR(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bR(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("power=").append(this.acq).append('\n');
        stringBuilder.append(string).append("gfxId=").append(this.acr).append('\n');
        stringBuilder.append(string).append("appearanceData=(").append(this.RG != null ? this.RG.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("doubleType=").append(this.acs).append('\n');
        stringBuilder.append(string).append("doublespells=...\n");
        this.act.eD(stringBuilder, string + "  ");
        stringBuilder.append(string).append("doubleCharac=...\n");
        this.acu.br(stringBuilder, string + "  ");
        stringBuilder.append(string).append("equipmentAppareances=");
        if (this.acv.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.acv.size()).append(" elements)...\n");
            for (int i = 0; i < this.acv.size(); ++i) {
                uf_2 uf_22 = this.acv.get(i);
                uf_22.bS(stringBuilder, string + i + "/ ");
            }
        }
    }
}

