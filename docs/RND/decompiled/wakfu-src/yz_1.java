/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yz
 */
public class yz_1
implements gs_0 {
    public final yc_2 alV = new yc_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.alV.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.alV.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.alV.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            ya_1 ya_12 = new ya_1(this);
            boolean bl = ya_12.b(byteBuffer, n);
            if (bl) {
                ya_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.alV.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eI(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eI(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("compartment=...\n");
        this.alV.eJ(stringBuilder, string + "  ");
    }
}

