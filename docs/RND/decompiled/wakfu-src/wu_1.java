/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from wu
 */
public class wu_1
implements gs_0 {
    public String acN = null;
    public short ahu = 0;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.acN != null) {
            byte[] byArray = this.acN.getBytes(Charsets.UTF_8);
            if (byArray.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putShort(this.ahu);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.ahu = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.acN = null;
        this.ahu = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.acN != null ? this.acN.getBytes(Charsets.UTF_8).length : 0;
        return n += 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.du(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void du(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("characterName=").append(this.acN).append('\n');
        stringBuilder.append(string).append("permissions=").append(this.ahu).append('\n');
    }
}

