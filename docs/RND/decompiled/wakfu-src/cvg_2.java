/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cVg
 */
public class cvg_2
extends adj_1 {
    protected static final Logger nOM = Logger.getLogger(cvg_2.class);
    private static final cvg_2 nON = new cvg_2();
    private alx_2 ikv;
    private final List<biy_1> nOO = new ArrayList<biy_1>();

    public static cvg_2 eTB() {
        return nON;
    }

    private cvg_2() {
        super(new czh_1(), new czi_1(), new czj_1(), new czk_2(), new czl_1(), new czt_1(), new czm_1(), new czn_1(), new czo_1(), new czp_1(), new czq_1(), new czr_1(), new czs_1(), new czu_1(), new czv_1(), new czw_1(), new czg_1());
    }

    private void eTC() {
        fyw_0.gqw().d("wakfu.guildManagement", cew_2.class);
        fyw_0.gqw().d("wakfu.guildImprovement", ceu_2.class);
        fyw_0.gqw().d("wakfu.guildHavenWorld", cet_2.class);
    }

    private void eTD() {
        fyw_0.gqw().tc("wakfu.guildManagement");
        fyw_0.gqw().tc("wakfu.guildImprovement");
        fyw_0.gqw().tc("wakfu.guildHavenWorld");
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private fgo_2 getTableModel() {
        fgo_2 fgo_22 = new fgo_2();
        fgo_22.a("rank", new fgq_2(new cvh_2(this)));
        fgo_22.a("name", new fgq_2(new cvi_1(this)));
        fgo_22.a("level", new fgq_2(new cvj_1(this)));
        fgo_22.a("guildPoints", new fgq_2(new cvk_2(this)));
        return fgo_22;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            Object object;
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (!bgt_02.dpO()) {
                return;
            }
            bRb.kYS.mb(bgt_02.Ya());
            this.ikv = new cvl_1(this);
            boolean bl2 = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljy);
            bvk.dJZ().hd(bl2);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("guildManagementDialog", 32768L);
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("guildManagementDialog");
            if (fhs_22 != null) {
                object = this.getTableModel();
                fdq_1 fdq_12 = (fdq_1)fhs_22.uH("guildTable");
                if (fdq_12 != null) {
                    fdq_12.setTableModel((fgo_2)object);
                }
            }
            bvk.dJZ().dKb();
            this.eTC();
            fse_1.gFu().f("rankModificationDirty", false);
            fse_1.gFu().f("draggedGuildRank", (Object)null);
            fse_1.gFu().b("currentPage", 0, "guildManagementDialog");
            fse_1.gFu().f("guild", bvk.dJZ());
            object = new ckq_0();
            aue_0.cVJ().etu().d(object);
            cAY.eHc().nP(600012L);
            bqm_0.jbp.b(new brt_0());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("guildManagementDialog");
            this.eTD();
            fse_1.gFu().vX("guild");
            cAY.eHc().nP(600013L);
        }
    }

    public void h(biy_1 biy_12) {
        this.nOO.add(biy_12);
    }

    public void i(biy_1 biy_12) {
        this.nOO.remove(biy_12);
    }

    public void eTE() {
        for (int i = this.nOO.size() - 1; i >= 0; --i) {
            cwy_2.nUc.j(this.nOO.get(i));
        }
        this.nOO.clear();
    }
}

