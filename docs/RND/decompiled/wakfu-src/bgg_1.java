/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGg
 */
public final class bgg_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUz = Logger.getLogger(bgg_1.class);
    private int jUA;
    private List<Integer> jUB;

    public bgg_1(int n) {
        super(n);
    }

    @Override
    public void v(String ... stringArray) {
        if (stringArray == null || stringArray.length != 2) {
            jUz.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 2 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.jUA = Integer.parseInt(stringArray[0]);
        String string = stringArray[1].replace("[", "").replace("]", "");
        this.jUB = new ArrayList<Integer>();
        for (String string2 : string.split(",")) {
            this.jUB.add(Integer.parseInt(string2));
        }
    }

    @Override
    public fgM dTl() {
        return fgM.skV;
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (bgt_02 == null) {
            return false;
        }
        eki_0 eki_02 = bgt_02.dpK();
        for (int n : this.jUB) {
            if (eki_02.fv(this.jUA, n)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUz.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            for (int n : this.jUB) {
                eKR eKR2 = eKQ.qEb.QV(this.jUA).QZ(n);
                String string = aum_0.cWf().c("craft.recipeAlreadyKnow", aum_0.cWf().a(15, eKR2 != null ? (long)eKR2.fyZ().azv() : (long)ffV2.avr(), new Object[0]));
                aPh.czg().iY(string);
            }
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    protected boolean dTk() {
        return false;
    }

    @Generated
    public int dTA() {
        return this.jUA;
    }

    @Generated
    public List<Integer> dTB() {
        return this.jUB;
    }
}

