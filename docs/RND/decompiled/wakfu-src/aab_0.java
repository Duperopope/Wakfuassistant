/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aab
 */
public class aab_0 {
    protected static final Logger bXI = Logger.getLogger(aab_0.class);
    private static final ArrayList<DisplayedScreenElement> bXJ = new ArrayList(64);

    public static ArrayList<DisplayedScreenElement> a(int n, int n2, abi_1 abi_12, aae_0 aae_02, ayi_1 ayi_12) {
        aae_02.reset();
        int n3 = ayi_12.bRS();
        int n4 = ayi_12.bRT();
        bXJ.clear();
        switch (abi_12) {
            case dzk: {
                int n5 = n - ayi_12.bgv();
                int n6 = n2 - ayi_12.bgu();
                for (int i = 0; i < n3; ++i) {
                    int n7 = n5 + i;
                    for (int j = 0; j < n4; ++j) {
                        if (!ayi_12.cq(i, j)) continue;
                        aab_0.aZ(n7, n6 + j);
                    }
                }
                break;
            }
            case dzm: {
                int n8 = n - ayi_12.bgu() + ayi_12.bRT() - 1;
                int n9 = n2 - ayi_12.bgv();
                for (int i = 0; i < n3; ++i) {
                    int n10 = n9 + i;
                    for (int j = 0; j < n4; ++j) {
                        if (!ayi_12.cq(i, j)) continue;
                        aab_0.aZ(n8 - j, n10);
                    }
                }
                break;
            }
            case dzo: {
                int n11 = n - ayi_12.bgv() + ayi_12.bRS() - 1;
                int n12 = n2 - ayi_12.bgu() + ayi_12.bRT() - 1;
                for (int i = 0; i < n3; ++i) {
                    int n13 = n11 - i;
                    for (int j = 0; j < n4; ++j) {
                        if (!ayi_12.cq(i, j)) continue;
                        aab_0.aZ(n13, n12 - j);
                    }
                }
                break;
            }
            case dzq: {
                int n14 = n - ayi_12.bgu();
                int n15 = n2 + ayi_12.bgv();
                for (int i = 0; i < n3; ++i) {
                    int n16 = n15 - i;
                    for (int j = 0; j < n4; ++j) {
                        if (!ayi_12.cq(i, j)) continue;
                        aab_0.aZ(n14 + j, n16);
                    }
                }
                break;
            }
        }
        aae_02.h(bXJ);
        return aae_02.bqD();
    }

    private static void aZ(int n, int n2) {
        aaa_0.brC().b(n, n2, bXJ, abd.ccZ);
    }

    public static ArrayList<DisplayedScreenElement> a(int n, int n2, abi_1 abi_12, aae_0 aae_02, List<int[]> list) {
        aae_02.reset();
        int n3 = n;
        int n4 = n2;
        bXJ.clear();
        switch (abi_12) {
            case dzk: 
            case dzt: {
                for (int[] nArray : list) {
                    aab_0.aZ(n3 + nArray[0], n4 + nArray[1]);
                }
                break;
            }
            case dzm: {
                for (int[] nArray : list) {
                    aab_0.aZ(n3 - nArray[1], n4 + nArray[0]);
                }
                break;
            }
            case dzo: {
                for (int[] nArray : list) {
                    aab_0.aZ(n3 - nArray[0], n4 - nArray[1]);
                }
                break;
            }
            case dzq: {
                for (int[] nArray : list) {
                    aab_0.aZ(n3 + nArray[1], n4 - nArray[0]);
                }
                break;
            }
            default: {
                bXI.error((Object)("Impossible de selectionner des cellules dans cette direction :" + String.valueOf(abi_12)));
            }
        }
        aae_02.h(bXJ);
        return aae_02.bqD();
    }
}

