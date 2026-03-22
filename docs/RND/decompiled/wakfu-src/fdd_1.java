/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import org.apache.log4j.Logger;

/*
 * Renamed from fDd
 */
public class fdd_1
extends feq_1
implements WT {
    private static final Logger uca = Logger.getLogger(fdd_1.class);
    public static final String TAG = "smiley";
    public static final String ucb = "animatedElementViewer";
    private String ucc;
    private boolean ucd;
    private boolean uce = true;
    public static int lHp = Integer.MIN_VALUE;
    private fax_1 ucf;
    private float azQ;

    public void aB(String string, String string2) {
        this.b(string, string2, true);
    }

    public void b(String string, String string2, boolean bl) {
        this.ucc = string;
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.ucc);
        assert (fhs_22 != null) : "Impossible de charger un smiley";
        this.ucf = (fax_1)fhs_22.uH(ucb);
        if (this.ucf == null) {
            throw new Exception("On a charg\u00e9 un Widget de Smiley, mais il n'a pas de widget d'animatedElementViewer...");
        }
        this.ucd = bl;
        this.setAnimation(string2);
        this.azQ = this.ucf.getAnimatedElement().getScale();
    }

    public void setAnimation(String string) {
        this.ucf.setAnimName(string);
    }

    public void setTarget(ZG zG) {
        this.setTarget((ZC)zG);
    }

    public void setTarget(ZC zC) {
        if (zC == this.ujX) {
            return;
        }
        if (this.ujX != null && this.ujX instanceof ZC) {
            ((ZC)this.ujX).b(this);
        }
        super.setTarget(zC);
        if (zC != null) {
            zC.a(this);
            this.setTargetIsVisible(zC.isVisible());
        }
    }

    @Override
    public void gss() {
        if (this.ucd) {
            this.guv();
        } else {
            this.setSmileyIsVisible(false);
        }
    }

    public void setSmileyIsVisible(boolean bl) {
        if (this.uce == bl) {
            return;
        }
        this.uce = bl;
        this.bqn();
    }

    @Override
    protected void bqn() {
        this.setVisible(this.ujY && this.uce);
    }

    @Override
    public final void bFM() {
        super.bFM();
    }

    @Override
    public acc_1 getComputedPosition(int n, int n2, int n3) {
        acc_1 acc_12 = super.getComputedPosition(n, n2, n3);
        int n4 = acc_12.bWx();
        int n5 = acc_12.bWy();
        acc_12.cG(n4, n5);
        return acc_12;
    }

    @Override
    public void a(WQ wQ, int n, int n2, int n3) {
        this.bqn();
        super.a(wQ, n, n2, 0);
    }

    @Override
    protected void f(int n, float f2) {
        super.f(n, f2);
        float f3 = f2 - 0.5f + this.azQ;
        this.ucf.setScale(f3);
        float f4 = 1.0f;
        long l = this.getWatcherContainerAdviser().bnA();
        int n2 = this.getDuration();
        if (l < (long)(n2 / 4)) {
            f4 = (float)l / ((float)n2 / 4.0f);
        } else if (l > (long)(n2 * 3 / 4)) {
            f4 = 1.0f - ((float)l - (float)(3 * n2) / 4.0f) / ((float)n2 - (float)(3 * n2) / 4.0f);
        }
        Material material = (Material)Material.daL.bSK();
        material.p(f4, f4, f4, f4);
        this.ucf.setMaterial(material);
        material.bsI();
    }

    public void setDuration(int n) {
        this.uka.setDuration(n);
    }

    public void bnz() {
        this.uka.aaK(0);
        this.bqn();
    }

    public fax_1 getAnimatedElementViewer() {
        return this.ucf;
    }

    public int getAdviserId() {
        return this.uka.d();
    }

    public String getWidgetId() {
        return this.ucc;
    }

    public void guv() {
        fyw_0.gqw().tl(this.ucc);
    }

    @Override
    public void b(boolean bl, WU wU) {
        this.setTargetIsVisible(bl);
    }

    @Override
    public float getWorldX() {
        if (this.ujX != null) {
            return this.ujX.getWorldX();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.ujX != null) {
            return this.ujX.getWorldY();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.ujX != null) {
            return this.ujX.getAltitude();
        }
        return 0.0f;
    }

    public int getDuration() {
        return this.uka.getDuration();
    }

    @Override
    public void gsh() {
        super.gsh();
        if (this.ujX != null && this.ujX instanceof ZC) {
            ((ZC)this.ujX).b(this);
        }
    }
}

