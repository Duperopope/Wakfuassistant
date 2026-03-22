/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashSet;
import java.util.Optional;

public class bfP {
    private int hWK;
    private bfT hWL;
    private ewc_0 hWM;
    private static final String hWN = "challengeProposal";
    private static final String hWO = "challengeVarUpdated";
    private static final String hWP = "challengeVarUpdateNegate";
    private static final String hWQ = "challengeWin";
    private static final String hWR = "challengeFailed";
    private static final int hWS = 600;
    private static final bfP hWT = new bfP();

    public void Ch(int n) {
        this.hWK = n;
    }

    public void a(bfT bfT2) {
        this.hWL = bfT2;
        this.dhV();
    }

    public void a(ewc_0 ewc_02) {
        this.hWM = ewc_02;
    }

    public void a(ewc_0 ewc_02, int n) {
        this.hWM = ewc_02;
        bfR.hWV.g(n, false);
    }

    public ewc_0 dhP() {
        return this.hWM;
    }

    public int dhQ() {
        return this.hWK;
    }

    public bfT dhR() {
        return this.hWL;
    }

    public Optional<bfT> dhS() {
        return Optional.ofNullable(this.hWL);
    }

    public static bfP dhT() {
        return hWT;
    }

    public void dhU() {
        if (this.hWL != null) {
            bgd.diV().Cv(this.hWL.d());
            this.hWL = null;
            bci_2.hDG.Bf(-1);
        }
        this.dhZ();
        fse_1.gFu().f("waitingForInputChallenge", (Object)null);
    }

    private void lA(String string) {
        this.g(awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false));
    }

    private void g(awk_1 awk_12) {
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(awk_12, 32, 32, (xu_0)xp_02, 2000);
        xo_02.a(bdj_22);
        HashSet<xa_0> hashSet = xd_0.bnv().b(bdj_22);
        xo_02.qC(Math.max(1, hashSet != null ? hashSet.size() * 600 : 0));
        xd_0.bnv().a(xo_02);
    }

    public void a(int n, long l, ux_0 ux_02, TIntArrayList tIntArrayList, int n2) {
        if (n == -1) {
            this.jn(l);
        } else {
            this.b(n, l, ux_02, tIntArrayList, n2);
        }
    }

    private void b(int n, long l, ux_0 ux_02, TIntArrayList tIntArrayList, int n2) {
        bge.hZk.diW();
        bfR.hWV.g(l, false);
        this.hWL = bgd.diV().b(n, ux_02);
        this.hWL.a(tIntArrayList);
        this.hWL.fG(false);
        this.hWL.az(true);
        this.hWL.fH(true);
        cAY.eHc().nP(600127L);
        this.hWL.Ck(n2);
        this.hWL.E(ux_02);
        bge.hZk.diX();
        bfP.dhW();
        this.dhV();
        this.cAN();
    }

    private void jn(long l) {
        bfR.hWV.g(l, this.hWL == null);
        bfR.hWV.cAN();
        bge.hZk.diW();
        this.dhV();
        this.cAN();
    }

    public void dhV() {
        int n = this.dib() ? (this.hWL != null ? this.hWL.d() : -1) : -1;
        bci_2.hDG.Bf(n);
    }

    private static void dhW() {
        String string;
        String string2 = string = fyw_0.gqw().to("sundialDialog") ? "sundialDialog" : null;
        if (string == null) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        fes_2 fes_22 = (fes_2)fhs_22.uH("environmentRenderable.environmentQuestContainer");
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile("6001051.xps");
        fka_12.setAlignment(faa_2.tLO);
        fes_22.getAppearance().d(fka_12);
    }

    public void cAN() {
        switch (this.hWM) {
            case oIg: 
            case oIh: {
                bfM bfM2 = this.hWL != null ? bgk.hZN.Cx(this.hWL.d()) : null;
                fse_1.gFu().f("displayedAchievement", bfM2);
                break;
            }
            case oIj: 
            case oIi: {
                fse_1.gFu().f("displayedAchievement", (Object)null);
            }
        }
    }

    public void dhX() {
        switch (this.hWM) {
            case oIg: {
                break;
            }
            case oIh: {
                if (this.hWL == null) break;
                this.hWL.fG(false);
                this.hWL.az(true);
                break;
            }
            case oIj: 
            case oIi: {
                if (this.hWL != null && !this.hWL.aGv() && this.hWL.dil()) {
                    this.Ci(this.hWL.d());
                }
                this.dhU();
                bfR.hWV.dic();
            }
        }
    }

    public void Ci(int n) {
        if (this.hWL != null && this.hWL.d() == n) {
            boolean bl;
            fse_1.gFu().f("challengeDetailsVisible", false);
            this.hWL.fJ(true);
            this.hWL.fH(false);
            this.hWL.az(false);
            this.hWL.N(null);
            boolean bl2 = bl = !this.hWL.aGd();
            if (bl && this.dib()) {
                aPd.f("chat.challenge.failed", this.hWL.bAD());
                this.lA(auc_0.cVq().a("challengeFlyingImagePath", "defaultIconPath", hWR));
            }
            this.dhY();
        }
        this.dhZ();
    }

    public void dhY() {
        if (this.hWL != null) {
            bgd.diV().Cv(this.hWL.d());
            this.hWL = null;
            this.cAN();
            bci_2.hDG.Bf(-1);
        }
    }

    public short dhG() {
        if (this.hWL != null) {
            return this.hWL.dhG();
        }
        return -1;
    }

    public void dhZ() {
    }

    public void dia() {
        if (this.dib()) {
            this.lA(auc_0.cVq().a("challengeFlyingImagePath", "defaultIconPath", hWQ));
            bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
            bdj_22.a(abi_1.dzm);
            bdj_22.dT("AnimEmote-Victoire");
        }
    }

    public void fF(boolean bl) {
        if (this.dib()) {
            String string = bl ? hWO : hWP;
            this.lA(auc_0.cVq().a("challengeFlyingImagePath", "defaultIconPath", string));
        }
    }

    public boolean dib() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ang_2 ang_22 = this.hWL != null ? this.hWL.dig().diJ() : null;
        boolean bl = ang_22 == null || ang_22.b(bgt_02, bgt_02, null, null);
        return bl && !bgt_02.ffF().gaW();
    }
}

