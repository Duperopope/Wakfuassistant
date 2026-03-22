/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uy
 */
public class uy_2
implements gs_0 {
    public int adr = -1;
    public boolean ads = true;
    public final ArrayList<ua_2> adt = new ArrayList(0);
    public uz_1 adu = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.putInt(this.adr);
        byteBuffer.put(this.ads ? (byte)1 : 0);
        if (this.adt.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adt.size());
        for (n = 0; n < this.adt.size(); ++n) {
            ua_2 ua_22 = this.adt.get(n);
            boolean bl = ua_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        if (this.adu != null) {
            byteBuffer.put((byte)1);
            n = this.adu.aF(byteBuffer) ? 1 : 0;
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
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adt.clear();
        this.adt.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adt.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.aG(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.adr = -1;
        this.ads = true;
        this.adt.clear();
        this.adu = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uc_2 uc_22 = new uc_2(this);
            boolean bl = uc_22.b(byteBuffer, n);
            if (bl) {
                uc_22.avW();
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
        ++n;
        n += 2;
        for (int i = 0; i < this.adt.size(); ++i) {
            ua_2 ua_22 = this.adt.get(i);
            n += ua_22.DN();
        }
        ++n;
        if (this.adu != null) {
            n += this.adu.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cf(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cf(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.adr).append('\n');
        stringBuilder.append(string).append("enabled=").append(this.ads).append('\n');
        stringBuilder.append(string).append("items=");
        if (this.adt.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adt.size()).append(" elements)...\n");
            for (int i = 0; i < this.adt.size(); ++i) {
                ua_2 ua_22 = this.adt.get(i);
                ua_22.ch(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("building=");
        if (this.adu == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.adu.cg(stringBuilder, string + "  ");
        }
    }
}

