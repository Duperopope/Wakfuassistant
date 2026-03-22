/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beS
 */
public class bes_2
implements aeh_2 {
    public static final String hOB = "name";
    public static final String hOC = "level";
    public static final String hOD = "nameAndLevel";
    public static final String hOE = "iconUrl";
    public static final String hOF = "description";
    public static final String hOG = "canBeIncreased";
    public static final String hOH = "canBeDecreased";
    public static final String hOI = "categoryHasTooManyPoints";
    private static final String[] hOJ = new String[]{"name", "level", "nameAndLevel", "iconUrl", "description", "canBeIncreased", "canBeDecreased", "categoryHasTooManyPoints"};
    public static final Comparator<bes_2> hOK = Comparator.comparingInt(bes_2::deX);
    private final ehy_0 hOL;
    private final ber_2 hOM;
    private final bep_2 hON;

    public bes_2(ehy_0 ehy_02, ber_2 ber_22, bep_2 bep_22) {
        this.hOL = ehy_02;
        this.hOM = ber_22;
        this.hON = bep_22;
    }

    public int deX() {
        return this.hON.d();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "level": {
                return this.cmL();
            }
            case "nameAndLevel": {
                String string2 = this.cmL() + (String)(this.hON.bWc() == 0 ? "" : "/" + this.hON.bWc());
                return this.getName() + " - " + aum_0.cWf().c("levelShort.custom", string2);
            }
            case "iconUrl": {
                return auc_0.cVq().a("aptitudeIconsPath", "defaultIconPath", this.hON.aVt());
            }
            case "description": {
                return this.getDescription();
            }
            case "canBeIncreased": {
                return this.dfb();
            }
            case "canBeDecreased": {
                return this.dfa();
            }
            case "categoryHasTooManyPoints": {
                return this.hOM.deT() < 0;
            }
        }
        return null;
    }

    private String getName() {
        return aum_0.cWf().a(146, (long)this.hON.d(), new Object[0]);
    }

    public short cmL() {
        return this.hOL.PG(this.hON.d());
    }

    private String getDescription() {
        exx_2 exx_22;
        ahv_2 ahv_22 = new ahv_2();
        if (this.hON.bWc() != 0 && this.cmL() == this.hON.bWc()) {
            ahv_22.ceu();
            ahv_22.c(aum_0.cWf().c("aptitudes.maxLevelReached", new Object[0]));
            ahv_22.cev();
        }
        if ((exx_22 = this.deY()) != null) {
            ahv_22.ceH().ceH().c(aum_0.cWf().c(exx_22.name() + "Description", new Object[0]));
        }
        short s = this.cmL();
        ahv_22.ceH().ceH().ceA().c(aum_0.cWf().c("aptitudes.currentLevelEffects", new Object[0])).ceB().ceH();
        ahv_22.c(this.bk(s));
        if (!this.deZ()) {
            short s2 = (short)(s + 1);
            ahv_22.c("\n\n").ceA().c(aum_0.cWf().c("aptitudes.nextLevelEffects", new Object[0])).ceB().c("\n");
            ahv_22.c(this.bk(s2));
        }
        return ahv_22.ceL();
    }

    @Nullable
    private exx_2 deY() {
        enk_0 enk_02 = bat_2.cZD().RN(this.hON.aZH());
        if (enk_02 == null) {
            return null;
        }
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        if (!(ero_02 instanceof eON)) {
            return null;
        }
        eot_0 eot_02 = (eot_0)ero_02;
        return (exx_2)eot_02.fCY();
    }

    private String bk(short s) {
        eHH eHH2 = new eHH(this.hON, s);
        ArrayList<String> arrayList = eLL.a(new eLT<eHH>(eHH2, this.hON.d(), s));
        ahv_2 ahv_22 = new ahv_2();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            if (i > 0) {
                ahv_22.ceH();
            }
            ahv_22.c(arrayList.get(i));
        }
        return ahv_22.ceL();
    }

    private boolean deZ() {
        return this.hON.bWc() != 0 && this.cmL() >= this.hON.bWc();
    }

    private boolean dfa() {
        return this.hOL.PG(this.hON.d()) > 0;
    }

    private boolean dfb() {
        return !this.deZ() && this.hOL.an(this.hON.d(), 1, cvu_2.eUq());
    }

    public void dfc() {
        fse_1.gFu().a((aef_2)this, hOC, hOD, hOG, hOH, hOI);
        this.dfd();
        fse_1.gFu().a((aef_2)this.hOM, "remainingPoints", "tagRoundStyle");
    }

    private void dfd() {
        bes_2 bes_22 = (bes_2)fse_1.gFu().vY("describedAptitude");
        if (bes_22 != null && bes_22.deX() == this.deX()) {
            fse_1.gFu().a((aef_2)this, hOF);
        }
    }

    public ber_2 dfe() {
        return this.hOM;
    }

    public int bl(short s) {
        if (this.hON.bWc() == 0) {
            return this.hOL.s(this.hOM.d(), s);
        }
        return Math.min(this.hON.bWc() - this.cmL(), this.hOL.s(this.hOM.d(), s));
    }

    @Override
    public String[] bxk() {
        return hOJ;
    }
}

