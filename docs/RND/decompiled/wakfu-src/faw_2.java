/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Point;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.pool.ObjectPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAW
 */
public class faw_2
extends fes_2 {
    public static final String TAG = "Container";
    private static final ObjectPool tRc = new ayv_2(new fax_2());
    public static final String tRd = "__empty__";
    protected final ArrayList<fes_2> tRe = new ArrayList();
    protected boolean tRf = false;
    protected frs_1 tRg;
    protected boolean tRh = false;
    protected boolean tRi = false;
    protected boolean tRj = false;
    private boolean tRk = false;
    private fsm_1 tRl = null;
    private fsm_1 tRm = null;
    private boolean tRn = false;
    public static final int tRo = 3432985;
    public static final int tRp = -845342168;

    @Override
    public void l(fes_2 fes_22) {
        this.b(fes_22, this.tRe.size());
    }

    public boolean b(fes_2 fes_22, int n) {
        if (n < 0 || n > this.tRe.size()) {
            uxJ.error((Object)("Tentative d'ajout d'un widget a un parent avec un index invalide (index=" + n + ", taille=" + this.tRe.size()));
        } else if (this.tRe.contains(fes_22)) {
            uxJ.error((Object)"Tentative d'ajout d'un widget d\u00e9j\u00e0 contenu");
        } else {
            this.tRe.add(n, fes_22);
            fes_22.setContainerParent(this);
            if (this.isInWidgetTree()) {
                fes_22.eKI();
            }
            this.tRh = true;
            this.setNeedsToPreProcess();
            return true;
        }
        return false;
    }

    public int m(fes_2 fes_22) {
        return this.tRe.indexOf(fes_22);
    }

    @Override
    public void n(fes_2 fes_22) {
        if (fes_22 != null && this.tRe != null && this.tRe.contains(fes_22)) {
            if (this.isInWidgetTree()) {
                fes_22.gsh();
            }
            this.tRe.remove(fes_22);
            fes_22.setContainerParent(null);
            this.tRh = true;
            this.setNeedsToPreProcess();
            fes_22.gAC();
        }
    }

    @Override
    public void setWidgetOnTop(fes_2 fes_22) {
        if (fes_22 != null && this.tRe != null && this.tRe.contains(fes_22)) {
            this.tRe.remove(fes_22);
            this.l(fes_22);
        }
    }

    @Override
    public void a(fhp_1 fhp_12) {
        super.a(fhp_12);
        if (fhp_12 instanceof frs_1) {
            this.setLayoutManager((frs_1)fhp_12);
        }
    }

    public void c(fes_2 fes_22, int n) {
        if (this.b(fes_22, n)) {
            super.a(fes_22, false);
        } else if (fes_22 != null) {
            fes_22.gAD();
            uxJ.warn((Object)"On lib\u00e8re le Widget qui n'a pas p\u00fb \u00eatre ajout\u00e9");
        }
    }

    public void a(fes_2 fes_22, fes_2 fes_23) {
        int n = this.m(fes_22);
        this.j(fes_22);
        this.c(fes_23, n);
    }

    public void gsK() {
        for (fes_2 fes_22 : this.tRe) {
            if (this.isInWidgetTree()) {
                fes_22.gsh();
            }
            fes_22.setContainerParent(null);
        }
        this.tRe.clear();
        this.tRh = true;
        this.setNeedsToPreProcess();
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        int n = this.tRe.size();
        for (int i = 0; i < n; ++i) {
            fes_2 fes_22 = this.tRe.get(i);
            EntityGroup entityGroup = fes_22.getEntity();
            if (!fes_22.isVisible() || entityGroup == null) continue;
            this.bVe.g(entityGroup);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public ArrayList<fes_2> getWidgetChildren() {
        return this.tRe;
    }

    @Override
    public fys_0 getAppearance() {
        return this.uki;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    public void w(@NotNull @NotNull Consumer<@NotNull fys_0> consumer) {
        fys_0 fys_02 = this.getAppearance();
        if (fys_02 != null) {
            consumer.accept(fys_02);
        }
    }

    public static void a(@Nullable faw_2 faw_22, @NotNull @NotNull Consumer<@NotNull fys_0> consumer) {
        if (faw_22 != null) {
            faw_22.w(consumer);
        }
    }

    @NotNull
    public <Return> Return a(@NotNull @NotNull Function<@NotNull fys_0, @NotNull Return> function, @NotNull Return Return) {
        fys_0 fys_02 = this.getAppearance();
        if (fys_02 != null) {
            return function.apply(fys_02);
        }
        return Return;
    }

    @NotNull
    public static <Return> Return a(@Nullable faw_2 faw_22, @NotNull @NotNull Function<@NotNull fys_0, @NotNull Return> function, @NotNull Return Return) {
        if (faw_22 != null) {
            return faw_22.a(function, Return);
        }
        return Return;
    }

    protected void d(@NotNull @NotNull Function<@NotNull fys_0, @NotNull fzy_0> function) {
        this.a(function, true);
    }

    protected void a(@NotNull @NotNull Function<@NotNull fys_0, @NotNull fzy_0> function, boolean bl) {
        this.w(fys_02 -> {
            fzy_0 fzy_02 = (fzy_0)((Object)((Object)function.apply((fys_0)fys_02)));
            if (bl && !fys_02.a(fzy_02)) {
                return;
            }
            fys_02.grf();
            fys_02.setEnabled(fzy_02, true);
        });
    }

    protected static void a(@Nullable faw_2 faw_22, @NotNull @NotNull Function<@NotNull fys_0, @NotNull fzy_0> function) {
        if (faw_22 != null) {
            faw_22.d(function);
        }
    }

    protected static void a(@Nullable faw_2 faw_22, @NotNull @NotNull Function<@NotNull fys_0, @NotNull fzy_0> function, boolean bl) {
        if (faw_22 != null) {
            faw_22.a(function, bl);
        }
    }

    protected void b(@NotNull fzy_0 fzy_02) {
        this.d((fys_0 fys_02) -> fzy_02);
    }

    protected void a(@NotNull fzy_0 fzy_02, boolean bl) {
        this.a((fys_0 fys_02) -> fzy_02, bl);
    }

    protected static void a(@Nullable faw_2 faw_22, @NotNull fzy_0 fzy_02) {
        faw_2.a(faw_22, (fys_0 fys_02) -> fzy_02);
    }

    protected static void a(@Nullable faw_2 faw_22, @NotNull fzy_0 fzy_02, boolean bl) {
        faw_2.a(faw_22, (fys_0 fys_02) -> fzy_02, bl);
    }

    protected boolean gsL() {
        return this.a((Function)fys_02 -> fys_02.getAppearanceState().bqr(), (Object)false);
    }

    protected static boolean eU(@Nullable faw_2 faw_22) {
        if (faw_22 != null) {
            return faw_22.gsL();
        }
        return false;
    }

    public void setLayoutManager(frs_1 frs_12) {
        if (this.tRg != null && !this.tRg.isUnloading()) {
            this.tRg.aZp();
        }
        this.tRg = frs_12;
    }

    public fry_2 getLayoutManager() {
        return this.tRg;
    }

    @Override
    protected void oy(boolean bl) {
        if (bl != this.bmg) {
            this.setNeedsToPreProcess();
            this.setNeedsToMiddleProcess();
        }
        super.oy(bl);
    }

    @Override
    protected void setParentVisible(boolean bl) {
        if (bl != this.ukH) {
            super.setParentVisible(bl);
            for (int i = this.tRe.size() - 1; i >= 0; --i) {
                this.tRe.get(i).setParentVisible(bl);
            }
        }
    }

    @Override
    public fsm_1 getMaxSize() {
        if (this.ukz) {
            return this.uky;
        }
        return new fsm_1(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override
    public fsm_1 getContentMinSize() {
        if (this.tRg != null) {
            if (this.tRl == null) {
                this.tRl = this.tRg.getContentMinSize(this);
            }
            int n = this.uku == null ? this.tRl.width : Math.max(this.tRl.width, this.uku.width);
            int n2 = this.uku == null ? this.tRl.height : Math.max(this.tRl.height, this.uku.height);
            return new fsm_1(n, n2);
        }
        return super.getContentMinSize();
    }

    @Override
    public fsm_1 getContentPrefSize() {
        if (this.tRg != null) {
            if (this.tRm == null) {
                this.tRm = this.tRg.getContentPreferedSize(this);
            }
            int n = this.ukw == null ? this.tRm.width : Math.max(this.tRm.width, this.ukw.width);
            int n2 = this.ukw == null ? this.tRm.height : Math.max(this.tRm.height, this.ukw.height);
            return new fsm_1(n, n2);
        }
        return super.getContentPrefSize();
    }

    @Override
    public fsm_1 getContentGreedySize() {
        if (this.uko == null) {
            return new fsm_1(this.uki.getContentWidth(), this.uki.getContentHeight());
        }
        fsm_1 fsm_12 = this.uko.getContentGreedySize();
        fsm_12.width -= this.uko.getAppearance().getLeftInset() + this.uko.getAppearance().getRightInset();
        fsm_12.height -= this.uko.getAppearance().getTopInset() + this.uko.getAppearance().getBottomInset();
        return this.uko.getLayoutManager().getContentGreedySize(this.uko, this, fsm_12);
    }

    public boolean isRootFocusContainer() {
        return this.tRf;
    }

    public void setRootFocusContainer(boolean bl) {
        this.tRf = bl;
    }

    @Override
    public faw_2 getRootFocusParent() {
        if (this.tRf) {
            return this;
        }
        return super.getRootFocusParent();
    }

    @Override
    public void setNonBlocking(boolean bl) {
        this.setNonBlocking(bl, false);
    }

    public void setNonBlocking(boolean bl, boolean bl2) {
        super.setNonBlocking(bl);
        if (bl2) {
            for (fes_2 fes_22 : this.getWidgetChildren()) {
                if (fes_22 instanceof faw_2) {
                    ((faw_2)fes_22).setNonBlocking(bl, bl2);
                    continue;
                }
                fes_22.setNonBlocking(bl);
            }
        }
    }

    public boolean getInvalidateOnMinSizeChange() {
        return this.tRj;
    }

    public void setInvalidateOnMinSizeChange(boolean bl) {
        this.tRj = bl;
    }

    public boolean isInvalidateMinSizeOnSizeChange() {
        return this.tRk;
    }

    public void setInvalidateMinSizeOnSizeChange(boolean bl) {
        this.tRk = bl;
    }

    @Override
    public void setMinSize(fsm_1 fsm_12) {
        super.setMinSize(fsm_12);
        if (this.tRk) {
            this.gsm();
        }
    }

    @Override
    public void setPrefSize(fsm_1 fsm_12) {
        super.setPrefSize(fsm_12);
        if (this.tRk) {
            this.gsm();
        }
    }

    @Override
    public void setMaxSize(fsm_1 fsm_12) {
        super.setMaxSize(fsm_12);
        if (this.tRk) {
            this.gsm();
        }
    }

    public void setPack(boolean bl) {
        this.tRi = bl;
    }

    public boolean getPack() {
        return this.tRi;
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2)) {
            return null;
        }
        fes_2 fes_22 = this.ukD ? null : this;
        n -= this.getAppearance().getLeftInset();
        n2 -= this.getAppearance().getBottomInset();
        for (int i = this.tRe.size() - 1; i >= 0; --i) {
            fes_2 fes_23 = this.tRe.get(i);
            if (fes_23.isUnloading() || (fes_23 = fes_23.getWidget(n - fes_23.ukp.x, n2 - fes_23.ukp.y)) == null) continue;
            fes_22 = fes_23;
            break;
        }
        return fes_22;
    }

    public fes_2 getWidget(int n) {
        try {
            return this.tRe.get(n);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public fes_2 getNextFocusableWidget() {
        return null;
    }

    public axl_2 getScissor(fes_2 fes_22) {
        Point point = this.getScreenPosition();
        int n = point.x + this.uki.getLeftInset();
        int n2 = point.y + this.uki.getBottomInset();
        int n3 = this.uki.getContentWidth();
        int n4 = this.uki.getContentHeight();
        if (fes_22 == null) {
            return axl_2.t(n, n2, n3, n4);
        }
        Point point2 = fes_22.getScreenPosition();
        int n5 = point2.x;
        int n6 = point2.y;
        int n7 = fes_22.getWidth();
        int n8 = fes_22.getHeight();
        axl_2 axl_22 = axl_2.bQO();
        if (axl_2.b(n5, n6, n7, n8, n, n2, n3, n4)) {
            axl_22.a(n5, n6, n7, n8, n, n2, n3, n4);
        }
        return axl_22;
    }

    @Override
    public void eKI() {
        super.eKI();
        for (fes_2 fes_22 : this.tRe) {
            fes_22.eKI();
        }
    }

    @Override
    public void gsh() {
        super.gsh();
        for (fes_2 fes_22 : this.tRe) {
            fes_22.gsh();
        }
    }

    protected void gsM() {
        this.tRm = null;
        this.tRl = null;
        this.tRn = true;
        this.setNeedsToMiddleProcess();
    }

    public void gsm() {
        this.gsM();
        if (this.uko != null) {
            this.uko.gsm();
        }
        if (this.tRi || this.tRj) {
            this.bFM();
        }
    }

    @Override
    public void grg() {
        super.grg();
        this.tRn = false;
        if (this.tRi) {
            this.setSizeToPrefSize();
        }
        if (this.tRg != null && this.uki != null) {
            this.tRg.a(this);
            this.gsN();
        }
        this.setNeedsToResetMeshes();
        this.tRh = false;
    }

    public void gsN() {
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tRh) {
            this.gsm();
        }
        return bl;
    }

    @Override
    public boolean aaB(int n) {
        if (this.bmg && this.tRn) {
            this.bFM();
        }
        return super.aaB(n);
    }

    public static faw_2 checkOut() {
        faw_2 faw_22;
        try {
            faw_22 = (faw_2)tRc.borrowObject();
            faw_22.uth = tRc;
        }
        catch (Exception exception) {
            uxJ.error((Object)"Probl\u00e8me au borrowObject.");
            faw_22 = new faw_2();
            faw_22.aVI();
        }
        return faw_22;
    }

    @Override
    public void aVH() {
        this.gsK();
        super.aVH();
        this.tRl = null;
        this.tRm = null;
        if (this.tRg != null) {
            this.tRg.aZp();
            this.tRg = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tRf = false;
        this.tRh = false;
        this.tRi = false;
        this.tRj = false;
        this.tRk = false;
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        frz_2 frz_22 = frz_2.checkOut();
        this.a(frz_22);
        this.ukD = true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        faw_2 faw_22 = (faw_2)fhi_22;
        super.a(faw_22);
        faw_22.tRi = this.tRi;
        faw_22.tRf = this.tRf;
        frs_1 frs_12 = null;
        if (this.tRg != null) {
            frs_12 = this.tRg.gEJ();
        }
        if (frs_12 != null) {
            faw_22.setLayoutManager(frs_12);
        }
        faw_22.tRk = this.tRk;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3432985: {
                this.setPack(Bw.aK(string));
                return true;
            }
            case -845342168: {
                this.setInvalidateMinSizeOnSizeChange(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3432985: {
                this.setPack(Bw.l(object));
                return true;
            }
            case -845342168: {
                this.setInvalidateMinSizeOnSizeChange(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

