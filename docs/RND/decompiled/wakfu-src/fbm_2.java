/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fBM
 */
public class fbm_2
extends fab_1
implements fcx_1,
fjg_1 {
    public static final String TAG = "MultiSelectionList";
    private boolean tTt = false;
    private boolean tTu = true;
    private boolean tTv = true;
    private boolean tTw = true;
    private boolean tTx = false;
    @Nullable
    private Iterable<Object> tVG = null;
    private axb_2 tVH;
    private final List<fcv_1> tVI = new ArrayList<fcv_1>();
    private final List<fle_1> tVJ = new ArrayList<fle_1>();
    private final LinkedHashSet<Integer> tVK = new LinkedHashSet();
    public static final int tVL = 1430566280;
    public static final int tVM = 895182995;
    public static final int tVN = "selecteds".hashCode();
    public static final int tVO = "selectedValues".hashCode();
    public static final int tVP = 1039818982;
    public static final int tVQ = -2013533217;
    public static final int tVR = -1763504454;
    public static final int tVS = -1395080333;

    public fbm_2() {
    }

    public fbm_2(boolean bl) {
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
        for (fle_1 fle_12 : this.tVJ) {
            this.bVe.g(fle_12.gDq());
        }
        super.eKZ();
    }

    @Override
    public void setListOffset(float f2, boolean bl) {
        super.setListOffset(f2, bl);
        this.gtz();
    }

    @Override
    protected void gF(int n, int n2) {
        this.tVI.clear();
        super.gF(n, n2);
        if (this.tVI.size() != this.tVK.size()) {
            for (fcv_1 fcv_12 : this.ncz) {
                if (!this.tVK.contains(this.j(fcv_12)) || this.tVI.contains(fcv_12)) continue;
                this.tVI.add(fcv_12);
            }
        }
    }

    @Override
    protected void a(fcv_1 fcv_12, int n) {
        boolean bl = false;
        if (this.tVK.contains(this.j(fcv_12))) {
            this.n(fcv_12);
            bl = true;
        }
        super.a(fcv_12, n);
        if (this.tVK.contains(n)) {
            this.setSelectedAppearanceState(fcv_12);
            this.tVI.add(fcv_12);
            bl = true;
        }
        if (bl) {
            this.gtz();
        }
        if (!this.tVK.contains(this.j(fcv_12)) && fbm_2.eU(fcv_12)) {
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
        return this.tVH;
    }

    public void setSelectedColor(axb_2 axb_22) {
        if (Objects.equals(this.tVH, axb_22)) {
            return;
        }
        this.tVH = axb_22;
        if (this.tVH != null) {
            if (this.tVJ.size() != this.tVI.size()) {
                if (this.bVe != null) {
                    this.tVJ.forEach(fle_12 -> this.bVe.h(fle_12.gDq()));
                }
                this.tVJ.forEach(flk_1::aVH);
                this.tVJ.clear();
                this.tVI.forEach(fcv_12 -> {
                    fle_1 fle_12 = new fle_1();
                    fle_12.aVI();
                    this.tVJ.add(fle_12);
                });
                this.setNeedsToResetMeshes();
            }
            this.tVJ.forEach(fle_12 -> fle_12.setColor(this.tVH));
        } else {
            if (this.bVe != null) {
                this.tVJ.forEach(fle_12 -> this.bVe.h(fle_12.gDq()));
            }
            this.tVJ.forEach(flk_1::aVH);
            this.tVJ.clear();
            this.setNeedsToResetMeshes();
        }
    }

    public void setSelecteds(Collection<fsc_1> collection) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (fsc_1 fsc_12 : collection) {
            int n = this.jLZ.indexOf(fsc_12);
            if (n == -1) {
                return;
            }
            arrayList.add(n);
        }
        this.setSelectedOffsets(arrayList);
    }

    public void aaE(int n) {
        if (this.tVK.contains(n)) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (!this.isValidOffset(arrayList, n)) {
            return;
        }
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(this.tVK);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.tVK);
        linkedHashSet.add(n);
        Map<Integer, fcv_1> map = this.b(arrayList2, linkedHashSet);
        this.a(arrayList, arrayList2, arrayList2, map);
        this.gtz();
    }

    public void aaF(int n) {
        if (!this.tVK.contains(n)) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(this.tVK);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.tVK);
        linkedHashSet.remove(n);
        Map<Integer, fcv_1> map = this.b(arrayList, linkedHashSet);
        this.a(arrayList, linkedHashSet, map);
        this.gtz();
    }

    public Collection<Integer> getSelectedOffsets() {
        return this.tVK;
    }

    public void setSelectedOffsets(int n) {
        this.setSelectedOffsets(Collections.singletonList(n));
    }

    public void setSelectedOffsets(@Nullable Collection<Integer> collection) {
        if (collection == null) {
            collection = Collections.emptySet();
        }
        ArrayList<Object> arrayList = this.getItems();
        Object object = new ArrayList<Integer>(collection).iterator();
        while (object.hasNext()) {
            int n = object.next();
            if (this.isValidOffset(arrayList, n)) continue;
            collection.remove(n);
        }
        if (Objects.equals(collection, this.tVK)) {
            return;
        }
        object = new ArrayList<Integer>(this.tVK);
        Map<Integer, fcv_1> map = this.b((List<Integer>)object, collection);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Integer n : collection) {
            if (!object.contains(n)) continue;
            linkedHashSet.add(n);
        }
        this.a(arrayList, (List<Integer>)object, linkedHashSet, map);
        this.gtz();
    }

    public boolean isValidOffset(int n) {
        return this.isValidOffset(this.getItems(), n);
    }

    protected boolean isValidOffset(@Nullable ArrayList<Object> arrayList, int n) {
        return arrayList != null && n < arrayList.size() && n >= 0;
    }

    protected Map<Integer, fcv_1> R(@NotNull Collection<Integer> collection) {
        return this.b(new ArrayList<Integer>(this.tVK), collection);
    }

    /*
     * WARNING - void declaration
     */
    protected Map<Integer, fcv_1> b(@NotNull List<Integer> list, @NotNull Collection<Integer> collection) {
        ArrayList<fcv_1> arrayList = new ArrayList<fcv_1>(this.tVI);
        HashMap<Integer, fcv_1> hashMap = new HashMap<Integer, fcv_1>();
        for (int i = 0; i < list.size(); ++i) {
            void comparable;
            if (i < arrayList.size()) {
                fcv_1 fcv_12 = (fcv_1)arrayList.get(i);
            } else {
                Object var6_9 = null;
            }
            hashMap.put(list.get(i), (fcv_1)comparable);
            this.n((fcv_1)comparable);
        }
        this.tVK.clear();
        this.tVI.clear();
        for (Integer n : collection) {
            fcv_1 fcv_13 = this.getRenderableByOffset(n);
            this.tVK.add(n);
            if (fcv_13 == null) continue;
            this.tVI.add(fcv_13);
            this.setSelectedAppearanceState(fcv_13);
        }
        return hashMap;
    }

    protected void a(@NotNull List<Integer> list, @NotNull Collection<Integer> collection, @NotNull Map<Integer, fcv_1> map) {
        this.a(this.getItems(), list, collection, map);
    }

    protected void a(@Nullable ArrayList<Object> arrayList, @NotNull List<Integer> list, @NotNull Collection<Integer> collection, @NotNull Map<Integer, fcv_1> map) {
        Object object;
        if (arrayList != null && !list.isEmpty()) {
            object = list.iterator();
            while (object.hasNext()) {
                int n = (Integer)object.next();
                if (collection.contains(n)) continue;
                this.h(new flk_2(this, map.get(n), arrayList.get(n), n, false));
            }
        }
        object = new ArrayList<Integer>(this.tVK);
        ArrayList<fcv_1> arrayList2 = new ArrayList<fcv_1>(this.tVI);
        if (arrayList != null && !object.isEmpty()) {
            for (int i = 0; i < object.size(); ++i) {
                Integer n = (Integer)object.get(i);
                if (collection.contains(n)) continue;
                fcv_1 fcv_12 = arrayList2.size() > i ? (fcv_1)arrayList2.get(i) : null;
                this.h(new flk_2(this, fcv_12, arrayList.get(n), n, true));
            }
        }
    }

    public void setSelectedValues(Object object) {
        fbm_2.setIterableProperty(object, null, this::setSelectedValues);
    }

    public void setSelectedValues(Iterable<Object> iterable) {
        this.setSelectedValues(iterable, this.isUseSelectedValueCache());
    }

    private void setSelectedValues(Iterable<Object> iterable, boolean bl) {
        ArrayList<Object> arrayList;
        if (iterable == null) {
            iterable = Collections.emptyList();
        }
        if ((arrayList = this.getItems()) == null) {
            if (bl) {
                this.tVG = iterable;
            }
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        int n = 0;
        for (Object object : iterable) {
            for (int i = 0; i < arrayList.size(); ++i) {
                Object object2 = arrayList.get(i);
                if (object2 == null || object2 != object && !object2.equals(object)) continue;
                linkedHashSet.add(i);
                break;
            }
            ++n;
        }
        if (bl && n > 0 && linkedHashSet.isEmpty()) {
            this.tVG = iterable;
        }
        this.setSelectedOffsets(linkedHashSet);
    }

    @Override
    public Collection<Object> getSelectedValues() {
        return this.getSelectedValues(this.getItems());
    }

    public Collection<Object> getSelectedValues(ArrayList<Object> arrayList) {
        if (this.tVK.isEmpty() || arrayList == null) {
            return Collections.emptyList();
        }
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        Iterator iterator = this.tVK.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            linkedHashSet.add(arrayList.get(n));
        }
        return linkedHashSet;
    }

    @Override
    public Collection<fcv_1> getSelecteds() {
        return this.tVI;
    }

    protected void gtz() {
        if (this.tVI.size() == this.tVJ.size()) {
            for (int i = 0; i < this.tVI.size(); ++i) {
                fcv_1 fcv_12 = this.tVI.get(i);
                fle_1 fle_12 = this.tVJ.get(i);
                int n = GC.a(fcv_12.getX(), 0, this.getWidth());
                int n2 = GC.a(fcv_12.getY(), 0, this.getHeight());
                int n3 = GC.a(fcv_12.getX() + fcv_12.getWidth(), 0, this.getWidth());
                int n4 = GC.a(fcv_12.getY() + fcv_12.getHeight(), 0, this.getHeight());
                fle_12.f(n, n2, n3 - n, n4 - n2, this.uki.getTopInset(), this.uki.getBottomInset(), this.uki.getLeftInset(), this.uki.getRightInset());
            }
        }
        this.setNeedsToResetMeshes();
    }

    private void c(@NotNull fcv_1 fcv_12, boolean bl) {
        int n = this.getOffsetByRenderable(fcv_12);
        if (n == -1) {
            return;
        }
        if (bl) {
            this.aaE(n);
        } else {
            this.aaF(n);
        }
    }

    @Override
    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = super.gsk();
        fcv_12.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                this.setMousePressedAppearanceState(fcv_12, this.tVI.contains(fcv_12));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJU, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                boolean bl = this.tTt && this.tVI.contains(fcv_12) ? false : this.tTw || fcv_12.getItemValue() != null;
                this.c(fcv_12, bl);
                this.setMousePressedAppearanceState(fcv_12, this.tVI.contains(fcv_12));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJT, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                this.setMouseOverAppearanceState(fcv_12, this.tVI.contains(fcv_12));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJQ, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                if (this.tTw || fcv_12.getItemValue() != null) {
                    this.o(this.tMw);
                    this.tMw = fcv_12;
                    this.setMouseOverAppearanceState(this.tMw, this.tVI.contains(fcv_12));
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
                this.b(this.tMw, this.tVI.contains(fcv_12));
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
        this.a(fcv_12, this.tVK.contains(n));
        return n;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.uwm) {
            return;
        }
        Collection<Object> collection = this.getSelectedValues();
        super.setContent(iterable, bl);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Object object : collection) {
            int n = this.getOffsetByValue(object);
            if (n == -1) {
                this.h(new flk_2(this, null, object, n, false));
                continue;
            }
            linkedHashSet.add(n);
        }
        this.tVK.clear();
        this.tVK.addAll(linkedHashSet);
        if (this.isUseSelectedValueCache() && this.tVG != null) {
            this.setSelectedValues(this.tVG, false);
            this.tVG = null;
        }
    }

    @Override
    public void aV(Object object) {
        super.aV(object);
        this.aaE(this.jLZ.size() - 1);
    }

    @Override
    public boolean f(int n, Object object) {
        boolean bl = super.f(n, object);
        if (bl) {
            this.aaE(n);
        }
        return bl;
    }

    @Override
    public int p(Object object, Object object2) {
        int n = super.p(object, object2);
        if (n != -1) {
            this.aaE(n);
        }
        return n;
    }

    @Override
    public void c(Object object, int n, boolean bl) {
        super.c(object, n, bl);
    }

    @Override
    public void aW(Object object) {
        int n = this.getOffsetByValue(object);
        this.aaF(n);
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
            this.aaE(n);
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tVI.clear();
        if (!this.tVJ.isEmpty()) {
            if (this.bVe != null) {
                this.tVJ.forEach(fle_12 -> this.bVe.h(fle_12.gDq()));
            }
            this.tVJ.forEach(flk_1::aVH);
            this.tVJ.clear();
        }
        this.tVG = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tVK.clear();
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
            fbm_22.tTw = this.tTw;
            fbm_22.setSelectOnlyOnLeftClick(this.tTv);
            fbm_22.setUseSelectedValueCache(this.tTx);
        } else if (fhi_22 instanceof fbz_2) {
            fbz_2 fbz_22 = (fbz_2)fhi_22;
            fbz_22.setSelectedColor(this.getSelectedColor());
            fbz_22.setSelectionTogglable(this.tTt);
            fbz_22.setSelectionable(this.tTu);
            fbz_22.setCanSelectNull(this.tTw);
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
        if (n == tVN) {
            fbm_2.setIterableProperty(object, null, this::setSelecteds);
        } else if (n == tVO) {
            fbm_2.setIterableProperty(object, null, this::setSelectedValues);
        } else if (n == 1039818982) {
            this.setSelectionable(Bw.l(object));
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

