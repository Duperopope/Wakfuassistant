/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTx
 */
public class btx_1
implements aeh_2 {
    protected static final Logger loB = Logger.getLogger(btx_1.class);
    public static final String loC = "categories";
    public static final String loD = "hasMultipleCategories";
    public static final String loE = "selectedCategory";
    public static final String loF = "selectedGroup";
    public static final String loG = "selectedServer";
    public static final String loH = "selectedServerType";
    public static final String[] loI = new String[]{"categories", "hasMultipleCategories", "selectedCategory", "selectedGroup", "selectedServer"};
    private static final String loJ = "groupScrollContainer";
    private static final int loK = 9;
    private static final int loL = 10;
    private static final int loM = 20;
    @NotNull
    private final TreeMap<ezx_0, btu_1> loN = new TreeMap(Comparator.comparingInt(ezx_0::aYs).reversed().thenComparing(Function.identity()));
    private final List<bta_2> loO = new ArrayList<bta_2>();
    @NotNull
    private ezx_0 loP = ezx_0.pve;
    @Nullable
    private bty_1 loQ;
    @Nullable
    private bta_2 loR;

    public btx_1(@Nullable btx_1 btx_12) {
        this.loP = btx_12 != null ? btx_12.loP : ezx_0.pve;
        this.loQ = btx_12 != null ? btx_12.loQ : null;
        this.loR = btx_12 != null ? btx_12.loR : null;
    }

    @NotNull
    public ezx_0 enH() {
        return this.loP;
    }

    public List<bta_2> enI() {
        return this.loO;
    }

    @NotNull
    public TreeMap<ezx_0, btu_1> enJ() {
        return this.loN;
    }

    @Nullable
    public bty_1 enK() {
        return this.loQ;
    }

    @Nullable
    public bta_2 enL() {
        return this.loR;
    }

    public void b(@NotNull ezt_0 ezt_02, @Nullable ezy_0 ezy_02) {
        ezx_0 ezx_02 = ezt_02.enC();
        Bu<bty_1, bta_2> bu = this.loN.computeIfAbsent(ezx_02, ezx_03 -> new btu_1(this, ezx_02)).a(ezt_02, ezy_02);
        this.loO.add(bu.aHI());
        if (this.loR != null && this.loR.enY().d() == ezt_02.d()) {
            this.loR = bu.aHI();
            this.loP = ezt_02.enC();
        } else if (this.loP == ezx_0.pve) {
            this.loP = ezx_02;
        }
        if (this.loQ != null && this.loQ.vD() == bu.getFirst().vD()) {
            this.loQ = bu.getFirst();
        }
        int n = 0;
        for (btu_1 btu_12 : this.loN.values()) {
            btu_12.dZ(n, this.loN.size());
            ++n;
            int n2 = 0;
            for (bty_1 bty_12 : btu_12.enD()) {
                bty_12.JB(n2);
                ++n2;
            }
        }
    }

    public void a(@NotNull ezx_0 ezx_02) {
        if (ezx_02 == this.loP) {
            return;
        }
        btu_1 btu_12 = this.loN.get((Object)this.loP);
        this.loP = ezx_02;
        btu_1 btu_13 = this.loN.get((Object)this.loP);
        fse_1.gFu().a((aef_2)this, loE);
        if (btu_12 != null) {
            fse_1.gFu().a((aef_2)btu_12, "isSelected");
        }
        if (btu_13 != null) {
            fse_1.gFu().a((aef_2)btu_13, "isSelected");
        }
    }

    public void d(bty_1 bty_12) {
        if (bty_12 == this.loQ) {
            return;
        }
        this.loQ = bty_12;
        fse_1.gFu().a((aef_2)this, loF);
        fse_1.gFu().a((aef_2)this.loQ, "communityStyle");
    }

    public void a(@NotNull bta_2 bta_22) {
        if (bta_22 == this.loR) {
            return;
        }
        Integer n = this.loR != null ? Integer.valueOf(this.loR.enY().d()) : null;
        this.loR = bta_22;
        fse_1.gFu().a((aef_2)this, loG);
        fse_1.gFu().a((aef_2)bta_22, "isSelected");
        if (n != null) {
            for (bta_2 bta_23 : this.loO) {
                if (bta_23.enY().d() != n.intValue()) continue;
                fse_1.gFu().a((aef_2)bta_23, "isSelected");
            }
        }
    }

    private void b(@NotNull bta_2 bta_22) {
        this.a(bta_22.enY().enC());
        this.a(bta_22);
        this.d(bta_22.eoa());
        this.c(bta_22);
        this.enQ();
        this.enM();
    }

    public void enM() {
        int n = this.loR == null ? 0 : this.loR.eog();
        axb_2 axb_22 = switch (n) {
            case 9 -> new fhl_2(ett_1.oqP);
            case 10 -> new fhl_2(ett_1.oqQ);
            case 20 -> new fhl_2(ett_1.oqR);
            default -> awx_2.dnG;
        };
        cvz_1.u(axb_22);
    }

    private void c(@NotNull bta_2 bta_22) {
        btu_1 btu_12 = this.loN.get((Object)bta_22.enY().enC());
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        for (bty_1 object2 : btu_12.enD()) {
            for (bta_2 bta_23 : object2.enT()) {
                if (!bl) {
                    ++n;
                }
                if (bta_23.enY().d() == bta_22.enY().d()) {
                    bl = true;
                }
                ++n2;
            }
        }
        fhv_1 fhv_12 = fyw_0.gqw().th("newServerChoiceDialog");
        fcq_2 fcq_22 = (fcq_2)fhv_12.getChildWithId(loJ);
        fcq_22.setVerticalScrollBarPosition(1.0f - (float)n / (float)n2);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case loC -> this.loN.values();
            case loD -> this.loN.size() > 1;
            case loE -> this.loN.get((Object)this.loP);
            case loF -> this.loQ;
            case loG -> this.loR;
            case loH -> crm_2.eMO().eMQ().aJr();
            default -> null;
        };
    }

    public void enN() {
        this.loN.values().forEach(btu_12 -> btu_12.enD().forEach(bty_12 -> fse_1.gFu().a((aef_2)bty_12, "charactersCountText", "displayCharactersCount")));
    }

    public void enO() {
        btu_1 btu_12 = this.loN.get((Object)this.loP);
        if (btu_12 == null) {
            return;
        }
        btu_12.enD().forEach(bty_12 -> fse_1.gFu().a((aef_2)bty_12, "servers"));
        fse_1.gFu().a((aef_2)btu_12, "groups");
    }

    public void enP() {
        Optional<Object> optional;
        Object object3;
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.ljV);
        Optional<bta_2> optional2 = this.loO.stream().filter(bta_22 -> bta_22.enY().d() == n).findFirst();
        if (optional2.isPresent() && this.loP == optional2.get().enY().enC()) {
            this.b(optional2.get());
            return;
        }
        short s = 0;
        Object object2 = null;
        for (Object object3 : this.loO.stream().filter(bta_22 -> bta_22.enY().enC() == this.loP).toList()) {
            optional = btc_2.eoi().JC(object3.enY().d());
            if (optional.isEmpty() || optional.get() <= s) continue;
            s = optional.get();
            object2 = object3;
        }
        if (object2 != null) {
            this.b((bta_2)object2);
            return;
        }
        Object object4 = aup_0.cWk();
        object3 = object4 == vb_0.bIU ? vb_0.bIU : vb_0.bIW;
        optional = this.loO.stream().filter(arg_0 -> btx_1.a((vb_0)((Object)object3), arg_0)).filter(bta_22 -> bta_22.enY().enC() == this.loP).findFirst();
        if (optional.isPresent()) {
            this.b((bta_2)optional.get());
            return;
        }
        this.loO.stream().filter(bta_22 -> bta_22.enY().enC() == this.loP).findFirst().ifPresent(this::b);
    }

    public Optional<bta_2> JA(int n) {
        for (bta_2 bta_22 : this.loO) {
            if (bta_22.enY().d() != n || !bta_22.cBt()) continue;
            return Optional.of(bta_22);
        }
        return Optional.empty();
    }

    public void enQ() {
        this.nE("");
    }

    public void nE(String string) {
        String string2;
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.llc);
        crf_2 crf_22 = crf_2.Mk(n);
        if (this.loR == null || this.loR.eog() == 0 || crf_22 == crf_2.noi) {
            aaw_1.bUq().h(new dae_0(17273));
            return;
        }
        try {
            string2 = auc_0.cVq().bS("serverBackgroundIllustrationPath");
        }
        catch (fu_0 fu_02) {
            loB.warn((Object)("Error retrieving server background illustration at path : " + fu_02.getMessage()));
            aaw_1.bUq().h(new dae_0(17273));
            return;
        }
        dae_0 dae_02 = new dae_0(19343);
        String string3 = crf_22.ao(string2, this.loR.eog() + string);
        dae_02.fa(string3);
        aaw_1.bUq().h(dae_02);
    }

    public void n(axb_2 axb_22) {
        dae_0 dae_02 = new dae_0(17266);
        dae_02.D(axb_22);
        aaw_1.bUq().h(dae_02);
    }

    @Override
    public String[] bxk() {
        return loI;
    }

    private static /* synthetic */ boolean a(vb_0 vb_02, bta_2 bta_22) {
        return bta_22.enY().fnh() == vb_02;
    }
}

