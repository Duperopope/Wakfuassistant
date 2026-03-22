/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ti
 */
public class ti_1
implements gs_0 {
    public int aac = 0;
    public final ArrayList<tj_2> aad = new ArrayList(0);
    public final ArrayList<tk_1> aae = new ArrayList(0);
    public final ArrayList<tl_2> aaf = new ArrayList(0);
    public final ArrayList<to_1> aag = new ArrayList(0);
    public tn_2 aah = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putInt(this.aac);
        if (this.aad.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aad.size());
        for (n = 0; n < this.aad.size(); ++n) {
            gs_02 = this.aad.get(n);
            bl = ((tj_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aae.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aae.size());
        for (n = 0; n < this.aae.size(); ++n) {
            gs_02 = this.aae.get(n);
            bl = ((tk_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aaf.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aaf.size());
        for (n = 0; n < this.aaf.size(); ++n) {
            gs_02 = this.aaf.get(n);
            bl = ((tl_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aag.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aag.size());
        for (n = 0; n < this.aag.size(); ++n) {
            gs_02 = this.aag.get(n);
            bl = ((to_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aah != null) {
            byteBuffer.put((byte)1);
            n = this.aah.aF(byteBuffer) ? 1 : 0;
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
        int n3;
        int n4;
        this.aac = byteBuffer.getInt();
        int n5 = byteBuffer.getShort() & 0xFFFF;
        this.aad.clear();
        this.aad.ensureCapacity(n5);
        for (n4 = 0; n4 < n5; ++n4) {
            tj_2 tj_22 = new tj_2();
            boolean bl = tj_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aad.add(tj_22);
        }
        n4 = byteBuffer.getShort() & 0xFFFF;
        this.aae.clear();
        this.aae.ensureCapacity(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            tk_1 tk_12 = new tk_1();
            boolean bl = tk_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aae.add(tk_12);
        }
        n3 = byteBuffer.getShort() & 0xFFFF;
        this.aaf.clear();
        this.aaf.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            tl_2 tl_22 = new tl_2();
            boolean bl = tl_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aaf.add(tl_22);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.aag.clear();
        this.aag.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            to_1 to_12 = new to_1();
            boolean bl = to_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aag.add(to_12);
        }
        int n6 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.aah = new tn_2();
            boolean bl = this.aah.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.aah = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aac = 0;
        this.aad.clear();
        this.aae.clear();
        this.aaf.clear();
        this.aag.clear();
        this.aah = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            tm_2 tm_22 = new tm_2(this);
            boolean bl = tm_22.b(byteBuffer, n);
            if (bl) {
                tm_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        gs_0 gs_02;
        int n;
        int n2 = 0;
        n2 += 4;
        n2 += 2;
        for (n = 0; n < this.aad.size(); ++n) {
            gs_02 = this.aad.get(n);
            n2 += ((tj_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.aae.size(); ++n) {
            gs_02 = this.aae.get(n);
            n2 += ((tk_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.aaf.size(); ++n) {
            gs_02 = this.aaf.get(n);
            n2 += ((tl_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.aag.size(); ++n) {
            gs_02 = this.aag.get(n);
            n2 += ((to_1)gs_02).DN();
        }
        ++n2;
        if (this.aah != null) {
            n2 += this.aah.DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bl(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bl(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("scenarioId=").append(this.aac).append('\n');
        stringBuilder.append(string).append("activeGoals=");
        if (this.aad.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aad.size()).append(" elements)...\n");
            for (n = 0; n < this.aad.size(); ++n) {
                gs_02 = this.aad.get(n);
                ((tj_2)gs_02).bm(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("executedGoals=");
        if (this.aae.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aae.size()).append(" elements)...\n");
            for (n = 0; n < this.aae.size(); ++n) {
                gs_02 = this.aae.get(n);
                ((tk_1)gs_02).bn(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("globalVars=");
        if (this.aaf.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aaf.size()).append(" elements)...\n");
            for (n = 0; n < this.aaf.size(); ++n) {
                gs_02 = this.aaf.get(n);
                ((tl_2)gs_02).bo(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("watchedVars=");
        if (this.aag.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aag.size()).append(" elements)...\n");
            for (n = 0; n < this.aag.size(); ++n) {
                gs_02 = this.aag.get(n);
                ((to_1)gs_02).bq(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("remainingTime=");
        if (this.aah == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.aah.bp(stringBuilder, string + "  ");
        }
    }
}

