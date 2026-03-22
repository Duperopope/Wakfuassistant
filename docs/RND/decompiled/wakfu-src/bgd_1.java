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
 * Renamed from bGd
 */
public class bgd_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUw = Logger.getLogger(bgd_1.class);
    private int eAf;

    public bgd_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            jUw.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.eAf = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        return bbe_0.hAP.AD(this.eAf);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUw.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            String string = aum_0.cWf().a(80, (long)this.eAf, new Object[0]);
            aPd.e("error.emote.alreadyKnown", string);
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
        return fgM.skv;
    }
}

