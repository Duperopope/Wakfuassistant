/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cbZ
 */
public class cbz_2
implements aeh_2 {
    public static final String lMr = "currentPage";
    public static final String lMs = "playerList";
    public static final String lMt = "warningList";
    public static final String lMu = "muteList";
    public static final String lMv = "penalFile";
    public static final String lMw = "penalFileFilter";
    public static final String lMx = "penalFileUiTitle";
    public static final String lMy = "isPenalFileLoading";
    public static final String lMz = "sanctionList";
    public static final String lMA = "currentSearch";
    public static final String lMB = "searchResult";
    public static final String lMC = "moderatorsList";
    public static final String lMD = "moderatorGameServer";
    public static final String lME = "moderatorPosition";
    public static final String lMF = "moderatorInstance";
    public static final String lMG = "isAdmin";
    public static final String lMH = "currentPlayer";
    public static final String lMI = "logs";
    public static final String lMJ = "formattedLogs";
    public static final String lMK = "maximized";
    public static final String lML = "tpLocations";
    public static final String lMM = "tpLocationSelected";
    public static final String lMN = "nations";
    public static final String lMO = "nationSelected";
    public static final String lMP = "opacity";
    public static final String lMQ = "opacitySliderValue";
    public static final String lMR = "currentGuild";
    public static final String lMS = "hasGuildActionsRights";
    public static final String lMT = "canMutePartitions";
    public static final String lMU = "currentPartitionMuteStatus";
    public static final String lMV = "sendLocalizedEnabled";
    private ArrayList<String> lMW = new ArrayList();
    private final LinkedList<String> lMX = new LinkedList();
    private LinkedList<String> lMY = new LinkedList();
    private String lMZ;
    private final List<fsh_0> lNa = new ArrayList<fsh_0>();
    private cbx_2 lNb = cbx_2.lLZ;
    private final Map<String, cbu_2> lNc = new LinkedHashMap<String, cbu_2>();
    private cbu_2 lNd;
    private cbr_2 lNe;
    private final List<cca_2> lNf = new ArrayList<cca_2>();
    private final fez_1 lNg = new fez_1();
    private boolean lNh = false;
    private boolean cyw = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkn);
    private final List<String> lNi;
    private cby_2 lNj;
    private final List<String> lNk;
    private cbw_2 lNl;
    private float lNm = 100.0f - ((bsg_1)aie_0.cfn().bmH()).c(bsn_1.lkm);
    private boolean lNn;

    public cbz_2() {
        this.lNi = new ArrayList<String>();
        for (cby_2 enum_ : cby_2.values()) {
            this.lNi.add(enum_.esM());
        }
        this.lNj = cby_2.lMe;
        this.lNk = new ArrayList<String>();
        for (Enum enum_ : cbw_2.values()) {
            this.lNk.add(((cbw_2)enum_).elx());
        }
        this.lNl = cbw_2.KL(aue_0.cVJ().cVK().Xt());
    }

    public void ob(String string) {
        this.lNj = cby_2.oa(string);
    }

    public void oc(String string) {
        this.lNl = cbw_2.nZ(string);
    }

    public void a(ftY ftY2) {
        this.lNf.add(new cca_2(ftY2));
    }

    public void G(long l, long l2) {
        for (int i = this.lNf.size() - 1; i >= 0; --i) {
            ftY ftY2 = this.lNf.get(i).etg();
            if (ftY2.Xi() != l || ftY2.etb().getTime() != l2) continue;
            this.lNf.remove(i);
            break;
        }
    }

    public void iX(boolean bl) {
        this.lNh = bl;
    }

    public void esO() {
        this.lNf.clear();
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string2) {
        if (lMr.equals(string2)) {
            return this.lNb.d();
        }
        if (lMB.equals(string2)) {
            if (!this.lMY.isEmpty()) {
                return this.lMY;
            }
            return null;
        }
        if (lMs.equals(string2)) {
            return this.lNc.values();
        }
        if (lMC.equals(string2)) {
            String string3 = aum_0.cWf().c("moderationPanel.inGameModerators", new Object[0]) + " :";
            for (String string4 : this.lMW) {
                string3 = string3 + "\n - " + string4;
            }
            return string3;
        }
        if (lME.equals(string2)) {
            int n = aue_0.cVJ().cVK().bcC();
            int n2 = aue_0.cVJ().cVK().bcD();
            short s = aue_0.cVJ().cVK().bcE();
            return aum_0.cWf().c("moderationPanel.currentPosition", new Object[0]) + " : " + n + ", " + n2 + ", " + s;
        }
        if (lMD.equals(string2)) {
            return aum_0.cWf().c("moderationPanel.currentGameServer", new Object[0]) + " : " + this.lMZ;
        }
        if (lMF.equals(string2)) {
            long l = aue_0.cVJ().cVK().aqZ();
            return aum_0.cWf().c("moderationPanel.currentInstance", new Object[0]) + " : " + l;
        }
        if (lMH.equals(string2)) {
            return this.lNd;
        }
        if (lMt.equals(string2)) {
            ArrayList<ccc_2> arrayList = new ArrayList<ccc_2>();
            for (exj exj2 : exj.values()) {
                if (exj2.ffl() != exk.oWx) continue;
                arrayList.add(new ccc_2(exj2));
            }
            return arrayList;
        }
        if (lMu.equals(string2)) {
            ArrayList<ccc_2> arrayList = new ArrayList<ccc_2>();
            for (exj exj3 : exj.values()) {
                if (exj3.ffl() != exk.oWy) continue;
                arrayList.add(new ccc_2(exj3));
            }
            return arrayList;
        }
        if (lMz.equals(string2)) {
            ArrayList<ccc_2> arrayList = new ArrayList<ccc_2>();
            for (exj exj4 : exj.values()) {
                if (exj4.ffl() != exk.oWz) continue;
                arrayList.add(new ccc_2(exj4));
            }
            return arrayList;
        }
        if (lMJ.equals(string2)) {
            ahv_2 ahv_22 = new ahv_2();
            this.lMX.forEach(string -> this.c(ahv_22, (String)string));
            return ahv_22.ceL();
        }
        if (lMI.equals(string2)) {
            return Collections.unmodifiableList(this.lMX);
        }
        if (lMv.equals(string2)) {
            return this.esP();
        }
        if (lMw.equals(string2)) {
            return this.lNg;
        }
        if (lMx.equals(string2)) {
            return "Penal file of " + this.lNd.getName() + " (account: " + this.lNd.xl() + ")";
        }
        if (lMy.equals(string2)) {
            return this.lNh;
        }
        if (lMG.equals(string2)) {
            evp_2 evp_22 = evp_2.H(aue_0.cVJ().cVO().cWq());
            return evp_22 == evp_2.ovz || evp_22 == evp_2.ovy;
        }
        if (lMK.equals(string2)) {
            return this.cyw;
        }
        if (lML.equals(string2)) {
            return this.lNi;
        }
        if (lMM.equals(string2)) {
            return this.lNj.esM();
        }
        if (lMN.equals(string2)) {
            return this.lNk;
        }
        if (lMO.equals(string2)) {
            return this.lNl.elx();
        }
        if (lMP.equals(string2)) {
            return "1,1,1," + this.lNm / 100.0f;
        }
        if (lMQ.equals(string2)) {
            return Float.valueOf(this.lNm);
        }
        if (lMR.equals(string2)) {
            return this.lNe;
        }
        if (lMS.equals(string2)) {
            return evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.oub);
        }
        if (lMT.equals(string2)) {
            return evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.otH);
        }
        if (lMU.equals(string2)) {
            String string5 = this.lNa.isEmpty() ? "NO" : this.lNa.stream().map(Enum::name).collect(Collectors.joining(", "));
            return "Zone muted : " + string5;
        }
        if (lMV.equals(string2)) {
            return this.lNn;
        }
        return null;
    }

    public @Unmodifiable @NotNull List<cca_2> esP() {
        return this.lNf.stream().sorted(Comparator.comparing(cca_2::etb).reversed()).toList();
    }

    private void c(ahv_2 ahv_22, String string) {
        ahv_22.c(string).ceH();
    }

    public cbu_2 esQ() {
        return this.lNd;
    }

    public void od(String string) {
        if (string == null) {
            return;
        }
        if (!this.lNc.containsKey(string)) {
            cbu_2 cbu_22 = new cbu_2(string);
            this.lNc.put(string, cbu_22);
            fse_1.gFu().a((aef_2)this, lMs);
        }
    }

    public void f(@NotNull nE nE2) {
        if (!this.lNc.containsKey(nE2.getName())) {
            cbu_2 cbu_22 = new cbu_2(nE2);
            this.lNc.put(nE2.getName(), cbu_22);
            fse_1.gFu().a((aef_2)this, lMs);
        }
    }

    public void a(cbu_2 cbu_22) {
        this.lNc.remove(cbu_22.getName());
        fse_1.gFu().a((aef_2)this, lMs);
    }

    public void esR() {
        this.lNc.clear();
        fse_1.gFu().a((aef_2)this, lMs);
    }

    public void a(cbx_2 cbx_22) {
        this.lNb = cbx_22;
        fse_1.gFu().a((aef_2)this, lMr);
    }

    public void oe(String string) {
        this.od(string);
        this.lNd = this.lNc.get(string);
        this.esO();
        this.lNh = true;
        fse_1.gFu().a((aef_2)this, lMv, lMx, lMy);
        cwj_1.a(fud_0.thz, fub_0.thi, (Object)string);
        fse_1.gFu().a((aef_2)this, lMH, lMs);
        this.a(cbx_2.lMa);
    }

    public void of(String string) {
        this.lMZ = string;
        fse_1.gFu().a((aef_2)this, lMD);
    }

    public void Q(ArrayList<String> arrayList) {
        this.lMW = arrayList;
        fse_1.gFu().a((aef_2)this, lMC);
    }

    public void esS() {
        this.lMY.clear();
        fse_1.gFu().a((aef_2)this, lMB);
    }

    public void og(String string) {
        this.lMY.add(string);
        this.lMY.sort(String::compareTo);
        fse_1.gFu().a((aef_2)this, lMB);
    }

    public void b(LinkedList<String> linkedList) {
        this.lMY = linkedList;
        fse_1.gFu().a((aef_2)this, lMB);
    }

    public void oh(String string) {
        this.lMX.addFirst(string);
        fse_1.gFu().a((aef_2)this, lMI);
        fse_1.gFu().a((aef_2)this, lMJ);
    }

    public void esT() {
        this.lMX.clear();
        fse_1.gFu().a((aef_2)this, lMI);
        fse_1.gFu().a((aef_2)this, lMJ);
    }

    public cbx_2 esU() {
        return this.lNb;
    }

    public void esV() {
        this.cyw = !this.cyw;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkn, this.cyw);
    }

    public cby_2 esW() {
        return this.lNj;
    }

    public cbw_2 esX() {
        return this.lNl;
    }

    public void eS(float f2) {
        this.lNm = f2;
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkm, 100.0f - this.lNm);
    }

    public cbr_2 esY() {
        return this.lNe;
    }

    public void a(cbr_2 cbr_22) {
        this.lNe = cbr_22;
        fse_1.gFu().a((aef_2)this, lMR);
    }

    public void A(Collection<fsh_0> collection) {
        this.lNa.clear();
        this.lNa.addAll(collection);
        fse_1.gFu().a((aef_2)this, lMU);
    }

    public void iY(boolean bl) {
        this.lNn = bl;
        fse_1.gFu().a((aef_2)this, lMV);
    }

    @NotNull
    public List<cbu_2> esZ() {
        if (this.lNd == null) {
            return List.of();
        }
        long l = this.lNd.xl();
        return this.lNc.values().stream().filter(cbu_22 -> cbu_22.xl() == l).toList();
    }
}

