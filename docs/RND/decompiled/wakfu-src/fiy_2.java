/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fIy
 */
public class fiy_2
extends fip_1 {
    private fix_2 uBF = null;

    public void a(String string, fhs_2 fhs_22, fix_2 fix_22) {
        this.uBF = fix_22;
        this.b(string, fhs_22);
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(fix_2.class);
        list2.add(this.uBF);
        super.a(stringArray, list, list2);
    }

    public void a(fiy_2 fiy_22) {
        fiy_22.a(this.cEp, this.nQt, this.uBF);
    }

    public fiy_2 gBT() {
        fiy_2 fiy_22 = new fiy_2();
        this.a(fiy_22);
        return fiy_22;
    }
}

