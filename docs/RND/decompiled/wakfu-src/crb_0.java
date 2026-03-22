/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crB
 */
public class crb_0
extends nr_0 {
    private far_0 mgq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgq = caj_2.fc(byteBuffer);
        return true;
    }

    public far_0 eAg() {
        return this.mgq;
    }

    @Override
    public int d() {
        return 12058;
    }
}

