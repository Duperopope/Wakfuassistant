/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from aaQ
 */
public class aaq_0 {
    private static final Logger ccb = Logger.getLogger(aaq_0.class);
    public static final int ccc = 1024;
    public static final int ccd = 576;
    private static final LoadingCache<String, byte[]> cce = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new aar_0());
    final ArrayList<ScreenElement> ccf;
    final short ccg;
    final short cch;
    int bro;
    int brp;
    int brq;
    int brr;
    private int cci = Integer.MAX_VALUE;
    private int ccj = Integer.MAX_VALUE;
    private short cck = (short)Short.MAX_VALUE;
    private int ccl = Integer.MIN_VALUE;
    private int ccm = Integer.MIN_VALUE;
    private short ccn = (short)Short.MIN_VALUE;

    public aaq_0() {
        this(0, 0);
    }

    public aaq_0(int n, int n2) {
        this.ccf = new ArrayList(1024);
        this.bro = Integer.MAX_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.brp = Integer.MAX_VALUE;
        this.brr = Integer.MIN_VALUE;
        assert (n > Short.MIN_VALUE && n < Short.MAX_VALUE);
        assert (n2 > Short.MIN_VALUE && n2 < Short.MAX_VALUE);
        this.ccg = (short)n;
        this.cch = (short)n2;
    }

    public final void bsK() {
        int n = this.ccf.size();
        for (int i = 0; i < n; ++i) {
            ScreenElement screenElement = this.ccf.get(i);
            screenElement.bsI();
        }
        this.ccf.clear();
    }

    public final int ap(byte by) {
        int n = 0;
        int n2 = this.ccf.size();
        for (int i = 0; i < n2; ++i) {
            ScreenElement screenElement = this.ccf.get(i);
            byte by2 = screenElement.bsz().brR();
            if ((by2 & by) != by2) continue;
            ++n;
        }
        return n;
    }

    public final ArrayList<ScreenElement> bsL() {
        return this.ccf;
    }

    public final short bsM() {
        return this.ccg;
    }

    public final short bsN() {
        return this.cch;
    }

    public boolean bZ(String string) {
        byte[] byArray;
        String string2 = this.ee(string);
        try {
            byArray = (byte[])cce.get((Object)string2);
        }
        catch (ExecutionException executionException) {
            ccb.error((Object)("Unable to load map (" + string2 + ") in CACHE"));
            return false;
        }
        if (byArray == null) {
            ccb.error((Object)("Unable to load map (" + string2 + ")"));
            return false;
        }
        apl_1 apl_12 = apl_1.dw(byArray);
        this.cci = apl_12.aIA();
        this.ccj = apl_12.aIA();
        this.cck = apl_12.aIz();
        this.ccl = apl_12.aIA();
        this.ccm = apl_12.aIA();
        this.ccn = apl_12.aIz();
        int n = apl_12.aIz() & 0xFFFF;
        int[] nArray = new int[n];
        byte[] byArray2 = new byte[n];
        int[] nArray2 = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = apl_12.aIA();
            byArray2[i] = apl_12.aIy();
            nArray2[i] = apl_12.aIA();
        }
        float[][] fArray = this.c(apl_12);
        boolean bl = true;
        int n2 = apl_12.aIA();
        int n3 = apl_12.aIA();
        int n4 = apl_12.aIz() & 0xFFFF;
        for (int i = 0; i < n4; ++i) {
            int n5 = n2 + (apl_12.aIy() & 0xFF);
            int n6 = n2 + (apl_12.aIy() & 0xFF);
            int n7 = n3 + (apl_12.aIy() & 0xFF);
            int n8 = n3 + (apl_12.aIy() & 0xFF);
            for (int j = n5; j < n6; ++j) {
                for (int i2 = n7; i2 < n8; ++i2) {
                    int n9 = apl_12.aIy() & 0xFF;
                    for (int i3 = 0; i3 < n9; ++i3) {
                        ScreenElement screenElement = (ScreenElement)ScreenElement.cbJ.bSK();
                        screenElement.cbL = j;
                        screenElement.cbM = i2;
                        bl &= screenElement.b(apl_12);
                        int n10 = apl_12.aIz() & 0xFFFF;
                        screenElement.cbR = nArray[n10];
                        screenElement.bZd = byArray2[n10];
                        screenElement.bXO = nArray2[n10];
                        int n11 = apl_12.aIz() & 0xFFFF;
                        screenElement.ayR = fArray[n11];
                        aeS aeS2 = screenElement.cbP;
                        if (aeS2 == null) continue;
                        screenElement.bsH();
                        screenElement.bV(false);
                        this.ccf.add(screenElement);
                    }
                }
            }
        }
        apl_12.close();
        this.bsO();
        return bl;
    }

    private float[][] c(apl_1 apl_12) {
        int n = apl_12.aIz() & 0xFFFF;
        float[][] fArrayArray = new float[n][];
        for (int i = 0; i < n; ++i) {
            byte by = apl_12.aIy();
            fArrayArray[i] = ScreenElement.rr(by);
            ScreenElement.a(fArrayArray[i], by, apl_12);
        }
        return fArrayArray;
    }

    public final void bsO() {
        aaq_0.j(this.ccf);
        this.bsP();
    }

    public void bsP() {
        int n = this.ccf.size();
        for (int i = 0; i < n; ++i) {
            int n2;
            int n3;
            ScreenElement screenElement = this.ccf.get(i);
            if (screenElement.cbO < this.bro) {
                this.bro = screenElement.cbO;
            }
            if (screenElement.cbO + (n3 = screenElement.cbP.bwU()) > this.brq) {
                this.brq = screenElement.cbO + n3;
            }
            if (screenElement.cbN > this.brr) {
                this.brr = screenElement.cbN;
            }
            if (screenElement.cbN - (n2 = screenElement.cbP.bwV()) >= this.brp) continue;
            this.brp = screenElement.cbN - n2;
        }
    }

    private static void j(ArrayList<ScreenElement> arrayList) {
        arrayList.sort(Comparator.comparingLong(screenElement -> screenElement.cbS));
    }

    public final String toString() {
        return "ScreenMap {" + this.ccg + ", " + this.cch + "}";
    }

    int a(String string, int[] nArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        String string2 = this.ee(string);
        fs_0 fs_02 = new fs_0();
        this.bsQ();
        HashSet<aaT> hashSet = new HashSet<aaT>();
        HashSet<aaS> hashSet2 = new HashSet<aaS>();
        int n11 = this.ccf.size();
        for (n10 = 0; n10 < n11; ++n10) {
            ScreenElement screenElement = this.ccf.get(n10);
            hashSet.add(new aaT(screenElement));
            hashSet2.add(new aaS(screenElement));
        }
        fs_02.mz(this.cci);
        fs_02.mz(this.ccj);
        fs_02.k(this.cck);
        fs_02.mz(this.ccl);
        fs_02.mz(this.ccm);
        fs_02.k(this.ccn);
        n10 = Integer.MAX_VALUE;
        int n12 = Integer.MAX_VALUE;
        int n13 = Integer.MIN_VALUE;
        int n14 = Integer.MIN_VALUE;
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap(512);
        for (int i = 0; i < n11; ++i) {
            ScreenElement screenElement = this.ccf.get(i);
            n9 = screenElement.cbL;
            n8 = screenElement.cbM;
            if (n9 < n10) {
                n10 = n9;
            }
            if (n9 > n13) {
                n13 = n9;
            }
            if (n8 < n12) {
                n12 = n8;
            }
            if (n8 > n14) {
                n14 = n8;
            }
            int n15 = GC.t(n9, n8);
            aeb_2.a(tIntObjectHashMap, n15, screenElement);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        fs_02.k((short)arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            ((aaT)arrayList.get(i)).a(fs_02);
        }
        nArray[1] = arrayList.size();
        ArrayList arrayList2 = new ArrayList(hashSet2);
        fs_02.k((short)arrayList2.size());
        for (n9 = 0; n9 < arrayList2.size(); ++n9) {
            ((aaS)arrayList2.get(n9)).a(fs_02);
        }
        nArray[2] = arrayList2.size();
        assert (n13 - n10 <= 255);
        assert (n14 - n12 <= 255);
        fs_02.mz(n10);
        fs_02.mz(n12);
        n9 = n13 - n10 + 1;
        n8 = n14 - n12 + 1;
        ArrayList<aci_1> arrayList3 = new ArrayList<aci_1>(n9 * n8);
        byte[] byArray = new byte[n8 * n9];
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ArrayList arrayList4 = (ArrayList)tIntObjectIterator.value();
            n7 = arrayList4.size();
            n6 = tIntObjectIterator.key();
            n5 = GC.mS(n6);
            n4 = GC.mT(n6);
            byArray[(n4 - n12) * n9 + (n5 - n10)] = (byte)n7;
        }
        for (n3 = 0; n3 < n8; ++n3) {
            for (n7 = 0; n7 < n9; ++n7) {
                if (byArray[n3 * n9 + n7] == 0) continue;
                n6 = 1;
                n5 = 1;
                for (n4 = n3 + 1; n4 < n8 && byArray[n4 * n9 + n7] != 0; ++n4) {
                    ++n5;
                }
                for (n4 = n7 + 1; n4 < n9; ++n4) {
                    n2 = 1;
                    for (n = n3; n < n3 + n5; ++n) {
                        if (byArray[n * n9 + n4] != 0) continue;
                        n2 = 0;
                        break;
                    }
                    if (n2 == 0) break;
                    ++n6;
                }
                for (n4 = n3; n4 < n3 + n5; ++n4) {
                    for (n2 = n7; n2 < n7 + n6; ++n2) {
                        byArray[n4 * n9 + n2] = 0;
                    }
                }
                arrayList3.add(new aci_1(n7, n7 + n6, n3, n3 + n5));
            }
        }
        n3 = arrayList3.size();
        fs_02.k((short)n3);
        for (n7 = 0; n7 < n3; ++n7) {
            aci_1 aci_12 = (aci_1)arrayList3.get(n7);
            fs_02.g((byte)aci_12.cuQ);
            fs_02.g((byte)aci_12.cuR);
            fs_02.g((byte)aci_12.cuS);
            fs_02.g((byte)aci_12.cuT);
            for (n5 = aci_12.cuQ; n5 < aci_12.cuR; ++n5) {
                for (n4 = aci_12.cuS; n4 < aci_12.cuT; ++n4) {
                    n2 = n5 + n10;
                    n = n4 + n12;
                    int n16 = GC.t(n2, n);
                    ArrayList arrayList5 = (ArrayList)tIntObjectHashMap.get(n16);
                    int n17 = arrayList5.size();
                    fs_02.g((byte)n17);
                    for (int i = 0; i < n17; ++i) {
                        ScreenElement screenElement = (ScreenElement)arrayList5.get(i);
                        screenElement.e(fs_02);
                        int n18 = arrayList.indexOf(new aaT(screenElement));
                        if (n18 == -1 || n18 > Short.MAX_VALUE) {
                            throw new RuntimeException("pas d'indexage de groupe");
                        }
                        fs_02.k((short)n18);
                        int n19 = arrayList2.indexOf(new aaS(screenElement));
                        if (n19 == -1 || n19 > Short.MAX_VALUE) {
                            throw new RuntimeException("pas d'indexage de couleur");
                        }
                        fs_02.k((short)n19);
                    }
                }
            }
        }
        FileOutputStream fileOutputStream = fq_0.bO(string2);
        byte[] byArray2 = fs_02.aKU();
        fileOutputStream.write(byArray2);
        fs_02.close();
        fileOutputStream.close();
        return byArray2.length;
    }

    public void bsQ() {
        int n = this.ccf.size();
        for (int i = 0; i < n; ++i) {
            ScreenElement screenElement = this.ccf.get(i);
            if (screenElement.cbL < this.cci) {
                this.cci = screenElement.cbL;
            }
            if (screenElement.cbL > this.ccl) {
                this.ccl = screenElement.cbL;
            }
            if (screenElement.cbM < this.ccj) {
                this.ccj = screenElement.cbM;
            }
            if (screenElement.cbM > this.ccm) {
                this.ccm = screenElement.cbM;
            }
            if (screenElement.cbK < this.cck) {
                this.cck = screenElement.cbK;
            }
            if (screenElement.cbK <= this.ccn) continue;
            this.ccn = screenElement.cbK;
        }
    }

    void b(ScreenElement screenElement) {
        this.ccf.add(screenElement);
    }

    public void c(ScreenElement screenElement) {
        this.ccf.remove(screenElement);
    }

    boolean aK(int n, int n2) {
        return n >= this.cci && n <= this.ccl && n2 >= this.ccj && n2 <= this.ccm;
    }

    boolean K(int n, int n2, short s) {
        return n >= this.cci && n <= this.ccl && n2 >= this.ccj && n2 <= this.ccm && s >= this.cck && s <= this.ccn;
    }

    private String ee(String string) {
        return string + this.ccg + "_" + this.cch;
    }
}

