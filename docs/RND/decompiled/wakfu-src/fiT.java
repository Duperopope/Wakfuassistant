/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class fiT {
    private int iLl = 0;
    private fje oec = fje.swW;
    private boolean stq = true;
    private byte str = (byte)-1;

    public void h(azg_1 azg_12) {
        azg_12.vC(this.iLl);
        azg_12.aF((byte)this.oec.d());
        azg_12.dz(this.stq);
        azg_12.aF(this.str);
    }

    public void gi(ByteBuffer byteBuffer) {
        this.Wj(byteBuffer.getInt());
        this.c(fje.Wv(byteBuffer.get()));
        this.nx(byteBuffer.get() == 1);
        this.gK(byteBuffer.get());
    }

    public static int gam() {
        return 7;
    }

    @Generated
    public int eEQ() {
        return this.iLl;
    }

    @Generated
    public fje fbg() {
        return this.oec;
    }

    @Generated
    public boolean gan() {
        return this.stq;
    }

    @Generated
    public byte gao() {
        return this.str;
    }

    @Generated
    public fiT Wj(int n) {
        this.iLl = n;
        return this;
    }

    @Generated
    public fiT c(fje fje2) {
        this.oec = fje2;
        return this;
    }

    @Generated
    public fiT nx(boolean bl) {
        this.stq = bl;
        return this;
    }

    @Generated
    public fiT gK(byte by) {
        this.str = by;
        return this;
    }

    @Generated
    public String toString() {
        return "ClientPagination(m_firstIndex=" + this.eEQ() + ", m_sortType=" + String.valueOf((Object)this.fbg()) + ", m_ascendingSort=" + this.gan() + ", m_sortParameter=" + this.gao() + ")";
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fiT)) {
            return false;
        }
        fiT fiT2 = (fiT)object;
        if (!fiT2.C(this)) {
            return false;
        }
        if (this.eEQ() != fiT2.eEQ()) {
            return false;
        }
        if (this.gan() != fiT2.gan()) {
            return false;
        }
        if (this.gao() != fiT2.gao()) {
            return false;
        }
        fje fje2 = this.fbg();
        fje fje3 = fiT2.fbg();
        return !(fje2 == null ? fje3 != null : !((Object)((Object)fje2)).equals((Object)fje3));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fiT;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.eEQ();
        n2 = n2 * 59 + (this.gan() ? 79 : 97);
        n2 = n2 * 59 + this.gao();
        fje fje2 = this.fbg();
        n2 = n2 * 59 + (fje2 == null ? 43 : ((Object)((Object)fje2)).hashCode());
        return n2;
    }
}

