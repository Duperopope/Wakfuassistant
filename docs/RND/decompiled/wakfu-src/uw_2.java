/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uW
 */
public class uw_2
implements gs_0 {
    public final xw_1 aey = new xw_1();
    public final vu_1 aez = new vu_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aey.aF(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aez.aF(byteBuffer);
        return bl2;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aey.aG(byteBuffer);
        if (!bl) {
            return false;
        }
        boolean bl2 = this.aez.aG(byteBuffer);
        return bl2;
    }

    @Override
    public void clear() {
        this.aey.clear();
        this.aez.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090001) {
            ux_2 ux_22 = new ux_2(this);
            boolean bl = ux_22.b(byteBuffer, n);
            if (bl) {
                ux_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += this.aey.DN();
        return n += this.aez.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cx(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cx(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("questInventory=...\n");
        this.aey.ea(stringBuilder, string + "  ");
        stringBuilder.append(string).append("temporaryInventory=...\n");
        this.aez.cK(stringBuilder, string + "  ");
    }
}

