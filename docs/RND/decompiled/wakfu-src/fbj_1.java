/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TIntHashSet;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fBJ
 */
public class fbj_1
extends fch_1 {
    private static final Logger tVk = Logger.getLogger(fbj_1.class);
    public static final String TAG = "MasterRootContainer";
    public static final String tVl = "masterRootContainerWidth";
    public static final String tVm = "masterRootContainerHeight";
    private static final fbj_1 tVn = new fbj_1();
    private fes_2 tVo;
    private fes_2 tVp;
    private flp_2 tVq;
    private MouseEvent tVr = null;
    private flp_2 tVs = null;
    private MouseEvent tVt = null;
    private fsm_1 tVu = null;
    private boolean tVv = false;
    private fes_2 tVw;
    private boolean tVx = false;
    private int tVy;
    private final TIntHashSet tVz = new TIntHashSet();
    private fbw_2 tVA;
    boolean tVB = true;
    private boolean tVC = false;
    private final ArrayList<fbl_2> tVD = new ArrayList();
    private boolean tVE = false;

    private fbj_1() {
    }

    public static fbj_1 getInstance() {
        return tVn;
    }

    public void dKc() {
        this.a(fzq_0.tJH, new fbk_1(this), false);
        this.a(fzq_0.tKh, (fiq_1 fiq_12) -> {
            fsm_1 fsm_12 = this.getSize();
            fse_1.gFu().f(tVl, fsm_12.width);
            fse_1.gFu().f(tVm, fsm_12.height);
            return false;
        }, false);
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        this.tVu = new fsm_1(n, n2);
        this.setNeedsToPreProcess();
    }

    @Override
    public fbj_1 getMasterRootContainer() {
        return this;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fes_2 getMouseOver() {
        return this.tVo;
    }

    public flp_2 getCurrentMouseEvent() {
        return this.tVs;
    }

    public MouseEvent getCurrentAWTMouseEvent() {
        return this.tVt;
    }

    public fbw_2 getPopupContainer() {
        return this.tVA;
    }

    public boolean isResized() {
        return this.tVv;
    }

    public boolean isKeyEventConsumed() {
        return this.tVB;
    }

    public void setKeyEventConsumed(boolean bl) {
        this.tVB = bl;
    }

    @Override
    public void setElementMap(fhs_2 fhs_22) {
        super.setElementMap(fhs_22);
        this.tZP.setElementMap(fhs_22);
    }

    @Override
    protected void oy(boolean bl) {
        boolean bl2 = this.bmg;
        super.oy(bl);
        fhn_1.gzT().a(fzo_0.tHq);
        if (bl2 != bl) {
            for (fbl_2 fbl_22 : this.tVD) {
                if (bl) {
                    fbl_22.a(this);
                    continue;
                }
                fbl_22.b(this);
            }
        }
    }

    public void a(fbl_2 fbl_22) {
        if (!this.tVD.contains(fbl_22)) {
            this.tVD.add(fbl_22);
        }
    }

    public void b(fbl_2 fbl_22) {
        this.tVD.remove(fbl_22);
    }

    public void gtw() {
        this.aVH();
        this.aVI();
        this.setSize(fmt_1.gEy().gED());
        fhv_2 fhv_22 = fyw_0.gqw().gqD();
        fhv_22.n(this.bVe);
    }

    @Override
    public boolean isInWidgetTree() {
        return true;
    }

    @Override
    public boolean isInTree() {
        return true;
    }

    public boolean isDragging() {
        return this.tVw != null;
    }

    public fes_2 getDragged() {
        return this.tVw;
    }

    public int getDragButton() {
        return this.tVy;
    }

    public void setDragged(fes_2 fes_22, int n) {
        this.tVw = fes_22;
        this.tVy = n;
    }

    public boolean isShiftPressed() {
        return this.tVC;
    }

    public void gtx() {
        if (this.tVw != null) {
            this.tVw = null;
            this.tVy = 0;
            fil_1.gBx().cancel();
        }
    }

    public void p(fes_2 fes_22) {
        if (this.tVw == fes_22) {
            this.tVw = null;
            this.tVy = 0;
            fil_1.gBx().bmX();
        }
        if (this.tVo == fes_22) {
            this.tVo = null;
        }
        if (this.tVp == fes_22) {
            this.tVp = null;
        }
    }

    public void gty() {
        if (this.tVr != null) {
            this.g(this.tVr);
        }
    }

    public boolean isMovePointMode() {
        return this.tVE;
    }

    public void setMovePointMode(boolean bl) {
        this.tVE = bl;
        fhn_1.gzT().a(bl ? fzo_0.tHO : fzo_0.tHq);
    }

    public boolean g(MouseEvent mouseEvent) {
        flp_2 flp_22;
        fes_2 fes_22;
        this.tVr = mouseEvent;
        this.tVt = mouseEvent;
        int n = this.ukt.height - mouseEvent.getY();
        int n2 = mouseEvent.getX();
        boolean bl = false;
        if (!fhx_2.gAQ().hb(n2, n)) {
            bl = true;
        }
        if (this.tVw == null && bl) {
            this.tVt = null;
            return true;
        }
        fhz_2.gAS().hc(n2, n);
        fes_2 fes_23 = fes_22 = !bl ? this.getWidget(n2, n) : null;
        if (fes_22 != null) {
            if (fes_22 != this || fes_22 != this.tVo) {
                fhn_1.gzT().a(fes_22.getCursorType());
            }
            flp_22 = flp_2.l(mouseEvent);
            flp_22.x((fhv_1)fes_22);
            flp_22.qu(n2);
            flp_22.qv(n);
            flp_22.b(fzq_0.tJM);
            this.tVs = flp_22;
            this.tVt = mouseEvent;
            fes_22.h(flp_22);
        }
        if (this.tVE) {
            fhn_1.gzT().a(fzo_0.tHO);
        }
        if (fes_22 != this.tVo) {
            flr_1 flr_12;
            if (this.tVo != null) {
                flp_22 = flp_2.l(mouseEvent);
                flp_22.x((fhv_1)this.tVo);
                flp_22.qu(n2);
                flp_22.qv(n);
                flp_22.b(fzq_0.tJR);
                this.tVs = flp_22;
                this.tVo.h(flp_22);
                this.tVs = null;
                flr_12 = flr_1.gEr();
                flr_12.x(this.tVo);
                flr_12.b(fzq_0.tJY);
                this.tVo.h(flr_12);
            }
            if (fes_22 != null) {
                flp_22 = flp_2.l(mouseEvent);
                flp_22.x((fhv_1)fes_22);
                flp_22.qu(n2);
                flp_22.qv(n);
                flp_22.b(fzq_0.tJQ);
                this.tVs = flp_22;
                fes_22.h(flp_22);
                this.tVs = null;
                flr_12 = flr_1.gEr();
                flr_12.x(fes_22);
                flr_12.b(fzq_0.tJX);
                fes_22.h(flr_12);
            }
            this.tVo = fes_22;
        }
        if (this.tVw != null) {
            this.tVs = flp_2.l(mouseEvent);
            this.tVs.x((fhv_1)this.tVw);
            this.tVs.qu(n2);
            this.tVs.qv(n);
            this.tVs.b(fzq_0.tJO);
            if (!fil_1.gBx().d(this.tVo, n2, n)) {
                if (this.tVx) {
                    flp_22 = flp_2.o(this.tVs);
                    flp_22.b(fzq_0.tJN);
                    this.tVw.h(flp_22);
                    this.tVx = false;
                }
                this.tVw.h(this.tVs);
            } else {
                this.tVs.aZp();
            }
            this.tVs = null;
        }
        fib_2.gBU().hc(mouseEvent.getX(), n);
        this.tVt = null;
        fht_2.gBk().w(fes_22);
        return this.tVw != null;
    }

    public boolean b(MouseEvent mouseEvent) {
        int n = mouseEvent.getButton();
        if (n == 0) {
            return false;
        }
        this.tVt = mouseEvent;
        int n2 = mouseEvent.getX();
        int n3 = this.ukt.height - mouseEvent.getY();
        if (!fhx_2.gAQ().hb(n2, n3)) {
            this.tVt = null;
            this.tVz.add(n);
            return true;
        }
        fhz_2.gAS().hc(n2, n3);
        fes_2 fes_22 = this.getWidget(n2, n3);
        if (fes_22 == null) {
            fes_22 = this;
        }
        fhw_2.gAL().s(fes_22);
        flp_2 flp_22 = flp_2.l(mouseEvent);
        flp_22.x((fhv_1)fes_22);
        flp_22.qu(n2);
        flp_22.qv(n3);
        flp_22.b(fzq_0.tJS);
        this.tVs = flp_22;
        if (this.tVw == null && fes_22 != this) {
            this.tVx = true;
            this.tVw = fes_22;
            this.tVy = n;
            fil_1.gBx().c(fes_22, n2, n3);
        }
        fhz_2.gAS().a(fes_22, flp_22);
        if (this.tVq != null) {
            this.tVq.aZp();
        }
        this.tVq = flp_2.o(flp_22);
        fes_22.h(flp_22);
        this.tVs = null;
        this.tVt = null;
        if (fes_22 != this) {
            this.tVz.add(n);
        }
        return fes_22 != this;
    }

    public boolean c(MouseEvent mouseEvent) {
        boolean bl;
        int n = mouseEvent.getButton();
        if (n == 0) {
            return false;
        }
        this.tVt = mouseEvent;
        int n2 = mouseEvent.getX();
        int n3 = this.ukt.height - mouseEvent.getY();
        boolean bl2 = this.tVy == n;
        boolean bl3 = bl = !fhx_2.gAQ().hb(n2, n3);
        if (bl && !bl2) {
            this.tVt = null;
            return this.tVz.remove(n);
        }
        fhz_2.gAS().hc(n2, n3);
        fes_2 fes_22 = this.getWidget(n2, n3);
        if (fes_22 == null) {
            fes_22 = this;
        }
        flp_2 flp_22 = null;
        if (!bl) {
            flp_22 = flp_2.l(mouseEvent);
            flp_22.x((fhv_1)fes_22);
            flp_22.qu(n2);
            flp_22.qv(n3);
            flp_22.b(fzq_0.tJT);
            flp_22.P(this.tVq);
            this.tVs = flp_22;
        }
        if (bl2) {
            flp_2 flp_23 = flp_2.l(mouseEvent);
            flp_23.x((fhv_1)fes_22);
            flp_23.qu(n2);
            flp_23.qv(n3);
            flp_23.b(fzq_0.tJP);
            this.tVw.h(flp_23);
            this.tVw = null;
            this.tVy = 0;
            fil_1.gBx().e(fes_22, n2, n3);
        }
        if (!bl) {
            fhz_2.gAS().b(fes_22, flp_22);
            fes_22.h(flp_22);
            this.tVs = null;
        }
        this.tVt = null;
        return this.tVz.remove(n);
    }

    public boolean a(MouseWheelEvent mouseWheelEvent) {
        this.tVt = mouseWheelEvent;
        int n = mouseWheelEvent.getX();
        int n2 = this.ukt.height - mouseWheelEvent.getY();
        if (!fhx_2.gAQ().hb(n, n2)) {
            return true;
        }
        fes_2 fes_22 = this.getWidget(n, n2);
        if (fes_22 == null) {
            fes_22 = this;
        }
        flp_2 flp_22 = flp_2.l(mouseWheelEvent);
        flp_22.x((fhv_1)fes_22);
        flp_22.qu(n);
        flp_22.qv(n2);
        flp_22.acb(mouseWheelEvent.getWheelRotation());
        flp_22.b(fzq_0.tJW);
        this.tVs = flp_22;
        fes_22.h(flp_22);
        this.tVs = null;
        this.tVt = null;
        return fes_22 != this;
    }

    public boolean b(KeyEvent keyEvent) {
        boolean bl;
        boolean bl2;
        boolean bl3 = false;
        if (!fhx_2.gAQ().aJG() && !fyw_0.gqw().gqA().e(keyEvent)) {
            bl3 = true;
        }
        fii_2.gBX().keyPressed(keyEvent);
        if (keyEvent.getKeyCode() == 16) {
            this.tVC = true;
        }
        boolean bl4 = bl2 = (keyEvent.getModifiersEx() & 0x200) == 512;
        if (bl2 && keyEvent.getKeyCode() == 17) {
            this.setMovePointMode(true);
        }
        boolean bl5 = bl = (keyEvent.getModifiersEx() & 0x80) == 128;
        if (keyEvent.getKeyCode() == 9 && !bl) {
            if ((keyEvent.getModifiersEx() & 0x40) == 64) {
                fhw_2.gAL().gAO();
            } else {
                fhw_2.gAL().gAP();
            }
            return bl3;
        }
        return bl3 |= this.a(keyEvent, fzq_0.tJF);
    }

    public boolean c(KeyEvent keyEvent) {
        boolean bl;
        boolean bl2 = false;
        if (!fhx_2.gAQ().aJG() && !fyw_0.gqw().gqA().e(keyEvent)) {
            bl2 = true;
        }
        fii_2.gBX().keyReleased(keyEvent);
        if (keyEvent.getKeyCode() == 16) {
            this.tVC = false;
        }
        if (keyEvent.getKeyCode() == 17) {
            this.setMovePointMode(false);
        }
        if (bl = this.a(keyEvent, fzq_0.tJG)) {
            fyw_0.gqw().gqA().bCz();
            this.setMovePointMode(false);
        }
        return bl | bl2;
    }

    public boolean a(KeyEvent keyEvent) {
        return this.a(keyEvent, fzq_0.tJH);
    }

    private boolean a(KeyEvent keyEvent, fzq_0 fzq_02) {
        int n = keyEvent.getKeyCode();
        fes_2 fes_22 = fhw_2.gAL().gAM();
        fes_2 fes_23 = fes_22 == null ? this : fes_22;
        fli_2 fli_22 = fli_2.gDX();
        fli_22.x(fes_23);
        fli_22.q(keyEvent.getKeyChar());
        fli_22.ta(n);
        fli_22.abZ(keyEvent.getModifiersEx());
        fli_22.b(fzq_02);
        this.tVB = false;
        boolean bl = fes_23.h(fli_22);
        return this.tVB || bl;
    }

    @Override
    public boolean LZ(int n) {
        if (this.tVv) {
            this.tVv = false;
        }
        boolean bl = false;
        if (this.tVu != null) {
            super.setSize(this.tVu.width, this.tVu.height, false);
            this.tVu = null;
            this.tVv = true;
            bl = true;
        }
        return bl |= super.LZ(n);
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        Point point = fmt_1.gEy().gEz();
        this.bVe.bIS().d(0, point.x, point.y + this.ukt.height);
        return bl;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.setTreeDepth(0);
        this.ukD = false;
        this.tVv = false;
        this.ukX = true;
        this.tVA = new fbw_2();
        this.tVA.aVI();
        this.tZP.d(this.tVA, 30000);
        fau_2.tQS.aVI();
        this.tZP.d(fau_2.tQS, -40000);
        fau_2.tQS.setElementMap(new fhs_2("", fyw_0.gqw().gqC()));
        fau_2.tQS.onChildrenAdded();
        this.setScreenPosition(0, 0);
        this.dKc();
        this.ukW = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tVw = null;
        this.tVr = null;
        this.tVo = null;
        this.tVs = null;
        this.tVt = null;
        this.tVu = null;
        this.tVA = null;
    }

    @Override
    protected void eKZ() {
        super.eKZ();
    }

    public Point getRelativePosition(@Nullable fes_2 fes_22) {
        Point point = new Point();
        fes_2 fes_23 = fes_22;
        while (fes_23 != null && fes_23 != this) {
            fes_2 fes_24 = fes_23.getParentOfType(fes_2.class);
            point.x = point.x + (fes_23.getX() + fes_23.getLeftMargin() + (fes_24 == null ? 0 : fes_24.getLeftPadding()));
            point.y = point.y + (fes_23.getY() + fes_23.getBottomMargin() + (fes_24 == null ? 0 : fes_24.getBottomPadding()));
            fes_23 = fes_24;
        }
        return point;
    }
}

