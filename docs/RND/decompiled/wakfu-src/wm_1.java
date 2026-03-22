/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wm
 */
public class wm_1
implements gs_0 {
    public String ahe = null;
    public wn_2 ahf = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.ahe != null) {
            byte[] byArray = this.ahe.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.ahf != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.ahf.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.ahe = new String(byArray, Charsets.UTF_8);
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.ahf = new wn_2();
            boolean bl3 = this.ahf.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.ahf = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.ahe = null;
        this.ahf = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.ahe != null ? this.ahe.getBytes(Charsets.UTF_8).length : 0;
        ++n;
        if (this.ahf != null) {
            n += this.ahf.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dm(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dm(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("speech=").append(this.ahe).append('\n');
        stringBuilder.append(string).append("governor=");
        if (this.ahf == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.ahf.dn(stringBuilder, string + "  ");
        }
    }
}

