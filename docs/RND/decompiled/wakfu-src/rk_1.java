/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from rK
 */
public class rk_1
extends go_0
implements gs_0 {
    public long TL = 0L;
    public long Xq = 0L;
    public short Xr = 0;
    public String Ud = null;
    private final fi_1 Xs = new rl_1(this);

    @Override
    public fi_1 DM() {
        return this.Xs;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TL);
        byteBuffer.putLong(this.Xq);
        byteBuffer.putShort(this.Xr);
        if (this.Ud != null) {
            byte[] byArray = this.Ud.getBytes(Charsets.UTF_8);
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
        this.TL = byteBuffer.getLong();
        this.Xq = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Ud = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.TL = 0L;
        this.Xq = 0L;
        this.Xr = 0;
        this.Ud = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10058000) {
            rm_1 rm_12 = new rm_1(this);
            boolean bl = rm_12.b(byteBuffer, n);
            if (bl) {
                rm_12.avW();
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
        n += 8;
        n += 2;
        n += 2;
        return n += this.Ud != null ? this.Ud.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ax(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ax(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("blazon=").append(this.Xq).append('\n');
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
        stringBuilder.append(string).append("guildName=").append(this.Ud).append('\n');
    }
}

