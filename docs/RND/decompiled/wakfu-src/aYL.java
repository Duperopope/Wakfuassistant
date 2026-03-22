/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aYL
implements afl {
    private static final Logger hxX = Logger.getLogger(aYL.class);

    public void a(WL wL) {
        aqb_1.bGD().a(new fwC(), fwC2 -> {
            try {
                fiN fiN2 = new fiN();
                fiN2.fi(fwC2.cyv());
                for (fwD fwD2 : fwC2.goL()) {
                    fiL fiL2 = new fiL().Wc(fwD2.azv()).gI((byte)fwD2.bfd()).gJ((byte)fwD2.csp()).fg(fwD2.cqi()).fh(fwD2.cqj()).ff(fwD2.cyA()).ac(fwD2.cmK()).nv(fwD2.cqk());
                    fiN2.a(fiL2.drr());
                }
                fiJ.ssM.a(fwC2.d(), fiN2.gae());
            }
            catch (Exception exception) {
                hxX.error((Object)("Exception au chargement de la table de loot externe " + fwC2.d()), (Throwable)exception);
            }
        });
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.externalLootLists", new Object[0]);
    }
}

