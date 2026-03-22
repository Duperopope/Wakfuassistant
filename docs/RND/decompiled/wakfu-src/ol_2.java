/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oL
 */
public class ol_2
extends go_0
implements gs_0 {
    public byte[] RG = null;
    private final fi_1 RH = new om_2(this);

    @Override
    public fi_1 DM() {
        return this.RH;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.RG != null) {
            if (this.RG.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.RG.length);
            byteBuffer.put(this.RG);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.RG = new byte[n];
            byteBuffer.get(this.RG);
        } else {
            this.RG = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.RG = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.RG != null ? this.RG.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.h(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void h(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("appearanceData=(").append(this.RG != null ? this.RG.length : 0).append(" bytes)\n");
    }
}

