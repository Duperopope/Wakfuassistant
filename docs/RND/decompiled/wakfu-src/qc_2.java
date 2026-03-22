/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from qc
 */
public class qc_2
extends go_0
implements gs_0 {
    public String Ud = null;
    private final fi_1 Ue = new qd_2(this);

    @Override
    public fi_1 DM() {
        return this.Ue;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Ud != null) {
            byte[] byArray = this.Ud.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Ud = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.Ud = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        return n += this.Ud != null ? this.Ud.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.K(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void K(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildName=").append(this.Ud).append('\n');
    }
}

