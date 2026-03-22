/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUE
 */
public class cue_2
implements adi_1 {
    private static final Logger nNa = Logger.getLogger(cue_2.class);
    private static final cue_2 nNb = new cue_2();
    private final akd_0 nNc = akd_0.ciR();
    private boolean cHn = true;
    private boolean nNd = true;
    private int nNe = 0;
    private int nNf = -1;
    private boolean Na = false;
    private bwt_0 nNg;
    private final ady_0<ads_0> nNh = new cuf_1(this);
    private ewi_2 nNi = new ewi_2();

    public static cue_2 eSA() {
        return nNb;
    }

    public final void eSB() {
        this.cHn = true;
    }

    public final void eSC() {
        this.cHn = false;
        this.eSI();
    }

    public void eSD() {
        this.nNd = false;
        this.eSI();
    }

    public void eSE() {
        this.nNd = true;
    }

    public void eSF() {
        this.nNe = 0;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!this.Na) {
            nNa.warn((Object)"Traitement d'un message alors que la frame n'est plus active");
            this.eSI();
        }
        if (aue_0.cVJ().c(cyx_2.eYd())) {
            return true;
        }
        if (!this.cHn || !this.nNd) {
            return true;
        }
        switch (aam_22.d()) {
            case 17000: {
                this.eSG();
                return true;
            }
            case 16902: {
                dcm_0 dcm_02 = (dcm_0)aam_22;
                fib_2.gBU().eKH();
                if (!dcm_02.fch()) {
                    this.eSI();
                    cub_1.eSi().eSj().Q(0, 0, (short)Short.MAX_VALUE);
                    return true;
                }
                if (!cub_1.eSi().eSo()) {
                    return true;
                }
                this.nNe = 0;
                if (cub_1.eSi().eSj() == null) {
                    return false;
                }
                bgy bgy2 = cue_2.eSH();
                if (bgy2 == null) {
                    return false;
                }
                if (this.nNg != null && this.nNg.bDU() > 0) {
                    anp_2 anp_22 = this.nNg.dMW();
                    if (this.nNg.bDU() == 1 && bgy2.aZw().cF(anp_22.bDW()[0], anp_22.bDW()[1])) {
                        return false;
                    }
                    if (!this.a(bgy2, this.nNg)) {
                        return false;
                    }
                    this.nNe = this.nNg.bDU();
                    this.a(bgy2, anp_22);
                    this.eSD();
                    this.eSI();
                }
                return cue_2.eJ(dcm_02.bqM(), dcm_02.bqN());
            }
        }
        return true;
    }

    private static boolean eJ(int n, int n2) {
        ArrayList<adj_0> arrayList = aie_0.cfn().bmC().aD(n, n2);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (adj_0 adj_02 : arrayList) {
            if (!(adj_02 instanceof bdj_2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(bgy bgy2, bwt_0 bwt_02) {
        ewh_2 ewh_22 = this.b(bgy2, bwt_02.dMW());
        int n = ewh_22.fNK();
        int n2 = ewh_22.fNL() + this.a(bwt_02);
        int n3 = this.b(bwt_02);
        return n <= bgy2.c((pt_0)exx_2.rGj) && n2 <= bgy2.c((pt_0)exx_2.rGk) && n3 <= bgy2.c((pt_0)exx_2.rGl);
    }

    public void eSG() {
        if (!this.cHn || !this.nNd) {
            return;
        }
        if (cub_1.eSi().eSo()) {
            if (!cub_1.eSi().eSr()) {
                this.eSJ();
            } else {
                this.eSI();
            }
        }
    }

    private static bgy eSH() {
        bgy bgy2 = null;
        try {
            bgy2 = cub_1.eSi().cXk().dGQ().dIA();
            if (!bgy2.dkQ()) {
                nNa.warn((Object)"WORLD_SCENE_MOUSE_RELEASED demand\u00e9 pour un fighter qui n'est pas \u00e0 soi");
            }
        }
        catch (NullPointerException nullPointerException) {
            nNa.error((Object)"WORLD_SCENE_MOUSE_RELEASED dans une frame de combat, sans combat ou combattant");
        }
        return bgy2;
    }

    private void a(bgy bgy2, anp_2 anp_22) {
        cky cky2 = new cky();
        cky2.d(anp_22);
        cky2.eY(bgy2.Sn());
        aue_0.cVJ().etu().d(cky2);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        this.Na = true;
        this.nNd = true;
        this.clear();
        aue_0.cVJ().cVK().ddI().a(this.nNh);
        cub_1.eSi().eSr();
        this.eSJ();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        this.Na = false;
        this.clear();
        aue_0.cVJ().cVK().ddI().c(this.nNh);
    }

    public void eSI() {
        this.nNc.bqC();
        this.nNg = null;
    }

    private void clear() {
        this.nNe = 0;
        this.nNf = -1;
        cub_1.eSi().eSs();
        this.eSI();
    }

    public void eK(int n, int n2) {
    }

    public void eSJ() {
        bsj_0 bsj_02 = cub_1.eSi().cXk();
        if (bsj_02 == null) {
            this.eSI();
            return;
        }
        bua bua2 = bsj_02.dGQ();
        if (bua2 == null) {
            this.eSI();
            return;
        }
        bgy bgy2 = bua2.dIA();
        if (bgy2 == null) {
            this.eSI();
            return;
        }
        if (!bgy2.dkQ()) {
            this.eSI();
            nNa.warn((Object)"refreshPath demand\u00e9 pour un fighter qui n'est pas \u00e0 soi");
            return;
        }
        if (cub_1.eSi().eSj() == null || bgy2.a(exe_1.rDe) || bgy2.a(exe_1.rEJ)) {
            this.eSI();
            return;
        }
        int n = bgy2.c((pt_0)exx_2.rGk);
        if (bgy2.a(exe_1.rDK)) {
            n *= 2;
        }
        if (bgy2.a(exe_1.rDJ)) {
            n /= 2;
        }
        if (this.nNf != n) {
            this.nNf = n;
            this.nNe = 0;
        } else {
            n -= this.nNe;
        }
        if (n <= 0 && !this.cb(bgy2)) {
            this.eSI();
            fib_2.gBU().eKH();
            return;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        bwt_0 bwt_02 = bgy2.dls().a(bgy2, bdj_22, n);
        ewh_2 ewh_22 = this.b(bgy2, bwt_02.dMW());
        if (bwt_02.bDU() <= 0 || n <= 0 && !bwt_02.dMY()) {
            this.eSI();
            fib_2.gBU().eKH();
            return;
        }
        this.nNc.b(bwt_02.dMW());
        int n2 = bgy2.c((pt_0)exx_2.rGj);
        if (ewh_22.fNL() + this.a(bwt_02) > n || n2 < ewh_22.fNK() || bgy2.c((pt_0)exx_2.rGl) < this.b(bwt_02)) {
            this.nNc.setColor(aid_0.dUQ);
        } else {
            this.nNc.setColor(aid_0.dUP);
        }
        this.nNg = bwt_02;
        String string = this.eNA();
        if (string != null) {
            if (fib_2.gBU().bjv()) {
                fib_2.gBU().a(null, string, 30, 0, faa_2.tLN);
            } else {
                fib_2.gBU().setText(string);
            }
        } else {
            fib_2.gBU().eKH();
        }
    }

    private boolean cb(bgy bgy2) {
        if (bgy2.doV() != eym.pia) {
            return false;
        }
        if (bgy2.c((pt_0)exx_2.rGl) <= 0) {
            return false;
        }
        return bwn_0.b(bgy2, bgy2.aZw());
    }

    private ewh_2 b(bgy bgy2, anp_2 anp_22) {
        List<ewh_2> list = ewg_2.a(anp_22, bgy2);
        return this.ax(list);
    }

    private ewh_2 ax(List<ewh_2> list) {
        ewh_2 ewh_22 = new ewh_2();
        for (ewh_2 ewh_23 : list) {
            ewh_22.SG(ewh_22.fNK() + ewh_23.fNK());
            ewh_22.SH(ewh_22.fNL() + ewh_23.fNL());
        }
        return ewh_22;
    }

    private String eNA() {
        return this.eSK();
    }

    private int a(bwt_0 bwt_02) {
        int n = bwt_02.bDU();
        bgy bgy2 = cue_2.eSH();
        if (bgy2 == null) {
            return n;
        }
        if (bwt_02.dMX()) {
            if (bgy2.i(exe_1.rES)) {
                return 1;
            }
            return (n + 3 - 1) / 3;
        }
        if (bwt_02.dMY()) {
            return 0;
        }
        return n;
    }

    private int b(bwt_0 bwt_02) {
        return bwt_02.dMY() ? bwt_02.bDU() : 0;
    }

    @Nullable
    private String eSK() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return null;
        }
        bgy bgy2 = bsj_02.dGQ().dIA();
        if (bgy2 == null || bgy2.a(exe_1.rEq)) {
            return null;
        }
        return this.cc(bgy2);
    }

    private String cc(bgy bgy2) {
        boolean bl;
        ewh_2 ewh_22 = this.b(bgy2, this.nNg.dMW());
        int n = ewh_22.fNK();
        int n2 = ewh_22.fNL();
        if (n2 == 0 && n == 0) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2().ceu();
        if (n != 0) {
            bl = bgy2.c((pt_0)exx_2.rGj) < n;
            ahv_22.ceC();
            if (bl) {
                ahv_22.ih(awx_2.dnJ.bQk());
            }
            ahv_22.c(aum_0.cWf().c("tackle.apLoss", n)).ceD();
        }
        if (n2 != 0) {
            if (n != 0) {
                ahv_22.ceH();
            }
            bl = bgy2.c((pt_0)exx_2.rGk) < n2 + this.a(this.nNg);
            ahv_22.ceC();
            if (bl) {
                ahv_22.ih(awx_2.dnJ.bQk());
            }
            ahv_22.c(aum_0.cWf().c("tackle.mpLoss", n2 + this.a(this.nNg))).ceD();
        }
        ahv_22.cev();
        String string = ahv_22.ceL();
        if (string.isEmpty()) {
            return null;
        }
        return string;
    }
}

