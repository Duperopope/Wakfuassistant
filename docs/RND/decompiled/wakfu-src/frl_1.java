/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/*
 * Renamed from fRL
 */
public class frl_1
extends frs_1 {
    public static final String TAG = "SpringLayout";
    public static final String vat = "SPL";
    private final HashMap<fes_2, ArrayList<frm_1>> vau = new HashMap();

    @Override
    public String getTag() {
        return TAG;
    }

    public frm_1 getConstraint(fes_2 fes_22) {
        ArrayList<frm_1> arrayList = this.vau.get(fes_22);
        return arrayList != null && arrayList.size() != 0 ? arrayList.get(0) : null;
    }

    private fes_2 getWidgetByConstraint(faw_2 faw_22, frm_1 frm_12) {
        for (fes_2 fes_22 : faw_22.getWidgetChildren()) {
            frm_1 frm_13;
            if (!(fes_22.getLayoutData() instanceof frm_1) || !(frm_13 = (frm_1)fes_22.getLayoutData()).equals(frm_12)) continue;
            return fes_22;
        }
        return null;
    }

    private void ai(ArrayList<fes_2> arrayList) {
        Set<fes_2> set = this.vau.keySet();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = arrayList.get(i);
            if (set.contains(fes_22)) continue;
            this.vau.remove(fes_22);
        }
    }

    private void D(fes_2 fes_22) {
        if (fes_22.getLayoutData() instanceof frm_1) {
            return;
        }
        ArrayList<frm_1> arrayList = this.vau.get(fes_22);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.vau.put(fes_22, arrayList);
        }
        if (arrayList.size() == 0) {
            frm_1 frm_12 = frm_1.a(this, fes_22);
            arrayList.add(frm_12);
        }
    }

    @Override
    public boolean gEI() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        this.ai(faw_22.getWidgetChildren());
        Rectangle rectangle = new Rectangle();
        for (fes_2 fes_22 : faw_22.getWidgetChildren()) {
            frm_1 frm_12 = null;
            this.D(fes_22);
            frm_12 = this.vau.get(fes_22).get(0);
            rectangle.union(new Rectangle(frm_12.getX().getValue(), frm_12.getY().getValue(), frm_12.getWidth().getValue(), frm_12.getHeight().getValue()));
        }
        return new fsm_1((int)rectangle.getWidth(), (int)rectangle.getHeight());
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
        this.ai(arrayList);
        Rectangle rectangle = new Rectangle();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = arrayList.get(i);
            frm_1 frm_12 = null;
            this.D(fes_22);
            frm_12 = this.vau.get(fes_22).get(0);
            rectangle.union(new Rectangle(frm_12.getX().getValue(), frm_12.getY().getValue(), frm_12.getWidth().getValue(), frm_12.getHeight().getValue()));
        }
        return new fsm_1((int)rectangle.getWidth(), (int)rectangle.getHeight());
    }

    public static void a(faw_2 faw_22, List<fes_2> list) {
    }

    @Override
    public void a(faw_2 faw_22) {
        fes_2 fes_22;
        int n;
        ArrayList<fes_2> arrayList = faw_22.getWidgetChildren();
        if (arrayList == null) {
            return;
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            fes_22 = arrayList.get(n);
            fro_1.c(faw_22, fes_22);
            this.D(fes_22);
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            frm_1 frm_12;
            fes_22 = arrayList.get(n);
            if (!(fes_22.getLayoutData() instanceof frm_1) || (frm_12 = this.vau.get(fes_22).get(0)) == null) continue;
            int n2 = frm_12.getX().getValue();
            int n3 = frm_12.getY().getValue();
            int n4 = frm_12.getWidth().getValue();
            int n5 = frm_12.getHeight().getValue();
            fes_22.setPosition(n2, n3);
            fes_22.setSize(new fsm_1(n4, n5));
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vau.clear();
    }

    public frl_1 gEP() {
        frl_1 frl_12 = new frl_1();
        frl_12.aVI();
        this.a((fhi_2)frl_12);
        return frl_12;
    }

    private boolean isFullyDisplayed(faw_2 faw_22, frm_1 frm_12) {
        return frm_12.getX().getValue() >= 0 && frm_12.getY().getValue() >= 0 && frm_12.getX().getValue() + frm_12.getWidth().getValue() <= faw_22.getWidth() && frm_12.getY().getValue() + frm_12.getHeight().getValue() <= faw_22.getHeight();
    }

    public void a(fes_2 fes_22, frm_1 frm_12) {
        if (frm_12 == null) {
            return;
        }
        ArrayList<frm_1> arrayList = this.vau.get(fes_22);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.vau.put(fes_22, arrayList);
        } else {
            arrayList.clear();
        }
        arrayList.add(frm_12);
    }

    public void E(fes_2 fes_22) {
        this.vau.remove(fes_22);
    }

    @Override
    public /* synthetic */ frs_1 gEJ() {
        return this.gEP();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.gEP();
    }
}

