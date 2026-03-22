/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from tV
 */
public class tv_2
implements gs_0 {
    public long abV = 0L;
    public String abW = null;
    public byte abT = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.abV);
        if (this.abW != null) {
            byte[] byArray = this.abW.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.abT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.abV = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.abW = new String(byArray, Charsets.UTF_8);
        this.abT = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.abV = 0L;
        this.abW = null;
        this.abT = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 2;
        n += this.abW != null ? this.abW.getBytes(Charsets.UTF_8).length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bK(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bK(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("userId=").append(this.abV).append('\n');
        stringBuilder.append(string).append("userName=").append(this.abW).append('\n');
        stringBuilder.append(string).append("rights=").append(this.abT).append('\n');
    }
}

