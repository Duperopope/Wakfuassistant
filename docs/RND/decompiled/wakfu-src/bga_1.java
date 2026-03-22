/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGa
 */
public class bga_1
extends bfc_1
implements bgf_1 {
    private static final Logger jUs = Logger.getLogger(bga_1.class);
    private fm_1 ixY;

    public bga_1(int n) {
        super(n);
    }

    @Override
    public void v(String ... stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            jUs.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.ixY = fm_1.ce(Integer.parseInt(stringArray[0]));
    }

    @Override
    public boolean a(@Nullable bgt_0 bgt_02, @Nullable fhc_0 fhc_02) {
        if (fhc_02 == null) {
            return false;
        }
        return bjf_1.a(fhc_02.d(), this.ixY);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            jUs.error((Object)("[ItemAction] Trying to start an itemAction with an item we don't have " + String.valueOf(ffV2)));
            return false;
        }
        if (this.c(bgt_02, ffV2)) {
            bNG.egl();
            bNG.a(57, new Object[0]);
            return false;
        }
        if (ffV2.fUY() != null && ffV2.fUY().fXu() != fgW.smf) {
            this.jU(ffV2.LV());
            return true;
        }
        fiq_2.gCw().d(fik_2.b(string -> this.jU(ffV2.LV())).l(this.dTy(), ffV2.getName()));
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        if (!super.aG(byteBuffer)) {
            return false;
        }
        this.ixY = fm_1.ce(byteBuffer.getInt());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skY;
    }

    private String dTy() {
        return switch (this.ixY) {
            case fm_1.pu, fm_1.pv -> "cosmetics.petEquipment.confirmation";
            case fm_1.pw -> "cosmetics.costume.confirmation";
            case fm_1.px -> "cosmetics.playerSprint.confirmation";
            case fm_1.py -> "cosmetics.finisher.confirmation";
            case fm_1.pz -> "cosmetics.aura.confirmation";
            case fm_1.pB, fm_1.pC, fm_1.pD, fm_1.pE, fm_1.pF, fm_1.pG, fm_1.pH -> "account.mimiSymbic.confirmation";
            default -> null;
        };
    }

    public fm_1 duW() {
        return this.ixY;
    }
}

