/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crH
 */
public class crh_0
extends nr_0 {
    private faz_0 mgp;
    private fbn mgt;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgt = fbn.TS(byteBuffer.getInt());
        this.mgp = fak_0.fQ(byteBuffer);
        return true;
    }

    public faz_0 eAj() {
        return this.mgp;
    }

    public fbn eAk() {
        return this.mgt;
    }

    @Override
    public int d() {
        return 13769;
    }
}

