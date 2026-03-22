/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from fBw
 */
public class fbw_1
extends faw_2 {
    private static final Logger tSY = Logger.getLogger(fbw_1.class);
    public static final String TAG = "LayeredContainer";
    public static final int tSZ = -40000;
    public static final int tTa = -39999;
    public static final int tTb = -30000;
    public static final int tTc = -10000;
    public static final int tTd = 25000;
    public static final int tTe = 26000;
    public static final int tTf = 27000;
    public static final int tTg = 29500;
    public static final int tTh = 30000;
    public static final int tTi = 35000;
    public static final int tTj = 40000;
    public static final int tTk = Integer.MIN_VALUE;
    final TIntArrayList tTl = new TIntArrayList();

    public void d(fes_2 fes_22, int n) {
        this.a(fes_22, n, Integer.MAX_VALUE);
    }

    public void a(fes_2 fes_22, int n, int n2) {
        if (!this.uwb) {
            faw_2 faw_22 = this.getContainerFromLayer(n);
            if (faw_22 == null) {
                faw_22 = this.aaC(n);
            }
            int n3 = Math.min(faw_22.getWidgetChildren().size(), n2);
            faw_22.c(fes_22, n3);
        }
    }

    private faw_2 aaC(int n) {
        int n2;
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setSize(this.getWidth(), this.getHeight());
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.d(frp_12);
        fro_1 fro_12 = new fro_1();
        fro_12.setAdaptToContentSize(true);
        fro_12.aVI();
        faw_22.a(fro_12);
        int n3 = this.tRe.size();
        for (n2 = 0; n2 < n3 && this.tTl.get(n2) <= n; ++n2) {
        }
        this.tTl.insert(n2, n);
        this.c(faw_22, n2);
        return faw_22;
    }

    @Override
    public void j(fhv_1 fhv_12) {
        int n;
        if (fhv_12 instanceof faw_2 && (n = this.tRe.indexOf(fhv_12)) != -1) {
            this.tTl.removeAt(n);
        }
        super.j(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getLayer(fes_2 fes_22) {
        int n = this.tRe.size();
        for (int i = 0; i < n; ++i) {
            faw_2 faw_22 = (faw_2)this.tRe.get(i);
            if (!faw_22.getWidgetChildren().contains(fes_22)) continue;
            return this.tTl.get(i);
        }
        return Integer.MIN_VALUE;
    }

    public int getWidgetCountInLayer(int n) {
        faw_2 faw_22 = this.getContainerFromLayer(n);
        if (faw_22 != null) {
            return faw_22.getWidgetChildren().size();
        }
        return 0;
    }

    public faw_2 getContainerFromLayer(int n) {
        int n2 = this.tTl.indexOf(n);
        if (n2 != -1) {
            return (faw_2)this.tRe.get(n2);
        }
        return null;
    }

    public faw_2 getContainerFromWidget(fes_2 fes_22) {
        int n = this.tRe.size();
        for (int i = 0; i < n; ++i) {
            faw_2 faw_22 = (faw_2)this.tRe.get(i);
            if (!faw_22.getWidgetChildren().contains(fes_22)) continue;
            return faw_22;
        }
        return null;
    }

    public void a(TObjectProcedure<fes_2> tObjectProcedure, int ... nArray) {
        for (int n : nArray) {
            tObjectProcedure.execute((Object)this.getContainerFromLayer(n));
        }
    }

    public void b(TObjectProcedure<fes_2> tObjectProcedure, int ... nArray) {
        if (!this.tTl.isEmpty()) {
            this.tTl.forEach((TIntProcedure)new fbx_1(this, nArray, tObjectProcedure));
        }
    }

    public void o(fes_2 fes_22) {
        faw_2 faw_22;
        int n = this.getLayer(fes_22);
        if (n != Integer.MIN_VALUE && (faw_22 = this.getContainerFromLayer(n)) != null) {
            faw_22.getWidgetChildren().remove(fes_22);
            faw_22.getWidgetChildren().add(fes_22);
            faw_22.setNeedsToResetMeshes();
        }
    }

    public int getWidgetPositionInLayer(fes_2 fes_22) {
        faw_2 faw_22;
        int n = this.getLayer(fes_22);
        if (n != Integer.MIN_VALUE && (faw_22 = this.getContainerFromLayer(n)) != null) {
            return faw_22.getWidgetChildren().indexOf(fes_22);
        }
        return -1;
    }

    public void setWidgetPositionInLayer(fes_2 fes_22, int n) {
        faw_2 faw_22;
        if (n < 0) {
            tSY.warn((Object)"on essaye de set la position d'un widget dans un layer \u00e0 une position inf\u00e9rieure \u00e0 0");
            return;
        }
        int n2 = this.getLayer(fes_22);
        if (n2 != Integer.MIN_VALUE && (faw_22 = this.getContainerFromLayer(n2)) != null) {
            ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
            if (n >= arrayList.size()) {
                tSY.warn((Object)"on essaye de set la position d'un widget dans un layer \u00e0 une position trop grande");
                return;
            }
            arrayList.remove(fes_22);
            arrayList.add(n, fes_22);
            faw_22.setNeedsToResetMeshes();
        }
    }

    public Iterator<fes_2> getAllWidgetIterator() {
        return new fby_1(this);
    }

    @Override
    public void aVI() {
        super.aVI();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        this.a(fro_12);
    }
}

