/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oX
 */
public class ox_2
extends go_0
implements gs_0 {
    public final xs_2 RZ = new xs_2();
    private final fi_1 Sa = new oy_2(this);

    @Override
    public fi_1 DM() {
        return this.Sa;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.RZ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.RZ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.RZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            oz_2 oz_22 = new oz_2(this);
            boolean bl = oz_22.b(byteBuffer, n);
            if (bl) {
                oz_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.RZ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.m(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void m(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challenges=...\n");
        this.RZ.ep(stringBuilder, string + "  ");
    }
}

