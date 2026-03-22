/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from ul
 */
public class ul_2
implements gs_0 {
    public long acH = 0L;
    public String acI = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.acH);
        if (this.acI != null) {
            byte[] byArray = this.acI.getBytes(Charsets.UTF_8);
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
        this.acH = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acI = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.acH = 0L;
        this.acI = null;
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
        return n += this.acI != null ? this.acI.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bW(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bW(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("participantId=").append(this.acH).append('\n');
        stringBuilder.append(string).append("participantName=").append(this.acI).append('\n');
    }
}

