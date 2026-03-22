/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGc
 */
public class bgc_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUu = Logger.getLogger(bgc_1.class);
    private int jUv;

    public bgc_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            jUu.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.jUv = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (bgt_02 == null) {
            return false;
        }
        return bjf_1.a(this.jUv, fm_1.pI);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUu.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            aPd.e("chat.notify.dimensionalBagViewAlreadyKnown", new Object[0]);
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skC;
    }
}

