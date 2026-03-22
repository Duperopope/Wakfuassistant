/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class bHp
implements aEH,
fgf {
    public static final String jZi = "quantity";
    private final ffV jZj;
    private final long jZk;
    private int ejM;

    public bHp(ffV ffV2, long l) {
        this.jZj = ffV2;
        this.jZk = l;
        this.ejM = 0;
    }

    void Fq(int n) {
        this.ejM = GC.a(n, 0, (int)this.jZj.bfd());
        fSe.gFu().a((aEF)this, jZi);
    }

    public int dVs() {
        return this.jZj.bfd();
    }

    private short dUY() {
        Short s = this.jZj.fWb();
        return s != null ? s.shortValue() : this.jZj.dOg().cmL();
    }

    private int dVt() {
        if (!this.jZj.dXg()) {
            return -1;
        }
        fhI fhI2 = this.jZj.eAZ();
        if (fhI2.fYI() == 0) {
            return 0;
        }
        int n = 0;
        for (fhN fhN2 : fhI2.dTS().values()) {
            if (fhN2.dBe() != Rd.bjE) continue;
            ++n;
        }
        return 10 * fhI2.fYI() + n;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jZi.equals(string)) {
            return this.ejM > 0 ? Integer.valueOf(this.ejM) : null;
        }
        return this.jZj.eu(string);
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Generated
    public ffV getItem() {
        return this.jZj;
    }

    @Generated
    public long dVu() {
        return this.jZk;
    }

    @Generated
    public int oP() {
        return this.ejM;
    }

    @Generated
    public String toString() {
        return "MarketOfferFulfillmentView.ItemWithQuantity(m_item=" + String.valueOf(this.getItem()) + ", m_characterUid=" + this.dVu() + ", m_quantity=" + this.oP() + ")";
    }
}
