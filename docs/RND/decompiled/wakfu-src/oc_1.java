/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oC
 */
public class oc_1
extends go_0
implements gs_0 {
    public byte[] Rq = null;
    public boolean Rr = false;
    private final fi_1 Rs = new od_1(this);

    @Override
    public fi_1 DM() {
        return this.Rs;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Rq != null) {
            if (this.Rq.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Rq.length);
            byteBuffer.put(this.Rq);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.put(this.Rr ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Rq = new byte[n];
            byteBuffer.get(this.Rq);
        } else {
            this.Rq = null;
        }
        this.Rr = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Rq = null;
        this.Rr = false;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10064001) {
            oe_1 oe_12 = new oe_1(this);
            boolean bl = oe_12.b(byteBuffer, n);
            if (bl) {
                oe_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.Rq != null ? this.Rq.length : 0;
        return ++n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.d(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void d(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("serializedAchievementsContext=(").append(this.Rq != null ? this.Rq.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("isCompressed=").append(this.Rr).append('\n');
    }
}

