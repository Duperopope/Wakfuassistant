/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oS
 */
public class os_2
extends go_0
implements gs_0 {
    public ov_2 RS = null;
    private final fi_1 RT = new ot_2(this);

    @Override
    public fi_1 DM() {
        return this.RT;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.RS != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.RS.aF(byteBuffer);
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
            this.RS = new ov_2();
            boolean bl3 = this.RS.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.RS = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.RS = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            ou_2 ou_22 = new ou_2(this);
            boolean bl = ou_22.b(byteBuffer, n);
            if (bl) {
                ou_22.avW();
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
        if (this.RS != null) {
            n += this.RS.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.k(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void k(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("osaSpecific=");
        if (this.RS == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.RS.l(stringBuilder, string + "  ");
        }
    }
}

