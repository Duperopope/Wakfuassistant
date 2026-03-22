/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tb
 */
public class tb_1
implements gs_0 {
    public short ZO = 0;
    public final ArrayList<td_1> ZP = new ArrayList(0);
    public final ArrayList<tc_1> ZQ = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putShort(this.ZO);
        if (this.ZP.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ZP.size());
        for (n = 0; n < this.ZP.size(); ++n) {
            gs_02 = this.ZP.get(n);
            bl = ((td_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.ZQ.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.ZQ.size());
        for (n = 0; n < this.ZQ.size(); ++n) {
            gs_02 = this.ZQ.get(n);
            bl = ((tc_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        this.ZO = byteBuffer.getShort();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ZP.clear();
        this.ZP.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            td_1 td_12 = new td_1();
            boolean bl = td_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ZP.add(td_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.ZQ.clear();
        this.ZQ.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tc_1 tc_12 = new tc_1();
            boolean bl = tc_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.ZQ.add(tc_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ZO = 0;
        this.ZP.clear();
        this.ZQ.clear();
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
        n2 += 2;
        for (n = 0; n < this.ZP.size(); ++n) {
            gs_02 = this.ZP.get(n);
            n2 += ((td_1)gs_02).DN();
        }
        n2 += 2;
        for (n = 0; n < this.ZQ.size(); ++n) {
            gs_02 = this.ZQ.get(n);
            n2 += ((tc_1)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bf(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bf(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("freePoints=").append(this.ZO).append('\n');
        stringBuilder.append(string).append("xpBonusPoints=");
        if (this.ZP.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ZP.size()).append(" elements)...\n");
            for (n = 0; n < this.ZP.size(); ++n) {
                gs_02 = this.ZP.get(n);
                ((td_1)gs_02).bh(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("characteristicBonusPoints=");
        if (this.ZQ.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.ZQ.size()).append(" elements)...\n");
            for (n = 0; n < this.ZQ.size(); ++n) {
                gs_02 = this.ZQ.get(n);
                ((tc_1)gs_02).bg(stringBuilder, string + n + "/ ");
            }
        }
    }
}

