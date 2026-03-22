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
 * Renamed from yM
 */
public class ym_2
implements gs_0 {
    public long amu = 0L;
    public long amv = 0L;
    public String amw = null;
    public final ArrayList<yn_2> amx = new ArrayList(0);
    public long amy = 0L;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.amu);
        byteBuffer.putLong(this.amv);
        if (this.amw != null) {
            byte[] byArray = this.amw.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        if (this.amx.size() > 255) {
            return false;
        }
        byteBuffer.put((byte)this.amx.size());
        for (int i = 0; i < this.amx.size(); ++i) {
            yn_2 yn_22 = this.amx.get(i);
            boolean bl = yn_22.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        byteBuffer.putLong(this.amy);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.amu = byteBuffer.getLong();
        this.amv = byteBuffer.getLong();
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.amw = new String(byArray, Charsets.UTF_8);
        int n2 = byteBuffer.get() & 0xFF;
        this.amx.clear();
        this.amx.ensureCapacity(n2);
        for (int i = 0; i < n2; ++i) {
            yn_2 yn_22 = new yn_2();
            boolean bl = yn_22.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.amx.add(yn_22);
        }
        this.amy = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.amu = 0L;
        this.amv = 0L;
        this.amw = null;
        this.amx.clear();
        this.amy = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 8;
        ++n;
        n += this.amw != null ? this.amw.getBytes(Charsets.UTF_8).length : 0;
        ++n;
        for (int i = 0; i < this.amx.size(); ++i) {
            yn_2 yn_22 = this.amx.get(i);
            n += yn_22.DN();
        }
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eP(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eP(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("transactionDate=").append(this.amu).append('\n');
        stringBuilder.append(string).append("buyerId=").append(this.amv).append('\n');
        stringBuilder.append(string).append("buyerName=").append(this.amw).append('\n');
        stringBuilder.append(string).append("soldItems=");
        if (this.amx.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.amx.size()).append(" elements)...\n");
            for (int i = 0; i < this.amx.size(); ++i) {
                yn_2 yn_22 = this.amx.get(i);
                yn_22.eQ(stringBuilder, string + i + "/ ");
            }
        }
        stringBuilder.append(string).append("totalPrice=").append(this.amy).append('\n');
    }
}

