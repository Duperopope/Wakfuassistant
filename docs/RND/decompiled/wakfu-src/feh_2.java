/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.ArrayList;

/*
 * Renamed from fEH
 */
public class feh_2
extends fes_2
implements afS,
afZ {
    private static final feh_2 uni = new feh_2();
    public static final String TAG = "WorldPositionMarker";
    public static int unj;
    private static String tCu;
    private float unk;
    private float unl;
    private EntityGroup tTM;
    private final ArrayList<afQ> unm = new ArrayList();
    private final ArrayList<XulorParticleSystem> unn = new ArrayList();
    private static final ach_1 uno;

    private feh_2() {
    }

    public static feh_2 getInstance() {
        return uni;
    }

    public static void setParticlePath(String string) {
        tCu = string;
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.tTM);
    }

    @Override
    public void a(afQ afQ2) {
        this.unm.add(afQ2);
        XulorParticleSystem xulorParticleSystem = fmv_1.gEH().C(String.format(tCu, afQ2.bye()), 0);
        xulorParticleSystem.bIS().a(new awp_1());
        this.unn.add(xulorParticleSystem);
    }

    @Override
    public void b(afQ afQ2) {
        if (this.unm.remove(afQ2)) {
            XulorParticleSystem xulorParticleSystem = this.unn.remove(this.unn.size() - 1);
            xulorParticleSystem.bLH();
            xulorParticleSystem.bsI();
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    private int getOnScreenX(float f2, float f3, int n, int n2) {
        int n3 = this.getAppearance().getContentHeight() - n2;
        int n4 = this.getAppearance().getContentWidth() - n;
        float f4 = (float)n3 / (float)n4;
        float f5 = f3 - (float)(n3 / 2);
        float f6 = f2 - (float)(n4 / 2);
        float f7 = f5 / f6;
        if (Math.abs(f7) < f4) {
            return f6 > 0.0f ? n4 : 0;
        }
        return (int)(Math.signum(f6) * (float)n3 / 2.0f / Math.abs(f7)) + n4 / 2;
    }

    private int getOnScreenY(float f2, float f3, int n, int n2) {
        int n3 = this.getAppearance().getContentHeight() - n2;
        int n4 = this.getAppearance().getContentWidth() - n;
        float f4 = (float)n3 / (float)n4;
        float f5 = f3 - (float)(n3 / 2);
        float f6 = f2 - (float)(n4 / 2);
        float f7 = f5 / f6;
        if (Math.abs(f7) > f4) {
            return f5 > 0.0f ? n3 : 0;
        }
        return (int)(Math.signum(f5) * (float)n4 / 2.0f * Math.abs(f7)) + n3 / 2;
    }

    private void a(afQ afQ2, XulorParticleSystem xulorParticleSystem, float f2, float f3) {
        float f4 = (float)afQ2.getScreenX() - this.unk;
        float f5 = (float)afQ2.getScreenY() - this.unl;
        int n = this.getOnScreenX((float)((int)f4) + f2, (float)((int)f5) + f3, 50, 50);
        int n2 = this.getOnScreenY((float)((int)f4) + f2, (float)((int)f5) + f3, 50, 50);
        awp_1 awp_12 = (awp_1)xulorParticleSystem.bIS().uW(0);
        float f6 = (float)n - f2;
        float f7 = (float)n2 - f3;
        float f8 = this.bF(f6, f7) - (float)Math.PI;
        uno.a(acp_1.dAW, f8);
        awp_12.A(n + 25, n2 + 25, 0.0f);
        awp_12.a(uno);
        xulorParticleSystem.bIS().bPv();
        this.tTM.g(xulorParticleSystem);
    }

    private float bF(float f2, float f3) {
        if (f2 == 0.0f && f3 < 0.0f) {
            f2 = -1.0E-4f;
        }
        float f4 = aco_1.bm(f2, f3);
        float f5 = f3 / f4;
        float f6 = -f2 / f4;
        double d2 = Math.acos(f5);
        return (float)((double)Math.signum(f6) * d2);
    }

    public void clear() {
        this.unm.clear();
        for (int i = this.unn.size() - 1; i >= 0; --i) {
            XulorParticleSystem xulorParticleSystem = this.unn.remove(0);
            xulorParticleSystem.bLH();
            xulorParticleSystem.bsI();
        }
    }

    public void a(afV afV2, int n) {
        float f2 = (float)this.uki.getContentWidth() / 2.0f;
        float f3 = (float)this.uki.getContentHeight() / 2.0f;
        this.tTM.bJk();
        for (int i = this.unm.size() - 1; i >= 0; --i) {
            afQ afQ2 = this.unm.get(i);
            XulorParticleSystem xulorParticleSystem = this.unn.get(i);
            this.a(afQ2, xulorParticleSystem, f2, f3);
            xulorParticleSystem.ca((float)n / 1000.0f);
            xulorParticleSystem.b(this.tTM);
        }
    }

    public void a(afV afV2, float f2, float f3) {
        this.unk = afV2.aM(f2, f3);
        this.unl = afV2.aN(f2, f3);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tTM.bsI();
        this.tTM = null;
        this.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        this.d(frp_12);
        this.ukD = true;
        assert (this.tTM == null);
        this.tTM = (EntityGroup)EntityGroup.cXh.bSK();
        this.tTM.cWR = this;
        this.tTM.bIS().a(new awp_1());
    }

    static {
        uno = new ach_1();
    }
}

