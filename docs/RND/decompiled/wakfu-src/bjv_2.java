/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bjv
 */
public class bjv_2
implements bgp_0 {
    private static final Logger ioq = Logger.getLogger(bjv_2.class);
    private final bhx_0 ior;
    private boolean ios;
    private pv_0 iot;

    public static boolean aM(bgy bgy2) {
        return cpa_1.Mg(bgy2.aVt());
    }

    public bjv_2(bhx_0 bhx_02) {
        this.ior = bhx_02;
    }

    @Override
    public void a(int n, Object object) {
        if (n == 301) {
            this.drt();
            this.dru();
        } else if (n == 300) {
            this.ios = true;
        }
    }

    @Override
    public void a(rl_0 rl_02) {
        if (rl_02.d() == 101 && this.ios) {
            this.ios = false;
            aWH aWH2 = new aWH(agb_1.cbm(), eui_1.rtq.aJr(), 0, this.ior);
            aVi.cWF().a(this.ior.dkZ(), (aft_2)aWH2);
            this.dru();
        }
    }

    @Override
    public void f(pv_0 pv_02) {
        if (!cpa_1.j(pv_02)) {
            return;
        }
        this.iot = pv_02;
        this.drt();
    }

    @Override
    public void h(pv_0 pv_02) {
        if (!cpa_1.j(pv_02)) {
            return;
        }
        this.drs();
        this.ior.a((bgp_0)null);
    }

    private void drs() {
        bdj_2 bdj_22 = this.ior.ddI();
        this.ior.CK(0);
        this.ior.dkr();
        bdj_22.a(bdj_22.bqc(), new bjw_1(this, bdj_22));
    }

    private void drt() {
        if (this.iot == null || !cpa_1.j(this.iot)) {
            ioq.error((Object)("On essaie d'ajouter un skin encapuchonn\u00e9 \u00e0 un monstre qui n'a pas de propri\u00e9t\u00e9 correspondante" + String.valueOf(this.iot)));
            return;
        }
        bdj_2 bdj_22 = this.ior.ddI();
        bdj_22.dcX().u(bdj_22);
        bdj_22.dV("AnimStatique");
        bdj_22.dT("AnimTransEffect-Debut");
        this.ior.dkr();
        int n = (int)(Math.abs(this.ior.Sn()) % (long)cpa_1.k(this.iot));
        this.ior.CK(cpa_1.a(n, this.iot));
    }

    private void dru() {
        if (this.ior.doP()) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800340);
        if (freeParticleSystem == null) {
            ioq.error((Object)"pas d'aps 800340");
            return;
        }
        freeParticleSystem.pu(this.ior.bqo());
        freeParticleSystem.r(this.ior.bcC(), this.ior.bcD(), this.ior.bcE());
        agZ.bzy().b(freeParticleSystem);
    }
}

