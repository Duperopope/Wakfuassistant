/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;

/*
 * Renamed from cVo
 */
public class cvo_1
implements adi_1 {
    private static final cvo_1 nOT = new cvo_1();
    private alx_2 ikv;
    private bah_2 nOU;
    private bvy_0 nOV;
    private long nOW;
    private static final int nOX = 3000;
    private final Runnable nOY = () -> {
        if (this.nOV == null) {
            aue_0.cVJ().etu().d(new cxc_0());
        } else {
            String string = this.nOV.dLf();
            int n = this.nOV.dfz();
            boolean bl = this.nOV.dLh();
            boolean bl2 = this.nOV.dLj();
            aue_0.cVJ().etu().d(new cxc_0(string, n, bl, bl2));
        }
    };

    private cvo_1() {
    }

    public static cvo_1 eTI() {
        return nOT;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17167: {
                dbD dbD2 = (dbD)aam_22;
                bvx_0 bvx_02 = dbD2.faQ();
                this.nOW = bvx_02.Ya();
                fse_1.gFu().f("basicHavenWorld", new bQH(bvx_02.getName(), bvx_02.Ya(), bvx_02.dLc(), bvx_02.bVe(), bvx_02.dLd()));
                fse_1.gFu().b("selectedHavenWorld", bvx_02, "havenWorldEntranceDialog");
                return false;
            }
            case 19538: {
                bvx_0 bvx_03 = (bvx_0)fse_1.gFu().aW("selectedHavenWorld", "havenWorldEntranceDialog");
                if (bvx_03 == null) {
                    return false;
                }
                if (this.nOU == null) {
                    return false;
                }
                if (!bvx_03.bVe()) {
                    return false;
                }
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                boolean bl = evm_2.b(bgt_02.dpL().cWq(), evn_2.ovs);
                if (bvx_03.dLd() && bvx_03.Ya() != bgt_02.Ya() && !bl) {
                    return false;
                }
                ckx_0 ckx_02 = new ckx_0(bvx_03.Ya(), this.nOU.Sn());
                aue_0.cVJ().etu().d(ckx_02);
                aue_0.cVJ().b(this);
                return false;
            }
            case 18069: {
                bvx_0 bvx_04 = (bvx_0)fse_1.gFu().aW("selectedHavenWorld", "havenWorldEntranceDialog");
                if (bvx_04 == null) {
                    return false;
                }
                if (this.nOU == null) {
                    return false;
                }
                clc clc2 = new clc(bvx_04.Ya());
                aue_0.cVJ().etu().d(clc2);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02.dnZ().aJG()) {
                aue_0.cVJ().b(this);
                return;
            }
            this.ikv = string -> {
                if (string.equals("havenWorldEntranceDialog")) {
                    aue_0.cVJ().b(nOT);
                }
            };
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("havenWorldEntranceDialog", 32768L);
            fyw_0.gqw().d("wakfu.havenWorldEntrance", cey_1.class);
            cAY.eHc().nP(600012L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("havenWorldEntranceDialog");
            fyw_0.gqw().tc("wakfu.havenWorldEntrance");
            fse_1.gFu().vX("basicHavenWorld");
            fse_1.gFu().vX("havenWorldViewList");
            fse_1.gFu().vX("selectedHavenWorld");
            this.nOU = null;
            this.nOV = null;
            cAY.eHc().nP(600013L);
            abg_2.bUP().h(this.nOY);
        }
    }

    public void a(bah_2 bah_22) {
        this.nOU = bah_22;
        this.nOV = new bvy_0();
        aue_0.cVJ().a(this);
        aue_0.cVJ().etu().d(new cxc_0());
        abg_2.bUP().a(this.nOY, 3000L, -1);
    }

    public void az(List<faa_0> list) {
        if (this.nOV == null) {
            return;
        }
        List<bvx_0> list2 = list.stream().map(bvx_0::new).toList();
        this.nOV.R(list2);
        fse_1.gFu().f("havenWorldViewList", this.nOV);
        Optional<bvx_0> optional = list2.stream().filter(bvx_02 -> bvx_02.Ya() == this.nOW).findFirst();
        if (optional.isPresent()) {
            bvx_0 bvx_03 = optional.get();
            fse_1.gFu().b("selectedHavenWorld", bvx_03, "havenWorldEntranceDialog");
            fse_1.gFu().f("basicHavenWorld", new bQH(bvx_03.getName(), bvx_03.Ya(), bvx_03.dLc(), bvx_03.bVe(), bvx_03.dLd()));
            return;
        }
        bvx_0 bvx_04 = this.nOV.dLe();
        if (bvx_04 != null) {
            fse_1.gFu().b("selectedHavenWorld", bvx_04, "havenWorldEntranceDialog");
            fse_1.gFu().f("basicHavenWorld", new bQH(bvx_04.getName(), bvx_04.Ya(), bvx_04.dLc(), bvx_04.bVe(), bvx_04.dLd()));
        } else {
            fse_1.gFu().b("selectedHavenWorld", (Object)null, "havenWorldEntranceDialog");
            fse_1.gFu().f("basicHavenWorld", (Object)null);
        }
    }

    public void Ne(int n) {
        if (this.nOV == null) {
            return;
        }
        this.nOV.FS(n);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

