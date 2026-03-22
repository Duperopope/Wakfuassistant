/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rz
 */
public class rz_1
extends go_0
implements gs_0 {
    public rc_1 Xb = null;
    private final fi_1 Xc = new ra_2(this);

    @Override
    public fi_1 DM() {
        return this.Xc;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Xb != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Xb.aF(byteBuffer);
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
            this.Xb = new rc_1();
            boolean bl3 = this.Xb.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Xb = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Xb = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            rb_2 rb_22 = new rb_2(this);
            boolean bl = rb_22.b(byteBuffer, n);
            if (bl) {
                rb_22.avW();
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
        if (this.Xb != null) {
            n += this.Xb.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.as(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void as(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("properties=");
        if (this.Xb == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Xb.at(stringBuilder, string + "  ");
        }
    }
}

