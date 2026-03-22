/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aaU
 */
public class aau_0 {
    public static final int ccu = 86;
    public static final int ccv = 43;
    public static final int ccw = 10;
    private static final int ccx = 5;
    private static final int ccy = 7;
    private static final int ccz = 35;
    private static final float ccA = 9.765625E-4f;
    private static final float ccB = 0.0017361111f;
    private static final Logger ccC = Logger.getLogger(aau_0.class);
    final aah_1<aaq_0> ccD = new aah_1();
    private final ArrayList<aaq_0> ccE = new ArrayList();
    protected final abh ccF = new abh();
    private float ccG;
    private float ccH;
    private final aav_0 ccI = new aav_0();

    public void rw(int n) {
        this.ccD.vS(n);
    }

    public void clear() {
        for (aaq_0 aaq_02 : this.ccD) {
            if (aaq_02 == null) continue;
            aaq_02.bsK();
        }
        this.ccD.clear();
        this.ccE.clear();
        this.ccF.clear();
        this.ccI.reset();
    }

    boolean bsR() {
        return this.ccI.ccL;
    }

    float bsS() {
        return this.ccG;
    }

    float bsT() {
        return this.ccH;
    }

    public int bsU() {
        return this.ccD.bTR();
    }

    void a(String string, int n, int n2, int n3, int n4, @NotNull wb_0 wb_02) {
        int n5;
        int n6;
        if (!this.ccI.k(n = GC.C((float)n * 0.0017361111f), n3 = GC.B((float)n3 * 0.0017361111f), n2 = GC.B((float)n2 * 9.765625E-4f), n4 = GC.C((float)n4 * 9.765625E-4f))) {
            this.ccF.a(this.ccG, this.ccH, 35, this.ccE);
            return;
        }
        this.ccG = (float)(n2 + n4) / 2.0f;
        this.ccH = (float)(n + n3) / 2.0f;
        this.ccE.clear();
        if (n2 <= Short.MIN_VALUE || n4 >= Short.MAX_VALUE || n3 <= Short.MIN_VALUE || n >= Short.MAX_VALUE) {
            ccC.error((Object)("on ne devrait pas \u00eatre l\u00e0!! chargement de la map: " + n + "," + n2));
        } else {
            int n7;
            n6 = n4 - n2;
            if (n6 > 5) {
                n7 = (n6 - 5) / 2;
                n4 -= n7;
                n2 += n7;
            }
            if ((n7 = n - n3) > 7) {
                n5 = (n7 - 7) / 2;
                n -= n5;
                n3 += n5;
            }
            for (n5 = n3 - 1; n5 <= n; ++n5) {
                for (int i = n2; i <= n4; ++i) {
                    int n8 = GC.t(i, n5);
                    if (!wb_02.aI(i, n5)) continue;
                    aaq_0 aaq_02 = (aaq_0)this.ccF.rx(n8);
                    if (aaq_02 == null) {
                        aaq_02 = this.a(string, i, n5);
                        this.ccF.b(n8, aaq_02);
                    }
                    this.ccE.add(aaq_02);
                }
            }
        }
        this.ccD.clear();
        for (n6 = this.ccE.size() - 1; n6 >= 0; --n6) {
            try {
                aaq_0 aaq_03 = this.ccE.get(n6);
                n5 = GC.d(aaq_03.ccg, aaq_03.cch);
                this.ccD.b(n5, aaq_03);
                continue;
            }
            catch (Exception exception) {
                ccC.error((Object)"Probl\u00e8me avec la map ", (Throwable)exception);
            }
        }
    }

    protected aaq_0 a(String string, int n, int n2) {
        return aau_0.b(string, n, n2);
    }

    @NotNull
    protected static aaq_0 b(String string, int n, int n2) {
        aaq_0 aaq_02 = new aaq_0(n, n2);
        try {
            aaq_02.bZ(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            ccC.error((Object)("file not found to load map (" + n + "; " + n2 + ")"));
        }
        catch (IOException iOException) {
            ccC.error((Object)("Unable to load map (" + n + "; " + n2 + ")"), (Throwable)iOException);
        }
        return aaq_02;
    }

    public void ef(String string) {
        Iterator<aaq_0> iterator = this.ccD.iterator();
        int[] nArray = new int[4];
        int[] nArray2 = new int[nArray.length];
        int[] nArray3 = new int[nArray.length];
        int[] nArray4 = new int[nArray.length];
        Arrays.fill(nArray4, Integer.MAX_VALUE);
        while (iterator.hasNext()) {
            aaq_0 aaq_02 = iterator.next();
            nArray[3] = aaq_02.a(string, nArray);
            nArray[0] = aaq_02.ccf.size();
            for (int i = 0; i < nArray.length; ++i) {
                int n = i;
                nArray3[n] = nArray3[n] + nArray[i];
                if (nArray[i] < nArray4[i]) {
                    nArray4[i] = nArray[i];
                }
                if (nArray[i] <= nArray2[i]) continue;
                nArray2[i] = nArray[i];
            }
        }
        float f2 = this.ccD.bTR();
        ccC.info((Object)("exportPath = " + string + " mapCount=" + f2));
        ccC.info((Object)("Num elements = " + nArray3[0] + "\tsize= " + nArray3[3] + "octets"));
        ccC.info((Object)("Avg elements by maps = " + (float)nArray3[0] / f2 + "\tsize = " + (float)nArray3[3] / f2 + "\tNum Groupe = " + (float)nArray3[1] / f2 + "\tnumColors = " + (float)nArray3[2] / f2));
        ccC.info((Object)("Max elements by maps = " + nArray2[0] + "\tsize = " + nArray2[3] + "\tNum Groupe = " + nArray2[1] + "\tnumColors = " + nArray2[2]));
        ccC.info((Object)("Min elements by maps = " + nArray4[0] + "\tsize = " + nArray4[3] + "\tNum Groupe = " + nArray4[1] + "\tnumColors = " + nArray4[2]));
    }

    public static int bj(int n, int n2) {
        return (int)((float)((n - n2) * 86) * 0.5f);
    }

    public static int o(int n, int n2, int n3) {
        return (int)((float)(-(n + n2)) * 21.5f) + n3 * 10;
    }

    public static float bk(int n, int n2) {
        return GC.B((float)((n - n2) * 86) * 0.5f);
    }

    public static float p(int n, int n2, int n3) {
        float f2 = Math.abs(n) % 2 == Math.abs(n2) % 2 ? 0.0f : 0.5f;
        return (float)(GC.B((float)(-(n + n2)) * 21.5f) + n3 * 10) + f2;
    }

    public void a(int n, int n2, ScreenElement screenElement) {
        this.a(this.ccD, n, n2, screenElement);
    }

    @NotNull
    protected aaq_0 a(aah_1<aaq_0> aah_12, int n, int n2, ScreenElement screenElement) {
        aaq_0 aaq_02 = this.a(aah_12, n, n2);
        aaq_02.b(screenElement);
        return aaq_02;
    }

    @NotNull
    protected aaq_0 a(aah_1<aaq_0> aah_12, int n, int n2) {
        int n3 = GC.t(n, n2);
        aaq_0 aaq_02 = aah_12.vK(n3);
        if (aaq_02 == null) {
            aaq_02 = this.bl(n, n2);
            aah_12.b(n3, aaq_02);
        }
        return aaq_02;
    }

    protected aaq_0 bl(int n, int n2) {
        return new aaq_0(n, n2);
    }
}

