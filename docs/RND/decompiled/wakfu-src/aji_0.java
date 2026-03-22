/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aJi
 */
public class aji_0
extends aje_0 {
    protected static final Logger eaj = Logger.getLogger(aji_0.class);

    aji_0(ajf_0 ajf_02) {
        super(ajf_02);
    }

    @Override
    public void b(adx_0 adx_02) {
        adx_02.ci(false);
        String string = adx_02.bkI();
        if (string.equals(this.dZS.chq())) {
            adx_02.dT(this.dZS.chp());
        } else {
            adx_02.dT(this.dZS.cho());
        }
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        adx_02.ch(false);
        adx_02.ci(false);
        if (adx_02.dZ(this.dZS.chn()) && this.k(adx_02)) {
            adx_02.dT(this.dZS.chn());
        } else if (!adx_02.dZ(this.dZS.chn())) {
            adx_02.dT(this.dZS.chl());
        }
    }

    private boolean k(adx_0 adx_02) {
        return !adx_02.bkI().equals(this.dZS.chl()) && !adx_02.bkI().equals(this.dZS.chm()) && !adx_02.bkI().equals(this.dZS.chn());
    }

    @Override
    public void c(adx_0 adx_02) {
        adx_02.cj(false);
        adx_02.ci(false);
        adx_02.ch(true);
        if (!adx_02.bcB().bVO()) {
            return;
        }
        adx_02.dT(this.dZS.chq());
    }

    @Override
    public void d(adx_0 adx_02) {
        adx_02.cj(false);
        adx_02.ch(false);
        adx_02.ci(true);
        adx_02.dT("AnimArtefact-Papatte");
    }

    @Override
    public void e(adx_0 adx_02) {
        adx_02.ci(false);
        adx_02.ch(false);
        adx_02.cj(true);
        adx_02.a(aeC.bwx());
        adx_02.dT("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(adx_0 adx_02) {
    }

    @Override
    public aea_0 bwe() {
        return aea_0.cmy;
    }
}

