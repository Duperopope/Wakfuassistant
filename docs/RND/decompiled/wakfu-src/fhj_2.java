/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHJ
 */
public class fhj_2 {
    private static final Logger uyK = Logger.getLogger(fhj_2.class);
    private static final fhj_2 uyL = new fhj_2();
    private static final boolean uyM = false;
    private static final THashSet<String> uyN = new THashSet();
    private static final int uyO = 100;
    private boolean uyD;
    private final Set<fhi_2> uyP = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyQ = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyR = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyS = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyT = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyU = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyV = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyW = new HashSet<fhi_2>(100);
    private final Set<fhi_2> uyX = new HashSet<fhi_2>(100);
    private int uyY = 4;
    public static final int uyZ = 0;
    public static final int uza = 1;
    public static final int uzb = 2;
    public static final int uzc = 3;
    public static final int uzd = 4;
    private int dDh;
    private boolean uze;
    @Nullable
    private BooleanSupplier uzf;

    private fhj_2() {
    }

    public static fhj_2 gBa() {
        return uyL;
    }

    public void gAW() {
        this.uyD = true;
    }

    public boolean gBb() {
        return this.uyY != 4;
    }

    public void b(@Nullable BooleanSupplier booleanSupplier) {
        this.uzf = booleanSupplier;
    }

    private void gBc() {
        if (this.uzf != null && !this.uzf.getAsBoolean()) {
            uyK.warn((Object)String.format("Not the dedicated thread but on following thread %s... sus", Thread.currentThread()), (Throwable)new Exception("for stacktrace"));
        }
    }

    private void a(fhi_2 fhi_22, Set<fhi_2> set, Set<fhi_2> set2, int n) {
        if (!fhi_22.isUnloading() && !fhi_22.isInTreeDepthManager()) {
            this.gBc();
            if (this.uyY == n) {
                set.add(fhi_22);
            } else {
                set2.add(fhi_22);
            }
        }
    }

    private void a(fhi_2 fhi_22, Set<fhi_2> set) {
        if (!(fhi_22.isUnloading() || fhi_22.isATemplate() || fhi_22.isAddedNextInTreeDepthManager())) {
            this.gBc();
            set.add(fhi_22);
        }
    }

    public void Y(fhi_2 fhi_22) {
        this.a(fhi_22, this.uyQ);
    }

    public void Z(fhi_2 fhi_22) {
        this.a(fhi_22, this.uyT);
    }

    public void aa(fhi_2 fhi_22) {
        this.a(fhi_22, this.uyW);
    }

    public void ab(fhi_2 fhi_22) {
        if (!fhi_22.isATemplate()) {
            if (this.uyY == 4 || this.uyY <= 1 && fhi_22.getLastPreProcessFrame() != this.dDh) {
                this.a(fhi_22, this.uyR, this.uyP, 1);
            } else {
                this.Y(fhi_22);
            }
        }
    }

    public void ac(fhi_2 fhi_22) {
        if (!fhi_22.isATemplate()) {
            if (this.uyY == 4 || this.uyY <= 2 && fhi_22.getLastMiddleProcessFrame() != this.dDh) {
                this.a(fhi_22, this.uyU, this.uyS, 2);
            } else {
                this.Z(fhi_22);
            }
        }
    }

    public void ad(fhi_2 fhi_22) {
        if (!fhi_22.isATemplate()) {
            if (this.uyY == 4 || this.uyY <= 3 && fhi_22.getLastPostProcessFrame() != this.dDh) {
                this.a(fhi_22, this.uyX, this.uyV, 3);
            } else {
                this.aa(fhi_22);
            }
        }
    }

    public boolean ae(fhi_2 fhi_22) {
        return this.ag(fhi_22) || this.ai(fhi_22) || this.ak(fhi_22);
    }

    public boolean af(fhi_2 fhi_22) {
        return this.ah(fhi_22) || this.aj(fhi_22) || this.al(fhi_22);
    }

    public boolean ag(fhi_2 fhi_22) {
        return fhj_2.a(fhi_22, this.uyP);
    }

    public boolean ah(fhi_2 fhi_22) {
        return fhj_2.b(fhi_22, this.uyP);
    }

