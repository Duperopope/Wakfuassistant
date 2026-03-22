/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGu
 */
public final class bgu_1
extends bgq_1 {
    @NotNull
    private final eJS jVw;
    @Nullable
    private eIi jVx;

    public bgu_1(eJS eJS2) {
        this.jVw = eJS2;
        fgd_0 fgd_02 = eJS2.dme();
        for (ffS ffS2 : eJI.qAk) {
            ffV ffV2 = (ffV)fgd_02.ai(ffS2.shb);
            if (ffV2 != null) {
                this.a(ffS2, new bgp_1(ffS2, ffV2));
                continue;
            }
            this.a(ffS2, new bgp_1(ffS2));
        }
        this.dTT();
        this.dTR();
    }

    @Override
    public boolean jW(long l) {
        return this.jVw.dme().dM(l);
    }

    @Override
    public void dTT() {
        Optional<eIi> optional = eJW.z(this.jVw);
        if (optional.isPresent()) {
            fhs.eW(optional.get().cmL()).fXL().forEach((ffS2, n) -> {
                this.g((ffS)ffS2).setItem(eJW.d(ffS2, n));
                fse_1.gFu().a((aef_2)this.g((ffS)ffS2), "item", "backgroundImageStyle");
            });
            this.jVx = optional.get();
        } else if (this.jVx != null) {
            fhs.eW(this.jVx.cmL()).fXL().forEach((ffS2, n) -> {
                ffV ffV2 = this.g((ffS)ffS2).getItem();
                if (ffV2 != null && ffV2.avr() == n.intValue()) {
                    this.g((ffS)ffS2).setItem(null);
                    fse_1.gFu().a((aef_2)this.g((ffS)ffS2), "item", "backgroundImageStyle");
                }
            });
            this.jVx = null;
        }
    }
}

