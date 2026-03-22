/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fRN
 */
public class frn_1
extends frc_1 {
    private static final Logger vaF = Logger.getLogger(frn_1.class);
    private final frl_1 vaG;
    private fes_2 tCV;
    private final String vaH;
    private String awN;

    public frn_1(frl_1 frl_12, fes_2 fes_22, String string) {
        this.vaG = frl_12;
        this.tCV = fes_22;
        this.vaH = string;
    }

    public frn_1(frl_1 frl_12, String string, String string2) {
        this.vaG = frl_12;
        this.awN = string;
        this.vaH = string2;
    }

    public frc_1 getConstraint() {
        if (this.tCV == null) {
            fhu_1 fhu_12 = fyw_0.gqw().gqC();
            if (fhu_12 == null) {
                fhu_12 = fyw_0.gqw().gqC();
            }
            this.tCV = (fes_2)fhu_12.uH(this.awN);
            if (this.tCV == null) {
                vaF.warn((Object)("Impossible de trouver le widget " + this.awN));
            }
        }
        if (this.vaG.getConstraint(this.tCV) == null) {
            return null;
        }
        return this.vaG.getConstraint(this.tCV).getConstraint(this.vaH);
    }

    @Override
    public int getValue() {
        frc_1 frc_12 = this.getConstraint();
        return frc_12 != null ? frc_12.getValue() : 0;
    }

    @Override
    public void setValue(int n) {
        this.getConstraint().setValue(n);
    }
}

