/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;

/*
 * Renamed from bet
 */
public final class bet_2
extends beh_2 {
    public final int hNo;
    public final acd_1 hNp;
    public final boolean hNq;
    public final pg_0 hNr;
    public final boolean hNs;
    public FreeParticleSystem hNt;
    public bdj_2 hKX;
    bew_2 hNu;
    public boolean hNv = false;

    bet_2(enk_0 enk_02, int n, acd_1 acd_12, boolean bl, boolean bl2, pg_0 pg_02, bew_2 bew_22) {
        super(enk_02);
        this.hNo = n;
        this.hNp = acd_12;
        this.hNq = bl;
        this.hNu = bew_22;
        this.hNr = pg_02;
        this.hNs = bl2;
    }

    private bet_2(bet_2 bet_22) {
        super(bet_22.hMZ);
        this.hNo = bet_22.hNo;
        this.hNp = bet_22.hNp;
        this.hNq = bet_22.hNq;
        this.hNu = null;
        this.hNr = bet_22.hNr;
        this.hNs = bet_22.hNs;
    }

    @Override
    public void p(bdj_2 bdj_22) {
        this.hKX = bdj_22;
        this.hNu.g(this);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bet_2 bet_22 = (bet_2)object;
        if (this.hNq != bet_22.hNq) {
            return false;
        }
        if (this.hNs != bet_22.hNs) {
            return false;
        }
        if (this.hNo != bet_22.hNo) {
            return false;
        }
        if (this.hNp != null ? !this.hNp.equals(bet_22.hNp) : bet_22.hNp != null) {
            return false;
        }
        return this.hNr == bet_22.hNr;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.hNo;
        n = 31 * n + (this.hNp != null ? this.hNp.hashCode() : 0);
        n = 31 * n + (this.hNq ? 1 : 0);
        n = 31 * n + (this.hNr != null ? this.hNr.hashCode() : 0);
        n = 31 * n + (this.hNs ? 1 : 0);
        return n;
    }

    public bet_2 dew() {
        return new bet_2(this);
    }

    public /* synthetic */ beh_2 deb() {
        return this.dew();
    }
}

