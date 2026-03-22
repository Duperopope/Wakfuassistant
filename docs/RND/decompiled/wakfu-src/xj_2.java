/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xJ
 */
public class xj_2
implements gs_0 {
    public int aac = 0;
    public final ArrayList<xn_2> akp = new ArrayList(0);
    public final ArrayList<xq_1> akq = new ArrayList(0);
    public final ArrayList<xk_2> akr = new ArrayList(0);
    public final ArrayList<xl_2> aks = new ArrayList(0);
    public xp_2 akt = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putInt(this.aac);
        if (this.akp.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akp.size());
        for (n = 0; n < this.akp.size(); ++n) {
            gs_02 = this.akp.get(n);
            bl = ((xn_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.akq.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akq.size());
        for (n = 0; n < this.akq.size(); ++n) {
            gs_02 = this.akq.get(n);
            bl = ((xq_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.akr.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.akr.size());
        for (n = 0; n < this.akr.size(); ++n) {
            gs_02 = this.akr.get(n);
            bl = ((xk_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.aks.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.aks.size());
        for (n = 0; n < this.aks.size(); ++n) {
            gs_02 = this.aks.get(n);
            bl = ((xl_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.akt != null) {
            byteBuffer.put((byte)1);
            n = this.akt.aF(byteBuffer) ? 1 : 0;
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
        this.akp.clear();
        this.akp.ensureCapacity(n5);
        for (n4 = 0; n4 < n5; ++n4) {
            xn_2 xn_22 = new xn_2();
            boolean bl = xn_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akp.add(xn_22);
        }
        n4 = byteBuffer.getShort() & 0xFFFF;
        this.akq.clear();
        this.akq.ensureCapacity(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            xq_1 xq_12 = new xq_1();
            boolean bl = xq_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akq.add(xq_12);
        }
        n3 = byteBuffer.getShort() & 0xFFFF;
        this.akr.clear();
        this.akr.ensureCapacity(n3);
        for (n2 = 0; n2 < n3; ++n2) {
            xk_2 xk_22 = new xk_2();
            boolean bl = xk_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.akr.add(xk_22);
        }
        n2 = byteBuffer.getShort() & 0xFFFF;
        this.aks.clear();
        this.aks.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            xl_2 xl_22 = new xl_2();
            boolean bl = xl_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.aks.add(xl_22);
        }
        int n6 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.akt = new xp_2();
            boolean bl = this.akt.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.akt = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aac = 0;
        this.akp.clear();
        this.akq.clear();
        this.akr.clear();
        this.aks.clear();
        this.akt = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xo_1 xo_12 = new xo_1(this);
            boolean bl = xo_12.b(byteBuffer, n);
            if (bl) {
                xo_12.avW();
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
        for (n = 0; n < this.akp.size(); ++n) {
            gs_02 = this.akp.get(n);
            n2 += ((xn_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.akq.size(); ++n) {
            gs_02 = this.akq.get(n);
            n2 += ((xq_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.akr.size(); ++n) {
            gs_02 = this.akr.get(n);
            n2 += ((xk_2)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.aks.size(); ++n) {
            gs_02 = this.aks.get(n);
            n2 += ((xl_2)gs_02).DN();
        }
        ++n2;
        if (this.akt != null) {
            n2 += this.akt.DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ei(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ei(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("scenarioId=").append(this.aac).append('\n');
        stringBuilder.append(string).append("globalVars=");
        if (this.akp.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akp.size()).append(" elements)...\n");
            for (n = 0; n < this.akp.size(); ++n) {
                gs_02 = this.akp.get(n);
                ((xn_2)gs_02).el(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("currentVarsForAddedUsers=");
        if (this.akq.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akq.size()).append(" elements)...\n");
            for (n = 0; n < this.akq.size(); ++n) {
                gs_02 = this.akq.get(n);
                ((xq_1)gs_02).en(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("activeActionGroups=");
        if (this.akr.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.akr.size()).append(" elements)...\n");
            for (n = 0; n < this.akr.size(); ++n) {
                gs_02 = this.akr.get(n);
                ((xk_2)gs_02).ej(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("executedActionGroups=");
        if (this.aks.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.aks.size()).append(" elements)...\n");
            for (n = 0; n < this.aks.size(); ++n) {
                gs_02 = this.aks.get(n);
                ((xl_2)gs_02).ek(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("startTime=");
        if (this.akt == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.akt.em(stringBuilder, string + "  ");
        }
    }
}

