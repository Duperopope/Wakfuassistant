/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

/*
 * Renamed from Xv
 */
public class xv_0
extends xi_0
implements xa_0 {
    private xf_0 bRU;
    private int o;
    private int atn = 3;
    private float aPY;
    private float aPZ;
    private final acr_1 bRV = new acr_1();

    public xv_0(awh_2 awh_22, String string) {
        this(awh_22, string, -1);
    }

    public xv_0(awh_2 awh_22, String string, int n) {
        this(awh_22, string, new xw_0(), n);
    }

    public xv_0(awh_2 awh_22, String string, xf_0 xf_02, int n) {
        super(awh_22, string, n);
        this.bny().a((GeometryBackground)null);
        this.bny().a(awh_22);
        this.bRU = xf_02;
    }

    public xf_0 bnN() {
        return this.bRU;
    }

    public void a(xf_0 xf_02) {
        this.bRU = xf_02;
    }

    public float bnO() {
        return 2.0f;
    }

    @Override
    public void b(float f2, float f3, float f4, float f5) {
        this.bRV.m(f2, f3, -1.0f);
        this.bny().a(this.bRV);
        this.bny().ce((int)f4, (int)f5);
        this.aPY = f2;
        this.aPZ = f3;
        this.bnK();
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        this.qy(n);
    }

    @Override
    public void qy(int n) {
        super.qy(n);
        this.bnN().a(this, n);
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    public void lK(int n) {
        this.o = n;
    }

    @Override
    public int aHp() {
        return this.atn;
    }

    @Override
    public void ma(int n) {
        this.atn = n;
    }

    @Override
    public EntityText bny() {
        return super.bny();
    }

    @Override
    public void bmX() {
        this.aZp();
    }

    void bnK() {
        this.bny().bIS().d(0, this.aPY, this.aPZ);
    }

    public float aSc() {
        return this.aPY;
    }

    public void ap(float f2) {
        this.aPY = f2;
    }

    public float aSd() {
        return this.aPZ;
    }

    public void aq(float f2) {
        this.aPZ = f2;
    }

    @Override
    public /* synthetic */ Entity getEntity() {
        return this.bny();
    }

    static /* synthetic */ int a(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int b(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int c(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int d(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int e(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int f(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int g(xv_0 xv_02) {
        return xv_02.bnA();
    }

    static /* synthetic */ int h(xv_0 xv_02) {
        return xv_02.bnA();
    }
}

