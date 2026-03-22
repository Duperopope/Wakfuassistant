/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cRE
 */
public class cre_2
implements aeh_2 {
    private static final String nnZ = "illustration1";
    private static final String noa = "illustration2";
    private static final String[] nob = new String[]{"illustration1", "illustration2"};
    private static final String noc = "illustration1";
    private static final String nod = "illustration2";
    private boolean noe;
    private String nof;
    private String nog;
    private final String noh;

    public cre_2(String string, @NotNull crf_2 crf_22) {
        this.noh = string;
        this.nof = crf_22.qf(string);
        this.noe = true;
    }

    @Override
    public String[] bxk() {
        return nob;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case "illustration1" -> this.nof;
            case "illustration2" -> this.nog;
            default -> null;
        };
    }

    public void eMI() {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.llc);
        crf_2 crf_22 = crf_2.Mk(n);
        this.qd(crf_22.qf(this.noh));
    }

    public void qd(String string) {
        if (this.qe(string)) {
            return;
        }
        if (this.noe) {
            this.nog = string;
            fse_1.gFu().a((aef_2)this, "illustration2");
        } else {
            this.nof = string;
            fse_1.gFu().a((aef_2)this, "illustration1");
        }
        this.eMJ();
    }

    private boolean qe(String string) {
        String string2 = this.noe ? this.nof : this.nog;
        return BH.a(string, string2, false);
    }

    private void eMJ() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("illustrationDialog");
        fbt_1 fbt_12 = (fbt_1)fhs_22.uH("illustration1");
        fbt_1 fbt_13 = (fbt_1)fhs_22.uH("illustration2");
        if (fbt_12 == null || fbt_13 == null) {
            return;
        }
        fsa_2 fsa_22 = czc_1.a(fbt_12, !this.noe);
        fsa_2 fsa_23 = czc_1.a(fbt_13, this.noe);
        fbt_12.x(fsa_2.class);
        fbt_13.x(fsa_2.class);
        fbt_12.a(fsa_22);
        fbt_13.a(fsa_23);
        this.noe = !this.noe;
    }

    public void t(axb_2 axb_22) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("illustrationDialog");
        fbt_1 fbt_12 = this.noe ? (fbt_1)fhs_22.uH("illustration1") : (fbt_1)fhs_22.uH("illustration2");
        if (fbt_12 == null) {
            return;
        }
        fsa_2 fsa_22 = czc_1.a(fbt_12, axb_22);
        fbt_12.x(fsa_2.class);
        fbt_12.a(fsa_22);
    }
}

