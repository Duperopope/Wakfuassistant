/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Optional;

/*
 * Renamed from bNz
 */
public class bnz_1
extends bnx_1 {
    private int iyg = 0;

    public void In(int n) {
        this.iyg = n;
    }

    @Override
    public int duZ() {
        return this.iyg;
    }

    @Override
    protected void dvb() {
        if (this.iyg != 0) {
            this.a((fhc_0)fgD.fXh().Vd(this.iyg), true);
        }
        super.dvb();
    }

    @Override
    public void a(bhJ bhJ2, fhk fhk2, ffS ... ffSArray) {
        this.kDb = Arrays.asList(ffSArray);
        this.kCX.clear();
        this.kDa = bhJ2;
        bhJ bhJ3 = new bhJ();
        bhJ3.fR(false);
        this.kCY = new bdj_2(bhJ3);
        this.kCY.a((ZC)this.kDa.ddI());
        for (ffS ffS2 : ffS.values()) {
            if (this.kDb.contains(ffS2)) continue;
            Optional<ffV> optional = fht.a(bhJ2, fhk2, ffS2);
            optional.ifPresentOrElse(ffV2 -> this.e((ffV)ffV2, ffS2.aJr()), () -> this.cy(ffS2.aJr()));
        }
        this.dvb();
        fse_1.gFu().a((aef_2)this, kDd);
    }

    @Override
    protected void a(ffV ffV2, byte by, ffS ffS2) {
        if (this.j(ffS2)) {
            return;
        }
        super.a(ffV2, by, ffS2);
    }

    private boolean j(ffS ffS2) {
        Optional<fm_1> optional = ekj_0.r(ffS2);
        if (optional.isEmpty()) {
            return true;
        }
        fb_2 fb_22 = ekj_0.b(this.kDa.aZj(), this.kDa.Sn(), optional.get());
        return fb_22 != ekl_0.qBx;
    }

    @Override
    protected void a(byte by, ffS ffS2, ffV ffV2) {
        if (this.j(ffS2)) {
            return;
        }
        super.a(by, ffS2, ffV2);
    }
}

