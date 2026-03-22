/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class aeO {
    private static final short coc = 2;
    private static final aeN cod = new aeP();

    @Nullable
    public static anp_2 a(ads_0 ads_02, acd_1 acd_12, st_0 st_02, wz_0 wz_02, sr_0 sr_02) {
        if (acd_12 == null) {
            return null;
        }
        int n = ads_02.bvI();
        int n2 = ads_02.bvJ();
        short s = ads_02.buV() != null ? ads_02.buV().bcE() : ads_02.bcE();
        sr_02.bge();
        sr_02.p(n, n2, s);
        sr_02.a(st_02);
        sr_02.a((int)ads_02.aKu(), ads_02.bcO(), ads_02.bvy());
        wa_0.a(ads_02.aKu(), ads_02.bcO(), ads_02.bvy());
        boolean bl = false;
        if (wz_02 == null) {
            wz_02 = new wz_0();
            bl = true;
        }
        sr_02.b(wz_02);
        int n3 = acd_12.getX();
        int n4 = acd_12.getY();
        short s2 = wa_0.w(n3, n4, acd_12.bdi());
        if (bl) {
            wa_0.a(n, n2, n3, n4, wz_02);
        }
        sr_02.q(n3, n4, s2);
        int n5 = sr_02.bgj();
        if (n5 == -1 || n5 == 0) {
            return null;
        }
        long[] lArray = (long[])sr_02.bgg().clone();
        if (lArray == null) {
            return null;
        }
        int[][] nArray = new int[n5][3];
        for (int i = 0; i < n5; ++i) {
            int n6 = n5 - 1 - i;
            nArray[i][0] = sr_0.dY(lArray[n6]);
            nArray[i][1] = sr_0.dZ(lArray[n6]);
            nArray[i][2] = sr_0.ea(lArray[n6]);
        }
        return new anp_2(nArray);
    }

    public static acd_1 a(aaj_0 aaj_02, int n, int n2, boolean bl) {
        return aeO.a(aaj_02, n, n2, bl, bl);
    }

    @Nullable
    public static acd_1 a(aaj_0 aaj_02, int n, int n2, boolean bl, boolean bl2) {
        Object object;
        ArrayList<acx_0> arrayList;
        if ((bl || bl2) && (arrayList = aaj_02.aD(n, n2)).size() != 0 && (object = (adj_0)arrayList.get(0)) != null && (bl && ((ZC)object).bcO() == 0 || bl2 && ((ZC)object).bcO() > 0)) {
            return ((ZC)object).bqg();
        }
        arrayList = aaj_02.a(n, n2, 0.0f, aar.bZk);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        object = ((DisplayedScreenElement)arrayList.get(0)).brk();
        return new acd_1(((ScreenElement)object).bsu(), ((ScreenElement)object).bsv(), ((ScreenElement)object).bst());
    }

    @Nullable
    public static ArrayList<acd_1> b(aaj_0 aaj_02, int n, int n2, boolean bl, boolean bl2) {
        return aeO.a(aaj_02, n, n2, bl, bl2, cod);
    }

    @Nullable
    public static ArrayList<acd_1> a(aaj_0 aaj_02, int n, int n2, boolean bl, boolean bl2, aeN aeN2) {
        adj_0 adj_02;
        ArrayList<acx_0> arrayList;
        if ((bl || bl2) && !(arrayList = aaj_02.aD(n, n2)).isEmpty() && (adj_02 = (adj_0)arrayList.get(0)) != null && (bl && adj_02.bcO() == 0 || bl2 && adj_02.bcO() > 0) && aeN2.l(adj_02)) {
            ArrayList<acd_1> arrayList2 = new ArrayList<acd_1>(1);
            arrayList2.add(adj_02.bqg());
            return arrayList2;
        }
        arrayList = aaj_02.a(n, n2, 0.0f, aar.bZk);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return aeO.l(arrayList);
    }

    private static ArrayList<acd_1> l(ArrayList<DisplayedScreenElement> arrayList) {
        int n = arrayList.size();
        ArrayList<acd_1> arrayList2 = new ArrayList<acd_1>(n);
        for (int i = 0; i < n; ++i) {
            ScreenElement screenElement = arrayList.get(i).brk();
            arrayList2.add(new acd_1(screenElement.bsu(), screenElement.bsv(), screenElement.bst()));
        }
        return arrayList2;
    }
}

