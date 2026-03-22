/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eZN
 */
class ezn_2
implements ezk_1 {
    private static final Logger rMG = Logger.getLogger(ezn_2.class);
    private long mln;

    ezn_2() {
    }

    ezn_2(fab fab2) {
        this.mln = fab2.Sn();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.mln);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.mln = byteBuffer.getLong();
    }

    @Override
    public void a(eyy_2 eyy_22) {
        try {
            eyy_22.ry(this.mln);
        }
        catch (fae fae2) {
            rMG.error((Object)"Impossible d'ajouter le rang", (Throwable)fae2);
        }
    }

    @Override
    public ezm_2 fQA() {
        return ezm_2.rMk;
    }

    public String toString() {
        return "RemoveRankChange{m_rankId=" + this.mln + "}";
    }
}

