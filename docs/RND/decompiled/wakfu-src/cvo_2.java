/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cVO
 */
public class cvo_2
extends cts_1
implements adi_1,
fsk_1 {
    private static final cvo_2 nQC = new cvo_2();
    public static final int nQD = 330;
    public static final int nQE = 616;
    public static final int nQF = 280;
    public static final String nQG = "equipInventWindow";
    private fii_1 nQH;
    protected static final Logger nQI = Logger.getLogger(cvo_2.class);
    private final alx_2 nQJ = new cvp_1(this);
    private long aDh;
    private final List<String> nQK = new ArrayList<String>();
    @NotNull
    private final bgi_1 nQL = new bgi_1(new bdl_0());
    private final Map<Long, bgx_1> nQM = new HashMap<Long, bgx_1>();
    private final Map<Long, cvt_1> nQN = new HashMap<Long, cvt_1>();
    private fka_1 nQO;
    private final crl_2 nQP = new crl_2();
    @Nullable
    private bga_2 nQQ;
    private boolean nQR = false;
    private boolean nQS = false;
    private static final int nQT = 40;

    public static cvo_2 eUK() {
        return nQC;
    }

    @Override
    public void eX(String string) {
        if (string != null && !string.equals("inventoryDialog")) {
            fyw_0.gqw().tl("inventoryDialog");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public String ePj() {
        return "inventoryDialog";
    }

    public static void ky(boolean bl) {
        fse_1.gFu().f("equipment.inventory.enableMove", bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19148: {
                aef_2 aef_22;
                dae_0 dae_02 = (dae_0)aam_22;
                if (this.aDh == dae_02.bCp()) {
                    return false;
                }
                long l = aue_0.cVJ().cVO().xl();
                long l2 = fcK.rUe.sq(l);
                if (bsl_0.jfZ.dFt() != null) {
                    this.aDh = l2 > 0L ? l2 : 0L;
                    aef_22 = bwa_0.jwi.aj((bhJ)fcL.rUh.sw(l2));
                    fse_1.gFu().b("characterSheet", aef_22, "inventoryDialog");
                } else {
                    this.aDh = dae_02.bCp();
                }
                aef_22 = (bgt_0)fcL.rUh.sw(this.aDh);
                if (aef_22 == null) {
                    nQI.error((Object)("On essaye d'afficher l'inventaire d'un personnage qu'on ne connait pas : characterId = " + this.aDh));
                    return false;
                }
                this.an((bgt_0)aef_22);
                return false;
            }
            case 19261: {
                ang_2 ang_22;
                dbl_0 dbl_02 = (dbl_0)aam_22;
                bgt_0 bgt_02 = (bgt_0)fcI.ab(bbs_2.xl(), dbl_02.getSourceUniqueId());
                bgt_0 bgt_03 = (bgt_0)fcL.rUh.sw(dbl_02.getDestinationCharacter().dcP().Sn());
                if (bgt_02 == null || bgt_03 == null) {
                    return false;
                }
                if (fug_0.fP(bgt_02.fhv())) {
                    return false;
                }
                if (fug_0.fP(bgt_03.fhv())) {
                    return false;
                }
                if (bgt_02.Sn() != bgt_03.Sn() && !cvu_1.b(bgt_02, dbl_02.getItem())) {
                    aPd.e("item.error.badBind", new Object[0]);
                }
                bdl_0 bdl_02 = bgt_03.dno();
                ffs_0 ffs_02 = bgt_02.dno().sY(dbl_02.getSourceUniqueId());
                ffV ffV3 = dbl_02.getItem();
                byte by = bdl_02.hB(ffn_0.sgo.UV(ffV3.avr()));
                if (by == -1) {
                    aPd.e("error.bagContainerFull", new Object[0]);
                    return false;
                }
                if (!ffs_0.d(ffV3, bgt_02)) {
                    aPd.e("item.error.impossibilityToEquip", new Object[0]);
                    return false;
                }
                if (bgt_02.Sn() != bgt_03.Sn() && (ang_22 = ffV3.dOg().a(ffj_0.sgg)) != null && !ang_22.b(bgt_02, fcI.sk(bgt_02.Xi()), ffV3, bgt_02.fgg())) {
                    aPd.e("item.error.badBind", new Object[0]);
                    return false;
                }
                if (ffs_02 != null) {
                    byte by2 = dbl_02.getDestinationPosition() == -1 ? by : (byte)dbl_02.getDestinationPosition();
                    cli_0 cli_02 = new cli_0();
                    cli_02.nk(ffV3.LV());
                    cli_02.nn(ffs_02.Lx());
                    cli_02.ni(bgt_03.Sn());
                    cli_02.dr(by2);
                    aue_0.cVJ().etu().d(cli_02);
                } else {
                    nQI.warn((Object)("On ne trouve pas la source de l'item que le joueur veut ajouter. Id de la source transmis : " + dbl_02.getSourceUniqueId()));
                }
                return false;
            }
            case 19851: {
                Object object;
                Bu<ffs_0, Short> bu;
                short s;
                long l;
                dbl_0 dbl_03 = (dbl_0)aam_22;
                long l3 = dbl_03.getSourceUniqueId();
                bgt_0 bgt_04 = (bgt_0)fcI.ab(aue_0.cVJ().cVK().Xi(), l3);
                if (bgt_04 == null) {
                    return false;
                }
                if (fug_0.fP(bgt_04.fhv())) {
                    return false;
                }
                bdl_0 bdl_03 = bgt_04.dno();
                ffs_0 ffs_03 = bdl_03.sY(l3);
                if (!ffs_03.aJG()) {
                    aPd.e("error.bagNotEmpty", new Object[0]);
                    return false;
                }
                Object r = fgD.fXh().Vd(ffs_03.avr());
                ffV ffV4 = ffV.a(ffs_03.Lx(), r);
                if (ffV4 == null) {
                    return false;
                }
                ffV4.ak((short)1);
                if (dbl_03.getDestinationUniqueId() != -1L) {
                    l = dbl_03.getDestinationUniqueId();
                    s = dbl_03.getDestinationPosition();
                } else {
                    bu = bdl_03.e(ffV4, l3);
                    if (bu == null) {
                        return false;
                    }
                    l = bu.getFirst().Lx();
                    s = bu.aHI();
                }
                if (l == ffs_03.Lx()) {
                    aPd.e("error.sameBag", new Object[0]);
                    return false;
                }
                bu = fcI.ap(bgt_04.Xi(), l);
                bgt_0 bgt_05 = (bgt_0)fcI.ab(bgt_04.Xi(), l);
                if (bu == null || bgt_05 == null) {
                    return false;
                }
                if (bgt_04.Sn() != bgt_05.Sn() && !cvu_1.b(bgt_04, dbl_03.getItem())) {
                    aPd.e("item.error.badBind", new Object[0]);
                }
                if (bgt_04.Sn() != bgt_05.Sn() && (object = ((fhc_0)r).a(ffj_0.sgg)) != null && !((ang_2)object).b(bgt_04, fcI.sk(bgt_04.Xi()), r, bgt_04.fgg())) {
                    aPd.e("item.error.badBind", new Object[0]);
                    return false;
                }
                try {
                    if (!((ffs_0)((Object)bu)).bq(ffV4)) {
                        boolean bl = false;
                        return bl;
                    }
                }
                catch (Exception exception) {
                    boolean bl = false;
                    return bl;
                }
                finally {
                    ffV4.aZp();
                }
                object = new clu_0();
                ((cll_0)object).nk(l);
                ((cll_0)object).nm(ffs_03.Lx());
                ((cll_0)object).nn(l3);
                ((cll_0)object).nl(l);
                ((clu_0)object).dr((byte)s);
                aue_0.cVJ().etu().d(object);
                cvo_2.oA(ffs_03.Lx());
                return false;
            }
            case 18684: {
                bgt_0 bgt_06 = aue_0.cVJ().cVK();
                if (bgt_06 == null) {
                    return false;
                }
                if (fug_0.fP(bgt_06.fhv())) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                clj clj2 = new clj();
                clj2.dr(dae_03.bCn());
                clj2.nj(dae_03.bCp());
                aue_0.cVJ().etu().d(clj2);
                return false;
            }
            case 19173: {
                dbl_0 dbl_04 = (dbl_0)aam_22;
                cly_0 cly_02 = new cly_0();
                bgt_0 bgt_07 = aue_0.cVJ().cVK();
                if (bgt_07 == null) {
                    return false;
                }
                if (fug_0.fP(bgt_07.fhv())) {
                    return false;
                }
                long l = dbl_04.getDestinationCharacter().Sn();
                ffs_0 ffs_04 = ((exP)fcL.rUh.sw(l)).dod().gh((byte)dbl_04.getDestinationPosition());
                cly_02.nq(dbl_04.getItem().LV());
                cly_02.du((byte)dbl_04.getDestinationPosition());
                cly_02.np(ffs_04.Lx());
                aue_0.cVJ().etu().d(cly_02);
                return false;
            }
            case 18087: {
                dae_0 dae_04 = (dae_0)aam_22;
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                aue_0.cVJ().cVK().dno().dRv();
                fyw_0.gqw().tl(dae_04.bCt());
                return false;
            }
            case 17177: {
                dae_0 dae_05 = (dae_0)aam_22;
                fhw_0 fhw_02 = (fhw_0)((Object)dae_05.bCv());
                long l = dae_05.bCp();
                byte by = dae_05.bCn();
                bgt_0 bgt_08 = (bgt_0)fcL.rUh.sw(l);
                if (bgt_08 == null || bgt_08.djU()) {
                    return false;
                }
                clm_0 clm_02 = new clm_0(fhw_02, l, by);
                aue_0.cVJ().etu().d(clm_02);
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkV, fhw_02.aJr());
                return false;
            }
            case 19519: {
                dbF dbF2 = (dbF)aam_22;
                bgi_1 bgi_12 = dbF2.faS();
                if (bgi_12 != null) {
                    bgi_12.a(dbF2.fay());
                }
                return false;
            }
            case 18566: {
                bgi_1 bgi_13 = (bgi_1)((dae_0)aam_22).bCv();
                bgi_13.dTK();
                return false;
            }
            case 19859: {
                this.a(new bgi_2());
                return false;
            }
            case 17752: {
                bgx_1 bgx_12 = (bgx_1)((dae_0)aam_22).bCv();
                bgt_0 bgt_09 = bgx_12.dUF();
                if (bgt_09 == null) {
                    return false;
                }
                if (bgt_09.djT()) {
                    return false;
                }
                List<ffV> list = fhB.c(bgx_12.dUG(), bgt_09);
                bdu_0 bdu_02 = bdr_0.b(bgt_09, list);
                if (list.isEmpty()) {
                    byj_1.epo().a(byc_1.b(byh_1.lAA, aum_0.cWf().c("inventory.recycle.none.selection", new Object[0])));
                } else {
                    bdr_0.a(bdu_02, () -> {
                        ciY ciY2 = new ciY(bdu_02.dRE());
                        aue_0.cVJ().etu().d(ciY2);
                    });
                }
                return false;
            }
            case 16503: {
                this.a(new bgk_2(((dae_0)aam_22).bCp()));
                return false;
            }
            case 16793: {
                dbq_0 dbq_02 = (dbq_0)aam_22;
                long l = dbq_02.eAV();
                bgt_0 bgt_010 = dbq_02.fbb();
                if (bgt_010 == null) {
                    return false;
                }
                if (bgt_010.djU()) {
                    return false;
                }
                List<ffV> list = dbq_02.fba().stream().filter(ffV2 -> cvu_1.b(bgt_010, ffV2)).toList();
                bgt_0 bgt_011 = (bgt_0)fcL.rUh.sw(l);
                List<ffV> list2 = fgt.a(bgt_011.dno(), list);
                if (list2.isEmpty()) {
                    String string = list.isEmpty() ? aum_0.cWf().c("inventory.move.selection.none", new Object[0]) : aum_0.cWf().c("inventory.transfer.destination.full", bgt_011.getName());
                    byj_1.epo().a(byc_1.c(byh_1.lAA, string));
                    return false;
                }
                if (list2.size() < list.size()) {
                    byj_1.epo().a(byc_1.b(byh_1.lAA, aum_0.cWf().c("inventory.not.enough.room.in.destination", bgt_011.getName())));
                }
                fyd_0.closePopup(null);
                cls_0 cls_02 = new cls_0(bgt_010.Sn(), l, list2.stream().map(ffV::LV).toList());
                aue_0.cVJ().etu().d(cls_02);
                return false;
            }
            case 16830: {
                dbr_0 dbr_02 = (dbr_0)aam_22;
                bgt_0 bgt_012 = dbr_02.fbc();
                bgt_0 bgt_013 = dbr_02.fbd();
                if (bgt_012.djU() || bgt_013.djU()) {
                    return false;
                }
                if (fug_0.fP(bgt_012.fhv())) {
                    return false;
                }
                if (fug_0.fP(bgt_013.fhv())) {
                    return false;
                }
                List<ffV> list = bgt_012.dno().dRy().stream().filter(ffV2 -> cvu_1.b(bgt_012, ffV2)).filter(ffV2 -> ffV2.fWi().fZt()).filter(ffV2 -> !ffV2.fWi().fZr() || !ffV2.dXg()).toList();
                List<ffV> list3 = fgt.a(bgt_013.dno(), list);
                if (list3.isEmpty()) {
                    return false;
                }
                cls_0 cls_03 = new cls_0(bgt_012.Sn(), bgt_013.Sn(), list3.stream().map(ffV::LV).toList());
                aue_0.cVJ().etu().d(cls_03);
                return false;
            }
            case 16449: {
                this.a(new bgg_2());
                return false;
            }
            case 17140: {
                bgx_1 bgx_13 = (bgx_1)((dae_0)aam_22).bCv();
                bgt_0 bgt_014 = bgx_13.dUF();
                if (bgt_014 == null) {
                    return false;
                }
                if (bgt_014.djT()) {
                    return false;
                }
                List<@NotNull ffV> list = bgx_13.hF(true);
                if (list.isEmpty()) {
                    return false;
                }
                boolean bl = list.stream().allMatch(bdq_0.dRC()::ab);
                bdq_0.dRC().a(list, !bl);
                clq_0 clq_02 = new clq_0(bgt_014.Sn(), !bl);
                clq_02.at(list.stream().map(ffV::LV).toList());
                aue_0.cVJ().etu().d(clq_02);
                for (ffV ffV5 : list) {
                    fse_1.gFu().a((aef_2)ffV5, "isLocked");
                }
                return false;
            }
            case 16006: {
                Object object;
                List<ffV> list;
                boolean bl;
                dbn_0 dbn_02 = (dbn_0)aam_22;
                bgx_1 bgx_14 = dbn_02.faX();
                bgt_0 bgt_015 = dbn_02.faY();
                bde_0 bde_02 = dbn_02.faZ();
                bgt_0 bgt_016 = bgx_14.dUF();
                if (bgt_016 == null) {
                    return false;
                }
                if (fug_0.fP(bgt_016.fhv()) || fug_0.fP(bgt_015.fhv())) {
                    return false;
                }
                boolean bl2 = bl = bgt_016.Sn() == bgt_015.Sn();
                if (bl && bde_02 == null) {
                    return false;
                }
                List<ffV> list4 = bgx_14.dUG().stream().filter(ffV2 -> {
                    if (bl) {
                        return !bde_02.dM(ffV2.LV());
                    }
                    return cvu_1.b(bgt_016, ffV2);
                }).toList();
                if (bl && list4.isEmpty()) {
                    return false;
                }
                List<ffV> list5 = list = bl ? fgt.a(bde_02, list4) : fgt.a(bgt_015.dno(), list4);
                if (list.isEmpty()) {
                    String string = list4.isEmpty() ? aum_0.cWf().c("inventory.move.selection.none", new Object[0]) : aum_0.cWf().c("inventory.move.selection.full", new Object[0]);
                    byj_1.epo().a(byc_1.c(byh_1.lAA, string));
                    return false;
                }
                if (list.size() < list4.size()) {
                    object = aum_0.cWf().c("inventory.move.selection.not.enough.room", new Object[0]);
                    byj_1.epo().a(byc_1.b(byh_1.lAA, (String)object));
                }
                fyd_0.closePopup(null);
                object = new cls_0(bgt_016.Sn(), bgt_015.Sn(), list.stream().map(ffV::LV).toList(), bde_02 != null ? Long.valueOf(bde_02.Lx()) : null);
                aue_0.cVJ().etu().d(object);
                return false;
            }
            case 19522: {
                boolean bl = this.nQR = !this.nQR;
                if (fyw_0.gqw().to("pvpInventoryDialog")) {
                    fyw_0.gqw().tl("pvpInventoryDialog");
                } else {
                    ccj_2.g("pvpInventoryDialog", 32768L);
                    fse_1.gFu().b("pvpInventoryView", bgt_2.jWG, "pvpInventoryDialog");
                }
                return false;
            }
            case 16914: {
                dbl_0 dbl_05 = (dbl_0)aam_22;
                this.b(dbl_05);
                return false;
            }
            case 18415: {
                if (this.nQS) {
                    return false;
                }
                bgt_0 bgt_017 = aue_0.cVJ().cVK();
                if (bgt_017 == null) {
                    return false;
                }
                if (fug_0.fQ(bgt_017.fhv())) {
                    return false;
                }
                this.nQS = true;
                aue_0.cVJ().etu().d(new clL());
                return false;
            }
        }
        return super.b(aam_22);
    }

    private void b(dbl_0 dbl_02) {
        if (this.nQS) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (fug_0.fP(bgt_02.fhv())) {
            return;
        }
        if (!(dbl_02.getItem() instanceof bgs_2)) {
            return;
        }
        bgs_2 bgs_22 = (bgs_2)dbl_02.getItem();
        if (!bgt_2.jWG.g(bgs_22.avr(), bgs_22.bfd())) {
            return;
        }
        Optional<bgt_0> optional = dbl_02.faW();
        if (optional.isEmpty()) {
            return;
        }
        optional.get().dno().a(dbl_02).ifPresentOrElse(bdg_02 -> {
            this.nQS = true;
            cln_0 cln_02 = new cln_0(bgs_22.avr(), dbl_02.bfd(), ((bgt_0)optional.get()).Sn());
            cln_02.nr(bdg_02.dRh().Lx());
            cln_02.setDestinationPosition(bdg_02.dRi());
            aue_0.cVJ().etu().d(cln_02);
        }, () -> {
            String string = aum_0.cWf().c("error.flea.buy.inventoryfull", new Object[0]);
            byj_1.epo().a(byc_1.c(byh_1.lAA, string));
        });
    }

    public void kz(boolean bl) {
        this.nQS = bl;
    }

    @Nullable
    public bga_2 eUL() {
        return this.nQQ;
    }

    public void a(bga_2 bga_22) {
        if (this.nQQ != null && this.nQQ.dUf() == bga_22.dUf()) {
            this.eUM();
        } else {
            this.b(bga_22);
        }
    }

    private void b(bga_2 bga_22) {
        if (this.nQQ != null) {
            this.nQQ.dTY();
        }
        bga_22.q(() -> {
            this.nQQ = null;
        });
        this.nQQ = bga_22;
        this.nQQ.dTX();
    }

    public void eUM() {
        if (this.nQQ != null) {
            this.nQQ.dTY();
            this.nQQ = null;
        }
    }

    public void j(String string, @Nullable Object object) {
        fse_1.gFu().b(string, object, "inventoryDialog");
        this.nQK.forEach(string2 -> fse_1.gFu().b(string, object, (String)string2));
    }

    public void an(bgt_0 bgt_02) {
        this.aDh = bgt_02.Sn();
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog");
        fse_1.gFu().a("characterSheet", (Object)bgl_02, fhs_22);
        fse_1.gFu().a("localPlayer", (Object)bgt_02, fhs_22);
        fse_1.gFu().a("previewDialogActor", null, fhs_22);
        this.ao(bgt_02);
        this.nQL.a(bgt_02.dno());
        if (!this.nQM.containsKey(bgt_02.Sn())) {
            this.nQM.put(bgt_02.Sn(), new bgx_1(this.nQL));
        }
        fse_1.gFu().a("bagSearchView", (Object)this.nQL, fhs_22);
        fse_1.gFu().a("inventorySelectionView", (Object)this.nQM.get(bgt_02.Sn()), fhs_22);
    }

    public static void oA(long l) {
        bgt_0 bgt_02 = cvo_2.daL();
        bdl_0 bdl_02 = bgt_02.dno();
        bdl_02.dRv();
        bgt_02.dlH();
    }

    public boolean bVe() {
        return aue_0.cVJ().c(this);
    }

    public void eUN() {
        if (!this.bVe()) {
            aue_0.cVJ().a(this);
        }
    }

    @Override
    public String o(bgl_0 bgl_02) {
        if (!fyw_0.gqw().to("inventoryDialog")) {
            bon.dAK().a(bor.iPd, "inventoryDialog");
        }
        String string = super.o(bgl_02);
        cvo_2.qL(string);
        return string;
    }

    public static void qL(String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        fcq_2 fcq_22 = (fcq_2)fhs_22.uH("inventoriesScrollContainer");
        fcq_22.setAutoScrollVertical(true);
        fcq_22.setDndListenerContentValidator(new cvq_2());
        fse_1.gFu().a("editableBag", null, fhs_22);
    }

    @Override
    public String a(bgl_0 bgl_02, String string, int n, int n2) {
        String string2 = super.a(bgl_02, string, n, n2);
        if (string2 == null) {
            return null;
        }
        if (!bgl_02.aXd()) {
            cvo_2.qL(string2);
        }
        fse_1.gFu().b("itemLevelController", (Object)null, string2);
        fse_1.gFu().b("equipment.showBags", false, string2);
        fse_1.gFu().b("equipment.closeButton.xOffset", 330, string2);
        bqm_0.jbp.b(new bri_0());
        cvo_2.qN(string2);
        return string2;
    }

    public void b(bgl_0 bgl_02, String string, String string2, int n, int n2, fey_2 fey_22) {
        String string3 = super.a(bgl_02, string, string2, n, n2, fey_22);
        if (string3 == null) {
            fyw_0.gqw().tl(string + bgl_02.dcP().Sn());
            return;
        }
        this.nQK.add(string3);
        cvo_2.qL(string3);
        if (!fyw_0.gqw().tb("wakfu.inventory")) {
            fyw_0.gqw().d("wakfu.inventory", cfe_1.class);
        }
        bgt_0 bgt_02 = (bgt_0)bgl_02.dcP();
        fse_1.gFu().b("itemLevelController", (Object)null, string3);
        fse_1.gFu().b("localPlayer", bgt_02, string3);
        fse_1.gFu().b("equipment.showBags", true, string3);
        fse_1.gFu().b("equipment.closeButton.xOffset", 280, string3);
        cvt_1 cvt_12 = cvt_1.ap(bgt_02);
        this.nQN.put(bgt_02.Sn(), cvt_12);
        fse_1.gFu().b("bagSearchView", cvt_12.nQZ, string3);
        fse_1.gFu().b("inventorySelectionView", cvt_12.nRa, string3);
    }

    void qM(String string) {
        this.nQK.remove(string);
        this.nIW.remove(string);
        try {
            long l = Long.parseLong(string.substring("inventoryOnlyDialog".length()));
            this.nQN.remove(l);
            fse_1.gFu().b("bagSearchView", (Object)null, string);
            fse_1.gFu().b("inventorySelectionView", (Object)null, string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    @Override
    public String a(bgl_0 bgl_02, String string, String string2, int n, int n2, fey_2 fey_22) {
        String string3 = super.a(bgl_02, string, string2, n, n2, fey_22);
        this.nQK.add(string3);
        if (string3 == null) {
            return null;
        }
        if (!bgl_02.aXd()) {
            cvo_2.qL(string3);
        }
        if (!fyw_0.gqw().tb("wakfu.inventory")) {
            fyw_0.gqw().d("wakfu.inventory", cfe_1.class);
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string3);
        fey_2 fey_23 = (fey_2)fhs_22.uH(string2);
        fey_23.a(new cvr_2(this, fey_23, n, n2));
        fse_1.gFu().b("itemLevelController", (Object)null, string3);
        fse_1.gFu().b("localPlayer", fcL.rUh.sw(bgl_02.dcP().Sn()), string3);
        fse_1.gFu().b("equipment.showBags", true, string3);
        fse_1.gFu().b("equipment.closeButton.xOffset", 280, string3);
        return string3;
    }

    public void eUO() {
        for (String string : this.nQK) {
            fyw_0.gqw().tl(string);
        }
    }

    private static void eUP() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("worldAndFightBarDialog");
        if (fhs_22 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH("inventoryButton");
        if (fes_22 == null) {
            return;
        }
        fes_22.getAppearance().x(fsa_2.class);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = this.nIZ != null ? this.nIZ : aue_0.cVJ().cVK();
        super.a(aye_22, bl);
        cvo_2.eUP();
        this.aDh = bgt_02.Sn();
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        fse_1.gFu().b("characterSheet", bgl_02, this.ePj());
        fse_1.gFu().b("localPlayer", bgt_02, "inventoryDialog");
        fse_1.gFu().b("equipment.showBags", true, "inventoryDialog");
        fse_1.gFu().b("equipment.closeButton.xOffset", 616, "inventoryDialog");
        this.j("recycleInventory", false);
        fse_1.gFu().f("inventoryCurrentMode", (Object)null);
        fse_1.gFu().a((aef_2)bgt_02, "formatedKamas");
        this.nQH = cfe_1::onDropItem;
        fil_1.gBx().a(this.nQH);
        bdl_0 bdl_02 = bgt_02.dno();
        bdl_02.dRv();
        this.nQL.a(bgt_02.dno());
        bgx_1 bgx_12 = new bgx_1(this.nQL);
        this.nQM.put(bgt_02.Sn(), bgx_12);
        fse_1.gFu().b("bagSearchView", this.nQL, "inventoryDialog");
        fse_1.gFu().b("inventorySelectionView", bgx_12, "inventoryDialog");
        if (!fyw_0.gqw().tb("wakfu.inventory")) {
            fyw_0.gqw().d("wakfu.inventory", cfe_1.class);
        }
        aie_0.cfn().bmE().a(bed_0.jMi, true);
        cAY.eHc().nP(600026L);
        fyw_0.gqw().a(this.nQJ);
        this.eUS();
        cfe_1.addListener(this.nQP);
        this.nQS = false;
        fse_1.gFu().f("cosmeticPreviewType", bjf_1.f(fm_1.pw));
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.eUO();
        this.eUS();
        fse_1.gFu().b("pet", (Object)null, "inventoryDialog");
        if (!aue_0.cVJ().c(ctg_1.eQG())) {
            fyw_0.gqw().tc("wakfu.inventory");
        }
        aie_0.cfn().bmE().a(bed_0.jMi);
        fil_1.gBx().b(this.nQH);
        this.nQH = null;
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 != null) {
            this.aDh = 0L;
        }
        this.eUM();
        cAY.eHc().nP(600027L);
        fyw_0.gqw().b(this.nQJ);
        cfe_1.removeListener(this.nQP);
        this.nQR = false;
        this.nQL.a(new bdl_0());
        this.nQM.clear();
        this.nQN.clear();
        super.b(aye_22, false);
    }

    void bB(fey_2 fey_22) {
        fey_22.a(new cvs_2(this, fey_22));
    }

    private void ao(bgt_0 bgt_02) {
        for (String string : this.nIW) {
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
            for (String string2 : bgt_0.ieL) {
                fse_1.gFu().b("characterSheet", string2, fhs_22);
            }
            fse_1.gFu().a((aef_2)fcL.rUh.sw(this.aDh), bgt_0.ieL);
            fse_1.gFu().a((aef_2)bgt_02, "formatedKamas");
        }
    }

    public void eUQ() {
        TLongObjectIterator tLongObjectIterator = nIU.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (String string : this.nIW) {
                Object object;
                fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
                bgl_0 bgl_02 = (bgl_0)tLongObjectIterator.value();
                for (String string2 : bgt_0.ieL) {
                    fse_1.gFu().b("characterSheet", string2, fhs_22);
                }
                if (bgl_02.aXd()) {
                    if (bgl_02.dme().ai(ffS.sgQ.shb) != null) {
                        if (fhs_22 == null) continue;
                        if (fhs_22.uK("localPlayerDisplay") && bgl_02.dcP().Sn() == this.aDh) {
                            object = (fax_1)fhs_22.uH("localPlayerDisplay");
                            ((fax_1)object).setDirection(abi_1.dzm.wp());
                        }
                    }
                } else if (bgl_02.dcP().dmL().t(ffS.sgQ) != null) {
                    if (fhs_22 == null) continue;
                    if (fhs_22.uK("localPlayerDisplay") && bgl_02.dcP().Sn() == this.aDh) {
                        object = (fax_1)fhs_22.uH("localPlayerDisplay");
                        ((fax_1)object).setDirection(abi_1.dzm.wp());
                    }
                }
                object = aue_0.cVJ().cVK();
                fse_1.gFu().a((aef_2)object, bgt_0.ieL);
            }
        }
    }

    public long KU() {
        return this.aDh == 0L ? aue_0.cVJ().cVK().Sn() : this.aDh;
    }

    public static bgt_0 daL() {
        return cvo_2.nQC.aDh == 0L ? aue_0.cVJ().cVK() : (bgt_0)fcL.rUh.sw(cvo_2.nQC.aDh);
    }

    public void oB(long l) {
        if (this.nQK.contains("inventoryOnlyDialog" + l)) {
            fyw_0.gqw().tl("inventoryOnlyDialog" + l);
        }
        this.nQM.remove(l);
        this.nQN.remove(l);
        if (this.aDh != l) {
            return;
        }
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null || bgt_02.Sn() == this.aDh) {
            return;
        }
        this.aDh = bgt_02.Sn();
        this.an(bgt_02);
        bgl_0 bgl_02 = bwa_0.jwi.aj(bgt_02);
        fse_1.gFu().b("characterSheet", bgl_02, "inventoryDialog");
    }

    private static void qN(String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        faw_2 faw_22 = (faw_2)fhs_22.uH("containerBottom");
        fzv fzv2 = (fzv)fhs_22.uH("margin");
        Insets insets = new Insets(0, 0, 0, 0);
        faw_2 faw_23 = fzv2.getParentOfType(faw_2.class);
        faw_23.getAppearance().setMargin(insets);
        faw_23.getContainer().getLayoutManager().a(faw_23);
        faw_22.gsm();
    }

    private static void eUR() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog");
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH("textEditor");
        fdu_1 fdu_13 = (fdu_1)fhs_22.uH("minLevel");
        fdu_1 fdu_14 = (fdu_1)fhs_22.uH("maxLevel");
        fdu_12.setText("");
        fdu_13.setText("");
        fdu_14.setText("");
    }

    private void eUS() {
        if (this.nQO != null) {
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("inventoryDialog");
            fad_1 fad_12 = (fad_1)fhs_22.uH("validateButton");
            if (fad_12 != null) {
                fad_12.getAppearance().c(this.nQO);
            }
            this.nQO = null;
        }
    }

    public void u(long l, boolean bl) {
        cvt_1 cvt_12;
        this.nQL.hE(bl);
        bgx_1 bgx_12 = this.nQM.get(l);
        if (bgx_12 != null) {
            bgx_12.dUC();
        }
        if ((cvt_12 = this.nQN.get(l)) != null) {
            cvt_12.nQZ.hE(bl);
            cvt_12.nRa.dUC();
        }
    }

    public void oC(long l) {
        this.nQL.dTL();
        cvt_1 cvt_12 = this.nQN.get(l);
        if (cvt_12 != null) {
            cvt_12.nQZ.dTL();
        }
    }
}

