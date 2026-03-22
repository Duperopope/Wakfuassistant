/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumSet;

/*
 * Renamed from aZO
 */
class azo_0
implements aqg_1<anh_0> {
    azo_0(aZN aZN2) {
    }

    public void a(anh_0 anh_02) {
        flA flA2 = flA.WZ(anh_02.csS());
        int n = anh_02.d();
        int n2 = anh_02.csT();
        int n3 = anh_02.csV();
        boolean bl = anh_02.csW();
        EnumSet<flw> enumSet = EnumSet.noneOf(flw.class);
        if (anh_02.csX()) {
            enumSet.add(flw.sEB);
        }
        if (anh_02.csY()) {
            enumSet.add(flw.sEC);
        }
        if (anh_02.csZ()) {
            enumSet.add(flw.sED);
        }
        String[] stringArray = anh_02.aHm();
        flv_0 flv_02 = flA2.sFB.b(n, n2, n3, bl, enumSet);
        flv_02.WY(anh_02.csU());
        ArrayList<amx_1> arrayList = aZN.s(stringArray);
        if (!sn_0.a(flA2, arrayList)) {
            aZN.hyv.error((Object)("La loi " + String.valueOf(flA2) + " n'a pas des param\u00e8tres du bon type"));
            return;
        }
        flv_02.bk(arrayList);
        int[] nArray = anh_02.cta();
        if (nArray.length == 0) {
            flF.sFP.c(flv_02);
            return;
        }
        for (int n4 : nArray) {
            flF.sFP.a(n4, flv_02);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((anh_0)aqz_22);
    }
}

