/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyB
 */
public class cyb_0
extends nr_0 {
    private fpu_0 mbV;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbV = fpu_0.YK(byteBuffer.get());
        return false;
    }

    public fpu_0 eFC() {
        return this.mbV;
    }

    @Override
    public int d() {
        return 14174;
    }
}

