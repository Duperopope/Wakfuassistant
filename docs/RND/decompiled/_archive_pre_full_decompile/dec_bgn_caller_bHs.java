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

public class bHs
extends bHy {
    public static final String jZB = "item";
    public static final String jZC = "price";
    public static final String jZD = "quantity";
    public static final String jZE = "sellDuration";
    public static final String jZF = "totalProfit";
    public static final String jZG = "cashAfterTaxes";
    public static final String jZH = "isSaleValid";
    public static final String jZI = "sellButtonText";
    private static final String[] jZJ = new String[]{"item", "price", "quantity", "sellDuration", "totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"};
    private static final String[] jZK = (String[])ArrayUtils.addAll((Object[])bHy.kaR, (Object[])new String[]{"totalProfit", "cashAfterTaxes", "isSaleValid", "sellButtonText"});
    @Nullable
    private bIm jZL;
    private long jYa = 0L;
    private int ejM = 0;
    @NotNull
    private bIg jYb = bHz.kbK;

    private void u(String ... stringArray) {
        fSe.gFu().a((aEF)this, stringArray);
    }

    public void setItem(@Nullable ffV ffV2) {
        boolean bl;
        boolean bl2 = bl = ffV2 != null && this.jZL != null && ffV2.avr() == this.jZL.avr();
        if (ffV2 != null) {
            Optional<bIm> optional = bHz.dWn().bi(ffV2);
            this.jZL = optional.orElse(new bIm(ffV2));
            this.d(ffV2, bl);
            this.e(ffV2, bl);
            if (!bId.b(bSN.lkO)) {
                this.jYb = bHz.kbK;
            }
            bHz.dWn().dWF().GR(this.jZL.avr());
        } else {
            this.jZL = null;
            this.jYa = 0L;
            bHz.dWn().dWF().reset();
        }
    }

    @Nullable
    public ffV getItem() {
        return this.jZL == null ? null : this.jZL.dXE();
    }

    private void d(@NotNull ffV ffV2, boolean bl) {
        bIc bIc2 = bId.c(bSN.lkM);
        this.jYa = GC.a(switch (bIc2) {
            case bIc.kdQ -> this.jYa;
            case bIc.kdR -> bl ? this.jYa : 0L;
            case bIc.kdU -> Optional.ofNullable(bGN.dUk().bc(ffV2)).orElse(0L);
            default -> 0L;
        }, 0L, 999999999999L);
    }

    private void e(@NotNull ffV ffV2, boolean bl) {
        bIc bIc2 = bId.c(bSN.lkN);
        this.ejM = GC.a(switch (bIc2) {
            case bIc.kdP -> 0;
            case bIc.kdR -> bl ? this.ejM : 0;
            case bIc.kdS -> 1;
            case bIc.kdT -> ffV2.bfd();
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

    public void a(@NotNull bIg bIg2) {
        this.jYb = bIg2;
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
        return this.jZL != null && this.jYa > 0L && this.ejM > 0 && this.ejM <= this.dVs() && this.jYb != null && this.dWi() && bHz.dWn().dWq();
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
                    return aUM.cWf().c("market.put.up.for.sale", new Object[0]);
                }
                if (this.jYa <= 0L) {
                    return aUM.cWf().c("market.sell.no.price.defined", new Object[0]);
                }
                if (this.ejM <= 0) {
                    return aUM.cWf().c("market.sell.no.quantity.defined", new Object[0]);
                }
                if (!bHz.dWn().dWq()) {
                    return aUM.cWf().c("market.sell.maximum.reached", new Object[0]);
                }
                return aUM.cWf().c("market.tax.too.high", new Object[0]);
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
    public bIm dVE() {
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
    public bIg dUX() {
        return this.jYb;
    }
}
