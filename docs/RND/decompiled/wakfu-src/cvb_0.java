/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvb
 */
public class cvb_0
extends nr_0 {
    private int mjD;
    private int mjJ;
    private fpp_0 mjK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mjD = byteBuffer.getInt();
        this.mjJ = byteBuffer.getInt();
        this.mjK = fpp_0.hk(byteBuffer.get());
        return true;
    }

    @Override
    public int d() {
        return 15524;
    }

    public int auH() {
        return this.mjD;
    }

    public int bgM() {
        return this.mjJ;
    }

    public fpp_0 eDH() {
        return this.mjK;
    }
}

