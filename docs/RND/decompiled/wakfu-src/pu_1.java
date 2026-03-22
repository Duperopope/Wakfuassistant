/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pu
 */
public class pu_1
extends go_0
implements gs_0 {
    public px_2 SN = null;
    private final fi_1 SO = new pv_1(this);

    @Override
    public fi_1 DM() {
        return this.SO;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.SN != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.SN.aF(byteBuffer);
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
            this.SN = new px_2();
            boolean bl3 = this.SN.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.SN = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.SN = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x99F9F8) {
            pw_2 pw_22 = new pw_2(this);
            boolean bl = pw_22.b(byteBuffer, n);
            if (bl) {
                pw_22.avW();
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
        if (this.SN != null) {
            n += this.SN.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.v(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void v(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("dimensionalBag=");
        if (this.SN == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.SN.w(stringBuilder, string + "  ");
        }
    }
}

