/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uE
 */
public class ue_2
implements gs_0 {
    public String adF = null;
    public long Vz = 0L;
    public short adG = 0;
    public final uy_1 adH = new uy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.adF != null) {
            byte[] byArray = this.adF.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putLong(this.Vz);
        byteBuffer.putShort(this.adG);
        boolean bl = this.adH.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.adF = new String(byArray, Charsets.UTF_8);
        this.Vz = byteBuffer.getLong();
        this.adG = byteBuffer.getShort();
        boolean bl = this.adH.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adF = null;
        this.Vz = 0L;
        this.adG = 0;
        this.adH.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uf_1 uf_12 = new uf_1(this);
            boolean bl = uf_12.b(byteBuffer, n);
            if (bl) {
                uf_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.adF != null ? this.adF.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        n += 2;
        return n += this.adH.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cj(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cj(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("memberName=").append(this.adF).append('\n');
        stringBuilder.append(string).append("date=").append(this.Vz).append('\n');
        stringBuilder.append(string).append("qty=").append(this.adG).append('\n');
        stringBuilder.append(string).append("item=...\n");
        this.adH.cy(stringBuilder, string + "  ");
    }
}

