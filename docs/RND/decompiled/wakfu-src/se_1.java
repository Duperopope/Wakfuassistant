/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sE
 */
public class se_1
extends go_0
implements gs_0 {
    public short Xr = 0;
    public byte[] Za = null;
    private final fi_1 Zb = new sf_1(this);

    @Override
    public fi_1 DM() {
        return this.Zb;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.Xr);
        if (this.Za != null) {
            if (this.Za.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Za.length);
            byteBuffer.put(this.Za);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Xr = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Za = new byte[n];
            byteBuffer.get(this.Za);
        } else {
            this.Za = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Xr = 0;
        this.Za = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += 2;
        return n += this.Za != null ? this.Za.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aS(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aS(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("level=").append(this.Xr).append('\n');
        stringBuilder.append(string).append("states=(").append(this.Za != null ? this.Za.length : 0).append(" bytes)\n");
    }
}

