/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eJY
 */
public final class ejy_0
implements Sp {
    private static final Logger qAZ = Logger.getLogger(ejy_0.class);
    private final eJS qBa;

    public ejy_0(eJS eJS2) {
        this.qBa = eJS2;
    }

    @Override
    public void b(Sl sl) {
        if (!(sl instanceof Sn)) {
            return;
        }
        Sn sn = (Sn)sl;
        Sm sm = sl.bfB();
        switch (sm) {
            case bnZ: 
            case boa: {
                this.w(sn.bfD());
                break;
            }
            case bob: 
            case boc: {
                this.q(sn.bfD());
                break;
            }
            case bod: {
                break;
            }
            case boe: {
                break;
            }
            case bof: {
                break;
            }
            case bog: {
                break;
            }
        }
    }

    private void q(RT rT) {
        this.a(rT, false);
        if (rT instanceof ffV) {
            ((ffV)rT).bYg();
        }
    }

    private void w(RT rT) {
        this.a(rT, true);
        if (rT instanceof ffV) {
            ((ffV)rT).bYg();
        }
    }

    private void a(RT rT, boolean bl) {
        if (!(rT instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)rT;
        if (!ffV2.apo()) {
            return;
        }
        fgd_0 fgd_02 = this.qBa.dme();
        fhc_0 fhc_02 = ffV2.dOg();
        if (fhc_02 == null) {
            return;
        }
        fhy_0 fhy_02 = fhc_02.dGh();
        if (fhy_02 == null) {
            return;
        }
        ffV ffV3 = ffV2.fVR();
        ffV2.cE(ffV3);
        for (ffS ffS2 : fhy_02.fZs()) {
            if (bl) {
                try {
                    fgd_02.a(ffV3, ffS2.aJr());
                }
                catch (sa_0 sa_02) {
                    qAZ.error((Object)"Exception levee", (Throwable)sa_02);
                }
                catch (Sz sz) {
                    qAZ.error((Object)"Exception levee", (Throwable)sz);
                }
                catch (SD sD) {
                    qAZ.error((Object)"Exception levee", (Throwable)sD);
                }
                continue;
            }
            fgd_02.af(ffS2.aJr());
        }
    }
}

