/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from fFA
 */
public class ffa_1
extends asn_1 {
    private static final String uqm = "minAlpha";
    private static final String uqn = "maxAlpha";
    private static final String uqo = "px";
    private static final String uqp = "py";
    private static final String uqq = "pw";
    private static final String uqr = "ph";
    private static final String uqs = "texSize";

    private static asl_1 gvH() {
        return new asl_1(new ase_1(uqm, asf_1.cZr), new ase_1(uqn, asf_1.cZr), new ase_1(uqo, asf_1.cZr), new ase_1(uqp, asf_1.cZr), new ase_1(uqq, asf_1.cZr), new ase_1(uqr, asf_1.cZr), new ase_1(uqs, asf_1.cZr));
    }

    public ffa_1() {
        super(fyw_0.gqw().tCv + "gui.cgfx", "AngleDesat", ffa_1.gvH());
    }

    public void fN(float f2) {
        this.cZG.c(uqm, f2);
    }

    public void fO(float f2) {
        this.cZG.c(uqn, f2);
    }

    public void setPixmap(awg_1 awg_12) {
        this.cZG.c(uqo, awg_12.getX());
        this.cZG.c(uqp, awg_12.getY());
        this.cZG.c(uqq, awg_12.getWidth());
        this.cZG.c(uqr, awg_12.getHeight());
        acc_1 acc_12 = awg_12.bHg().bQt();
        this.cZG.c(uqs, acc_12.bWx());
    }

    @Override
    public void a(EntitySprite entitySprite) {
        entitySprite.a(this.bJY(), this.bJZ(), this.cZG);
    }

    public asl_1 bJT() {
        if (!avh_2.dhF.bMU()) {
            this.cZG.c("gColorScale", asa_1.cZh.bX("gColorScale"));
        }
        return this.cZG;
    }
}