    public boolean ai(fhi_2 fhi_22) {
        return fhj_2.a(fhi_22, this.uyS);
    }

    public boolean aj(fhi_2 fhi_22) {
        return fhj_2.b(fhi_22, this.uyS);
    }

    public boolean ak(fhi_2 fhi_22) {
        return fhj_2.a(fhi_22, this.uyV);
    }

    public boolean al(fhi_2 fhi_22) {
        return fhj_2.b(fhi_22, this.uyV);
    }

    public static boolean a(fhi_2 fhi_22, Collection<fhi_2> collection) {
        if (fhi_22.isATemplate()) {
            return false;
        }
        return collection.stream().anyMatch(fhi_23 -> fhi_23 == fhi_22);
    }

    public static boolean b(fhi_2 fhi_22, Collection<fhi_2> collection) {
        if (fhi_22.isATemplate()) {
            return false;
        }
        return collection.stream().anyMatch(fhi_23 -> !fhi_23.isATemplate() && fhi_23.isChildOf(fhi_22));
    }

    private int a(fhv_1 fhv_12, int n) {
        fhv_12.setTreePosition(n);
        if (fhv_12.uxK != null) {
            int n2 = fhv_12.uxK.size();
            for (int i = 0; i < n2; ++i) {
                n = this.a(fhv_12.uxK.get(i), n + 1);
            }
        }
        return n;
    }

    public void gBd() {
        this.uze = true;
    }

    private void am(fhi_2 fhi_22) {
        fhv_1 fhv_12;
        fhs_2 fhs_22;
        if (fhi_22.getElementType() == fht_1.uxB && (fhs_22 = (fhv_12 = (fhv_1)fhi_22).getElementMap()) != null) {
            uyN.add((Object)fhs_22.gAt());
        }
    }

    public void abF(int n) {
        this.uze = true;
        while (this.uze) {
            ArrayList<fhi_2> arrayList;
            this.uze = false;
            this.uyY = 0;
            this.dDh = (this.dDh + 1) % Integer.MAX_VALUE;
            if (this.uyD) {
                this.a(fyw_0.gqw().gqD().getMasterRootContainer(), 0);
                this.uyD = false;
            }
            fhv_2.gBo();
            this.uyY = 1;
            while (!this.uyP.isEmpty()) {
                arrayList = new ArrayList<fhi_2>(this.uyP);
                arrayList.sort(fhk_2.uzg);
                for (fhi_2 fhi_22 : arrayList) {
                    fhi_22.setLastPreProcessFrame(this.dDh);
                    fhi_22.abB(n);
                }
                this.uyP.clear();
                this.uyP.addAll(this.uyR);
                this.uyR.clear();
            }
            this.uyY = 2;
            while (!this.uyS.isEmpty()) {
                arrayList = new ArrayList<fhi_2>(this.uyS);
                arrayList.sort(fhl_1.uzh);
                for (fhi_2 fhi_22 : arrayList) {
                    fhi_22.setLastMiddleProcessFrame(this.dDh);
                    fhi_22.abC(n);
                }
                this.uyS.clear();
                this.uyS.addAll(this.uyU);
                this.uyU.clear();
            }
            this.uyY = 3;
            while (!this.uyV.isEmpty()) {
                arrayList = new ArrayList<fhi_2>(this.uyV);
                arrayList.sort(fhl_1.uzh);
                for (fhi_2 fhi_22 : arrayList) {
                    fhi_22.setLastPostProcessFrame(this.dDh);
                    fhi_22.abD(n);
                }
                this.uyV.clear();
                this.uyV.addAll(this.uyX);
                this.uyX.clear();
            }
            this.uyY = 4;
            this.uyP.addAll(this.uyQ);
            this.uyQ.clear();
            this.uyS.addAll(this.uyT);
            this.uyT.clear();
            this.uyV.addAll(this.uyW);
            this.uyW.clear();
        }
    }

    private void gBe() {
        if (!uyN.isEmpty()) {
            uyK.info((Object)("[Frame " + this.dDh + "] Dialog process\u00e9es : "));
            for (String string : uyN) {
                uyK.info((Object)("\t\t" + string));
            }
        }
    }
}

