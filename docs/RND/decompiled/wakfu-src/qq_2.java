/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qq
 */
public class qq_2
extends go_0
implements gs_0 {
    public final uw_2 UF = new uw_2();
    private final fi_1 UG = new qr_1(this);

    @Override
    public fi_1 DM() {
        return this.UG;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.UF.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.UF.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.UF.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090001) {
            qs_2 qs_22 = new qs_2(this);
            boolean bl = qs_22.b(byteBuffer, n);
            if (bl) {
                qs_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.UF.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.R(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void R(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("inventoryHandler=...\n");
        this.UF.cx(stringBuilder, string + "  ");
    }
}

