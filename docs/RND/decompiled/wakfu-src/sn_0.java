/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from SN
 */
public class sn_0 {
    public static boolean a(aoy_1 aoy_12, ArrayList<amx_1> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Iterator<aow_1> iterator = aoy_12.bEt().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().bEJ() != 0) continue;
                return true;
            }
            return false;
        }
        for (aow_1 aow_12 : aoy_12.bEt()) {
            boolean bl = true;
            boolean bl2 = true;
            int n = 0;
            for (int n2 = 0; n2 < arrayList.size(); n2 = (int)((byte)(n2 + 1))) {
                boolean bl3;
                if (n > aow_12.bEJ() - 1) {
                    bl2 = false;
                    break;
                }
                aoz_1 aoz_12 = (aoz_1)aow_12.tl(n);
                if (aoz_12.bDv() == amz_1.cJA && arrayList.get(n2).bDv() != amz_1.cJA) {
                    bl = false;
                    bl3 = true;
                    while (n2 < arrayList.size()) {
                        if (arrayList.get(n2) == null || arrayList.get(n2).bDv() != amz_1.cJy) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aow_12.bEJ() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (aoz_12.bDv() == amz_1.cJB) {
                    bl = false;
                    bl3 = true;
                    int n3 = arrayList.size();
                    while (n2 < n3) {
                        if (arrayList.get(n2).bDv() != amz_1.cJx) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aow_12.bEJ() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (aoz_12.bDv() == amz_1.cJD) {
                    if (arrayList.get(n2) == null) {
                        ++n;
                        continue;
                    }
                    bl = false;
                    bl3 = true;
                    while (n2 < arrayList.size()) {
                        if (arrayList.get(n2).bDv() != amz_1.cJC) {
                            bl3 = false;
                            break;
                        }
                        n2 = (byte)(n2 + 1);
                    }
                    if (bl3) {
                        if (n != aow_12.bEJ() - 1) {
                            bl2 = false;
                            break;
                        }
                        return true;
                    }
                    n2 = (byte)(n2 - 1);
                    ++n;
                    continue;
                }
                if (arrayList.get(n2) == null) {
                    bl2 = false;
                    break;
                }
                if (aoz_12.bDv().bDE().isAnAlias()) {
                    if (!aoz_12.bDv().bDE().getTypeRelated().contains((Object)arrayList.get(n2).bDv().bDE())) {
                        bl2 = false;
                        break;
                    }
                } else if (arrayList.get(n2).bDv() != aoz_12.bDv()) {
                    bl2 = false;
                    break;
                }
                ++n;
            }
            if (!bl2 || bl && arrayList.size() != aow_12.bEJ()) continue;
            return true;
        }
        return false;
    }
}

