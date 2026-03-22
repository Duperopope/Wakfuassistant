/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.RenderTree;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aaO
extends aaj_0
implements acu_0 {
    private static final Logger cbf = Logger.getLogger(aaO.class);
    private short aXk = (short)-1;
    private boolean cbg = true;
    private aam_0 cbh;

    private aaO(arr_2 arr_22) {
        super(arr_22, null);
        this.bM(false);
    }

    public aaO() {
        super((arr_2)RenderTree.cbn.bSJ(), aaa_0.brB());
        this.bM(false);
    }

    private aap_0 bsc() {
        return (aap_0)this.csf;
    }

    @Override
    protected agb bqK() {
        return new aap_0(this);
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
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
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        return false;
    }

    @Override
    protected void bqR() {
    }

    @Override
    public void qy(int n) {
        if (!this.ra(n)) {
            return;
        }
        this.rm(n);
        this.bP(true);
        this.qZ(n);
        this.bYk.clear();
        this.bqW();
        this.csb.clear();
        this.csc.clear();
    }

    @Override
    protected void b(Entity entity) {
        this.bYk.c(entity);
    }

    @Override
    protected void rb(int n) {
        throw new UnsupportedOperationException("pas de light sur les map de d\u00e9cor de fond");
    }

    @Override
    public void bP(boolean bl) {
        this.bYl.a(this.csf.byJ());
    }

    @Override
    protected void aC(float f2, float f3) {
        this.bYl.c(this);
    }

    @Override
    public boolean bqY() {
        return !this.bsd() || this.bYl.brN();
    }

    public void reset() {
        this.a((short)-1, 0.0f, 0.0f, 0.0f);
    }

    public void b(short s, float f2) {
        this.a(s, f2, f2, 1.0f);
    }

    public void a(short s, float f2, float f3) {
        this.a(s, f2, f2, f3);
    }

    public void a(short s, float f2, float f3, float f4) {
        this.bN(true);
        this.cbh.b(this);
        this.aXk = s;
        if (this.bsd()) {
            aag_0 aag_02 = this.cbh.bqL();
            this.bsc().a(aag_02, f2, f3, f4);
            this.bYl.a(WX.ap(s));
            this.bYl.fG(s);
            this.bM(true);
            this.dw(true);
            this.cbh.a(this);
        }
    }

    public void a(mo_1 mo_12) {
        this.cbg = mo_12.aXl;
        this.a(mo_12.aXk, mo_12.aXm, mo_12.aXo, mo_12.aXn);
    }

    public boolean bsd() {
        return this.aXk != -1;
    }

    public void a(@NotNull aam_0 aam_02) {
        this.cbh = aam_02;
    }

    public boolean bse() {
        return this.cbg;
    }

    private void rm(int n) {
        if (this.cbh == null) {
            return;
        }
        aag_0 aag_02 = this.cbh.bqL();
        this.bsc().a(aag_02, this.cbg, n);
    }

    @Override
    protected aaj_0 a(arr_2 arr_22) {
        return new aaO(arr_22);
    }

    @Override
    public void a(agb agb2, ArrayList<acx_0> arrayList) {
        try {
            this.bYl.a(agb2, arrayList);
        }
        catch (Exception exception) {
            cbf.error((Object)"[Parallax] Error when querying visible objects", (Throwable)exception);
        }
    }
}

