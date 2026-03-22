/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bng
 */
public class bng_1
implements aeh_2 {
    protected static final Logger iGz = Logger.getLogger(bng_1.class);
    public static final String iGA = "speakerIconUrl";
    public static final String iGB = "speakerName";
    public static final String iGC = "currentText";
    public static final String iGD = "currentChoices";
    public static final String[] iGE = new String[]{"speakerIconUrl", "speakerName", "currentText", "currentChoices"};
    private qb_0 iGF;
    private final emh_0 iGG;
    private final long iGH;
    private final String iGI;
    private final String iGJ;
    private ArrayList<bnf_1> iGK;
    private String[] iGL;
    private static final int iGM = 800;
    public static final int iGN = -2;
    public static final int iGO = -1;
    private int iGP = 0;
    private boolean iGQ = false;

    public bng_1(qb_0 qb_02, emh_0 emh_02, long l, String string, String string2) {
        this.iGG = emh_02;
        this.iGH = l;
        this.iGI = string;
        this.iGJ = string2;
        this.b(qb_02);
    }

    @Override
    public String[] bxk() {
        return iGE;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iGA)) {
            return auc_0.cVq().kC(this.cjv());
        }
        if (string.equals(iGB)) {
            return this.iGF.aZs().or(this::dya).orElseGet(() -> switch (this.iGG) {
                case emh_0.qMU -> {
                    bgy var1_1 = bgg_0.dlO().ju(this.iGH);
                    if (var1_1 == null) {
                        yield null;
                    }
                    yield var1_1.getName();
                }
                case emh_0.qMT -> {
                    bJr var1_2 = (bJr)bjx_0.klY.Ym((int)this.iGH);
                    if (var1_2 == null) {
                        yield null;
                    }
                    yield var1_2.getName();
                }
                default -> null;
            });
        }
        if (string.equals(iGC)) {
            return this.iGL == null ? "" : this.iGL[this.iGP] + (this.dyg() ? "" : " [...]");
        }
        if (string.equals(iGD)) {
            return this.dyc();
        }
        return null;
    }

    public String cjv() {
        if (this.iGF != null && this.iGF.aZt().isPresent()) {
            return this.iGF.aZt().get();
        }
        return this.iGI;
    }

    private Optional<String> dya() {
        if (aum_0.cWf().e(159, this.iGF.d())) {
            return Optional.of(aum_0.cWf().a(159, (long)this.iGF.d(), new Object[0]));
        }
        return Optional.empty();
    }

    public String dyb() {
        if (this.iGF != null && this.iGF.aZt().isPresent()) {
            return this.iGF.aZt().get();
        }
        return this.iGJ;
    }

    private ArrayList<bnf_1> dyc() {
        if (this.iGK != null) {
            return this.iGK;
        }
        this.iGK = new ArrayList();
        if (!this.dyg()) {
            this.iGK.add(new bnf_1(-2, bne_1.iGh));
            this.iGQ = true;
            return this.iGK;
        }
        if (this.iGF.aZq() == 0) {
            this.iGQ = true;
            this.iGK.add(new bnf_1(-1, bne_1.iGh));
            return this.iGK;
        }
        this.iGQ = false;
        Iterator<qc_0> iterator = this.iGF.aZr();
        while (iterator.hasNext()) {
            qc_0 qc_02 = iterator.next();
            if (!qc_02.a(aue_0.cVJ().cVK(), this.dyd())) continue;
            this.iGK.add(new bnf_1(qc_02.d(), bne_1.bu(qc_02.aZv())));
        }
        return this.iGK;
    }

    private qe_0 dyd() {
        switch (this.iGG) {
            case qMU: {
                return (bhx_0)bgg_0.dlO().ju(this.iGH);
            }
            case qMT: {
                return bjx_0.klY.Ym((int)this.iGH);
            }
        }
        return null;
    }

    public void b(qb_0 qb_02) {
        this.iGF = qb_02;
        this.iGK = null;
        this.iGP = 0;
        String string = aum_0.cWf().a(75, (long)this.iGF.d(), new Object[0]);
        ArrayList<String> arrayList = new ArrayList<String>();
        while (string.length() > 800) {
            String string2 = string.substring(0, 800);
            int n = string2.lastIndexOf(" ");
            arrayList.add(string.substring(0, n));
            string = string.substring(n + 1);
        }
        arrayList.add(string);
        this.iGL = new String[arrayList.size()];
        for (int i = 0; i < this.iGL.length; ++i) {
            this.iGL[i] = (String)arrayList.get(i);
        }
        fse_1.gFu().a((aef_2)this, iGE);
    }

    public int dye() {
        return this.iGF.d();
    }

    public ArrayList<bnf_1> dyf() {
        return this.iGK;
    }

    public boolean dyg() {
        return this.iGP == this.iGL.length - 1;
    }

    public void dyh() {
        ++this.iGP;
        if (this.dyg()) {
            this.iGK = null;
        }
        fse_1.gFu().a((aef_2)this, iGC, iGD);
    }

    public boolean dyi() {
        return this.iGQ;
    }

    public void reset() {
        this.iGL = null;
        fse_1.gFu().a((aef_2)this, iGC);
    }
}

