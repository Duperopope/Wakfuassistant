/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from un
 */
public class un_2
implements gs_0 {
    public long acK = 0L;
    public String acL = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.acK);
        if (this.acL != null) {
            byte[] byArray = this.acL.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.acK = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acL = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.acK = 0L;
        this.acL = null;
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
        return n += this.acL != null ? this.acL.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bY(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bY(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("registeredId=").append(this.acK).append('\n');
        stringBuilder.append(string).append("registeredName=").append(this.acL).append('\n');
    }
}

