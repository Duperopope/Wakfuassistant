/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpZ
 */
public class cpz_0
extends nr_0 {
    private long lXG;
    private ffV iWZ;
    private long aZj;
    private short euw;
    private ett_0 mer;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lXG = byteBuffer.getLong();
        this.aZj = byteBuffer.getLong();
        this.mer = ett_0.fj(byteBuffer.get());
        this.euw = byteBuffer.getShort();
        uy_1 uy_12 = new uy_1();
        if (!uy_12.aG(byteBuffer)) {
            return false;
        }
        this.iWZ = new ffV();
        this.iWZ.c(uy_12);
        return true;
    }

    @Override
    public int d() {
        return 13170;
    }

    public ffV getItem() {
        return this.iWZ;
    }

    public long fD() {
        return this.aZj;
    }

    public long exN() {
        return this.lXG;
    }

    public ett_0 exQ() {
        return this.mer;
    }

    public short cyg() {
        return this.euw;
    }
}

