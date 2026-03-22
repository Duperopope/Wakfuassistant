/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aaj
 */
public abstract class aaj_0
extends afV
implements aba_1,
aby_1,
abz_1 {
    static final Logger bYa = Logger.getLogger(aaj_0.class);
    public static final String bYb = "contents/gfx";
    public static final String bYc = "contents/sounds";
    protected String bXZ = "contents/gfx";
    protected String bYd = "contents/sounds";
    private int bYe;
    private int bYf;
    protected final ArrayList<afZ> bYg = new ArrayList();
    private boolean bYh;
    private final acd_1 bYi = new acd_1(Integer.MIN_VALUE, Integer.MIN_VALUE, (short)Short.MIN_VALUE);
    private final Matrix44 bYj = Matrix44.dAb.bWs();
    protected arr_2 bYk;
    protected final aaa_0 bYl;
    protected boolean bYm;
    private boolean bYn;
    private boolean bYo;
    protected final awx_2 bYp = new awx_2(new float[0]);
    protected boolean bYq;
    private final Matrix44 bYr = (Matrix44)Matrix44.dAb.bSJ();
    private final ach_1 bYs = new ach_1();
    private wy_0 bYt;
    private boolean bYu;
    final aaC bYv = new aaC();
    final aaC bYw = new aaC();

    public aaj_0() {
        this(null, aaa_0.brC());
        this.brb();
    }

    protected aaj_0(arr_2 arr_22, aaa_0 aaa_02) {
        this.a(aaE.brU());
        this.a(adn_0.bvh());
        this.a(agZ.bzy());
        this.a(agx_0.bze());
        this.a(ahl.bzR());
        this.a(xd_0.bnv());
        this.bYk = arr_22;
        this.bYl = aaa_02;
    }

    @Override
    protected agb bqK() {
        return new aak_0(this, this);
    }

    public final aag_0 bqL() {
        return (aag_0)super.brf();
    }

    public void bM(boolean bl) {
        this.bYh = bl;
    }

    public void ec(String string) {
        this.bXZ = string;
        aai.bqJ().ec(string);
    }

    public void ed(String string) {
        aeH.bwA().en(string);
        aeH.bwA().buq();
    }

    public int bqM() {
        return this.bYe;
    }

    public int bqN() {
        return this.bYf;
    }

    public void a(afZ afZ2) {
        this.bYg.add(afZ2);
    }

    public void b(afZ afZ2) {
        this.bYg.remove(afZ2);
    }

    @Override
    public void bqO() {
        this.bN(true);
        super.bqO();
    }

    public void bqP() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.bYk.c(hashSet);
        for (Entity entity : hashSet) {
            entity.bGY();
        }
    }

    public void bqQ() {
        HashSet<Entity> hashSet = new HashSet<Entity>();
        this.bYk.c(hashSet);
        for (Entity entity : hashSet) {
            entity.bsI();
        }
        this.bYk.clear();
        super.bqO();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void bN(boolean bl) {
        this.bYj.bPx();
        this.dw(false);
        this.a(awx_2.dnG);
        this.bYk.clear();
        this.bqR();
        this.bYl.clear();
        this.bM(true);
        this.csb.clear();
        this.csc.clear();
        this.bYm = false;
        aaC aaC2 = this.bYv;
        synchronized (aaC2) {
            this.bYv.reset();
        }
    }

    protected void bqR() {
        aah_0.brY().brZ();
        adn_0.bvh().bvj();
        agZ.bzy().bzB();
        xd_0.bnv().bnx();
        acq_0.cge.reset();
        XQ.bSY.clear();
        ast_1.bJG().bJN();
    }

    @Override
    public void init(GLAutoDrawable gLAutoDrawable) {
        this.bYn = true;
        super.init(gLAutoDrawable);
        this.bqS();
    }

    @Override
    public void bb(int n, int n2) {
        if (this.drD != (float)n || this.drE != (float)n2) {
            super.bb(n, n2);
        }
        this.csf.bD(n, n2);
    }

    public void bqS() {
        if (this.csf != null) {
            this.bYm = false;
        }
    }

    @Override
    public void bqT() {
        super.bqT();
        this.bYm = false;
    }

    private void bqU() {
        this.bYk.clear();
        int n = this.cse.size();
        for (int i = 0; i < n; ++i) {
            this.bYk.a((Entity)this.cse.get(i), 0);
        }
        if (this.bYk instanceof RenderTreeStencil) {
            aeD.cnx.b((RenderTreeStencil)this.bYk);
        }
    }

    @Override
    public void qy(int n) {
        if (!this.ra(n)) {
            return;
        }
        super.qy(n);
        aag_0 aag_02 = this.bqL();
        aag_02.qy(n);
        aaj_0.a(aag_02);
        this.qY(n);
        this.bP(this.bYh);
        this.qZ(n);
        this.rb(n);
        this.bqW();
        this.bqU();
        this.bqX();
        this.bqV();
        ast_1.bJG().qF(n);
    }

    private static void a(agf agf2) {
        int n = (int)Math.floor(agf2.bsf());
        int n2 = (int)Math.floor(agf2.bsg());
        WX.m(n, n2, 2);
    }

    private void qY(int n) {
        int n2 = this.bYg.size();
        for (int i = 0; i < n2; ++i) {
            afZ afZ2 = this.bYg.get(i);
            afZ2.a(this, n);
        }
    }

    private void bqV() {
        int n = this.csc.size();
        for (int i = 0; i < n; ++i) {
            this.bYk.c((Entity)this.csc.get(i));
        }
        this.csb.clear();
        this.csc.clear();
    }

    protected final void bqW() {
        int n;
        this.csd.resetQuick();
        int n2 = Math.min(this.csb.size(), 32766);
        for (n = 0; n < n2; ++n) {
            Entity entity = (Entity)this.csb.get(n);
            if (entity.bSW() < 0) continue;
            long l = entity.cWM;
            afX.fU(l);
            this.csd.add((l << 15) + (long)n);
        }
        this.csd.sort();
        this.cse.clear();
        n = this.csd.size();
        for (int i = 0; i < n; ++i) {
            int n3 = (int)(this.csd.getQuick(i) & 0x7FFFL);
            assert (n3 >= 0);
            Entity entity = (Entity)this.csb.get(n3);
            this.b(entity);
        }
    }

    protected void b(Entity entity) {
        this.cse.add(entity);
    }

    protected final void qZ(int n) {
        this.bYl.b(this, n);
        this.aC(this.csf.bsf(), this.csf.bsg());
    }

    protected final boolean ra(int n) {
        if (!this.isInitialized()) {
            this.cse.clear();
            return false;
        }
        if (this.csf == null) {
            return false;
        }
        if (asj_2.bJt().bJu()) {
            return false;
        }
        if (asj_2.bJt().bJw()) {
            this.csf.qy(n);
            this.bP(this.bYh);
            return false;
        }
        return true;
    }

    protected void rb(int n) {
        acq_0.cge.c(this, n);
    }

    private void bqX() {
        acL acL2 = acL.btU();
        acL2.reset();
        atg_2 atg_22 = aru_2.cVG.bIv();
        this.a((art_1)atg_22);
        acL2.k(this.cse);
        acL2.a(atg_22.bIp(), this.csf);
        acL2.f(this);
    }

    protected final void a(GL2 gL2) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(0);
        ava_2 ava_22 = ava_2.bMH();
        ava_22.cY(true);
        ava_22.cY(1.0f);
        ava_22.a(gL2, auy_2.dfX, Matrix44.dAe);
        ava_22.a(gL2, this.bRp());
        this.a((art_1)atg_22);
        ava_2.bMH().reset();
        ast_1.bJG().bJJ();
    }

    private void a(art_1 art_12) {
        if (!asj_2.bJt().bJu()) {
            agb agb2 = this.byu();
            float f2 = agb2.byB();
            float f3 = -agb2.bsh() * f2;
            float f4 = -agb2.bsi() * f2;
            this.bYj.bPx();
            if (this.bYo) {
                this.bYj.B(-f2, f2, 1.0f);
                this.bYj.A(-f3, f4, 0.0f);
            } else {
                this.bYj.B(f2, f2, 1.0f);
                this.bYj.A(f3, f4, 0.0f);
            }
            this.bYs.a(acp_1.dAW, agb2.aRX());
            this.bYr.c(this.bYs);
            this.bYj.e(this.bYr);
        }
        art_12.b(this.bYj);
    }

    protected void a(atg_2 atg_22) {
        this.a((art_1)atg_22);
    }

    @Override
    public void b(GL2 gL2) {
        if (!this.bYn) {
            return;
        }
        atg_2 atg_22 = aru_2.cVG.bIv();
        this.a(gL2);
        this.a(atg_22);
        this.b(atg_22);
        if (this.brd()) {
            aal.bc((int)this.csf.bsf(), (int)this.csf.bsg());
        }
        if (this.bre()) {
            aal.bd((int)this.csf.bsf(), (int)this.csf.bsg());
        }
    }

    protected void b(atg_2 atg_22) {
        ast_1.bJG().a(this.bYk, atg_22);
    }

    private void a(aag_0 aag_02) {
        boolean bl = this.b(aag_02);
        if (this.bYu == bl) {
            return;
        }
        this.bO(bl);
        this.bYu = bl;
    }

    protected void bO(boolean bl) {
    }

    private boolean b(aag_0 aag_02) {
        if (aag_02.bfb()) {
            return this.bYu;
        }
        int n = aag_02.bcC();
        int n2 = aag_02.bcD();
        int n3 = 0;
        if (this.byv() != null) {
            n3 = (int)Math.ceil(this.byv().getAltitude() + 0.5f);
        }
        if (this.bYi.L(n, n2, n3) && this.bYl.brP()) {
            return this.bYu;
        }
        this.bYi.Q(n, n2, (short)n3);
        DisplayedScreenElement displayedScreenElement = aag_0.a(this.bYl, n, n2, n3);
        if (displayedScreenElement == null) {
            aag_02.bqH();
            return false;
        }
        int n4 = displayedScreenElement.bcC();
        int n5 = displayedScreenElement.bcD();
        int n6 = displayedScreenElement.bqh();
        aag_02.ba(n6, displayedScreenElement.vD());
        boolean bl = false;
        if (n6 == 0) {
            bl = false;
        } else {
            if (this.bYt == null || !this.bYt.bmp().aK(n4, n5)) {
                this.bYt = wa_0.aQ(n4, n5);
            }
            if (this.bYt == null) {
                bYa.error((Object)("pas de map topologique aux coordonn\u00e9es " + n4 + " " + n5));
                return this.bYu;
            }
            short s = displayedScreenElement.bcE();
            bl = this.bYt.f(n4, n5, s);
        }
        return bl;
    }

    public void bP(boolean bl) {
        aag_0 aag_02 = this.bqL();
        if (!this.bYm) {
            this.bYm = true;
        }
        this.bYh = false;
        this.a(aag_02);
        this.bYl.a(aag_02.byJ());
    }

    protected void aC(float f2, float f3) {
        int n = this.bYg.size();
        for (int i = 0; i < n; ++i) {
            this.bYg.get(i).a(this, f2, f3);
        }
        try {
            this.bYl.c(this);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public ArrayList<DisplayedScreenElement> a(float f2, float f3, float f4, aar aar2) {
        return this.a(f2, f3, f4, aar2, 0.0f, 0.0f);
    }

    public ArrayList<DisplayedScreenElement> a(float f2, float f3, float f4, aar aar2, float f5, float f6) {
        if (this.csf == null) {
            return null;
        }
        int n = (int)(this.bT(f2) + (float)this.csf.byK() - f5);
        int n2 = (int)(this.bU(f3) + (float)this.csf.byL() - f6);
        ArrayList<DisplayedScreenElement> arrayList = new ArrayList<DisplayedScreenElement>();
        this.bYl.a(n, n2, arrayList);
        if (aar2.brv()) {
            int n3 = 0;
            while (n3 < arrayList.size()) {
                float f7;
                DisplayedScreenElement displayedScreenElement = arrayList.get(n3);
                float f8 = f7 = displayedScreenElement.bYU.bsz().bwX() == 0 ? 0.55f : 1.0f;
                if (this.a(n, n2, displayedScreenElement) > f7) {
                    arrayList.remove(n3);
                    continue;
                }
                ++n3;
            }
        }
        aar2.a(arrayList, new aax_0(this, f4, n, n2));
        return arrayList;
    }

    private float a(int n, int n2, DisplayedScreenElement displayedScreenElement) {
        int n3 = displayedScreenElement.bcC();
        int n4 = displayedScreenElement.bcD();
        float f2 = this.aM(n3, n4);
        float f3 = this.j(n3, n4, displayedScreenElement.bcE());
        float f4 = ((float)n - f2) / this.crY;
        float f5 = ((float)n2 - f3) / this.crZ;
        return Math.abs(f4) + Math.abs(f5);
    }

    protected final float bT(float f2) {
        if (this.bYo) {
            return (-f2 + this.drD * 0.5f) / this.csf.byB();
        }
        return (f2 - this.drD * 0.5f) / this.csf.byB();
    }

    protected final float bU(float f2) {
        return (this.drE * 0.5f - f2) / this.csf.byB();
    }

    public ArrayList<adj_0> aD(float f2, float f3) {
        if (this.csf == null) {
            return null;
        }
        return adn_0.bvh().ax(this.bT(f2), this.bU(f3));
    }

    @Override
    public abstract boolean a(MouseEvent var1);

    @Override
    public abstract boolean b(MouseEvent var1);

    @Override
    public abstract boolean c(MouseEvent var1);

    @Override
    public abstract boolean d(MouseEvent var1);

    @Override
    public abstract boolean e(MouseEvent var1);

    @Override
    public boolean f(MouseEvent mouseEvent) {
        this.bYe = mouseEvent.getX();
        this.bYf = mouseEvent.getY();
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        this.bYe = mouseEvent.getX();
        this.bYf = mouseEvent.getY();
        return false;
    }

    @Override
    public abstract boolean a(MouseWheelEvent var1);

    @Override
    public abstract boolean a(KeyEvent var1);

    @Override
    public abstract boolean b(KeyEvent var1);

    @Override
    public abstract boolean c(KeyEvent var1);

    public String toString() {
        return "zoom=" + this.csf.byB() + ", " + super.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(agV agV2, @NotNull Entity entity, int n, int n2, int n3, int n4, boolean bl) {
        aaC aaC2 = this.bYv;
        synchronized (aaC2) {
            int n5 = this.bYv.b(this.bYl, n, n2, n3);
            entity.cWM = afX.a(n, n2, n5, n4);
            DisplayedScreenElement displayedScreenElement = this.bYv.c(this.bYl, n, n2, n3);
            agX.a(agV2, displayedScreenElement);
            return displayedScreenElement != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final int n(int n, int n2, int n3) {
        aaC aaC2 = this.bYv;
        synchronized (aaC2) {
            DisplayedScreenElement displayedScreenElement = this.bYv.c(this.bYl, n, n2, n3);
            return displayedScreenElement == null ? 0 : displayedScreenElement.bqh();
        }
    }

    @Override
    public abstract boolean a(FocusEvent var1);

    @Override
    public abstract boolean b(FocusEvent var1);

    public void a(axb_2 axb_22) {
        if (this.bYp.aTn() == axb_22.aTn()) {
            return;
        }
        this.bYp.op(axb_22.aTn());
        this.bYq = true;
    }

    public boolean bqY() {
        return this.bYl.brN();
    }

    public final void bqZ() {
        aag_0 aag_02 = this.bqL();
        this.bYu = this.b(aag_02);
    }

    public aaa_0 bra() {
        return this.bYl;
    }

    public final void brb() {
        this.bYk = (arr_2)RenderTreeStencil.cbz.bSJ();
    }

    public final aaj_0 brc() {
        this.qy(0);
        aaj_0 aaj_02 = this.a(this.bYk);
        aaj_02.e(this);
        aaj_02.bqP();
        return aaj_02;
    }

    protected abstract aaj_0 a(arr_2 var1);

    protected void e(aaj_0 aaj_02) {
        this.bYj.c(aaj_02.bYj);
        this.bYn = aaj_02.bYn;
        this.bYp.op(aaj_02.bYp.bPU());
        this.bYq = aaj_02.bYq;
        this.bb((int)aaj_02.bRq(), (int)aaj_02.bRr());
        this.cse.addAll(aaj_02.cse);
        this.csd.add(aaj_02.csd.toArray());
    }

    public final void bQ(boolean bl) {
        aal.bQ(bl);
    }

    public final boolean brd() {
        return aal.brd();
    }

    public final void bR(boolean bl) {
        aal.bR(bl);
    }

    public final boolean bre() {
        return aal.bre();
    }

    @Override
    public /* synthetic */ agf brf() {
        return this.bqL();
    }
}

