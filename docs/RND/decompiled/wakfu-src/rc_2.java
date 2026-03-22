/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rc
 */
public class rc_2
extends go_0
implements gs_0 {
    public rf_2 Wg = null;
    private final fi_1 Wh = new rd_2(this);

    @Override
    public fi_1 DM() {
        return this.Wh;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Wg != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Wg.aF(byteBuffer);
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
            this.Wg = new rf_2();
            boolean bl3 = this.Wg.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Wg = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Wg = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            re_1 re_12 = new re_1(this);
            boolean bl = re_12.b(byteBuffer, n);
            if (bl) {
                re_12.avW();
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
        if (this.Wg != null) {
            n += this.Wg.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ah(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ah(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("occupation=");
        if (this.Wg == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Wg.ai(stringBuilder, string + "  ");
        }
    }
}

