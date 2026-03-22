/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from va
 */
final class va_1 {
    private final ve_1 aeO = new ve_1();
    final /* synthetic */ uz_2 aeP;

    va_1(uz_2 uz_22) {
        this.aeP = uz_22;
    }

    public void avW() {
        this.aeP.aeN.Us = this.aeO.Us;
        this.aeP.aeN.afO = this.aeO.afO;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        boolean bl = this.aeO.b(byteBuffer, 10032003);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10032003) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.cO(byteBuffer);
            return bl;
        }
        return false;
    }
}

