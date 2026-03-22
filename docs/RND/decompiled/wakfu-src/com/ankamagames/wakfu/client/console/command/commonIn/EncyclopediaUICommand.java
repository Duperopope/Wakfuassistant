/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EncyclopediaUICommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!cuj_2.eRF()) {
            cuj_2.eRE();
            return;
        }
        boolean bl = EncyclopediaUICommand.cTI();
        boolean bl2 = cuj_2.eQx();
        if (bl && bl2) {
            aue_0.cVJ().b(cuj_2.eRB());
            return;
        }
        if (EncyclopediaUICommand.cTJ()) {
            return;
        }
        if (EncyclopediaUICommand.cTL()) {
            return;
        }
        if (EncyclopediaUICommand.cTM()) {
            return;
        }
        if (bl2) {
            aue_0.cVJ().b(cuj_2.eRB());
        } else {
            aue_0.cVJ().a(cuj_2.eRB());
        }
    }

    public static boolean cTI() {
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        return fes_22 != null && fes_22.getElementMap() != null && "encyclopediaDialog".equals(fes_22.getElementMap().gAt());
    }

    private static boolean cTJ() {
        Optional<bgv_2> optional = EncyclopediaUICommand.cTK();
        if (optional.isEmpty()) {
            return false;
        }
        bgv_2 bgv_22 = optional.get();
        if (cuj_2.eRB().MV(bgv_22.d())) {
            return false;
        }
        cuj_2.eRB().a(bgv_22);
        fyd_0.closePopup(null);
        return true;
    }

    public static Optional<bgv_2> cTK() {
        bgv_2 bgv_22;
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 == null || fes_22 == fbj_1.getInstance()) {
            return Optional.empty();
        }
        fcv_1 fcv_12 = EncyclopediaUICommand.a(fes_22);
        if (fcv_12 == null) {
            return Optional.empty();
        }
        Object object = fcv_12.getItemValue();
        if (object instanceof fgf_0) {
            fgf_0 fgf_02 = (fgf_0)object;
            bgv_22 = (bgv_2)fgf_02.getItem().dOg();
        } else if (object instanceof bek_0) {
            bek_0 bek_02 = (bek_0)object;
            bgv_22 = bek_02.duo();
        } else {
            return Optional.empty();
        }
        if (!bpm_1.dCG().i(bgv_22)) {
            return Optional.empty();
        }
        return Optional.of(bgv_22);
    }

    @Nullable
    private static fcv_1 a(@NotNull fes_2 fes_22) {
        if (fes_22 instanceof fcv_1) {
            fcv_1 fcv_12 = (fcv_1)fes_22;
            return fcv_12;
        }
        return fes_22.getParentOfType(fcv_1.class);
    }

    private static boolean cTL() {
        Optional<bgy> optional = EncyclopediaUICommand.cTN();
        if (optional.isEmpty()) {
            return false;
        }
        Optional<bpg_1> optional2 = bpm_1.dCG().bI(optional.get().aWP());
        if (optional2.isEmpty()) {
            return false;
        }
        if (cuj_2.eRB().MW(optional.get().aWP())) {
            return false;
        }
        optional2.get().O(Integer.valueOf(optional.get().cmL()));
        cuj_2.eRB().f(optional2.get());
        cxq_1.eWO().a(cxq_1.eWO().eWP());
        return true;
    }

    private static boolean cTM() {
        Optional<bKT> optional = EncyclopediaUICommand.cTO();
        if (optional.isEmpty()) {
            return false;
        }
        bKT bKT2 = optional.get();
        if (bpm_1.dCG().EY(bKT2.d()).isEmpty()) {
            return false;
        }
        if (cuj_2.eRB().MX(bKT2.d())) {
            return false;
        }
        bpW bpW2 = new bpW(bKT2);
        cuj_2.eRB().a(bpr_1.iVn, bpW2);
        return true;
    }

    private static Optional<bgy> cTN() {
        return EncyclopediaUICommand.cTP().filter(zH -> zH instanceof bdj_2).map(zH -> (bdj_2)zH).map(bdj_2::dcP).filter(bgy2 -> bgy2 instanceof bhx_0).filter(bgy2 -> bpm_1.dCG().bI(bgy2.aWP()).isPresent()).findFirst();
    }

    private static Optional<bKT> cTO() {
        return EncyclopediaUICommand.cTP().filter(zH -> zH instanceof bKV).findFirst().map(zH -> (bKV)zH).map(bKV::eco);
    }

    private static Stream<ZH> cTP() {
        int n = fhz_2.gAS().getX();
        int n2 = fbj_1.getInstance().getHeight() - fhz_2.gAS().getY();
        aIs aIs2 = (aIs)aie_0.cfn().bmC();
        float f2 = fyw_0.gqw().gqD().getScale();
        ArrayList<ZH> arrayList = aIs2.cY((int)(f2 * (float)n), (int)(f2 * (float)n2));
        return arrayList.stream();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

