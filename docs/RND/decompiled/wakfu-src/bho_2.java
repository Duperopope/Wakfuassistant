/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHo
 */
public class bho_2
implements aeh_2,
bek_0 {
    public static final String jYQ = "selectedItems";
    public static final String jYR = "offerFulfillmentRecap";
    public static final String jYS = "canFulfill";
    public static final String jYT = "isFull";
    public static final String jYU = "fulfillButtonText";
    public static final String jYV = "lastMatchWasError";
    public static final String jYW = "lastMatchErrorText";
    public static final String[] jYX = new String[]{"selectedItems", "offerFulfillmentRecap", "canFulfill", "fulfillButtonText", "lastMatchWasError", "lastMatchErrorText"};
    public static final Comparator<bhp_2> jYY = Comparator.comparingInt(bhp_2::oP);
    public static final Comparator<bhp_2> jYZ = Comparator.comparingInt(bhp_2::dUY);
    public static final Comparator<bhp_2> jZa = Comparator.comparingInt(bhp_2::dVt);
    private static final int jZb = 7000;
    @NotNull
    private final bhz_1 jZc;
    private final List<bhp_2> jZd = new ArrayList<bhp_2>();
    private final Map<Long, bhp_2> jZe = new HashMap<Long, bhp_2>();
    private int jZf;
    private fix_0 jZg = fix_0.sup;
    private final Runnable jZh = () -> {
        this.jZg = fix_0.sup;
        fse_1.gFu().a((aef_2)this, jYV, jYW);
    };

    public bho_2(@NotNull bhz_1 bhz_12) {
        this.jZc = bhz_12;
    }

    public void bf(ffV ffV2) {
        bgl_0 bgl_02 = (bgl_0)fse_1.gFu().aW("characterSheet", "inventoryDialog");
        if (bgl_02 == null) {
            return;
        }
        this.b(ffV2, bgl_02.Sn());
    }

    private void b(ffV ffV2, long l) {
        if (this.jZe.containsKey(ffV2.LV())) {
            return;
        }
        if (this.jZf >= this.jZc.dXk().oP()) {
            return;
        }
        this.jZg = cwl_1.a(ffV2, this.jZc.dXk());
        abg_2.bUP().h(this.jZh);
        fse_1.gFu().a((aef_2)this, jYV, jYW);
        if (this.jZg != fix_0.sup) {
            abg_2.bUP().a(this.jZh, 7000L, 1);
            return;
        }
        bhp_2 bhp_22 = new bhp_2(ffV2, l);
        this.jZd.add(bhp_22);
        this.jZe.put(ffV2.LV(), bhp_22);
        this.a(bhp_22, bhp_22.dVs());
        fse_1.gFu().a((aef_2)this, jYX);
        fse_1.gFu().a((aef_2)ffV2, "movable");
    }

    public void bg(ffV ffV2) {
        if (!this.jZe.containsKey(ffV2.LV())) {
            return;
        }
        bhp_2 bhp_22 = this.jZe.remove(ffV2.LV());
        this.jZd.remove(bhp_22);
        this.jZf -= bhp_22.oP();
        this.jZg = fix_0.sup;
        fse_1.gFu().a((aef_2)this, jYX);
        fse_1.gFu().a((aef_2)ffV2, "movable");
    }

    public boolean jW(long l) {
        return this.jZe.containsKey(l);
    }

    public void dVo() {
        TLongHashSet tLongHashSet = fcL.rUh.sx(bbs_2.xl());
        mE mE2 = this.jZc.dXk();
        for (long l : tLongHashSet.toArray()) {
            Object t = fcL.rUh.sw(l);
            ((exP)t).dod().M((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
                if (cwl_1.a(ffV2, mE2) == fix_0.sup) {
                    if (this.jZe.containsKey(ffV2.LV())) {
                        this.a(this.jZe.get(ffV2.LV()), ffV2.bfd());
                    } else {
                        this.b((ffV)ffV2, l);
                    }
                }
                return this.jZf < mE2.oP();
            }));
            if (this.jZf >= mE2.oP()) break;
        }
    }

    public void a(bhp_2 bhp_22, int n) {
        int n2 = this.jZc.dXk().oP() - (this.jZf - bhp_22.oP());
        int n3 = GC.a(n, 0, n2);
        this.jZf += n3 - bhp_22.oP();
        bhp_22.Fq(n3);
        fse_1.gFu().a((aef_2)this, jYR, jYS, jYU);
    }

    public void n(Consumer<bhp_2> consumer) {
        this.jZd.forEach(consumer);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "selectedItems": {
                return this.jZd;
            }
            case "offerFulfillmentRecap": {
                return aum_0.cWf().c("market.offer.fulfill.recap", this.jZc.dXk().akd() * (long)this.jZf, this.jZf, new fhl_2(ett_1.opf).bQk());
            }
            case "canFulfill": {
                return this.dVp();
            }
            case "isFull": {
                return this.jZf == this.jZc.dXk().oP();
            }
            case "fulfillButtonText": {
                if (this.dVp()) {
                    return aum_0.cWf().c("market.offer.sell", new Object[0]);
                }
                if (this.jZd.isEmpty()) {
                    return aum_0.cWf().c("market.offer.fulfill.no.items", new Object[0]);
                }
                return aum_0.cWf().c("market.offer.fulfill.invalid.quantity", new Object[0]);
            }
            case "lastMatchWasError": {
                return this.jZg != fix_0.sup;
            }
            case "lastMatchErrorText": {
                if (this.jZg == fix_0.sup) {
                    return null;
                }
                return aum_0.cWf().c("market.offer.match.error." + this.jZg.d(), new Object[0]);
            }
        }
        return this.jZc.eu(string);
    }

    public boolean dVp() {
        return !this.jZd.isEmpty() && this.dVq();
    }

    private boolean dVq() {
        for (bhp_2 bhp_22 : this.jZd) {
            if (bhp_22.oP() > 0 && bhp_22.oP() <= bhp_22.getItem().bfd()) continue;
            return false;
        }
        return true;
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])jYX, (Object[])this.jZc.bxk());
    }

    @Override
    public bgv_2 duo() {
        return this.jZc.duo();
    }

    @NotNull
    @Generated
    public bhz_1 dVr() {
        return this.jZc;
    }
}

