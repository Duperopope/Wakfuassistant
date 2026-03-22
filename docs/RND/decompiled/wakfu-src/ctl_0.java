/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctL
 */
public class ctl_0
extends nr_0 {
    private fkH miE;

    public fkH eCB() {
        return this.miE;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.miE = fkH.gm(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 15764;
    }
}

