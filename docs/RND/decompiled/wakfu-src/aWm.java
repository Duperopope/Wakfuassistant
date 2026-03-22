/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public class aWm
extends agb_1 {
    private final Iterable<ftH> huA;

    public aWm(int n, Iterable<ftH> iterable) {
        super(n, eui_1.rsU.aJr(), 0);
        this.huA = iterable;
    }

    @Override
    public long cbk() {
        boolean bl;
        boolean bl2 = eIA.pH(bbs_2.xl());
        boolean bl3 = false;
        boolean bl4 = false;
        HashMap<bhJ, Short> hashMap = new HashMap<bhJ, Short>();
        for (ftH ftH2 : this.huA) {
            bgy bgy2 = bvz_0.ju(ftH2.aXb());
            if (!(bgy2 instanceof bhJ)) continue;
            bhJ bhJ3 = (bhJ)bgy2;
            ftO ftO2 = ftH2.gmt();
            evx_2.feo().b(bhJ3.Xi(), eva_1.owq).ifPresent(eig_02 -> eig_02.g(bhJ3.Sn(), (short)(bhJ3.dnG() + ftO2.gmw())));
            if (ftO2.gmA()) {
                bl3 = true;
                hashMap.put(bhJ3, ftO2.gmw());
            }
            if (!ftO2.gmA() || bhJ3.doP() || bhJ3.djT() || bhJ3.ddI().bvW()) continue;
            this.b(bhJ3);
            if (bhJ3 != aue_0.cVJ().cVK()) continue;
            bl4 = true;
        }
        if (bl3 && (bl = fse_1.gFu().dp("hideDownscaling")) && !eIA.pH(aue_0.cVJ().cVK().Xi())) {
            fse_1.gFu().f("hideDownscaling", false);
        }
        hashMap.forEach((bhJ2, s) -> byx_1.a(bhJ2, (int)s.shortValue(), bl2));
        int n = 0;
        if (bl4) {
            try {
                n = aue_0.cVJ().cVK().ddI().dY("AnimLevelUp");
            }
            catch (RuntimeException runtimeException) {
                dJP.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
        return n;
    }

    private boolean a(bhJ bhJ2, ftO ftO2) {
        long l = ftO2.gmy();
        if (l <= 0L) {
            return false;
        }
        short s = ftO2.gmw();
        bhJ2.h(l, s);
        if (s <= 0) {
            return false;
        }
        if (cvu_2.eQx()) {
            cvu_2.eTO().ov(bhJ2.Sn());
        }
        if (bhJ2 == aue_0.cVJ().cVK()) {
            try {
                bqm_0.jbp.b(new brz(bhJ2.dnG()));
            }
            catch (Exception exception) {
                dJP.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        return true;
    }

    private void b(bhJ bhJ2) {
        bhJ2.dkn();
        bhJ2.a(abi_1.dzl);
        bhJ2.ddI().dT("AnimLevelUp");
        bhJ2.ddI().dV(bhJ2.ddI().ddu());
    }

    @Override
    protected void caV() {
        for (ftH ftH2 : this.huA) {
            bgy bgy2 = bvz_0.ju(ftH2.aXb());
            if (!(bgy2 instanceof bhJ)) continue;
            bhJ bhJ2 = (bhJ)bgy2;
            this.a(bhJ2, ftH2.gmt());
        }
    }

    public static aWm a(cqj_0 cqj_02) {
        return new aWm(aWm.cbm(), cqj_02.eyQ());
    }
}

