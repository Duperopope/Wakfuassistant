/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bgL
 */
public class bgl_0
implements aeh_2 {
    public static final String icW = "isCompanion";
    public static final String icX = "isNewPlayer";
    public static final String icY = "companionView";
    public static final String icZ = "addRemovePartyEnabled";
    public static final String ida = "isInParty";
    public static final String idb = "isHero";
    public static final String idc = "guildBlazon";
    public static final String idd = "canAddToParty";
    public static final String ide = "addToPartyError";
    public static final String idf = "isInCompanyGuild";
    public static final String idg = "isInCompanyNation";
    public static final String idh = "isInSlot";
    public static final String idi = "cutName";
    public static final String idj = "levelsList";
    public static final String idk = "levelsAutoList";
    public static final String idl = "selectedLevel";
    public static final String idm = "xpToLevelUp";
    public static final String idn = "isReachedMaxLvl";
    public static final String ido = "aptitudesShortcutText";
    public static final String idp = "id";
    public static final int idq = 18;
    protected final bgy idr;
    protected final bli_1 ids;
    private ZG idt;
    private List<bfG> hUy;

    public bgl_0(bgy bgy2, bli_1 bli_12) {
        this.idr = bgy2;
        this.ids = bli_12;
        this.dlV();
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals(idm)) {
            return Float.valueOf(this.dlT());
        }
        if (string.equals(icW)) {
            return this.aXd();
        }
        if (string.equals(icX)) {
            return eIA.pH(this.idr.Xi());
        }
        if (string.equals(icY)) {
            return this.ids;
        }
        if (string.equals(icZ)) {
            return this.dmd();
        }
        if (string.equals(ida)) {
            return this.dfG();
        }
        if (string.equals(idb)) {
            return this.dmc();
        }
        if (string.equals("actorDescriptorLibrary")) {
            return this.dma();
        }
        if (string.equals(idc)) {
            if (!(this.dcP() instanceof bhJ)) {
                return null;
            }
            bhJ bhJ2 = (bhJ)this.dcP();
            if (!bhJ2.dpO()) {
                return null;
            }
            long l = bhJ2.HP();
            if (l == 0L) {
                l = bhJ2.dpI().Yc();
            }
            ezb ezb2 = new ezb(l);
            buJ buJ2 = new buJ(ezb2.fmd(), ezb2.fmf(), buH.dJn().Fz(ezb2.fmg()), buH.dJn().Fz(ezb2.fme()));
            awk_1 awk_12 = buK.dJw().a(buJ2);
            buJ2.bmX();
            return awk_12;
        }
        if (string.equals(idp)) {
            return this.Sn();
        }
        if (string.equals(idd)) {
            return this.dlS();
        }
        if (string.equals(ide)) {
            eww eww2 = fcz.rTU.a(this.dmb());
            return aum_0.cWf().c("error.cantAddHero" + eww2.aJr(), new Object[0]);
        }
        if (string.equals(idf)) {
            return this.dlZ();
        }
        if (string.equals(idg)) {
            return this.dlY();
        }
        if (string.equals(idh)) {
            return bly_0.ivl.b(this);
        }
        if (string.equals(idi)) {
            return this.dlX();
        }
        if (string.equals(idj)) {
            return this.dlV();
        }
        if (string.equals(idk)) {
            return this.fU(true);
        }
        if (string.equals(idl)) {
            return this.dlU();
        }
        if (string.equals(ido)) {
            return aUl.kf("aptitudes");
        }
        return this.dcP().eu(string);
    }

    public boolean dlS() {
        int n = bly_0.ivl.dtS();
        if (n >= ewo_0.oBF.i(ewr_0.oEt)) {
            return false;
        }
        Optional optional = bbs_2.a(eva_1.owr);
        boolean bl = ewo_0.oBF.k(ewr_0.oEg);
        if (!bl) {
            return true;
        }
        if (optional.isEmpty() || !((eKd)optional.get()).aOY()) {
            return false;
        }
        fcy fcy2 = this.dmb();
        if (this.aXd()) {
            bgt_0 bgt_02 = bvz_0.dLl();
            return fcz.rTW.a(fcy2) == eww.oHf && fcz.rTX.a(fcy2) == eww.oHf && bgt_02 != null && !bgt_02.djT();
        }
        eww eww2 = fcz.rTU.a(fcy2);
        return eww2 == eww.oHf;
    }

    private float dlT() {
        Optional<bfG> optional = this.hUy.stream().max(Comparator.comparingInt(bfG::cmL));
        if (optional.isEmpty()) {
            return 0.0f;
        }
        short s = optional.get().cmL();
        long l = this.idr.dlF();
        return mz_1.aVX.a(s, l);
    }

    private bfG dlU() {
        for (bfG bfG2 : this.hUy) {
            if (bfG2.cmL() != this.dcP().cmL()) continue;
            return bfG2;
        }
        return null;
    }

    private List<bfG> fU(boolean bl) {
        bgy bgy2 = this.dcP();
        eIi[] eIiArray = eIi.values();
        this.hUy = new ArrayList<bfG>();
        for (eIi eIi2 : eIiArray) {
            if (eIi2.cmL() <= 0 || eIi2.cmL() >= bgy2.dnG() || bl && eIi2.cmL() + 0 > bgy2.dnG()) continue;
            this.hUy.add(new bfG(eIi2.cmL(), bgy2));
        }
        this.hUy.add(new bfH(bgy2.dnG(), bgy2));
        return this.hUy;
    }

    private List<bfG> dlV() {
        return this.fU(false);
    }

    public void dlW() {
        fse_1.gFu().a((aef_2)this.dlU(), idl);
    }

    private String dlX() {
        Object object = this.idr.getName();
        if (((String)object).length() > 18) {
            object = ((String)object).substring(0, 15);
            object = (String)object + "...";
        }
        return object;
    }

    protected boolean dlY() {
        if (!(this.dcP() instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.dcP();
        int n = bgr_0.dmo().az(bhJ2);
        Optional<evv_2> optional = evx_2.feo().a(bhJ2.aZj(), eva_1.owr);
        if (optional.isEmpty()) {
            return false;
        }
        eKd eKd2 = (eKd)optional.get();
        int n2 = eKd2.Xt();
        return n == n2;
    }

    protected boolean dlZ() {
        if (!(this.dcP() instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.dcP();
        if (!bhJ2.dpO()) {
            return true;
        }
        long l = bhJ2.Ya();
        Optional<evv_2> optional = evx_2.feo().a(bhJ2.aZj(), eva_1.owr);
        if (optional.isEmpty()) {
            return false;
        }
        eKd eKd2 = (eKd)optional.get();
        long l2 = eKd2.Ya();
        return l == l2;
    }

    public long Sn() {
        return this.dcP().Sn();
    }

    private ZG dma() {
        if (this.idt != null) {
            return this.idt;
        }
        this.idt = new ZG();
        this.idt.a(this.idr.ddI());
        return this.idt;
    }

    public fcy dmb() {
        bgt_0 bgt_02 = bvz_0.dLl();
        bgy bgy2 = this.dcP();
        fcy fcy2 = new fcy();
        int n = bly_0.ivl.dtS();
        fcy2.Uc(n);
        Optional optional = bbs_2.a(eva_1.owr);
        fcy2.a(optional.isPresent() ? (eKd)optional.get() : null);
        if (bgt_02 == null) {
            return fcy2;
        }
        fcy2.sd(bgr_0.dmo().aA(bgt_02));
        if (fcy2.fSC() == 0L) {
            fcy2.sd(bgt_02.aqZ());
        }
        if (!(bgy2 instanceof bgt_0)) {
            fcy2.se(bgt_02.aqZ());
            return fcy2;
        }
        boolean bl = fcI.fSO();
        evd_2 evd_22 = bgt_02.dpL();
        boolean bl2 = evd_22.b(evv_1.oxo);
        int n2 = bly_0.ivl.dtT();
        fcy2.mR(bl2 || bl);
        fcy2.TZ(n2);
        fcy2.se(bgr_0.dmo().aA(bgy2));
        if (fcy2.fSD() == 0L) {
            fcy2.se(bgy2.aqZ());
        }
        fcy2.Ua(bgt_02.Xt());
        fcy2.Ub(bgr_0.dmo().az(bgy2));
        fcy2.sf(bgt_02.Ya());
        fcy2.sg(bgy2.Ya());
        fcy2.mS(bgt_02.dkZ() != null && bgt_02.dkZ().dGp() != etw_0.rqT);
        return fcy2;
    }

    protected boolean dmc() {
        return !fcK.rUe.aU(this.idr);
    }

    protected boolean dfG() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return false;
        }
        bvi_0 bvi_02 = bgt_02.dnQ();
        if (!bvi_02.dfG()) {
            return false;
        }
        return bvi_02.dKL().fa(this.idr.Sn());
    }

    protected boolean dmd() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return false;
        }
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null && bkb_02.dsm() == 4) {
            return false;
        }
        if (bgt_02.djT()) {
            return false;
        }
        if (this.dfG()) {
            return true;
        }
        bvi_0 bvi_02 = bgt_02.dnQ();
        if (bvi_02.dfG() && bvi_02.dKL().isFull()) {
            return false;
        }
        boolean bl = fse_1.gFu().dp("companionPartyListFull");
        if (bl) {
            return false;
        }
        boolean bl2 = fse_1.gFu().dp("isInDungeon");
        if (bl2) {
            return false;
        }
        return this.aXd() || bly_0.ivl.dtW() || fcI.fSO();
    }

    public boolean aXd() {
        return false;
    }

    public bgy dcP() {
        return this.idr;
    }

    public fgd_0 dme() {
        return null;
    }

    public bli_1 dmf() {
        return this.ids;
    }

    public short bEr() {
        return this.idr.bEr();
    }

    public boolean equals(Object object) {
        if (!(object instanceof bgl_0)) {
            return false;
        }
        return this.idr.Sn() == ((bgl_0)object).Sn();
    }

    public String toString() {
        return "CharacterView{m_characterInfo=" + String.valueOf(this.idr) + ", m_shortCharacterView=" + String.valueOf(this.ids) + "}";
    }
}

