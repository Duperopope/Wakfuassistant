/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bzJ
extends bCA
implements bba_2 {
    static final Logger jEh = Logger.getLogger(bzJ.class);
    private static final TObjectProcedure<Object> jEi = new bzk_0();
    private fdc_0 jEj;
    private static final String jEk = "\\{[^\\{\\}]*\\}";
    public static final String jEl = "(\\{[^\\{\\}]*\\})+";
    private static final String jEm = "(\\{[^\\{\\}]*\\})+(;[a-zA-Z0-9\\.]*)?";
    private static final Pattern jEn = Pattern.compile("\\{[^\\{\\}]*\\}");
    public static final Pattern jEo = Pattern.compile("(\\{[^\\{\\}]*\\})+");
    private String ezc;
    private final List<bzn_0> jEp = new ArrayList<bzn_0>();
    private ArrayList<afx_1> jEq;

    private void dOS() {
        assert (this.ezc == null);
        this.ezc = "";
        assert (this.jEp.isEmpty());
    }

    private void dOT() {
        this.ezc = null;
        this.jEp.clear();
    }

    private String dOU() {
        return aum_0.cWf().c(this.ezc, new Object[0]);
    }

    private cpm_1[] dOV() {
        int n = this.jEp.size();
        cpm_1[] cpm_1Array = new cpm_1[n];
        for (int i = 0; i < n; ++i) {
            bzn_0 bzn_02 = this.jEp.get(i);
            cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
            cqw_12.CV(bzn_02.jEt);
            cqw_12.setName(bzn_02.jEu);
            cqw_12.e(rw_0.blx[i]);
            cpm_1Array[i] = cqw_12;
        }
        return cpm_1Array;
    }

    private void dOW() {
        if (!this.baB.matches(jEm)) {
            jEh.error((Object)("[LD] Erreur de param\u00e8tres pour l'IE : " + this.aXv + " - Param\u00e8tres : " + this.baB));
            this.ezc = "";
            this.ht(false);
            return;
        }
        Matcher matcher = jEo.matcher(this.baB);
        if (!matcher.find() || matcher.groupCount() != 1) {
            jEh.error((Object)("[LD] Erreur de param\u00e8tres pour l'IE : " + this.aXv + " - Param\u00e8tres : " + this.baB));
            this.ezc = "";
            this.ht(false);
            return;
        }
        String string = matcher.group();
        if (matcher.hitEnd()) {
            this.ezc = "";
            this.ht(false);
        } else {
            this.ezc = this.baB.substring(matcher.end() + 1);
        }
        Matcher matcher2 = jEn.matcher(string);
        while (matcher2.find()) {
            String string2 = matcher2.group();
            String string3 = matcher2.group().substring(1, string2.length() - 1);
            String[] stringArray = string3.split(";");
            this.jEp.add(new bzn_0(Integer.valueOf(stringArray[0]), stringArray[1]));
        }
    }

    private void dOX() {
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 3 && stringArray.length != 2) {
            jEh.error((Object)("[LevelDesign] Un GenericActivableInteractiveElement doit avoir 2 param\u00e8tres - typeId=" + this.beA() + " / id=" + this.Sn()));
            this.ezc = "";
            this.ht(false);
            return;
        }
        this.jEp.add(new bzn_0(Integer.valueOf(stringArray[0]), stringArray[1]));
        if (stringArray.length == 3) {
            this.ezc = stringArray[2];
        } else {
            this.ezc = "";
            this.ht(false);
        }
    }

    @Override
    public fqy_0 drR() {
        return fqz_0.giz().YY(this.jEj.clf());
    }

    @Override
    public short dOY() {
        return 0;
    }

    protected bzJ() {
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        assert (this.jEj == null);
        assert (this.jEq == null);
        this.dOS();
        this.bf(true);
        this.bi(true);
        this.ht(true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jEj = null;
        this.dOZ();
        this.dOT();
    }

    @Override
    public boolean isUsable() {
        if (!super.isUsable()) {
            return false;
        }
        cpm_1[] cpm_1Array = this.chR();
        if (cpm_1Array == null || cpm_1Array.length <= 0) {
            return false;
        }
        for (cpm_1 cpm_12 : cpm_1Array) {
            if (cpm_12 == null) continue;
            cpm_12.aH(this);
            if (!cpm_12.isUsable() || !cpm_12.bxO()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        if (this.jEj == null) {
            return this.dOU();
        }
        return aum_0.cWf().a(106, (long)this.jEj.d(), new Object[0]);
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (!this.isVisible()) {
            return false;
        }
        this.b(rw_02);
        this.c(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        if (this.jEj != null) {
            return this.jEj.dNn();
        }
        return rw_0.blx[0];
    }

    @Override
    public rw_0[] dNf() {
        if (this.jEj != null) {
            return this.jEj.dNf();
        }
        return rw_0.blx;
    }

    @Override
    public cpm_1[] dNh() {
        if (this.jEj == null) {
            return this.dOV();
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fdf[] fdfArray = this.jEj.fTa();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = 0; i < fdfArray.length; ++i) {
            fdf fdf2 = fdfArray[i];
            if (fdf2.fTl()) continue;
            fqy_0 fqy_02 = fqz_0.giz().YY(fdf2.clf());
            if (fdf2.fTk() == 0) {
                jEh.error((Object)("Le visual " + i + " du generic param " + this.jEj.d() + " n'a pas de group d'action"));
                continue;
            }
            ahv_2 ahv_22 = new ahv_2();
            short s = fdf2.fTi();
            ArrayList<bCJ> arrayList2 = new ArrayList<bCJ>();
            fde_0 fde_02 = null;
            for (fde_0 fde_03 : fdf2.fTg()) {
                if (fde_03.fTe() != s) continue;
                fde_02 = fde_03;
                break;
            }
            if (fde_02 == null) continue;
            for (fdd fdd2 : fde_02.fTf()) {
                bCJ bCJ2 = bCL.d(fdd2);
                if (bCJ2 == null || bCJ2.bdo() != null && !bCJ2.bdo().b(bgt_02, null, null, bgt_02.bdV())) continue;
                String string = bCJ2.bkt();
                if (string != null) {
                    if (ahv_22.bXe() != 0) {
                        ahv_22.ceH();
                    }
                    ahv_22.c(string);
                }
                boolean bl = bCJ2.bH(bgt_02);
                boolean bl2 = bCJ2.bI(bgt_02);
                if (!bl || !bl2) continue;
                arrayList2.add(bCJ2);
            }
            if (fde_02.fTf().length != 0 && arrayList2.isEmpty()) continue;
            cqv_1 cqv_12 = (cqv_1)cps_1.njs.eLI();
            cqv_12.CV(fqy_02.giv());
            cqv_12.qb("desc.mru." + fqy_02.giw());
            cqv_12.pY(bah_1.c(fdf2.cnM(), fdf2.oP(), fdf2.cmP(), fdf2.cmN()));
            cqv_12.jU(bah_1.b(fdf2.cnM(), fdf2.oP(), fdf2.cmP(), fdf2.cmN()));
            int n = 1;
            cqv_12.setEnabled(true);
            cqv_12.qa(ahv_22.ceL());
            cqv_12.cL(s);
            cqv_12.U(arrayList2);
            arrayList.add(cqv_12);
        }
        return arrayList.toArray(new cpm_1[arrayList.size()]);
    }

    @Override
    public void dNq() {
        super.dNq();
        try {
            int n = Integer.parseInt(this.baB);
            fdc_0 fdc_02 = (fdc_0)fda_0.rWI.a(fdv_0.rZh, n);
            if (fdc_02 == null) {
                jEh.error((Object)("[LD] L'IE de g\u00e9n\u00e9ric " + this.aXv + " \u00e0 un parametre [" + n + "] qui ne correspond a rien dans les Admins"));
                return;
            }
            this.jEj = fdc_02;
        }
        catch (NumberFormatException numberFormatException) {
            jEh.warn((Object)("ancien param\u00e9trage pour l'IE g\u00e9n\u00e9ric " + this.Sn()));
            if (!this.baB.isEmpty() && this.baB.charAt(0) == '{') {
                this.dOW();
            }
            this.dOX();
        }
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    @Override
    public void aVR() {
        super.aVR();
        if (this.jEj == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("elementId", this.Sn());
        for (fdf fdf2 : this.jEj.fTa()) {
            if (!fdf2.fTl()) continue;
            fde_0 fde_02 = fdf2.fTh();
            for (fdd fdd2 : fde_02.fTf()) {
                if (fdd2.fTd() != fdS.rYo) continue;
                afx_1 afx_12 = cdp_0.a(exj_1.rIC, fdd2.avZ(), hashMap);
                if (this.jEq == null) {
                    this.jEq = new ArrayList();
                }
                this.jEq.add(afx_12);
                afx_12.cau();
            }
        }
    }

    @Override
    public void aVS() {
        super.aVS();
        this.dOZ();
    }

    private void dOZ() {
        if (this.jEq == null) {
            return;
        }
        for (afx_1 afx_12 : this.jEq) {
            afx_12.k(jEi);
            afx_12.caA();
            afx_12.cay();
        }
        this.jEq = null;
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDg(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bzJ bzJ2, ayv_2 ayv_22) {
        bzJ2.a(ayv_22);
    }
}

