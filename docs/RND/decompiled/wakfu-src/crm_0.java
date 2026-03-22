/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crM
 */
public class crm_0
extends nr_0 {
    private faZ mgv;
    private fbn mgt;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        fbb fbb2 = fbb.fZ(byteBuffer.get());
        this.mgv = (faZ)fbb2.createNew();
        this.mgv.fW(byteBuffer);
        this.mgt = fbn.TS(byteBuffer.getInt());
        return true;
    }

    public faZ eAm() {
        return this.mgv;
    }

    public fbn eAk() {
        return this.mgt;
    }

    @Override
    public int d() {
        return 13768;
    }

    @Override
    public String toString() {
        return "HavenWorldManageActionResult{m_error=" + String.valueOf((Object)this.mgt) + "}";
    }
}

