/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctF
 */
public class ctf_0
extends nr_0 {
    private fkw miw;
    private int laP;
    private int laW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.miw = fkw.gl(byteBuffer);
        this.laP = byteBuffer.getInt();
        this.laW = byteBuffer.getInt();
        return true;
    }

    public fkw eCs() {
        return this.miw;
    }

    public int ekU() {
        return this.laP;
    }

    public int eCt() {
        return this.laW;
    }

    @Override
    public int d() {
        return 12431;
    }
}

