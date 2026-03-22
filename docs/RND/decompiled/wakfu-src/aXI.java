/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class aXI
implements aaq_2<cpu_0> {
    private static final Logger hxd = Logger.getLogger(aXI.class);

    aXI() {
    }

    @Override
    public boolean a(cpu_0 cpu_02) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        bgt_0 bgt_02 = new bgt_0(true);
        bgt_02.fR(false);
        bgt_02.b(eIl.ey(cpu_02.evZ()));
        bgt_02.a(eHN.ex(cpu_02.ewa()));
        bgt_02.as(cpu_02.exn());
        bgt_02.aPg();
        bzj_2.eqi().b(bgt_02);
        bgt_0 bgt_03 = (bgt_0)bvz_0.ju(bgt_02.Sn());
        if (bgt_03 != null) {
            bgt_03.gc(true);
            bgt_03.fR(true);
            adn_0.bvh().g(bgt_03.ddI());
            bgt_03.b(eIl.ey(cpu_02.evZ()));
            bgt_03.a(eHN.ex(cpu_02.ewa()));
            bgt_03.as(cpu_02.exn());
            bgt_03.aPg();
            blk_2.J(bgt_03);
            bgt_03.ddI().setVisible(false);
        }
        bMV.a(bgt_02.dnM(), bgt_02.dkB(), bgt_02.dlG());
        fcx<bgt_0> fcx2 = new fcx<bgt_0>(aUQ2.xl());
        try {
            fcx2.bJ(bgt_02);
            fcx2.bK(bgt_02);
        }
        catch (fcw fcw2) {
            hxd.error((Object)"Probl\u00e8me \u00e0 l'ajout du h\u00e9ros : ", (Throwable)fcw2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13145;
    }
}

