/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from uG
 */
public class ug_2
implements gs_0 {
    public String adF = null;
    public long Vz = 0L;
    public int adL = 0;

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
        byteBuffer.putInt(this.adL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.adF = new String(byArray, Charsets.UTF_8);
        this.Vz = byteBuffer.getLong();
        this.adL = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.adF = null;
        this.Vz = 0L;
        this.adL = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.adF != null ? this.adF.getBytes(Charsets.UTF_8).length : 0;
        n += 8;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ck(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ck(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("memberName=").append(this.adF).append('\n');
        stringBuilder.append(string).append("date=").append(this.Vz).append('\n');
        stringBuilder.append(string).append("amount=").append(this.adL).append('\n');
    }
}

