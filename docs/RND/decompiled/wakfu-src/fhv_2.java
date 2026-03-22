/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLDrawable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.google.common.collect.Lists;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLDrawable;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHV
 */
public class fhv_2
extends axq_1
implements alt_2 {
    private static final Logger uzV = Logger.getLogger(fhv_2.class);
    private static final float uzW = 15.0f;
    private fmt_1 uzX;
    private fbj_1 uzY;
    @Nullable
    private ahj_0 uzZ;
    private final Collection<alu_2> uAa = new ArrayList<alu_2>();
    private final List<fhw_1> uAb = new ArrayList<fhw_1>();
    private int brs;
    private int brt;
    private static final awn_1 uAc = new awp_1();
    private static final int[] uAd = new int[]{0, 1, 2, 3};
    private static final boolean uAe = false;
    private static final int uAf = 5;
    private static final long uAg = 3000000L;
    public static int uAh;
    private static long uAi;
    private static boolean uAj;

    public fhv_2() {
        this.a(fyw_0.gqw());
    }

    @Override
    public void a(alu_2 alu_22) {
        if (!this.uAa.contains(alu_22)) {
            this.uAa.add(alu_22);
        }
    }

    @Override
    public void b(alu_2 alu_22) {
        if (this.uAa.contains(alu_22)) {
            this.uAa.remove(alu_22);
        }
    }

    public void a(fhw_1 fhw_12) {
        if (!this.uAb.contains(fhw_12)) {
            this.uAb.add(fhw_12);
        }
    }

    public void b(fhw_1 fhw_12) {
        if (this.uAb.contains(fhw_12)) {
            this.uAb.remove(fhw_12);
        }
    }

    public void a(@Nullable ahj_0 ahj_02) {
        this.uzZ = ahj_02;
    }

    @Override
    public void bb(int n, int n2) {
        fta_2 fta_22;
        super.bb(n, n2);
        int n3 = (int)((float)n / this.azQ);
        int n4 = (int)((float)n2 / this.azQ);
        int n5 = n3 - this.brs;
        int n6 = n4 - this.brt;
        this.brs = n3;
        this.brt = n4;
        if (this.uzX != null) {
            this.uzX.hg(this.brs, this.brt);
        }
        if (this.uzY != null) {
            this.uzY.setSize(this.brs, this.brt);
        }
        if ((fta_22 = fyw_0.gqw().gqy()) != null) {
            fta_22.eVg();
        }
        this.hd(n5, n6);
    }

    @Override
    protected int bRs() {
        aeb_1 aeb_12 = fyw_0.gqw().bCh();
        if (aeb_12 == null || !aeb_12.aK(aff.cpK.getKey())) {
            return super.bRs();
        }
        String string = aeb_12.ep(aff.cpJ.getKey());
        aho aho2 = ahm.eO(string);
        if (aho2.bAa() == ahn_0.cwO) {
            int n = 0;
            int n2 = 0;
            if (this.uzZ != null) {
                if (this.uzZ.bAV() != null) {
                    n = this.uzZ.bAV().bAq().left + this.uzZ.bAV().bAq().right;
                }
                if (!aho2.bAb()) {
                    Insets insets = this.uzZ.bAN();
                    n2 = insets.left + insets.right;
                }
            }
            return 1920 - n - n2;
        }
        return 1920;
    }

    @Override
    protected int bRt() {
        aeb_1 aeb_12 = fyw_0.gqw().bCh();
        if (aeb_12 == null || !aeb_12.aK(aff.cpK.getKey())) {
            return super.bRt();
        }
        String string = aeb_12.ep(aff.cpJ.getKey());
        aho aho2 = ahm.eO(string);
        if (aho2.bAa() == ahn_0.cwO) {
            int n = 0;
            int n2 = 0;
            if (this.uzZ != null) {
                if (this.uzZ.bAV() != null) {
                    n = this.uzZ.bAV().bAq().top + this.uzZ.bAV().bAq().bottom;
                }
                if (!aho2.bAb()) {
                    Insets insets = this.uzZ.bAN();
                    n2 = insets.top + insets.bottom;
                }
            }
            return 1080 - n - n2;
        }
        return 1080;
    }

    @Override
    public void setScale(float f2) {
        super.setScale(f2);
        if (this.uzY != null) {
            this.n(this.uzY.getEntity());
        }
    }

    public void i(float f2, int n) {
        this.drG = f2 + fhv_2.fU(n);
        this.gBm();
    }

    public void gBm() {
        this.bb(this.drC.getSurfaceWidth(), this.drC.getSurfaceHeight());
    }

    public static float fU(float f2) {
        return f2 / 15.0f;
    }

    public fbj_1 getMasterRootContainer() {
        return this.uzY;
    }

    @Override
    public void init(GLAutoDrawable gLAutoDrawable) {
        try {
            super.init(gLAutoDrawable);
            ((Component)gLAutoDrawable).setFocusTraversalKeysEnabled(false);
            this.uzX = fmt_1.gEy();
            this.uzX.hg(this.brs, this.brt);
            this.uzX.a((GLDrawable)gLAutoDrawable);
            fhu_1 fhu_12 = fyw_0.gqw().gqC();
            fhs_2 fhs_22 = fhu_12.uP("masterRootContainer");
            this.uzY = fbj_1.getInstance();
            this.uzY.aVI();
            this.uzY.setSize(this.brs, this.brt);
            this.uzY.setElementMap(fhs_22);
            this.uzY.getEntity().bIS().e(0, this.azQ, this.azQ);
            this.gBp();
        }
        catch (Throwable throwable) {
            uzV.error((Object)"Exception during XulorScene init", throwable);
        }
    }

    private void a(GL2 gL2) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        ava_2 ava_22 = ava_2.bMH();
        atg_22.dbl.uu(0);
        ava_22.cY(true);
        ava_22.a(auw_2.dfL, auw_2.dfM);
        ava_22.cY(1.0f);
        ava_22.a(gL2, auy_2.dfX, Matrix44.dAe);
        ava_22.a(gL2, auy_2.dfW, Matrix44.dAe);
        axv_1 axv_12 = this.bRp();
        ava_22.a(gL2, axv_12);
        uAc.bPx();
        float f2 = (float)(this.uzY.getWidth() - axv_12.bRD()) / 2.0f;
        float f3 = (float)(this.uzY.getHeight() - axv_12.bRE()) / 2.0f - (float)this.uzY.getHeight();
        uAc.A(f2, f3, 0.0f);
        atg_22.b(uAc.bIT());
        ava_2.bMH().reset();
    }

    @Override
    public void b(GL2 gL2) {
        if (!arn_2.bIc().bId()) {
            return;
        }
        this.a(gL2);
        atg_2 atg_22 = aru_2.cVG.bIv();
        try {
            if (this.uzY != null && this.uzY.isVisible()) {
                this.uzY.getEntity().b(atg_22);
            }
            int n = this.uAb.size();
            for (int i = 0; i < n; ++i) {
                this.uAb.get(i).a(atg_22, this.uzX);
            }
        }
        catch (Throwable throwable) {
            uzV.error((Object)"Exception during XulorScene display", throwable);
        }
    }

    public static boolean gBn() {
        return true;
    }

    public static void gBo() {
    }

    @Override
    public void qy(int n) {
        ast_1.bJG().qF(0);
        if (!arn_2.bIc().bId()) {
            return;
        }
        if (this.uzY != null && !this.uzY.isVisible()) {
            return;
        }
        try {
            super.qy(n);
            this.abP(n);
            if (this.uzY == null) {
                return;
            }
            if (fhc_2.gAV().gAX()) {
                fhc_2.gAV().bXC();
            }
            fhc_2.gAV().gAY();
            fhj_2.gBa().abF(n);
            fmw_1.uJG.qy(n);
        }
        catch (Throwable throwable) {
            uzV.error((Object)"Exception during XulorScene process", throwable);
        }
    }

    public void n(Entity entity) {
        entity.bIS().e(0, this.azQ, this.azQ);
    }

    public void f(axl_2 axl_22) {
        axl_22.setX((int)((float)axl_22.getX() * this.azQ));
        axl_22.setY((int)((float)axl_22.getY() * this.azQ));
        axl_22.setWidth((int)((float)axl_22.getWidth() * this.azQ));
        axl_22.setHeight((int)((float)axl_22.getHeight() * this.azQ));
    }

    public int abM(int n) {
        return (int)((float)n / this.azQ);
    }

    public int abN(int n) {
        return (int)((float)n / this.azQ);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return this.uzY != null && this.uzY.isVisible() && this.uzY.b(keyEvent);
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return this.uzY != null && this.uzY.isVisible() && this.uzY.c(keyEvent);
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return this.uzY != null && this.uzY.isVisible() && this.uzY.a(keyEvent);
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        if (!this.abO(mouseEvent.getButton())) {
            return false;
        }
        if (this.uzY != null && this.uzY.isVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.abM(mouseEvent.getX()), this.abN(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.uzY.g(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        if (this.uzY != null && this.uzY.isVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.abM(mouseEvent.getX()), this.abN(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.uzY.g(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        if (!this.abO(mouseEvent.getButton())) {
            return false;
        }
        if (this.uzY != null && this.uzY.isVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.abM(mouseEvent.getX()), this.abN(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.uzY.b(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        if (!this.abO(mouseEvent.getButton())) {
            return false;
        }
        if (this.uzY != null && this.uzY.isVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.abM(mouseEvent.getX()), this.abN(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.uzY.c(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        if (this.uzY != null && this.uzY.isVisible()) {
            MouseWheelEvent mouseWheelEvent2 = new MouseWheelEvent(mouseWheelEvent.getComponent(), mouseWheelEvent.getID(), mouseWheelEvent.getWhen(), mouseWheelEvent.getModifiersEx(), this.abM(mouseWheelEvent.getX()), this.abN(mouseWheelEvent.getY()), mouseWheelEvent.getClickCount(), mouseWheelEvent.isPopupTrigger(), mouseWheelEvent.getScrollType(), mouseWheelEvent.getScrollAmount(), mouseWheelEvent.getWheelRotation());
            return this.uzY.a(mouseWheelEvent2);
        }
        return false;
    }

    private boolean abO(int n) {
        for (int n2 : uAd) {
            if (n != n2) continue;
            return true;
        }
        return false;
    }

    protected void gBp() {
        ArrayList arrayList = Lists.newArrayList(this.uAa);
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ((alu_2)arrayList.get(i)).b(this);
        }
    }

    protected void abP(int n) {
        ArrayList arrayList = Lists.newArrayList(this.uAa);
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            ((alu_2)arrayList.get(i)).a(this, n);
        }
    }

    protected void hd(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList(this.uAa);
        int n3 = arrayList.size();
        for (int i = 0; i < n3; ++i) {
            ((alu_2)arrayList.get(i)).a(this, n, n2);
        }
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        fhw_2.gAL().setEnabled(true);
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        fhw_2.gAL().setEnabled(false);
        fyw_0.gqw().gqA().bCz();
        fbj_1.getInstance().setMovePointMode(false);
        return false;
    }
}

