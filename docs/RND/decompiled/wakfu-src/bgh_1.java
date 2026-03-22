/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGh
 */
public class bgh_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUC = Logger.getLogger(bgh_1.class);
    private int jUA;
    private int eIx;

    public bgh_1(int n) {
        super(n);
    }

    @Override
    public void v(String ... stringArray) {
        if (stringArray == null || stringArray.length != 2) {
            jUC.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 2 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.jUA = Integer.parseInt(stringArray[0]);
        this.eIx = Integer.parseInt(stringArray[1]);
    }

    @Override
    public fgM dTl() {
        return fgM.skU;
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (bgt_02 == null) {
            return false;
        }
        eki_0 eki_02 = bgt_02.dpK();
        return eki_02.fv(this.jUA, this.eIx);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUC.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            eKR eKR2 = eKQ.qEb.QV(this.jUA).QZ(this.eIx);
            String string = aum_0.cWf().c("craft.recipeAlreadyKnow", aum_0.cWf().a(15, eKR2 != null ? (long)eKR2.fyZ().azv() : (long)ffV2.avr(), new Object[0]));
            aPh.czg().iY(string);
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
    public int rX() {
        return this.eIx;
    }
}

