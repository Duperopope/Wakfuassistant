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
 * Renamed from us
 */
public class us_2
implements gs_0 {
    public String ade = null;
    public String adf = null;
    public final ArrayList<ut_1> adg = new ArrayList(0);

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byte[] byArray;
        if (this.ade != null) {
            byArray = this.ade.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.adf != null) {
            byArray = this.adf.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.adg.size() > 65535) {
            return false;
        }
        byteBuffer.putShort((short)this.adg.size());
        for (int i = 0; i < this.adg.size(); ++i) {
            ut_1 ut_12 = this.adg.get(i);
            boolean bl = ut_12.aF(byteBuffer);
            if (bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.ade = new String(byArray, Charsets.UTF_8);
        int n2 = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.adf = new String(byArray2, Charsets.UTF_8);
        int n3 = byteBuffer.getShort() & 0xFFFF;
        this.adg.clear();
        this.adg.ensureCapacity(n3);
        for (int i = 0; i < n3; ++i) {
            ut_1 ut_12 = new ut_1();
            boolean bl = ut_12.aG(byteBuffer);
            if (!bl) {
                return false;
            }
            this.adg.add(ut_12);
        }
        return true;
    }

    @Override
    public void clear() {
        this.ade = null;
        this.adf = null;
        this.adg.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.ade != null ? this.ade.getBytes(Charsets.UTF_8).length : 0;
        n += 2;
        n += this.adf != null ? this.adf.getBytes(Charsets.UTF_8).length : 0;
        n += 2;
        for (int i = 0; i < this.adg.size(); ++i) {
            ut_1 ut_12 = this.adg.get(i);
            n += ut_12.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cb(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cb(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("title=").append(this.ade).append('\n');
        stringBuilder.append(string).append("message=").append(this.adf).append('\n');
        stringBuilder.append(string).append("contents=");
        if (this.adg.isEmpty()) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("(").append(this.adg.size()).append(" elements)...\n");
            for (int i = 0; i < this.adg.size(); ++i) {
                ut_1 ut_12 = this.adg.get(i);
                ut_12.cc(stringBuilder, string + i + "/ ");
            }
        }
    }
}

