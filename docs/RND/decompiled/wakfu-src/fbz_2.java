/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fBz
 */
public class fbz_2
extends fab_1
implements fcx_1,
fjm_1 {
    public static final String TAG = "List";
    private boolean tTt = false;
    private boolean tTu = true;
    private boolean tTv = true;
    private boolean tTw = true;
    private boolean tTx = false;
    @Nullable
    private Object tTy = null;
    private fcv_1 tTz;
    private int tTA = -1;
    private fle_1 tPK;
    public static final int tTB = 1430566280;
    public static final int tTC = 895182995;
    public static final int tTD = "selected".hashCode();
    public static final int tTE = "selectedValue".hashCode();
    public static final int tTF = 1039818982;
    public static final int tTG = -2013533217;
    public static final int tTH = -1763504454;
    public static final int tTI = -1395080333;

    public fbz_2() {
    }

    public fbz_2(boolean bl) {
        super(bl);
    }

    public boolean isCanSelectNull() {
        return this.tTw;
    }

    public void setCanSelectNull(boolean bl) {
        this.tTw = bl;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.tTv;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.tTv = bl;
    }

    public boolean isUseSelectedValueCache() {
        return this.tTx;
    }

    public void setUseSelectedValueCache(boolean bl) {
        this.tTx = bl;
    }

    @Override
    protected void eKZ() {
        if (this.tPK != null && this.tTz != null) {
            this.bVe.g(this.tPK.gDq());
        }
        super.eKZ();
    }

    @Override
    protected void gF(int n, int n2) {
        this.tTz = null;
        super.gF(n, n2);
        if (this.tTz == null && this.tTA != -1) {
            for (fcv_1 fcv_12 : this.ncz) {
                if (this.j(fcv_12) != this.tTA) continue;
                this.tTz = fcv_12;
                break;
            }
        }
    }

    @Override
    protected void a(fcv_1 fcv_12, int n) {
        boolean bl = false;
        if (this.tTA == this.j(fcv_12)) {
            this.n(fcv_12);
            bl = true;
        }
        super.a(fcv_12, n);
        if (this.tTA == n) {
            this.setSelectedAppearanceState(fcv_12);
            this.tTz = fcv_12;
            bl = true;
        }
        if (bl) {
            this.gth();
        }
        if (this.tTA != this.j(fcv_12) && fbz_2.eU(fcv_12)) {
            this.n(fcv_12);
        }
    }

    public void setSelectionTogglable(boolean bl) {
        this.tTt = bl;
    }

    public boolean getSelectionTogglable() {
        return this.tTt;
    }

    public void setSelectionable(boolean bl) {
        this.tTu = bl;
    }

    public boolean getSelectionable() {
        return this.tTu;
    }

    @Override
    public boolean isSelectable() {
        return this.getSelectionable();
    }

    public axb_2 getSelectedColor() {
        if (this.tPK == null) {
            return null;
        }
        return this.tPK.gDp();
    }

    public void setSelectedColor(axb_2 axb_22) {
        if (axb_22 != null) {
            if (this.tPK == null) {
                this.tPK = new fle_1();
                this.tPK.aVI();
                this.setNeedsToResetMeshes();
            }
            this.tPK.setColor(axb_22);
        } else {
            if (this.tPK != null) {
                if (this.bVe != null) {
                    this.bVe.h(this.tPK.gDq());
                }
                this.tPK.aVH();
            }
            this.tPK = null;
            this.setNeedsToResetMeshes();
        }
    }

    public void setSelected(fsc_1 fsc_12) {
        this.setSelectedOffset(this.jLZ.indexOf(fsc_12));
    }

    public int getSelectedOffset() {
        return this.tTA;
    }

    public void setSelectedOffset(int n) {
        this.setSelectedOffset(n, true);
    }

    public void setSelectedOffset(int n, boolean bl) {
        if (n == this.tTA && this.getRenderableByOffset(n) == this.tTz) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList.size() <= n || n < -1) {
            return;
        }
        int n2 = this.tTA;
        this.tTA = n;
        fcv_1 fcv_12 = this.tTz;
        this.n(fcv_12);
        this.tTz = this.getRenderableByOffset(n);
        this.setSelectedAppearanceState(this.tTz);
        if (bl && this.jLZ != null && n2 != -1) {
            this.h(new flk_2(this, fcv_12, arrayList.get(n2), n2, false));
        }
        if (bl) {
            this.gtg();
        }
        this.gth();
    }

    void gtg() {
        if (this.tTA == -1) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return;
        }
        this.h(new flk_2(this, this.tTz, arrayList.get(this.tTA), this.tTA, true));
    }

    public void setSelectedValue(Object object) {
        this.setSelectedValue(object, this.isUseSelectedValueCache());
    }

    private void setSelectedValue(Object object, boolean bl) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            if (bl) {
                this.tTy = object;
            }
            return;
        }
        int n = -1;
        for (int i = 0; i < arrayList.size(); ++i) {
            Object object2 = arrayList.get(i);
            if (object2 == null || object2 != object && !object2.equals(object)) continue;
            n = i;
            break;
        }
        if (bl && object != null && n == -1) {
            this.tTy = object;
        }
        this.setSelectedOffset(n);
    }

    @Override
    public Object getSelectedValue() {
        return this.getSelectedValue(this.getItems());
    }

    public Object getSelectedValue(ArrayList<Object> arrayList) {
        if (this.tTA < 0 || arrayList == null || this.tTA >= arrayList.size()) {
            return null;
        }
        return arrayList.get(this.tTA);
    }

    @Override
    public fcv_1 getSelected() {
        return this.tTz;
    }

    protected void gth() {
        if (this.tTz != null && this.tPK != null) {
            int n = GC.a(this.tTz.getX(), 0, this.getWidth());
            int n2 = GC.a(this.tTz.getY(), 0, this.getHeight());
            int n3 = GC.a(this.tTz.getX() + this.tTz.getWidth(), 0, this.getWidth());
            int n4 = GC.a(this.tTz.getY() + this.tTz.getHeight(), 0, this.getHeight());
            this.tPK.f(n, n2, n3 - n, n4 - n2, this.uki.getTopInset(), this.uki.getBottomInset(), this.uki.getLeftInset(), this.uki.getRightInset());
        }
        this.setNeedsToResetMeshes();
    }

    private void p(fcv_1 fcv_12) {
        if (fcv_12 == this.tTz) {
            return;
        }
        if (fcv_12 != null) {
            this.setSelectedOffset(this.getOffsetByRenderable(fcv_12));
        } else {
            this.tTA = -1;
        }
    }

    @Override
    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = super.gsk();
        fcv_12.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12;
                this.setMousePressedAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJU, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                this.n(this.tTz);
                fcv_1 fcv_13 = this.tTt && this.tTz == fiq_12.gBD() ? null : (this.tTw || fcv_12.getItemValue() != null ? fcv_12 : null);
                this.p(fcv_13);
                this.setMousePressedAppearanceState(fcv_12, this.tTz == fcv_12);
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJT, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12;
                this.setMouseOverAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJQ, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                if (this.tTw || fcv_12.getItemValue() != null) {
                    this.o(this.tMw);
                    this.tMw = fcv_12;
                    this.setMouseOverAppearanceState(this.tMw, this.tTz == fcv_12);
                    if (this.tMF != null) {
                        this.tMF.a(this.tMw.getPosition(), this.tMw.getSize(), this.uki.getTotalInsets());
                        this.setNeedsToResetMeshes();
                    }
                }
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJR, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                this.b(this.tMw, this.tTz == fcv_12);
                this.tMw = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return fcv_12;
    }

    public boolean isSelectEvent(fiq_1 fiq_12) {
        if (!this.tTu) {
            return false;
        }
        if (!this.tTv) {
            return true;
        }
        if (!(fiq_12 instanceof flp_2)) {
            return false;
        }
        return ((flp_2)fiq_12).gEk();
    }

    @Override
    protected int k(fcv_1 fcv_12) {
        int n = super.k(fcv_12);
        this.a(fcv_12, this.tTA == n);
        return n;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.uwm) {
            return;
        }
        int n = this.tTA;
        Object object = this.getSelectedValue();
        super.setContent(iterable, bl);
        this.tTA = this.getOffsetByValue(object);
        if (this.tTA == -1 && n != -1) {
            this.h(new flk_2(this, null, object, n, false));
            this.h(new flk_2(this, null, null, -1, true));
        }
        if (this.isUseSelectedValueCache() && this.tTy != null) {
            this.setSelectedValue(this.tTy, false);
            this.tTy = null;
        }
    }

    @Override
    public void aV(Object object) {
        super.aV(object);
        this.setSelectedOffset(this.jLZ.size() - 1);
    }

    @Override
    public boolean f(int n, Object object) {
        boolean bl = super.f(n, object);
        if (bl) {
            this.setSelectedOffset(n);
        }
        return bl;
    }

    @Override
    public int p(Object object, Object object2) {
        int n = super.p(object, object2);
        if (n != -1) {
            this.setSelectedOffset(n);
        }
        return n;
    }

    @Override
    public void c(Object object, int n, boolean bl) {
        super.c(object, n, bl);
        this.tTA = n;
        this.gth();
    }

    @Override
    public void aW(Object object) {
        int n = this.getOffsetByValue(object);
        if (this.tTA == n) {
            this.setSelectedOffset(-1);
        }
        super.aW(object);
    }

    @Override
    public boolean r(Object object, Object object2) {
        int n = this.getOffsetByValue(object);
        if (n == -1) {
            return false;
        }
        boolean bl = super.r(object, object2);
        if (bl) {
            this.setSelectedOffset(n);
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tTz = null;
        if (this.tPK != null) {
            if (this.bVe != null) {
                this.bVe.h(this.tPK.gDq());
            }
            this.tPK.aVH();
            this.tPK = null;
        }
        this.tTy = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tTA = -1;
        this.tTw = true;
        this.tTv = true;
        this.tTx = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        if (fhi_22 instanceof fbm_2) {
            fbm_2 fbm_22 = (fbm_2)fhi_22;
            fbm_22.setSelectedColor(this.getSelectedColor());
            fbm_22.setSelectionTogglable(this.tTt);
            fbm_22.setSelectionable(this.tTu);
            fbm_22.setCanSelectNull(this.tTw);
            fbm_22.setSelectOnlyOnLeftClick(this.tTv);
            fbm_22.setUseSelectedValueCache(this.tTx);
        } else if (fhi_22 instanceof fbz_2) {
            fbz_2 fbz_22 = (fbz_2)fhi_22;
            fbz_22.setSelectedColor(this.getSelectedColor());
            fbz_22.setSelectionTogglable(this.tTt);
            fbz_22.setSelectionable(this.tTu);
            fbz_22.tTw = this.tTw;
            fbz_22.setSelectOnlyOnLeftClick(this.tTv);
            fbz_22.setUseSelectedValueCache(this.tTx);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 1430566280: {
                this.setSelectedColor(fic_12.vm(string));
                return true;
            }
            case 1039818982: {
                this.setSelectionable(Bw.aK(string));
                return true;
            }
            case -2013533217: {
                this.setSelectionTogglable(Bw.aK(string));
                return true;
            }
            case 895182995: {
                this.setCanSelectNull(Bw.aK(string));
                return true;
            }
            case -1763504454: {
                this.setSelectOnlyOnLeftClick(Bw.aK(string));
                return true;
            }
            case -1395080333: {
                this.setUseSelectedValueCache(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tTD) {
            this.setSelected((fsc_1)object);
        } else if (n == tTE) {
            this.setSelectedValue(object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

