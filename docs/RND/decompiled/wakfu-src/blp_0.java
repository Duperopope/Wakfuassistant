/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blp
 */
public class blp_0
extends bgl_0
implements pu_0 {
    private static final float itE = 2.0f;
    protected static final Logger itF = Logger.getLogger(blp_0.class);
    public static final String itG = "characterSheetIllustrationUrl";
    public static final String itH = "spellsIllustrationUrl";
    public static final String itI = "listIllustrationUrl";
    public static final String itJ = "currentLevelPercentage";
    public static final String itK = "currentLevelPercentageInText";
    public static final String itL = "xpRatio";
    public static final String itM = "equipmentBonus";
    public static final String itN = "hasEquipment";
    public static final String itO = "equipmentPopupText";
    public static final String itP = "headEquipment";
    public static final String itQ = "hairEquipment";
    public static final String itR = "faceEquipment";
    public static final String itS = "shoulderEquipment";
    public static final String itT = "neckEquipment";
    public static final String itU = "chestEquipment";
    public static final String itV = "armsEquipment";
    public static final String itW = "leftHandEquipment";
    public static final String itX = "rightHandEquipment";
    public static final String itY = "beltEquipment";
    public static final String itZ = "skirtEquipment";
    public static final String iua = "trousersEquipment";
    public static final String iub = "legsEquipment";
    public static final String iuc = "petEquipment";
    public static final String iud = "mountEquipment";
    public static final String iue = "backEquipment";
    public static final String iuf = "wingEquipment";
    public static final String iug = "firstWeaponEquipment";
    public static final String iuh = "secondWeaponEquipment";
    public static final String iui = "accessoryEquipment";
    public static final String iuj = "backgroundText";
    public static final String iuk = "shopCost";
    public static final String iul = "canBuy";
    public static final String ium = "isOwned";
    public static final String iun = "isActivated";
    public static final String iuo = "isFree";
    public static final String iup = "actorStandardScale";
    public static final String iuq = "removeDisabledText";
    public static final String[] iur = new String[]{"headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "actorEquipment"};
    private final eJS ius;
    private bpt_1<?, ?> iut;
    private final TIntObjectHashMap<bls_0> iuu = new TIntObjectHashMap();

    public blp_0(bgy bgy2, bli_1 bli_12) {
        this(bgy2, bli_12, eJN.qAF.pR(-bli_12.Sn()));
    }

    public blp_0(bgy bgy2, bli_1 bli_12, eJS eJS2) {
        super(bgy2, bli_12);
        this.ius = eJS2;
        ((exy_2)this.dcP().fgM()).a(this);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        Object object;
        if (string.equals("nameAndLevel")) {
            return this.idr.lG(this.getName());
        }
        if (string.equals("breedInfo")) {
            return this.idr;
        }
        if (string.equals("companionRealLevel")) {
            return aum_0.cWf().c("levelShort.custom", this.ius.cmL());
        }
        if (string.equals(itG)) {
            try {
                return String.format(auc_0.cVq().bS("companionBigCharacterSheetIllustrationPath"), this.idr.aWP());
            }
            catch (fu_0 fu_02) {
                itF.error((Object)"PropertyException during getFieldValue for companionBigCharacterSheetIllustrationPath", (Throwable)fu_02);
            }
        }
        if (string.equals(itH)) {
            try {
                return String.format(auc_0.cVq().bS("companionSpellInventoryIllustrationsPath"), this.idr.aWP());
            }
            catch (fu_0 fu_03) {
                itF.error((Object)"PropertyException during getFieldValue for SPELLS_ILLUSTRATION_URL_FIELD", (Throwable)fu_03);
            }
        }
        if (string.equals(itI)) {
            try {
                return String.format(auc_0.cVq().bS("companionListIllustrationsPath"), this.idr.aWP());
            }
            catch (fu_0 fu_04) {
                itF.error((Object)"PropertyException during getFieldValue for LIST_ILLUSTRATION_URL_FIELD", (Throwable)fu_04);
            }
        }
        if (string.equals(itJ)) {
            return Float.valueOf(this.dnI());
        }
        if (string.equals("currentExperience")) {
            return this.ius.pf();
        }
        if (string.equals("xpToNextLevel")) {
            return "/ " + aum_0.cWf().cQ(this.dnH().N(this.cmL()));
        }
        if (string.equals("isReachedMaxLvl")) {
            return this.cmL() >= ewo_0.oBF.i(ewr_0.oCk);
        }
        if (string.equals(itK)) {
            return String.format("(%s %%)", GC.B(this.dnI() * 100.0f));
        }
        if (string.equals(itL)) {
            if (this.cmL() >= ewo_0.oBF.i(ewr_0.oCk)) {
                return aum_0.cWf().c("maxLevel", new Object[0]);
            }
            object = new StringBuilder();
            long l = this.dnH().N(this.cmL());
            long l2 = Math.min(this.dnH().cT(this.dlF()), l);
            ((StringBuilder)object).append(aum_0.cWf().c(itL, aum_0.cWf().cQ(l2), aum_0.cWf().cQ(l)));
            return ((StringBuilder)object).toString();
        }
        if (string.equals(itP)) {
            return this.ius.dme().ai(ffS.sgB.shb);
        }
        if (string.equals(itQ)) {
            return this.ius.dme().ai(ffS.sgC.shb);
        }
        if (string.equals(itR)) {
            return this.ius.dme().ai(ffS.sgD.shb);
        }
        if (string.equals(itS)) {
            return this.ius.dme().ai(ffS.sgE.shb);
        }
        if (string.equals(itT)) {
            return this.ius.dme().ai(ffS.sgF.shb);
        }
        if (string.equals(itU)) {
            return this.ius.dme().ai(ffS.sgG.shb);
        }
        if (string.equals(itV)) {
            return this.ius.dme().ai(ffS.sgH.shb);
        }
        if (string.equals(itW)) {
            return this.ius.dme().ai(ffS.sgI.shb);
        }
        if (string.equals(itX)) {
            return this.ius.dme().ai(ffS.sgJ.shb);
        }
        if (string.equals(itY)) {
            return this.ius.dme().ai(ffS.sgL.shb);
        }
        if (string.equals(itZ)) {
            return this.ius.dme().ai(ffS.sgK.shb);
        }
        if (string.equals(iua)) {
            return this.ius.dme().ai(ffS.sgM.shb);
        }
        if (string.equals(iub)) {
            return this.ius.dme().ai(ffS.sgN.shb);
        }
        if (string.equals(iue)) {
            return this.ius.dme().ai(ffS.sgO.shb);
        }
        if (string.equals(iuf)) {
            return this.ius.dme().ai(ffS.sgP.shb);
        }
        if (string.equals(iug)) {
            return this.ius.dme().ai(ffS.sgQ.shb);
        }
        if (string.equals(iuh)) {
            return this.ius.dme().ai(ffS.sgR.shb);
        }
        if (string.equals(iui)) {
            return this.ius.dme().ai(ffS.sgS.shb);
        }
        if (string.equals(iuc)) {
            return this.ius.dme().ai(ffS.sgX.shb);
        }
        if (string.equals(iud)) {
            return this.ius.dme().ai(ffS.sgZ.shb);
        }
        if (string.equals(itM)) {
            object = new ArrayList();
            for (ffV ffV2 : this.ius.dme()) {
                ((ArrayList)object).add(ffV2);
            }
            return bhJ.a(this.idr, object);
        }
        if (string.equals(itN)) {
            return !this.ius.dme().aJG();
        }
        if (string.equals(itO)) {
            if (this.ius.dme().aJG()) {
                return aum_0.cWf().c("companion.no.equipments", new Object[0]);
            }
            object = new StringBuilder();
            this.ius.dme().forEach(arg_0 -> blp_0.a((StringBuilder)object, arg_0));
            return aum_0.cWf().c("companion.retrieve.equipments", ((StringBuilder)object).toString());
        }
        if (string.equals(iuj)) {
            return aum_0.cWf().c(String.format("companionBackgroundText.%d", this.dcP().aWP()), new Object[0]);
        }
        if (string.equals(iuk)) {
            if (this.dtz()) {
                return null;
            }
            return this.iut == null ? null : Double.valueOf(this.iut.eif());
        }
        if (string.equals(iul)) {
            return this.iut != null;
        }
        if (string.equals(ium)) {
            return this.dtz();
        }
        if (string.equals(iuo)) {
            return this.dtA();
        }
        if (string.equals(iun)) {
            return this.aOY();
        }
        if (string.equals(iup)) {
            object = this.idr.ddI();
            short s = ((bdj_2)object).aKu();
            float f2 = ((ZC)object).bqd().getScale();
            return Float.valueOf(bsz_0.bL(s) * 2.0f * f2);
        }
        if (string.equals(iuq)) {
            eyp_1 eyp_12;
            boolean bl = false;
            ahv_2 ahv_22 = new ahv_2().ih(cpm_1.nim);
            ahv_22.c(aum_0.cWf().c("desc.removeCompanionDisabled", new Object[0]));
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bvi_0 bvi_02 = bgt_02.dnQ();
            if (bvi_02.dfG() && (eyp_12 = bvi_02.dKL()).fa(-this.doL())) {
                ahv_22.ceH().c(aum_0.cWf().c("companion.stillInParty", new Object[0]));
                bl = true;
            }
            if (!this.ius.dme().aJG()) {
                bl = true;
                ahv_22.ceH().c(aum_0.cWf().c("companion.hasEquipment", new Object[0]));
            }
            if (bgt_02.dno().fVd() == 0) {
                bl = true;
                ahv_22.ceH().c(aum_0.cWf().c("bagsFull", new Object[0]));
            }
            return bl ? ahv_22.ceL() : null;
        }
        if (string.equals("name")) {
            object = this.ius.getName();
            return object == null || ((String)object).isEmpty() ? this.ids.getName() : object;
        }
        if (string.equals("rerollXpBonus")) {
            return aum_0.cWf().c("rerollXp.factor", Float.valueOf(1.5f));
        }
        if (string.equals("addToPartyError")) {
            object = bvz_0.dLl();
            if (object != null && ((bgy)object).djT()) {
                return bNG.b(317, new Object[0]);
            }
            fcy fcy2 = this.dmb();
            eww eww2 = fcz.rTX.a(fcy2);
            if (eww2 != eww.oHf) {
                return aum_0.cWf().c("error.cantAddHero" + eww2.aJr(), new Object[0]);
            }
            eww eww3 = fcz.rTW.a(fcy2);
            return aum_0.cWf().c("error.cantAddHero" + eww3.aJr(), new Object[0]);
        }
        return super.eu(string);
    }

    @Override
    public long Sn() {
        return -this.ius.Sn();
    }

    @Override
    protected boolean dmc() {
        return false;
    }

    @Override
    protected boolean dfG() {
        for (bli_1 bli_12 : aue_0.cVJ().cVK().dnf()) {
            if (bli_12 == null || bli_12.xT() != this.dcP().aWP()) continue;
            return true;
        }
        return false;
    }

    @Override
    protected boolean dmd() {
        if (!super.dmd()) {
            return false;
        }
        return this.dtA() || this.dtz();
    }

    @Override
    public bgy dcP() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return super.dcP();
        }
        if (!bgt_02.djT()) {
            return super.dcP();
        }
        Collection collection = bgt_02.dkZ().a(evb_0.fJ((byte)5), evb_0.bF(bgt_02));
        for (bgy bgy2 : collection) {
            if (bgy2.aWP() != this.idr.aWP()) continue;
            return bgy2;
        }
        return super.dcP();
    }

    public boolean dtz() {
        return this.ius.efO();
    }

    public boolean aOY() {
        return this.ius.Sn() != 0L;
    }

    public boolean dtA() {
        return eKb.qBe.eFY() == this.idr.aWP();
    }

    @Override
    public boolean aXd() {
        return true;
    }

    @Override
    public fgd_0 dme() {
        return this.ius.dme();
    }

    public float dnI() {
        return this.dnH().a(this.cmL(), this.dlF());
    }

    public short cmL() {
        return this.idr.cmL();
    }

    public mj_1 dnH() {
        return mz_1.aVX;
    }

    public long dlF() {
        return this.ius.pf();
    }

    public long doL() {
        return this.ius.Sn();
    }

    public String getName() {
        return this.ids.getName();
    }

    public void b(bpt_1<?, ?> bpt_12) {
        this.iut = bpt_12;
        fse_1.gFu().a((aef_2)this, iuk, iul);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof blp_0)) {
            return false;
        }
        return this.idr.aWP() == ((blp_0)object).dcP().aWP();
    }

    public bpt_1<?, ?> dtB() {
        return this.iut;
    }

    public bls_0 DD(int n) {
        return (bls_0)this.iuu.get(n);
    }

    @Override
    public void a(pr_0 pr_02) {
        fse_1.gFu().a((aef_2)this, "characteristics");
    }

    public void dkf() {
        ((exy_2)this.dcP().fgM()).b(this);
        bNB.kDS.b(this.dcP().dlc());
    }

    public void dtC() {
        ((exy_2)this.dcP().fgM()).a(this);
        bNB.kDS.a(this.dcP().dlc());
    }

    @Override
    protected boolean dlY() {
        return true;
    }

    @Override
    protected boolean dlZ() {
        return true;
    }

    private static /* synthetic */ void a(StringBuilder stringBuilder, ffV ffV2) {
        if (ffV2 != null) {
            stringBuilder.append(" - ").append(ffV2.getName()).append(System.lineSeparator());
        }
    }
}

