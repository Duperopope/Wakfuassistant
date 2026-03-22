/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bNx
 */
public class bnx_1
implements aeh_2 {
    protected static final Logger kCy = Logger.getLogger(bnx_1.class);
    public static final String kCz = "animName";
    public static final String kCA = "actorDescriptorLibrary";
    public static final String kCB = "equipmentBonuses";
    public static final String kCC = "actorAnimationName";
    public static final String kCD = "headEquipment";
    public static final String kCE = "hairEquipment";
    public static final String kCF = "faceEquipment";
    public static final String kCG = "shoulderEquipment";
    public static final String kCH = "neckEquipment";
    public static final String kCI = "chestEquipment";
    public static final String kCJ = "armsEquipment";
    public static final String kCK = "leftHandEquipment";
    public static final String kCL = "rightHandEquipment";
    public static final String kCM = "beltEquipment";
    public static final String kCN = "skirtEquipment";
    public static final String kCO = "trousersEquipment";
    public static final String kCP = "legsEquipment";
    public static final String kCQ = "petEquipment";
    public static final String kCR = "mountEquipment";
    public static final String kCS = "backEquipment";
    public static final String kCT = "wingEquipment";
    public static final String kCU = "firstWeaponEquipment";
    public static final String kCV = "secondWeaponEquipment";
    public static final String kCW = "accessoryEquipment";
    protected final Map<Byte, ffV> kCX = new HashMap<Byte, ffV>();
    protected bdj_2 kCY;
    private final Map<Byte, Anm> kCZ = new HashMap<Byte, Anm>(bdl_1.values().length);
    protected bhJ kDa;
    protected List<ffS> kDb;
    private String kDc = null;
    protected static final String[] kDd = new String[]{"actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "actorDescriptorLibrary", "equipmentBonuses"};

    public bnx_1() {
    }

    public bnx_1(bgt_0 bgt_02) {
        this.a(bgt_02, bgt_02.dmL(), new ffS[0]);
    }

    public bnx_1(bgt_0 bgt_02, fhk fhk2) {
        this.a(bgt_02, fhk2, new ffS[0]);
    }

    @Override
    public String[] bxk() {
        return kDd;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kCz)) {
            return null;
        }
        if (string.equals(kCA)) {
            return this.kCY;
        }
        ffS ffS2 = ffS.sgQ;
        if (string.equals(kCC)) {
            if (!BH.aU(this.kDc)) {
                return this.kDc;
            }
            ffV ffV2 = this.kCX.get(ffS2.shb);
            if (ffV2 != null && !this.kDb.contains(ffS2)) {
                return "AnimStatique03-Boucle-" + btq_1.d(ffV2.fWi());
            }
            return "AnimStatique";
        }
        if (string.equals(kCD)) {
            return this.kCX.get(ffS.sgB.shb);
        }
        if (string.equals(kCE)) {
            return this.kCX.get(ffS.sgC.shb);
        }
        if (string.equals(kCF)) {
            return this.kCX.get(ffS.sgD.shb);
        }
        if (string.equals(kCG)) {
            return this.kCX.get(ffS.sgE.shb);
        }
        if (string.equals(kCH)) {
            return this.kCX.get(ffS.sgF.shb);
        }
        if (string.equals(kCI)) {
            return this.kCX.get(ffS.sgG.shb);
        }
        if (string.equals(kCJ)) {
            return this.kCX.get(ffS.sgH.shb);
        }
        if (string.equals(kCK)) {
            return this.kCX.get(ffS.sgI.shb);
        }
        if (string.equals(kCL)) {
            return this.kCX.get(ffS.sgJ.shb);
        }
        if (string.equals(kCM)) {
            return this.kCX.get(ffS.sgL.shb);
        }
        if (string.equals(kCN)) {
            return this.kCX.get(ffS.sgK.shb);
        }
        if (string.equals(kCO)) {
            return this.kCX.get(ffS.sgM.shb);
        }
        if (string.equals(kCP)) {
            return this.kCX.get(ffS.sgN.shb);
        }
        if (string.equals(kCS)) {
            return this.kCX.get(ffS.sgO.shb);
        }
        if (string.equals(kCT)) {
            return this.kCX.get(ffS.sgP.shb);
        }
        if (string.equals(kCU)) {
            return this.kCX.get(ffS2.shb);
        }
        if (string.equals(kCV)) {
            return this.kCX.get(ffS.sgR.shb);
        }
        if (string.equals(kCW)) {
            return this.kCX.get(ffS.sgS.shb);
        }
        if (string.equals(kCQ)) {
            return this.kCX.get(ffS.sgX.shb);
        }
        if (string.equals(kCR)) {
            return this.kCX.get(ffS.sgZ.shb);
        }
        if (string.equals(kCB)) {
            ArrayList<ffV> arrayList = new ArrayList<ffV>(this.kCX.values());
            return bhJ.a(this.kDa, arrayList);
        }
        return null;
    }

    public void c(ffV ffV2, byte by) {
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        ffS ffS2 = ffS.gj(by);
        if (ffS2 == null || !fhy_02.v(ffS2)) {
            return;
        }
        this.a(ffV2, by, ffS2);
        cAY.eHc().l(ffS2);
    }

    protected void a(ffV ffV2, byte by, ffS ffS2) {
        this.d(ffV2, by);
        this.i(ffS2);
    }

    public void d(ffV ffV2, byte by) {
        if (this.kDb != null && this.kDb.contains(ffS.gj(by))) {
            return;
        }
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        if (this.kCX.get(by) != null) {
            this.cB(by);
        }
        this.kCX.put(by, ffV2);
        this.f(ffV2, by);
        this.a(ffV2, fhy_02);
    }

    protected void a(ffV ffV2, fhy_0 fhy_02) {
        for (ffS ffS2 : fhy_02.fZs()) {
            this.kCX.put(ffS2.aJr(), ffV2.fVR());
        }
    }

    public void cy(byte by) {
        bdl_1 bdl_12 = bdl_1.bi(by);
        if (bdl_12 == null) {
            return;
        }
        this.cA(by);
        if (ffS.sgB.shb == by && this.duZ() != 0 && this.dva()) {
            return;
        }
        Optional<ffV> optional = this.cz(by).map(this::f);
        optional.filter(ffV2 -> ffV2.fWi().cpY()).ifPresent(ffV2 -> this.d((ffV)ffV2, by));
    }

    public void e(@NotNull ffV ffV2, byte by) {
        bdl_1 bdl_12 = bdl_1.bi(by);
        if (bdl_12 == null) {
            return;
        }
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        if (fhy_02 == null) {
            return;
        }
        this.cA(by);
        if (ffS.sgB.shb == by && this.duZ() != 0 && this.dva()) {
            return;
        }
        if (!fhy_02.cpY()) {
            return;
        }
        ffV ffV3 = this.cz(by).map(this::f).orElse(ffV2);
        this.d(ffV3, by);
    }

    private void f(ffV ffV2, byte by) {
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        this.cA(by);
        if (ffS.sgB.shb == by && this.duZ() != 0 && this.dva()) {
            return;
        }
        if (!fhy_02.cpY()) {
            return;
        }
        bdl_1 bdl_12 = bdl_1.bi(by);
        if (bdl_12 == null) {
            return;
        }
        int n = bjf_1.f(ffV2);
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        int n2 = this.v(bgv_22);
        this.a(by, n2, bdl_12);
    }

    private void a(byte by, int n, bdl_1 bdl_12) {
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = ZC.dR(String.format(string, n));
            this.kCY.a(anm, bdl_12.hKP);
            this.kCZ.put(by, anm);
        }
        catch (Exception exception) {
            kCy.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    private Optional<fb_2> cz(byte by) {
        ffS ffS2 = ffS.gj(by);
        Optional<fm_1> optional = ekj_0.r(ffS2);
        return optional.map(fm_12 -> ekj_0.b(this.kDa.aZj(), this.kDa.Sn(), (fm_1)((Object)((Object)optional.get()))));
    }

    protected int duZ() {
        return this.kDa.doZ();
    }

    protected boolean dva() {
        return !this.kDa.doJ();
    }

    private ffV f(fb_2 fb_22) {
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(fb_22.AK());
        if (bgv_22 == null) {
            return null;
        }
        return ffV.k(bgv_22);
    }

    private int v(bgv_2 bgv_22) {
        return this.kDa.aWO() == 0 ? bgv_22.aVt() : bgv_22.cpf();
    }

    private void cA(byte by) {
        bdl_1 bdl_12;
        Anm anm = this.kCZ.remove(by);
        if (anm != null && (bdl_12 = bdl_1.bi(by)) != null) {
            this.kCY.b(anm, bdl_12.hKP);
        }
    }

    public void cB(byte by) {
        ffS ffS2 = ffS.gj(by);
        if (ffS2 == null) {
            return;
        }
        ffV ffV2 = this.kCX.get(by);
        if (ffV2 == null) {
            return;
        }
        this.a(by, ffS2, ffV2);
    }

    protected void a(byte by, ffS ffS2, ffV ffV2) {
        if (ffS2 == ffS.sgS) {
            this.a(ffV2.dOg(), false);
        }
        this.kCX.remove(by);
        this.b(ffS2, ffV2);
        this.i(ffS2);
    }

    protected void b(ffS ffS2, ffV ffV2) {
        for (ffS ffS3 : ffV2.dOg().dGh().fZs()) {
            if (ffS3 == ffS2) {
                for (ffS ffS4 : ffV2.dOg().dGh().fZq()) {
                    ffV ffV3 = this.kCX.get(ffS4.aJr());
                    if (ffV3 == null || ffV3.avr() != ffV2.avr()) continue;
                    this.kCX.remove(ffS4.aJr());
                }
                continue;
            }
            this.kCX.remove(ffS3.aJr());
        }
    }

    public void deS() {
        this.kCY.dcL();
        this.kCY.bqd().bHB();
        this.kCY.lf(Integer.toString(this.kDa.aVt()));
        bgy bgy2 = this.kCY.dcP();
        if (bgy2 instanceof bhJ) {
            ((bhJ)bgy2).gg(!this.dva());
        }
        this.dkx();
        for (ffS ffS2 : ffS.values()) {
            byte by;
            ffV ffV2;
            if (this.kDb.contains(ffS2) || (ffV2 = this.kCX.get(by = ffS2.aJr())) == null) continue;
            this.f(ffV2, by);
        }
        this.dvb();
        fse_1.gFu().a((aef_2)this, kDd);
    }

    public void i(ffS ffS2) {
        byte by = ffS2.aJr();
        this.cA(by);
        this.dkx();
        ffV ffV2 = this.kCX.get(by);
        if (ffV2 != null) {
            this.f(ffV2, by);
            this.dvb();
        }
        fse_1.gFu().a((aef_2)this, kDd);
    }

    public void nb(String string) {
        this.kDc = string;
    }

    private void dkx() {
        String string = this.kDa.dly();
        String string2 = this.kDa.dlx();
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = auc_0.cVq().bS("ANMEquipmentPath");
            }
            catch (fu_0 fu_02) {
                kCy.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)fu_02);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.kCY.b(string3, ary_2.fT("VETEMENTCUSTOM"));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.kCY.b(string3, ary_2.fT("CHEVEUXCUSTOM"));
            }
        }
    }

    public ffV cw(byte by) {
        return this.kCX.get(by);
    }

    protected void dvb() {
        byte by = ffS.sgS.aJr();
        ffV ffV2 = this.cw(by);
        if (ffV2 != null) {
            this.a(ffV2.dOg(), true);
        }
    }

    public boolean a(fhc_0 fhc_02, boolean bl) {
        azl_2<enk_0> azl_22 = fhc_02.bcx();
        for (enk_0 enk_02 : azl_22) {
            if (enk_02.avZ() != enf_0.qUR.d()) continue;
            int n = enk_02.a(0, (short)0, ene_0.qPu);
            fqU fqU2 = fqX.gjM().Zr(n);
            if (fqU2 == null) continue;
            this.a(fqU2, bl);
        }
        return false;
    }

    private void a(fqU fqU2, boolean bl) {
        ArrayList<enk_0> arrayList = fqU2.fB((short)0);
        for (enk_0 enk_02 : arrayList) {
            byte by = this.kDa.aWO();
            ang_2 ang_22 = enk_02.fAx();
            if (ang_22 != null && !ang_22.b(this.kDa, this.kDa, this.kDa, null)) continue;
            ang_2 ang_23 = this.d(ang_22);
            if (ang_23 == null) {
                this.a(enk_02, bl);
                continue;
            }
            if (!(ang_23 instanceof egu_0) || ((egu_0)ang_23).aWO() != by) continue;
            this.a(enk_02, bl);
        }
    }

    private ang_2 d(ang_2 ang_22) {
        ang_2 ang_23;
        amx_2 amx_22;
        if (ang_22 == null) {
            return null;
        }
        if (ang_22 instanceof egu_0) {
            return ang_22;
        }
        if (ang_22 instanceof amw_1) {
            amx_22 = (amw_1)ang_22;
            ang_23 = this.d(((amw_1)amx_22).bDt());
            if (ang_23 != null) {
                return ang_23;
            }
            ang_23 = this.d(((amw_1)amx_22).bDu());
            if (ang_23 != null) {
                return ang_23;
            }
        }
        if (ang_22 instanceof amv_1) {
            amx_22 = (amv_1)ang_22;
            ang_23 = this.d(((amv_1)amx_22).bDt());
            if (ang_23 != null) {
                return ang_23;
            }
            ang_23 = this.d(((amv_1)amx_22).bDu());
            if (ang_23 != null) {
                return ang_23;
            }
        }
        return null;
    }

    public void a(enk_0 enk_02, boolean bl) {
        List<Pf> list = enk_02.fAC();
        if (list == null) {
            return;
        }
        for (Pf pf : list) {
            if (bl) {
                this.c(enk_02, pf);
                continue;
            }
            this.d(enk_02, pf);
        }
    }

    private boolean c(enk_0 enk_02, Pf pf) {
        if (pf.aXu() == ph_0.bcW) {
            Pu pu = (Pu)pf;
            bdz_1 bdz_12 = new bdz_1(enk_02, pu.aXP(), pu.aXY(), pu.aXX());
            bdz_12.a(this.kCY, false);
            return true;
        }
        if (pf.aXu() == ph_0.bda) {
            pf_0 pf_02 = (pf_0)pf;
            bef_2 bef_22 = new bef_2(enk_02, pf_02.aYk(), pf_02.aYl());
            bef_22.p(this.kCY);
            return true;
        }
        if (pf.aXu() == ph_0.bdi) {
            Pv pv = (Pv)pf;
            bee_1 bee_12 = new bee_1(enk_02, pv.aXZ(), pv.aXY(), pv.aJe());
            bee_12.a((ZH)this.kCY, false);
            return true;
        }
        if (pf.aXu() == ph_0.bdj) {
            pl_0 pl_02 = (pl_0)pf;
            this.nb(pl_02.aXM());
            return true;
        }
        return pf.aXu() == ph_0.bcS;
    }

    private boolean d(enk_0 enk_02, Pf pf) {
        if (pf.aXu() == ph_0.bda) {
            pf_0 pf_02 = (pf_0)pf;
            bef_2 bef_22 = new bef_2(enk_02, !pf_02.aYk(), pf_02.aYl());
            bef_22.p(this.kCY);
            return true;
        }
        if (pf.aXu() == ph_0.bdj) {
            this.nb("AnimStatique");
            return true;
        }
        return false;
    }

    public bhJ egd() {
        return this.kDa;
    }

    public void a(bhJ bhJ2, fhk fhk2, ffS ... ffSArray) {
        this.kDb = Arrays.asList(ffSArray);
        this.kCX.clear();
        this.kDa = bhJ2;
        bhJ bhJ3 = new bhJ();
        bhJ3.fR(false);
        this.kCY = new bdj_2(bhJ3);
        this.kCY.a((ZC)this.kDa.ddI());
        aJq.a((ZC)this.kCY, this.kDa.HP(), "blason", null);
        Map<ffS, Long> map = fhk2.fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            if (this.kDb.contains(entry.getKey())) continue;
            Optional<ffV> optional = fht.a(bhJ2, fhk2, entry.getKey());
            optional.ifPresent(ffV2 -> this.d((ffV)ffV2, ((ffS)entry.getKey()).aJr()));
        }
        this.deS();
    }

    public ZC getAnimatedElement() {
        return this.kCY;
    }

    public void ac(List<ffS> list) {
        this.kDb = list;
    }
}

