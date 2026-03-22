/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fAU
 */
public class fau_2
extends feq_1
implements afS,
afZ {
    public static final fau_2 tQS = new fau_2();
    public static final String TAG = "compass";
    public static final String tQT = "progressBar";
    public static final String tQU = "compassOrientation";
    fce_2 kqa;
    fbt_1 tQV;
    fbt_1 tQW;
    float aQj;
    private float tQX;
    private final ArrayList<afQ> tQY = new ArrayList();
    public static final int tQZ = 92960979;
    public static final int tRa = -490041217;

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(tQT)) {
            return this.kqa;
        }
        if (string.equals(tQU)) {
            return this.tQW;
        }
        return null;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    private float getEffectiveProximity() {
        float f2 = 0.05f;
        float f3 = 0.3f;
        return (1.0f - this.tQX) * 0.3f + 0.05f;
    }

    private void gsJ() {
        float f2 = this.aQj + (float)Math.PI * 2 * this.getEffectiveProximity() / 2.0f;
        this.kqa.getProgressBarMesh().setDeltaAngle(f2);
        this.kqa.gtF();
    }

    public void setAngle(float f2) {
        this.aQj = f2;
        this.tQW.getImageMesh().b(acp_1.dAW, f2);
        this.gsJ();
        this.gsm();
        this.setNeedsToPostProcess();
    }

    public void setProximity(float f2) {
        this.tQX = f2;
        this.kqa.getProgressBarMesh().setFullCirclePercentage(this.getEffectiveProximity());
        this.gsJ();
    }

    @Override
    public void a(afQ afQ2) {
        awk_1 awk_12;
        this.tQY.add(afQ2);
        if (!afQ2.byl()) {
            afQ2.C(this.getTarget().bcC(), this.getTarget().bcD(), this.getTarget().bcE());
        }
        if ((awk_12 = fic_1.gBr().vp(afQ2.byf())) == null) {
            uxJ.error((Object)("On essai d'ajouter un marqueur avec l'url=" + afQ2.byf() + " mais l'icone n'exite pas !!!"));
            return;
        }
        fze fze2 = new fze();
        fze2.aVI();
        fze2.setPixmap(new awg_1(awk_12));
        this.tQV.d(fze2);
        this.setVisible(true);
    }

    @Override
    public void b(afQ afQ2) {
        this.tQY.remove(afQ2);
        this.setVisible(false);
    }

    private float bF(float f2, float f3) {
        if (f2 == 0.0f && f3 < 0.0f) {
            f2 = -1.0E-4f;
        }
        if (f2 == 0.0f && f3 == 0.0f) {
            return -1.5707964f;
        }
        float f4 = aco_1.bm(f2, f3);
        float f5 = f3 / f4;
        float f6 = -f2 / f4;
        double d2 = Math.acos(f5);
        return (float)((double)Math.signum(f6) * d2) - 1.5707964f;
    }

    public void a(afV afV2, int n) {
        if (this.tQY.isEmpty()) {
            return;
        }
        afQ afQ2 = this.tQY.get(0);
        float f2 = this.getTarget().getWorldX();
        float f3 = this.getTarget().getWorldY();
        float f4 = aco_1.bm(afQ2.byi() - afQ2.getStartX(), afQ2.byj() - afQ2.getStartY());
        float f5 = aco_1.bm(f2 - (float)afQ2.getX(), f3 - (float)afQ2.getY());
        this.setProximity(1.0f - GC.b(f5 / (f4 * 1.2f), 0.0f, 1.0f));
        float f6 = afV2.aM(f2, f3);
        float f7 = afV2.j(f2, f3, this.getTarget().bcE());
        int n2 = afQ2.getScreenX();
        int n3 = afQ2.getScreenY();
        this.setAngle(this.bF(f6 - (float)n2, f7 - (float)n3));
    }

    public void a(afV afV2, float f2, float f3) {
    }

    @Override
    public void aVH() {
        super.aVH();
        this.kqa = null;
        this.tQW = null;
        this.tQV = null;
        this.tQY.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setSize(new fsm_1(200, 200));
        this.d(frp_12);
        fav_2 fav_22 = new fav_2(this);
        fav_22.aVI();
        this.a(fav_22);
        this.setVisible(false);
        this.setYOffset(-130);
        this.kqa = new fce_2();
        this.kqa.aVI();
        this.kqa.setDisplayType(fcf_2.tYe);
        this.kqa.setValue(1.0f);
        this.kqa.setNonBlocking(true);
        ffd_1 ffd_12 = (ffd_1)this.kqa.getProgressBarMesh();
        ffd_12.setInnerRadiusFactor(0.75f);
        ffd_12.setOuterRadiusFactor(0.8f);
        this.d(this.kqa);
        this.tQW = new fbt_1();
        this.tQW.aVI();
        this.tQW.setNonBlocking(true);
        this.d(this.tQW);
        this.tQV = new fbt_1();
        this.tQV.aVI();
        this.tQV.setNonBlocking(true);
        this.d(this.tQV);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fau_2 fau_22 = (fau_2)fhi_22;
        fau_22.setAngle(this.aQj);
        fau_22.setProximity(this.tQX);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92960979) {
            this.setAngle(Bw.o(string));
        } else if (n == -490041217) {
            this.setProximity(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92960979) {
            this.setAngle(Bw.o(object));
        } else if (n == -490041217) {
            this.setProximity(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

