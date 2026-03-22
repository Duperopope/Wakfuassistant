/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.awt.Dimension;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.apache.commons.pool.ObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fRT
 */
public class frt_1
extends frs_1
implements ayz_2 {
    private static final Logger vbG = LoggerFactory.getLogger(frt_1.class);
    public static final String TAG = "WrappableLayout";
    public static final String vbH = "wl";
    private static final ObjectPool vbI = new ayv_2(new fru_2(), 2000);
    private boolean tMi = true;
    private short uZL = 0;
    private short uZM = 0;
    private faa_2 tCX = faa_2.tLO;
    public static final int vbJ = 3200366;
    public static final int vbK = 3617440;
    public static final int vbL = 1387629604;
    public static final int vbM = 92903173;

    public static frt_1 checkOut() {
        frt_1 frt_12;
        try {
            frt_12 = (frt_1)vbI.borrowObject();
            frt_12.uth = vbI;
        }
        catch (Exception exception) {
            vbG.error("Error occured during onCheckOut/borrowObject", (Throwable)exception);
            frt_12 = new frt_1();
            frt_12.aVI();
        }
        return frt_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    public short getHgap() {
        return this.uZL;
    }

    public void setHgap(short s) {
        this.uZL = s;
    }

    public short getVgap() {
        return this.uZM;
    }

    public void setVgap(short s) {
        this.uZM = s;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    protected fsm_1 getContentDimensionOf(fsm_1 fsm_12, fes_2 fes_22) {
        if (fes_22.getAppearance() == null) {
            return fsm_12;
        }
        return new fsm_1(fsm_12.width - fes_22.getAppearance().getInsetWidth(), fsm_12.height - fes_22.getAppearance().getInsetHeight());
    }

    protected fsm_1 a(fsm_1 fsm_12, fsm_1 fsm_13, fes_2 fes_22) {
        fsm_1 fsm_14 = this.getContentDimensionOf(fsm_13, fes_22);
        return this.a(fsm_12, fsm_14.height, fsm_14.width);
    }

    protected fsm_1 a(fsm_1 fsm_12, int n, int n2) {
        if (!fsm_12.gGf()) {
            return fsm_12;
        }
        fsm_1 fsm_13 = fsm_12.gGg();
        if (fsm_12.gGe() != -1.0f) {
            fsm_13.setHeight((int)((float)n * (fsm_12.gGe() / 100.0f)));
            fsm_13.gd(-1.0f);
        }
        if (fsm_12.gGd() != -1.0f) {
            fsm_13.setWidth((int)((float)n2 * (fsm_12.gGd() / 100.0f)));
            fsm_13.ge(-1.0f);
        }
        return fsm_13;
    }

    protected Map<List<fes_2>, fsm_1> getWidgetsAndDimensionPerRow(int n, int n2, List<fes_2> list, Function<fes_2, fsm_1> function) {
        boolean bl = this.isHorizontal();
        int n3 = 0;
        int n4 = 0;
        LinkedHashMap<List<fes_2>, fsm_1> linkedHashMap = new LinkedHashMap<List<fes_2>, fsm_1>();
        LinkedList<fes_2> linkedList = new LinkedList<fes_2>();
        boolean bl2 = true;
        for (fes_2 fes_22 : list) {
            boolean bl3;
            short s;
            if (!fes_22.getVisible()) continue;
            fsm_1 fsm_12 = this.a(function.apply(fes_22), n, n2);
            if (bl2) {
                bl2 = false;
                s = 0;
            } else {
                short s2 = s = bl ? this.uZL : this.uZM;
            }
            if (bl) {
                bl3 = n3 + s + fsm_12.width <= n2;
            } else {
                boolean bl4 = bl3 = n4 + s + fsm_12.height <= n;
            }
            if (!bl3) {
                linkedHashMap.put(new LinkedList(linkedList), new fsm_1(n3, n4));
                n4 = 0;
                n3 = 0;
                bl2 = true;
                linkedList.clear();
            }
            linkedList.add(fes_22);
            if (bl) {
                n3 += s + fsm_12.width;
                n4 = Math.max(n4, fsm_12.height);
                continue;
            }
            n3 = Math.max(n3, fsm_12.width);
            n4 += s + fsm_12.height;
        }
        if (!linkedList.isEmpty()) {
            linkedHashMap.put(new LinkedList(linkedList), new fsm_1(n3, n4));
            linkedList.clear();
        }
        return linkedHashMap;
    }

    protected int getMaxOfAxes(Map<List<fes_2>, fsm_1> map, ToDoubleFunction<fsm_1> toDoubleFunction) {
        return (int)map.values().stream().mapToDouble(toDoubleFunction).max().orElse(0.0);
    }

    protected int getSumOfAxes(Map<List<fes_2>, fsm_1> map, ToDoubleFunction<fsm_1> toDoubleFunction, Supplier<Short> supplier) {
        int n = map.size();
        return (int)map.values().stream().mapToDouble(toDoubleFunction).sum() + (n > 1 ? (n - 1) * supplier.get() : 0);
    }

    protected fsm_1 getContentSize(faw_2 faw_22, fsm_1 fsm_12, Function<fes_2, fsm_1> function) {
        int n;
        int n2;
        Object object;
        Cloneable cloneable;
        if (fsm_12 == null) {
            fsm_12 = new fsm_1(Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else if (fsm_12.gGf()) {
            Object object2;
            cloneable = new LinkedHashMap();
            for (object = faw_22.getParentOfType(faw_2.class); object != null; object = ((fhi_2)object).getParentOfType(faw_2.class)) {
                object2 = ((fes_2)object).getSize();
                if (object2 == null) {
                    object2 = new fsm_1(100.0f, 100.0f);
                }
                ((LinkedHashMap)cloneable).putFirst(object, object2);
                if (!((fsm_1)object2).gGf()) break;
            }
            if (!((HashMap)cloneable).isEmpty()) {
                object2 = ((LinkedHashMap)cloneable).sequencedEntrySet();
                Bu<Object, Object> bu = Bu.a((Map.Entry)object2.removeFirst());
                int n3 = object2.size();
                for (int i = 0; i < n3; ++i) {
                    Map.Entry entry = (Map.Entry)object2.removeFirst();
                    bu = Bu.a((faw_2)entry.getKey(), this.a((fsm_1)entry.getValue(), (fsm_1)bu.aHI(), (fes_2)bu.getFirst()));
                }
                fsm_12 = this.a(fsm_12, (fsm_1)bu.aHI(), (fes_2)bu.getFirst());
            }
        }
        cloneable = this.getContentDimensionOf(fsm_12, faw_22);
        object = this.getWidgetsAndDimensionPerRow(((fsm_1)cloneable).height, ((fsm_1)cloneable).width, faw_22.getWidgetChildren(), function);
        if (this.isHorizontal()) {
            n2 = this.getMaxOfAxes((Map<List<fes_2>, fsm_1>)object, Dimension::getWidth);
            n = this.getSumOfAxes((Map<List<fes_2>, fsm_1>)object, Dimension::getHeight, () -> this.uZM);
        } else {
            n2 = this.getSumOfAxes((Map<List<fes_2>, fsm_1>)object, Dimension::getWidth, () -> this.uZL);
            n = this.getMaxOfAxes((Map<List<fes_2>, fsm_1>)object, Dimension::getHeight);
        }
        return new fsm_1(n2, n);
    }

    protected fsm_1 getContentSize(faw_2 faw_22, Function<faw_2, fsm_1> function, Function<fes_2, fsm_1> function2) {
        return this.getContentSize(faw_22, function.apply(faw_22), function2);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentSize(faw_22, fes_2::getSpecifiedContentMinSize, fes_2::getMinSize);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return this.getContentSize(faw_22, fes_2::getSpecifiedContentPrefSize, fes_2::getPrefSize);
    }

    @Override
    public void a(faw_2 faw_22) {
        int n;
        int n2;
        fsm_1 fsm_12 = faw_22.getAppearance().getContentSize();
        int n3 = fsm_12.height;
        int n4 = fsm_12.width;
        fsm_1 fsm_13 = this.getContentSize(faw_22, fsm_12, fes_2::getPrefSize);
        Function<fes_2, fsm_1> function = fsm_13.height <= n3 && fsm_13.width <= n4 ? fes_2::getPrefSize : fes_2::getMinSize;
        Map<List<fes_2>, fsm_1> map = this.getWidgetsAndDimensionPerRow(n3, n4, faw_22.getWidgetChildren(), function);
        boolean bl = this.isHorizontal();
        faa_2 faa_22 = this.getAlign();
        if (bl) {
            n2 = this.getSumOfAxes(map, Dimension::getHeight, () -> this.uZM);
            n = faa_22.cg(n2, n3) + n2;
        } else {
            n2 = this.getSumOfAxes(map, Dimension::getWidth, () -> this.uZL);
            n = faa_22.cf(n2, n4);
        }
        n2 = 1;
        for (Map.Entry<List<fes_2>, fsm_1> entry : map.entrySet()) {
            int n5;
            int n6;
            fsm_1 fsm_14 = entry.getValue();
            if (bl) {
                n6 = faa_22.cf(fsm_14.width, n4);
            } else {
                n5 = fsm_14.height + (n2 != 0 ? (short)0 : this.uZM);
                n6 = faa_22.cg(n5, n3) + n5;
            }
            if (bl) {
                n -= fsm_14.height + (n2 != 0 ? (short)0 : this.uZM);
            }
            n5 = 1;
            for (fes_2 fes_22 : entry.getKey()) {
                fsm_1 fsm_15 = function.apply(fes_22);
                fes_22.setSize(fsm_15);
                if (bl) {
                    var20_20 = n + faa_22.cg(fsm_15.height, fsm_14.height);
                    fes_22.setPosition(n6, var20_20);
                    n6 += fsm_15.width + this.uZL;
                } else {
                    var20_20 = n + faa_22.cf(fsm_15.width, fsm_14.width);
                    fes_22.setPosition(var20_20, n6 -= fsm_15.height);
                    n6 -= this.uZM;
                }
                if (n5 == 0) continue;
                n5 = 0;
            }
            if (!bl) {
                n += fsm_14.width + this.uZL;
            }
            if (n2 == 0) continue;
            n2 = 0;
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frt_1 frt_12 = (frt_1)fhi_22;
        super.a((fhi_2)frt_12);
        frt_12.setHorizontal(this.isHorizontal());
        frt_12.setHgap(this.getHgap());
        frt_12.setVgap(this.getVgap());
        frt_12.setAlign(this.getAlign());
    }

    public frt_1 gEW() {
        frt_1 frt_12 = frt_1.checkOut();
        this.a((fhi_2)frt_12);
        return frt_12;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tMi = true;
        this.uZL = 0;
        this.uZM = 0;
        this.tCX = faa_2.tLO;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3200366: {
                this.setHgap(Bw.r(string));
                return true;
            }
            case 3617440: {
                this.setVgap(Bw.r(string));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.aK(string));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.tI(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 3200366: {
                this.setHgap(Bw.r(object));
                return true;
            }
            case 3617440: {
                this.setVgap(Bw.r(object));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Bw.l(object));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.aU(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEW();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEW();
    }
}

