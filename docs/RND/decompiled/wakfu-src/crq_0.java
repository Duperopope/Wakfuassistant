/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crQ
 */
public class crq_0
extends nr_0 {
    private fan_0 mgD;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgD = fan_0.fY(byteBuffer.get());
        return true;
    }

    public fan_0 eAu() {
        return this.mgD;
    }

    @Override
    public int d() {
        return 15914;
    }
}

