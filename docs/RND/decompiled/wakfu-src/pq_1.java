/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from pQ
 */
public class pq_1
extends go_0
implements gs_0 {
    public String TD = null;
    public long TE = 0L;
    private final fi_1 TF = new pr_2(this);

    @Override
    public fi_1 DM() {
        return this.TF;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.TD != null) {
            byte[] byArray = this.TD.getBytes(Charsets.UTF_8);
            if (byArray.length > 255) {
                return false;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.putLong(this.TE);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.TD = new String(byArray, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.TD = null;
        this.TE = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        n += this.TD != null ? this.TD.getBytes(Charsets.UTF_8).length : 0;
        return n += 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.E(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void E(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("gameServer=").append(this.TD).append('\n');
        stringBuilder.append(string).append("lastLog=").append(this.TE).append('\n');
    }
}

