/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class fiQ
extends fiT {
    private static final byte[] stf = new fiQ().aVX();
    @Nullable
    private String p = null;
    @Nullable
    private Mv aVU = null;
    @Nullable
    private fjb kdb = null;
    private long stg = -1L;
    private long sth = -1L;
    @Nullable
    private fjh kfd = null;

    public void reset() {
        this.ge(ByteBuffer.wrap(stf));
    }

    public byte[] aVX() {
        byte[] byArray = BH.aP(this.p);
        azg_1 azg_12 = new azg_1(fiQ.eR(byArray));
        this.h(azg_12);
        byte by = GC.ct(byArray.length);
        azg_12.aF(by);
        azg_12.h(byArray, by);
        azg_12.aF(this.aVU == null ? (byte)-1 : this.aVU.aJr());
        azg_12.aF(this.kdb == null ? (byte)-1 : this.kdb.aJr());
        azg_12.gK(this.stg);
        azg_12.gK(this.sth);
        azg_12.aF(this.kfd == null ? (byte)-1 : this.kfd.aJr());
        return azg_12.bTe();
    }

    public static fiQ gf(ByteBuffer byteBuffer) {
        fiQ fiQ2 = new fiQ();
        fiQ2.ge(byteBuffer);
        return fiQ2;
    }

    private void ge(ByteBuffer byteBuffer) {
        this.gi(byteBuffer);
        this.sM(BH.eE(byteBuffer));
        this.D(Mv.z(byteBuffer.get()).orElse(null));
        byte by = byteBuffer.get();
        this.a(by == -1 ? null : fjb.Ws(by));
        this.tI(byteBuffer.getLong());
        this.tJ(byteBuffer.getLong());
        byte by2 = byteBuffer.get();
        this.a(by2 == -1 ? null : fjh.gO(by2));
    }

    private static int eR(byte[] byArray) {
        return fiQ.gam() + 1 + byArray.length + 1 + 8 + 8 + 1;
    }

    @Nullable
    @Generated
    public String getName() {
        return this.p;
    }

    @Nullable
    @Generated
    public Mv aUXX() {
        return this.aVU;
    }

    @Nullable
    @Generated
    public fjb dXd() {
        return this.kdb;
    }

    @Generated
    public long gah() {
        return this.stg;
    }

    @Generated
    public long gai() {
        return this.sth;
    }

    @Nullable
    @Generated
    public fjh dXD() {
        return this.kfd;
    }

    @Generated
    public fiQ sM(@Nullable String string) {
        this.p = string;
        return this;
    }

    @Generated
    public fiQ D(@Nullable Mv mv) {
        this.aVU = mv;
        return this;
    }

    @Generated
    public fiQ a(@Nullable fjb fjb2) {
        this.kdb = fjb2;
        return this;
    }

    @Generated
    public fiQ tI(long l) {
        this.stg = l;
        return this;
    }

    @Generated
    public fiQ tJ(long l) {
        this.sth = l;
        return this;
    }

    @Generated
    public fiQ a(@Nullable fjh fjh2) {
        this.kfd = fjh2;
        return this;
    }

    @Override
    @Generated
    public String toString() {
        return "ClientHistorySearchParameters(m_name=" + this.getName() + ", m_language=" + String.valueOf((Object)this.aUXX()) + ", m_elementType=" + String.valueOf((Object)this.dXd()) + ", m_minPrice=" + this.gah() + ", m_maxPrice=" + this.gai() + ", m_timespan=" + String.valueOf((Object)this.dXD()) + ")";
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiQ)) {
            return false;
        }
        fiQ fiQ2 = (fiQ)object;
        if (!fiQ2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.gah() != fiQ2.gah()) {
            return false;
        }
        if (this.gai() != fiQ2.gai()) {
            return false;
        }
        String string = this.getName();
        String string2 = fiQ2.getName();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        Mv mv = this.aUXX();
        Mv mv2 = fiQ2.aUXX();
        if (mv == null ? mv2 != null : !((Object)((Object)mv)).equals((Object)mv2)) {
            return false;
        }
        fjb fjb2 = this.dXd();
        fjb fjb3 = fiQ2.dXd();
        if (fjb2 == null ? fjb3 != null : !((Object)((Object)fjb2)).equals((Object)fjb3)) {
            return false;
        }
        fjh fjh2 = this.dXD();
        fjh fjh3 = fiQ2.dXD();
        return !(fjh2 == null ? fjh3 != null : !((Object)((Object)fjh2)).equals((Object)fjh3));
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof fiQ;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        long l = this.gah();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        long l2 = this.gai();
        n2 = n2 * 59 + (int)(l2 >>> 32 ^ l2);
        String string = this.getName();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        Mv mv = this.aUXX();
        n2 = n2 * 59 + (mv == null ? 43 : ((Object)((Object)mv)).hashCode());
        fjb fjb2 = this.dXd();
        n2 = n2 * 59 + (fjb2 == null ? 43 : ((Object)((Object)fjb2)).hashCode());
        fjh fjh2 = this.dXD();
        n2 = n2 * 59 + (fjh2 == null ? 43 : ((Object)((Object)fjh2)).hashCode());
        return n2;
    }
}

