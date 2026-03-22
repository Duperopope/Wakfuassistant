/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/*
 * Renamed from bSt
 */
public class bst_2
implements aeh_2 {
    public static final String lgC = "name";
    public static final String lgD = "territoryName";
    public static final String lgE = "cash";
    public static final String lgF = "taxes";
    public static final String lgG = "satisfaction";
    public static final String lgH = "animation";
    public static final String lgI = "animName";
    public static final String lgJ = "inChaos";
    private final fnd_0 lgK;
    private final bJr lgL;
    private ZG lgM;
    private ArrayList lgN;
    public static final String[] lgO = new String[]{"name", "cash", "taxes", "satisfaction", "inChaos"};

    public bst_2(fnd_0 fnd_02) {
        this.lgK = fnd_02;
        this.lgL = bjx_0.klY.HC(fnd_02.d());
        if (this.lgL.gfR() != this.lgK.ems()) {
            this.lgL.s(this.lgK.ems());
        }
    }

    @Override
    public String[] bxk() {
        return lgO;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lgC)) {
            String string2 = aum_0.cWf().a(48, (long)this.ctn(), new Object[0]);
            return string2 + (String)(this.lgK.exj() ? " " + aum_0.cWf().c("chaos.label", new Object[0]) : "");
        }
        if (string.equals(lgD)) {
            return this.lgL.eaw();
        }
        if (string.equals(lgE)) {
            return DecimalFormat.getIntegerInstance().format(this.emK()) + " \u00a7";
        }
        if (string.equals(lgG)) {
            if (this.lgN == null) {
                int n = this.lgK.emM();
                int n2 = this.lgK.emO();
                this.lgN = new ArrayList(n);
                for (int i = 0; i < n; ++i) {
                    this.lgN.add(i < n2);
                }
            }
            return this.lgN;
        }
        if (string.equals(lgH)) {
            return this.eee();
        }
        if (string.equals(lgI)) {
            return this.getAnimName();
        }
        if (string.equals(lgF)) {
            return (int)(this.emP() * 100.0f) + " %";
        }
        if (string.equals(lgJ)) {
            return this.lgK.exj();
        }
        return null;
    }

    public long emK() {
        return this.lgK.emK();
    }

    public float emL() {
        return this.lgK.emM() == 0 ? -1.0f : (float)this.lgK.emO() / (float)this.lgK.emM();
    }

    public int emM() {
        return this.lgK.emM();
    }

    public boolean emN() {
        return this.emM() == 0 || this.emM() == this.lgK.emO();
    }

    public int emO() {
        return this.lgK.emO();
    }

    public float emP() {
        return this.lgK.gdP();
    }

    public int ctn() {
        return this.lgK.d();
    }

    public bkr_0 emQ() {
        return bkr_0.c(fpb.gj(this.lgK.emO(), this.lgK.emM()));
    }

    public String getAnimName() {
        return this.emQ().bkI();
    }

    public ZG eee() {
        if (this.lgM == null) {
            ZG zG = new ZG(aym_2.bSE(), 0.0f, 0.0f, 0.0f);
            String string = this.lgK.d() + ".anm";
            try {
                zG.k(auc_0.cVq().bS("ANMGUIPath") + string, true);
            }
            catch (IOException iOException) {
                return null;
            }
            catch (fu_0 fu_02) {
                return null;
            }
            zG.dP(string);
            this.lgM = zG;
        }
        this.lgM.dV(this.getAnimName());
        this.lgM.dT(this.getAnimName());
        return this.lgM;
    }

    public String eaw() {
        return this.lgL.eaw();
    }
}

