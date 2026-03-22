/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bNV
extends bNW {
    @Override
    public void a(RH rH, exP exP2) {
    }

    @Override
    public void b(RH rH, exP exP2) {
        csb_2.eOl().c((bco_0)rH);
    }

    @Override
    public fry a(exP exP2, RH rH, long l) {
        List<frg_0> list = frb_0.sYO.aM(rH.Sn(), l);
        Set set = list.stream().map(frg_02 -> bNV.a(frg_02, exP2, rH)).collect(Collectors.toSet());
        return set.contains((Object)fry.sYz) ? fry.sYz : fry.sYH;
    }

    @Override
    protected void b(exP exP2, RH rH, long l) {
        coc_0 coc_02 = new coc_0(rH.Sn(), l);
        aue_0.cVJ().etu().d(coc_02);
    }

    @NotNull
    private static fry a(frg_0 frg_02, exP exP2, RH rH) {
        if (!frg_02.a(exP2, rH)) {
            return fry.sYC;
        }
        if (!frg_02.b(exP2, rH)) {
            return fry.sYC;
        }
        return fry.sYz;
    }

    @Override
    public boolean a(bgt_0 bgt_02, bco_0 bco_02) {
        return true;
    }

    @Override
    public fre_0 egC() {
        return fre_0.sZc;
    }

    @Override
    public String a(bco_0 bco_02) {
        bNL bNL2 = new bNL();
        bNL2.a(bco_02.Sn(), bco_02);
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().a(83, (long)((int)bco_02.Sn()), new Object[0])).ceH().ceH();
        ahv_22.c(aum_0.cWf().c("destinations", new Object[0])).ceH();
        ahv_22.c(bNL2.getDescription());
        return ahv_22.ceL();
    }

    @Override
    @Nullable
    public String b(bco_0 bco_02) {
        return null;
    }
}

