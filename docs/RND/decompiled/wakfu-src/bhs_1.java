/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHs
 */
public class bhs_1
extends bhy_1 {
    public static final String jZB = "item";
    public static final String jZC = "price";
    public static final String jZD = "quantity";
    public static final String jZE = "sellDuration";
    public static final String jZF = "totalProfit";
    public static final String jZG = "cashAfterTaxes";
    public static final String jZH = "isSaleValid";
    public static final String jZI = "sellButtonText";
    private static final String[] jZJ = new String[]{"item", "price", "quantity", "sellDuration", "totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"};
    private static final String[] jZK = (String[])ArrayUtils.addAll((Object[])bhy_1.kaR, (Object[])new String[]{"totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"});
    @Nullable
    private bim_1 jZL;
    private long jYa = 0L;
    private int ejM = 0;
    @NotNull
    private big_1 jYb = bhz_2.kbK;

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    public void setItem(@Nullable ffV ffV2) {
        boolean bl;
        boolean bl2 = bl = ffV2 != null && this.jZL != null && ffV2.avr() == this.jZL.avr();
        if (ffV2 != null) {
            Optional<bim_1> optional = bhz_2.dWn().bi(ffV2);
            this.jZL = optional.orElse(new bim_1(ffV2));
            this.d(ffV2, bl);
            this.e(ffV2, bl);
            if (!bid_1.b(bsn_1.lkO)) {
                this.jYb = bhz_2.kbK;
            }
            bhz_2.dWn().dWF().GR(this.jZL.avr());
        } else {
            this.jZL = null;
            this.jYa = 0L;
            bhz_2.dWn().dWF().reset();
        }
    }

    @Nullable
    public ffV getItem() {
        return this.jZL == null ? null : this.jZL.dXE();
    }

    private void d(@NotNull ffV ffV2, boolean bl) {
        bic_1 bic_12 = bid_1.c(bsn_1.lkM);
        this.jYa = GC.a(switch (bic_12) {
            case bic_1.kdQ -> this.jYa;
            case bic_1.kdR -> bl ? this.jYa : 0L;
            case bic_1.kdU -> Optional.ofNullable(bgn_1.dUk().bc(ffV2)).orElse(0L);
            default -> 0L;
        }, 0L, 999999999999L);
    }

    private void e(@NotNull ffV ffV2, boolean bl) {
        bic_1 bic_12 = bid_1.c(bsn_1.lkN);
        this.ejM = GC.a(switch (bic_12) {
            case bic_1.kdP -> 0;
            case bic_1.kdR -> bl ? this.ejM : 0;
            case bic_1.kdS -> 1;
            case bic_1.kdT -> ffV2.bfd();
            default -> this.ejM;
        }, 0, (int)ffV2.bfd());
    }

    public void k(long l, boolean bl) {
        this.jYa = GC.a(l, 0L, 999999999999L);
        if (bl) {
            this.u(jZC);
        }
        this.u(jZK);
    }

    public void z(int n, boolean bl) {
        this.ejM = GC.a(n, 0, this.dVs());
        if (bl) {
            this.u(jZD);
        }
        this.u(jZK);
    }

    public void a(@NotNull big_1 big_12) {
        this.jYb = big_12;
        this.u(jZE);
        this.u(jZK);
    }

    public void dVC() {
        this.u(jZC, jZD);
        this.u(jZK);
    }

    public int dVs() {
        return Math.min(this.jZL == null ? 0 : this.jZL.oP(), 999999);
    }

    public boolean dVD() {
        return this.jZL != null && this.jYa > 0L && this.ejM > 0 && this.ejM <= this.dVs() && this.jYb != null && this.dWi() && bhz_2.dWn().dWq();
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "item": {
                return this.jZL;
            }
            case "price": {
                return this.jYa > 0L ? Long.valueOf(this.jYa) : null;
            }
            case "quantity": {
                return this.ejM > 0 ? Integer.valueOf(this.ejM) : null;
            }
            case "sellDuration": {
                return this.jYb;
            }
            case "totalProfit": {
                return (long)this.ejM * this.jYa - this.dWh();
            }
            case "cashAfterTaxes": {
                return this.dWg();
            }
            case "isSaleValid": {
                return this.dVD();
            }
            case "sellButtonText": {
                if (this.dVD()) {
                    return aum_0.cWf().c("market.put.up.for.sale", new Object[0]);
                }
                if (this.jYa <= 0L) {
                    return aum_0.cWf().c("market.sell.no.price.defined", new Object[0]);
                }
                if (this.ejM <= 0) {
                    return aum_0.cWf().c("market.sell.no.quantity.defined", new Object[0]);
                }
                if (!bhz_2.dWn().dWq()) {
                    return aum_0.cWf().c("market.sell.maximum.reached", new Object[0]);
                }
                return aum_0.cWf().c("market.tax.too.high", new Object[0]);
            }
        }
        return super.eu(string);
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])jZJ);
    }

    @Nullable
    @Generated
    public bim_1 dVE() {
        return this.jZL;
    }

    @Override
    @Generated
    public long akd() {
        return this.jYa;
    }

    @Override
    @Generated
    public int oP() {
        return this.ejM;
    }

    @Override
    @NotNull
    @Generated
    public big_1 dUX() {
        return this.jYb;
    }
}

