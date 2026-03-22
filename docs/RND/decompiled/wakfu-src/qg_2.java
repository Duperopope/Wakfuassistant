/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from qG
 */
public class qg_2
extends go_0
implements gs_0 {
    public String Vk = null;
    private final fi_1 Vl = new qh_1(this);

    @Override
    public fi_1 DM() {
        return this.Vl;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Vk != null) {
            byte[] byArray = this.Vk.getBytes(Charsets.UTF_8);
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
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Vk = new String(byArray, Charsets.UTF_8);
        return true;
    }

    @Override
    public void clear() {
        this.Vk = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.Vk != null ? this.Vk.getBytes(Charsets.UTF_8).length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.Y(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void Y(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("name=").append(this.Vk).append('\n');
    }
}

