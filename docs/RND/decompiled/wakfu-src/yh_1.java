/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yH
 */
public class yh_1
implements gs_0 {
    public final tg_2 ami = new tg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ami.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ami.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ami.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10013) {
            yi_1 yi_12 = new yi_1(this);
            boolean bl = yi_12.b(byteBuffer, n);
            if (bl) {
                yi_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ami.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eM(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eM(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("capturedCreature=...\n");
        this.ami.bk(stringBuilder, string + "  ");
    }
}

