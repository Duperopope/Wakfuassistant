/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cun
 */
public class cun_0
extends nr_0 {
    private tg_1 mjn;

    public tg_1 eDc() {
        return this.mjn;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mjn = new tg_1();
        this.mjn.aG(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 12748;
    }
}

