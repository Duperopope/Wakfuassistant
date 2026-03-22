/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oH
 */
public class oh_1
extends go_0
implements gs_0 {
    public oj_1 Rz = null;
    private final fi_1 RA = new oi_1(this);

    @Override
    public fi_1 DM() {
        return this.RA;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Rz != null) {
            byteBuffer.put((byte)1);
            boolean bl = this.Rz.aF(byteBuffer);
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
            this.Rz = new oj_1();
            boolean bl3 = this.Rz.aG(byteBuffer);
            if (!bl3) {
                return false;
            }
        } else {
            this.Rz = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Rz = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10026000) {
            ok_2 ok_22 = new ok_2(this);
            boolean bl = ok_22.b(byteBuffer, n);
            if (bl) {
                ok_22.avW();
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
        if (this.Rz != null) {
            n += this.Rz.DN();
        }
        return n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.f(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void f(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("addictionData=");
        if (this.Rz == null) {
            stringBuilder.append("{}").append('\n');
        } else {
            stringBuilder.append("...\n");
            this.Rz.g(stringBuilder, string + "  ");
        }
    }
}

