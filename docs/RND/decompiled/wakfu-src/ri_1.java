/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ri
 */
public class ri_1
extends go_0
implements gs_0 {
    public int[] Wq = null;
    public int[] Wr = null;
    public int[] Ws = null;
    private final fi_1 Wt = new rj_2(this);

    @Override
    public fi_1 DM() {
        return this.Wt;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        int n;
        if (this.Wq != null) {
            if (this.Wq.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Wq.length);
            for (n = 0; n < this.Wq.length; ++n) {
                byteBuffer.putInt(this.Wq[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.Wr != null) {
            if (this.Wr.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Wr.length);
            for (n = 0; n < this.Wr.length; ++n) {
                byteBuffer.putInt(this.Wr[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        if (this.Ws != null) {
            if (this.Ws.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Ws.length);
            for (n = 0; n < this.Ws.length; ++n) {
                byteBuffer.putInt(this.Ws[n]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n;
        int n2;
        int n3 = byteBuffer.getShort() & 0xFFFF;
        if (n3 > 0) {
            this.Wq = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.Wq[n2] = byteBuffer.getInt();
            }
        } else {
            this.Wq = null;
        }
        if ((n2 = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.Wr = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Wr[n] = byteBuffer.getInt();
            }
        } else {
            this.Wr = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.Ws = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ws[i] = byteBuffer.getInt();
            }
        } else {
            this.Ws = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Wq = null;
        this.Wr = null;
        this.Ws = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10026000) {
            rk_2 rk_22 = new rk_2(this);
            boolean bl = rk_22.b(byteBuffer, n);
            if (bl) {
                rk_22.avW();
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
        n += this.Wq != null ? this.Wq.length * 4 : 0;
        n += 2;
        n += this.Wr != null ? this.Wr.length * 4 : 0;
        n += 2;
        return n += this.Ws != null ? this.Ws.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ak(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ak(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildEffects=(").append(this.Wq.length).append(" bytes)\n");
        stringBuilder.append(string).append("havenWorldEffects=(").append(this.Wr.length).append(" bytes)\n");
        stringBuilder.append(string).append("antiAddictionEffects=(").append(this.Ws.length).append(" bytes)\n");
    }
}

