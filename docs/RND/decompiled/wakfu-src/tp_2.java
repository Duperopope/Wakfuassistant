/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from tP
 */
public class tp_2
implements gs_0 {
    public long aba = 0L;
    public long Ut = 0L;
    public String abb = null;
    public long TL = 0L;
    public int abf = 0;
    public final ArrayList<ts_2> abG = new ArrayList(0);
    public final ArrayList<tq_1> abH = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl;
        gs_0 gs_02;
        int n;
        byteBuffer.putLong(this.aba);
        byteBuffer.putLong(this.Ut);
        if (this.abb != null) {
            byte[] byArray = this.abb.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.TL);
        byteBuffer.putInt(this.abf);
        if (this.abG.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.abG.size());
        for (n = 0; n < this.abG.size(); ++n) {
            gs_02 = this.abG.get(n);
            bl = ((ts_2)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.abH.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.abH.size());
        for (n = 0; n < this.abH.size(); ++n) {
            gs_02 = this.abH.get(n);
            bl = ((tq_1)gs_02).aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        this.aba = byteBuffer.getLong();
        this.Ut = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n2];
        byteBuffer.get(byArray);
        this.abb = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.abf = byteBuffer.getInt();
        int n3 = byteBuffer.get() & 0xFF;
        this.abG.clear();
        this.abG.ensureCapacity(n3);
        for (n = 0; n < n3; ++n) {
            ts_2 ts_22 = new ts_2();
            boolean bl = ts_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.abG.add(ts_22);
        }
        n = byteBuffer.get() & 0xFF;
        this.abH.clear();
        this.abH.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            tq_1 tq_12 = new tq_1();
            boolean bl = tq_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.abH.add(tq_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.aba = 0L;
        this.Ut = 0L;
        this.abb = null;
        this.TL = 0L;
        this.abf = 0;
        this.abG.clear();
        this.abH.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            tr_1 tr_12 = new tr_1(this);
            boolean bl = tr_12.b(byteBuffer, n);
            if (bl) {
                tr_12.avW();
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
        n2 += 8;
        n2 += 8;
        ++n2;
        n2 += this.abb != null ? this.abb.getBytes(Charsets.UTF_8).length : 0;
        n2 += 8;
        n2 += 4;
        ++n2;
        for (n = 0; n < this.abG.size(); ++n) {
            gs_02 = this.abG.get(n);
            n2 += ((ts_2)gs_02).DN();
        }
        ++n2;
        for (n = 0; n < this.abH.size(); ++n) {
            gs_02 = this.abH.get(n);
            n2 += ((tq_1)gs_02).DN();
        }
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bG(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bG(StringBuilder stringBuilder, String string) {
        gs_0 gs_02;
        int n;
        stringBuilder.append(string).append("clientId=").append(this.aba).append('\n');
        stringBuilder.append(string).append("ownerId=").append(this.Ut).append('\n');
        stringBuilder.append(string).append("ownerName=").append(this.abb).append('\n');
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("customViewModelId=").append(this.abf).append('\n');
        stringBuilder.append(string).append("shelfItems=");
        if (this.abG.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abG.size()).append(" elements)...\n");
            for (n = 0; n < this.abG.size(); ++n) {
                gs_02 = this.abG.get(n);
                ((ts_2)gs_02).bI(stringBuilder, string + n + "/ ");
            }
        }
        stringBuilder.append(string).append("merchantDisplays=");
        if (this.abH.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.abH.size()).append(" elements)...\n");
            for (n = 0; n < this.abH.size(); ++n) {
                gs_02 = this.abH.get(n);
                ((tq_1)gs_02).bH(stringBuilder, string + n + "/ ");
            }
        }
    }
}

