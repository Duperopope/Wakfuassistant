/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongIterator;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bDw {
    private static final Logger jKj = Logger.getLogger(bDw.class);
    private final fdf_0 jKk;
    private final bgt_0 jKl;

    public bDw(fdf_0 fdf_02, bgt_0 bgt_02) {
        this.jKk = fdf_02;
        this.jKl = bgt_02;
    }

    @NotNull
    public <T extends crq_1> T a(@NotNull T t, fqy_0 fqy_02, fdg_0 fdg_02) {
        t.CV(fqy_02.giv());
        t.qb("desc.mru." + fqy_02.giw());
        t.pY(this.h(fdg_02));
        t.jU(this.b(fdg_02));
        t.bl(this.a(fdg_02));
        t.pZ(this.f(fdg_02));
        t.cM(fdg_02.bdL());
        t.k(fdg_02);
        return t;
    }

    public boolean a(fdg_0 fdg_02) {
        return this.d(fdg_02) || this.e(fdg_02) || !this.c(fdg_02);
    }

    public boolean a(RG rG) {
        fdg_0 fdg_02 = this.jKk.u(rG, rG, this, ((exP)((Object)rG)).bdV());
        if (fdg_02 == null) {
            return false;
        }
        if (fcL.rUh.sA(this.jKl.Xi()) <= 1) {
            return true;
        }
        if (!exc.oTS.contains(fdg_02.bdL()) && !exc.oTT.contains(fdg_02.bdL())) {
            return true;
        }
        aPd.e("error.heroCantAccessToThisWorld", new Object[0]);
        return false;
    }

    public boolean b(fdg_0 fdg_02) {
        if (this.jKk == null) {
            return false;
        }
        fdW fdW2 = new fdW(this.jKl, this.jKk, fdg_02);
        return fdW2.fUm() && fdW2.fUn();
    }

    private boolean c(fdg_0 fdg_02) {
        fia_0 fia_02 = this.jKl.dmD();
        fif_0 fif_02 = fia_02.VQ(fdg_02.cyj());
        if (fif_02 == null) {
            return true;
        }
        int n = fif_02.fZN();
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 == null) {
            return true;
        }
        bDx bDx2 = new bDx(eIb2.aVf());
        fcL.rUh.b(this.jKl.Xi(), bDx2);
        return bDx2.isValid();
    }

    private boolean d(fdg_0 fdg_02) {
        if (this.jKk == null || fdg_02 == null) {
            return true;
        }
        if (fdg_02.cyj() < 0) {
            return false;
        }
        return this.jKl.dmD().Qh(fdg_02.cyj());
    }

    private boolean e(fdg_0 fdg_02) {
        if (this.jKk == null) {
            return false;
        }
        bgt_0 bgt_02 = this.jKl;
        return !fdg_02.bdo().b(bgt_02, null, null, bgt_02.bdV());
    }

    private String f(fdg_0 fdg_02) {
        return this.a(fdg_02.bdo(), fdg_02);
    }

    private String a(ang_2 ang_22, fdg_0 fdg_02) {
        String string;
        String string2 = this.g(fdg_02);
        String string3 = this.f(ang_22);
        boolean bl = true;
        ahv_2 ahv_22 = new ahv_2();
        if (string2 != null && !string2.isEmpty()) {
            ahv_22.c(string2);
            bl = false;
        }
        if (string3 != null && !string3.isEmpty()) {
            if (!bl) {
                ahv_22.ceH();
            }
            ahv_22.c(string3);
        }
        return (string = ahv_22.toString()).isEmpty() ? null : string;
    }

    private String g(fdg_0 fdg_02) {
        if (this.jKk == null || fdg_02 == null) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        if (fdg_02.cyj() > 0) {
            String string = this.j(fdg_02);
            String string2 = boe.a(this.jKl, fdg_02.cyj());
            ahv_22.c(string);
            if (!string2.isEmpty()) {
                ahv_22.ceH().ceu().ih(awx_2.dnJ.bQk()).c(string2).cev();
            }
        } else {
            Optional<bxa_0> optional = bwz_0.jAA.FZ(this.jKk.d());
            if (optional.isEmpty()) {
                return null;
            }
            ahv_22.c(aum_0.cWf().a(89, (long)this.jKk.d(), new Object[0])).c(" (");
            int n = optional.get().rI();
            bDx bDx2 = new bDx(n);
            fcL.rUh.b(this.jKl.Xi(), bDx2);
            boolean bl = bDx2.isValid();
            ahv_22.ceC().ih((bl ? awx_2.dnL : awx_2.dnJ).bQk());
            ahv_22.c(aum_0.cWf().c("required.level.custom", n));
            ahv_22.ceD().c(")\n");
            ahv_22.c(aum_0.cWf().c("infinite.waves.player.limit", new Object[0]));
        }
        return ahv_22.ceL();
    }

    private String f(ang_2 ang_22) {
        if (this.jKk == null) {
            return null;
        }
        if (ang_22.b(this.jKl, null, null, this.jKl.bdV())) {
            return null;
        }
        eLR eLR2 = new eLR(this.jKl, null, null, this.jKl.bdV());
        String string = eLP.a((amx_1)ang_22, eLR2);
        if (string.isEmpty()) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceC().e(awx_2.dnJ);
        ahv_22.c(string);
        return ahv_22.ceL();
    }

    private String h(fdg_0 fdg_02) {
        if (this.jKk == null) {
            return null;
        }
        int n = fcL.rUh.sA(this.jKl.Xi());
        int n2 = fdg_02.fTM() * n;
        int n3 = fdg_02.fTK();
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n3);
        ahv_2 ahv_22 = new ahv_2();
        if (bgv_22 != null && n3 > 0) {
            boolean bl = !this.b(n3, fdg_02);
            ahv_22.ceC().ih((bl ? awx_2.dnJ : awx_2.dnL).bQk());
            ahv_22.c("[").c(bgv_22.getName()).c("]").c(" x").aN(this.i(fdg_02));
            ahv_22.ceD();
        }
        if (n2 > 0) {
            if (bgv_22 != null && n3 > 0) {
                ahv_22.ceH();
            }
            ahv_22.ceC().ih((this.kX(n2) ? awx_2.dnL : awx_2.dnJ).bQk());
            ahv_22.c(aum_0.cWf().c("kama.shortGain", n2)).ceD();
        }
        return ahv_22.ceL();
    }

    private boolean kX(long l) {
        fgj_0 fgj_02 = this.jKl.cWp();
        if (fgj_02 == null) {
            return false;
        }
        return fgj_02.exS() >= l;
    }

    private boolean b(int n, fdg_0 fdg_02) {
        int n2 = this.i(fdg_02);
        int n3 = fea_0.ah(this.jKl.aZj(), n);
        if (n3 >= n2) {
            return true;
        }
        boolean bl = true;
        TLongIterator tLongIterator = fcL.rUh.sx(this.jKl.aZj()).iterator();
        while (tLongIterator.hasNext()) {
            bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(tLongIterator.next());
            if (n == 0) continue;
            int n4 = bgt_02.dno().UN(n);
            fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
            ffm ffm2 = fec_02.UB(n);
            if (ffm2 == null) {
                n2 -= n4;
                bl = false;
                continue;
            }
            short s = ffm2.bfd();
            if (s >= fdg_02.fTL()) continue;
            bl = false;
        }
        return n2 <= 0 || bl;
    }

    private short i(fdg_0 fdg_02) {
        int n = fdg_02.fTK();
        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n);
        if (bgv_22 == null) {
            return fdg_02.fTL();
        }
        if (bgv_22.c(fgg_0.sit)) {
            return fdg_02.fTL();
        }
        boolean bl = bgv_22.c(fgg_0.sia);
        if (this.dQR() || bl) {
            int n2 = fcL.rUh.sA(this.jKl.Xi());
            return (short)(fdg_02.fTL() * n2);
        }
        return fdg_02.fTL();
    }

    private boolean dQR() {
        short[] sArray = this.jKk.fTH();
        boolean bl = false;
        for (int i = 0; i < sArray.length; ++i) {
            short s = sArray[i];
            bzq_2 bzq_22 = bzp_2.eqt().mA(s);
            if (bzq_22 == null) continue;
            bl |= bzq_22.eqx();
        }
        return bl;
    }

    private String j(fdg_0 fdg_02) {
        if (fdg_02 == null) {
            return aum_0.cWf().a(89, (long)this.jKk.d(), new Object[0]);
        }
        fia_0 fia_02 = this.jKl.dmD();
        fif_0 fif_02 = fia_02.VQ(fdg_02.cyj());
        if (fif_02 == null) {
            return aum_0.cWf().a(89, (long)this.jKk.d(), new Object[0]);
        }
        int n = fif_02.fZN();
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 == null) {
            return aum_0.cWf().a(89, (long)this.jKk.d(), new Object[0]);
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().a(137, (long)n, new Object[0])).c(" (");
        boolean bl = this.c(fdg_02);
        ahv_22.ceC().ih((bl ? awx_2.dnL : awx_2.dnJ).bQk());
        if (fdg_02.fTQ()) {
            short s = eIi.dB(eIb2.aVf());
            ahv_22.c(aum_0.cWf().c("downscale.mru.modifiedLevelForDungeon", s));
            try {
                ahv_22.a(auk_0.zU(116), 10, 9, null, null);
            }
            catch (fu_0 fu_02) {
                jKj.error((Object)"Exception raised", (Throwable)fu_02);
            }
        } else {
            ahv_22.c(aum_0.cWf().c("required.level.custom", eIb2.aVf()));
        }
        ahv_22.ceD().k(')');
        return ahv_22.ceL();
    }
}

