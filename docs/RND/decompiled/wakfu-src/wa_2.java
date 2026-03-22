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
 * Renamed from wa
 */
public class wa_2
implements gs_0 {
    public long adP = 0L;
    public byte agE = (byte)-1;
    public short agF = 0;
    public byte agG = 1;
    public final ArrayList<wb_1> agH = new ArrayList(0);
    public String agI = null;
    public boolean agJ = false;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.adP);
        byteBuffer.put(this.agE);
        byteBuffer.putShort(this.agF);
        byteBuffer.put(this.agG);
        if (this.agH.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.agH.size());
        for (int i = 0; i < this.agH.size(); ++i) {
            wb_1 wb_12 = this.agH.get(i);
            boolean bl = wb_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.agI != null) {
            byte[] byArray = this.agI.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.agJ ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agH.clear();
        this.agH.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.agH.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.adP = 0L;
        this.agE = (byte)-1;
        this.agF = 0;
        this.agG = 1;
        this.agH.clear();
        this.agI = null;
        this.agJ = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wd_2 wd_22 = new wd_2(this);
            boolean bl = wd_22.b(byteBuffer, n);
            if (bl) {
                wd_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        ++n;
        n += 2;
        ++n;
        n += 2;
        for (int i = 0; i < this.agH.size(); ++i) {
            wb_1 wb_12 = this.agH.get(i);
            n += wb_12.DN();
        }
        n += 2;
        n += this.agI != null ? this.agI.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dc(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dc(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("uid=").append(this.adP).append('\n');
        stringBuilder.append(string).append("requiredItemType=").append(this.agE).append('\n');
        stringBuilder.append(string).append("nSlots=").append(this.agF).append('\n');
        stringBuilder.append(string).append("maxPackSize=").append(this.agG).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.agH.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.agH.size()).append(" elements)...\n");
            for (int i = 0; i < this.agH.size(); ++i) {
                wb_1 wb_12 = this.agH.get(i);
                wb_12.dd(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("shortAd=").append(this.agI).append('\n');
        stringBuilder.append(string).append("locked=").append(this.agJ).append('\n');
    }
}

