/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pi
 */
public class pi_2
extends go_0
implements gs_0 {
    public pl_2 Ss = null;
    private final fi_1 St = new pj_1(this);

    @Override
    public fi_1 DM() {
        return this.St;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Ss != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Ss.aF(byteBuffer);
            if (!bl) {
                return false;
            }
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ss = new pl_2();
            boolean bl3 = this.Ss.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ss = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Ss = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10047003) {
            pk_1 pk_12 = new pk_1(this);
            boolean bl = pk_12.b(byteBuffer, n);
            if (bl) {
                pk_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        if (this.Ss != null) {
            n += this.Ss.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.q(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void q(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("creationData=");
        if (this.Ss == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Ss.r(stringBuilder, string + "  ");
        }
    }
}

