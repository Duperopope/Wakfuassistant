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
 * Renamed from bFZ
 */
public class bfz_0
extends bfc_1
implements bgf_1 {
    private static final Logger jUr = Logger.getLogger(bfz_0.class);
    private int jbc;

    public bfz_0(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            jUr.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.jbc = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (bgt_02 == null) {
            return false;
        }
        return bgt_02.CQ(this.jbc);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUr.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            String string = aum_0.cWf().a(34, (long)this.jbc, new Object[0]);
            aPd.e("error.title.alreadyKnown", string);
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
        return fgM.sks;
    }
}

