/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bjq
 */
public class bjq_1
implements bjn_1 {
    protected long aDL;
    private long ioh;
    private short ejt;
    private String p;

    @Override
    public ezz_1 jP(long l) {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer des membres de guilde d'un remote");
    }

    @Override
    public fab jR(long l) {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer des rangs de guilde d'un remote");
    }

    @Override
    public long drj() {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer le best rank d'un remote");
    }

    @Override
    public long Ya() {
        return this.aDL;
    }

    @Override
    public void jQ(long l) {
        this.aDL = l;
    }

    @Override
    public long Yc() {
        return this.ioh;
    }

    public void jS(long l) {
        this.ioh = l;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public void setName(String string) {
        this.p = string;
    }

    public void bw(short s) {
        this.ejt = s;
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public TIntHashSet drk() {
        throw new UnsupportedOperationException("On n'est pas cens\u00e9 r\u00e9cup\u00e9rer les bonus d'un remote");
    }

    @Override
    public void clear() {
        this.aDL = 0L;
        this.ioh = 0L;
        this.ejt = 0;
        this.p = "";
    }

    public String toString() {
        return "GuildRemoteInformationHandler{m_guildId=" + this.aDL + ", m_blazon=" + this.ioh + ", m_level=" + this.ejt + ", m_name='" + this.p + "'}";
    }
}

