/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteObjectIterator
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bNy
 */
public class bny_1
implements aeh_2 {
    protected static final Logger kDe = Logger.getLogger(bny_1.class);
    public static final String kDf = "actorDescriptorLibrary";
    public static final String kDg = "actorAnimationName";
    public static final String kDh = "headEquipment";
    public static final String kDi = "hairEquipment";
    public static final String kDj = "faceEquipment";
    public static final String kDk = "shoulderEquipment";
    public static final String kDl = "neckEquipment";
    public static final String kDm = "chestEquipment";
    public static final String kDn = "armsEquipment";
    public static final String kDo = "leftHandEquipment";
    public static final String kDp = "rightHandEquipment";
    public static final String kDq = "beltEquipment";
    public static final String kDr = "skirtEquipment";
    public static final String kDs = "trousersEquipment";
    public static final String kDt = "legsEquipment";
    public static final String kDu = "petEquipment";
    public static final String kDv = "mountEquipment";
    public static final String kDw = "costumeEquipment";
    public static final String kDx = "backEquipment";
    public static final String kDy = "wingEquipment";
    public static final String kDz = "firstWeaponEquipment";
    public static final String kDA = "secondWeaponEquipment";
    public static final String kDB = "accessoryEquipment";
    public static final String kDC = "direction";
    public static final String kDD = "AnimStatique";
    public static final String kDE = "AnimMarche";
    public static final String kDF = "AnimCourse";
    public static final String kDG = "breedName";
    public static final int kDH = 511;
    private int iyg = 0;
    private boolean kDI;
    private final TByteObjectHashMap<ffV> kDJ = new TByteObjectHashMap();
    protected bdj_2 kCY;
    private final TShortObjectHashMap<Anm> kDK = new TShortObjectHashMap(bdl_1.values().length);
    protected bhJ kDa;
    private static final String[] kDL = new String[]{"actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "costumeEquipment", "actorDescriptorLibrary", "breedName", "direction"};

    public void a(bgt_0 bgt_02, byte by, eym eym2) {
        bhJ bhJ2 = new bhJ();
        bhJ2.aQ(by);
        bhJ2.c(eym2);
        bhJ2.dpo();
        bhJ2.dpr();
        bhJ2.dpm();
        bhJ2.c((byte)0, false);
        bhJ2.d((byte)0, false);
        bhJ2.a(abi_1.dzm);
        bhJ2.fR(false);
        this.iyg = bgt_02.doZ();
        this.kDI = bgt_02.doJ();
        this.kDa = bhJ2;
        this.kCY = bhJ2.ddI();
        this.kCY.setCanPlaySound(false);
        this.kCY.setVisible(false);
        this.kCY.dT(this.nc(kDD));
        Map<ffS, Long> map = bgt_02.dmL().fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            Optional<ffV> optional = fht.a(bgt_02, bgt_02.dmL(), entry.getKey());
            optional.ifPresent(ffV2 -> this.d((ffV)ffV2, ((ffS)entry.getKey()).aJr()));
        }
        this.deS();
    }

    @Override
    public String[] bxk() {
        return kDL;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kDf)) {
            return this.kCY;
        }
        if (string.equals(kDg)) {
            return this.kCY.bkI();
        }
        if (string.equals(kDh)) {
            return this.kDJ.get(ffS.sgB.shb);
        }
        if (string.equals(kDi)) {
            return this.kDJ.get(ffS.sgC.shb);
        }
        if (string.equals(kDj)) {
            return this.kDJ.get(ffS.sgD.shb);
        }
        if (string.equals(kDk)) {
            return this.kDJ.get(ffS.sgE.shb);
        }
        if (string.equals(kDl)) {
            return this.kDJ.get(ffS.sgF.shb);
        }
        if (string.equals(kDm)) {
            return this.kDJ.get(ffS.sgG.shb);
        }
        if (string.equals(kDn)) {
            return this.kDJ.get(ffS.sgH.shb);
        }
        if (string.equals(kDo)) {
            return this.kDJ.get(ffS.sgI.shb);
        }
        if (string.equals(kDp)) {
            return this.kDJ.get(ffS.sgJ.shb);
        }
        if (string.equals(kDq)) {
            return this.kDJ.get(ffS.sgL.shb);
        }
        if (string.equals(kDr)) {
            return this.kDJ.get(ffS.sgK.shb);
        }
        if (string.equals(kDs)) {
            return this.kDJ.get(ffS.sgM.shb);
        }
        if (string.equals(kDt)) {
            return this.kDJ.get(ffS.sgN.shb);
        }
        if (string.equals(kDx)) {
            return this.kDJ.get(ffS.sgO.shb);
        }
        if (string.equals(kDy)) {
            return this.kDJ.get(ffS.sgP.shb);
        }
        if (string.equals(kDz)) {
            return this.kDJ.get(ffS.sgQ.shb);
        }
        if (string.equals(kDA)) {
            return this.kDJ.get(ffS.sgR.shb);
        }
        if (string.equals(kDB)) {
            return this.kDJ.get(ffS.sgS.shb);
        }
        if (string.equals(kDu)) {
            return this.kDJ.get(ffS.sgX.shb);
        }
        if (string.equals(kDv)) {
            return this.kDJ.get(ffS.sgZ.shb);
        }
        if (string.equals(kDC)) {
            return this.kCY.bcB().wp();
        }
        if (string.equals(kDG)) {
            return this.kDa.dkD().getName() + " " + (this.kDa.aWO() == 0 ? (char)'M' : 'F');
        }
        return null;
    }

    public void g(ffV ffV2, byte by) {
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        if (!fhy_02.v(ffS.gj(by))) {
            return;
        }
        this.d(ffV2, by);
        this.deS();
    }

    public void d(ffV ffV2, byte by) {
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        if (this.kDJ.get(by) != null) {
            this.cB(by);
        }
        this.kDJ.put(by, (Object)ffV2);
        this.f(ffV2, by);
        for (ffS ffS2 : fhy_02.fZs()) {
            this.kDJ.put(ffS2.aJr(), (Object)ffV2.to(ffV2.LV()));
        }
        if (by == ffS.sgQ.aJr()) {
            this.kCY.dT(this.nc(this.kCY.bkI()));
        }
    }

    private void f(ffV ffV2, byte by) {
        fhy_0 fhy_02 = ffV2.dOg().dGh();
        this.cn(by);
        if (!this.kDI && ffS.sgB.shb == by) {
            return;
        }
        if (!fhy_02.cpY()) {
            return;
        }
        int n = this.kDa.aWO() == 0 ? ffV2.aVt() : ffV2.cpf();
        bdl_1 bdl_12 = bdl_1.bi(by);
        if (bdl_12 == null) {
            return;
        }
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = ZC.dR(String.format(string, n));
            this.kCY.a(anm, bdl_12.hKP);
            this.kDK.put((short)by, (Object)anm);
        }
        catch (Exception exception) {
            kDe.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    private void cn(short s) {
        bdl_1 bdl_12;
        Anm anm = (Anm)this.kDK.remove(s);
        if (anm != null && (bdl_12 = bdl_1.bi(s)) != null) {
            this.kCY.b(anm, bdl_12.hKP);
        }
    }

    public void cB(byte by) {
        ffS ffS2 = ffS.gj(by);
        ffV ffV2 = (ffV)this.kDJ.get(by);
        if (ffS2 == ffS.sgS) {
            this.a(ffV2.dOg(), false);
        }
        this.kDJ.remove(by);
        for (ffS ffS3 : ffV2.dOg().dGh().fZs()) {
            if (ffS3 == ffS2) {
                for (ffS ffS4 : ffV2.dOg().dGh().fZq()) {
                    ffV ffV3 = (ffV)this.kDJ.get(ffS4.aJr());
                    if (ffV3 == null || ffV3.avr() != ffV2.avr()) continue;
                    this.kDJ.remove(ffS4.aJr());
                }
                continue;
            }
            this.kDJ.remove(ffS3.aJr());
        }
        if (by == ffS.sgQ.aJr()) {
            this.kCY.dT(this.nc(this.kCY.bkI()));
        }
        this.deS();
    }

    public void deS() {
        this.kCY.dcL();
        this.kCY.bqd().bHB();
        this.kCY.lf(Integer.toString(this.kDa.aVt()));
        bgy bgy2 = this.kCY.dcP();
        if (bgy2 instanceof bhJ) {
            ((bhJ)bgy2).gg(aue_0.cVJ().cVK().doJ());
        }
        this.dkx();
        TByteObjectIterator tByteObjectIterator = this.kDJ.iterator();
        while (tByteObjectIterator.hasNext()) {
            tByteObjectIterator.advance();
            this.f((ffV)tByteObjectIterator.value(), tByteObjectIterator.key());
        }
        this.dvb();
        fse_1.gFu().a((aef_2)this, kDL);
    }

    private void dkx() {
        String string = this.kDa.dly();
        String string2 = this.kDa.dlx();
        this.ah(string, string2);
    }

    private void ah(String string, String string2) {
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = auc_0.cVq().bS("ANMEquipmentPath");
            }
            catch (fu_0 fu_02) {
                kDe.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)fu_02);
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
        return (ffV)this.kDJ.get(by);
    }

    private void dvb() {
        if (this.iyg != 0) {
            this.a((fhc_0)fgD.fXh().Vd(this.iyg), true);
            return;
        }
        byte by = ffS.sgS.aJr();
        ffV ffV2 = this.cw(by);
        if (ffV2 != null) {
            this.a(ffV2.dOg(), true);
        }
    }

    private boolean a(fhc_0 fhc_02, boolean bl) {
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

    private void a(enk_0 enk_02, boolean bl) {
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
        return false;
    }

    private boolean d(enk_0 enk_02, Pf pf) {
        if (pf.aXu() == ph_0.bda) {
            pf_0 pf_02 = (pf_0)pf;
            bef_2 bef_22 = new bef_2(enk_02, !pf_02.aYk(), pf_02.aYl());
            bef_22.p(this.kCY);
            return true;
        }
        return false;
    }

    public bhJ egd() {
        return this.kDa;
    }

    public void Im(int n) {
        this.kCY.a(this.kCY.bcB().wH(n));
        this.deS();
    }

    public void setAnimation(String string) {
        this.kCY.dT(this.nc(string));
        fse_1.gFu().a((aef_2)this, kDg);
    }

    public String nc(String string) {
        if (string.startsWith(kDD)) {
            ffV ffV2 = (ffV)this.kDJ.get(ffS.sgQ.shb);
            if (ffV2 != null) {
                return "AnimStatique03-Boucle-" + btq_1.d(ffV2.fWi());
            }
            return kDD;
        }
        if (string.startsWith(kDE)) {
            int n;
            ffV ffV3 = (ffV)this.kDJ.get(ffS.sgQ.shb);
            if (ffV3 != null && (n = btq_1.d(ffV3.fWi())) != 511) {
                return "AnimMarche-" + n;
            }
            return kDE;
        }
        return string;
    }

    public void DN(int n) {
        this.iyg = n;
    }

    public void ih(boolean bl) {
        this.kDI = bl;
    }
}

