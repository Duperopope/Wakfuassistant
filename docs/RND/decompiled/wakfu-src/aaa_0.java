/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aaA
 */
public class aaa_0
implements acu_0 {
    private static final int bZE = 25;
    private static final int bZF = 0;
    private static final int bZG = 1;
    private static final int bZH = 2;
    private static final int bZI = 3;
    public static final int bZJ = 0;
    public static final int bZK = 1;
    public static final int bZL = 2;
    private final ArrayList<DisplayedScreenElement> bZM = new ArrayList(2048);
    private aau_0 bZN;
    private final ArrayList<aay_0> bZO;
    private String bZP;
    private String aXF;
    private wb_0 bZQ;
    private long aHT = Long.MIN_VALUE;
    private byte bZR;
    private static byte bZS = (byte)-1;
    private static final aaa_0 bZT = new aaa_0();
    private static final Logger bZU = Logger.getLogger(aaa_0.class);
    private final aav bZV = new aav();
    private final ArrayList<aaB> bZW = new ArrayList();
    private final ArrayList<aan_0> bZX = new ArrayList();
    private final aaX bZY;
    private final THashSet<DisplayedScreenElement> bZZ = new THashSet();
    private final abj caa = new abj();
    private final ArrayList<DisplayedScreenElement> cab = new ArrayList();
    private int cac;
    private boolean cad = true;
    private boolean cae = false;

    private aaa_0() {
        this.bZO = new ArrayList(25);
        this.bZY = new aaX(this.bZV);
        this.bZN = new aau_0();
        this.clear();
    }

    public static aaa_0 brB() {
        return new aaa_0();
    }

    public static aaa_0 brC() {
        return bZT;
    }

    public Iterator<aay_0> brD() {
        return this.bZO.iterator();
    }

    public void a(@NotNull aau_0 aau_02, wb_0 wb_02) {
        this.bZN.clear();
        this.bZN = aau_02;
        this.a(wb_02);
    }

    public void clear() {
        this.cab.clear();
        this.bZX.clear();
        this.bZW.clear();
        this.bZR = 0;
        this.bZO.clear();
        this.bZN.clear();
        this.bZY.clear();
        this.bZZ.clear();
        this.bZV.clear();
    }

    public void brE() {
        this.bZY.clear();
        this.brI();
    }

    public String fF(long l) {
        return aaa_0.c(this.aXF, l);
    }

    private static String c(String string, long l) {
        if (string == null) {
            return null;
        }
        assert (string.contains("%d") && string.endsWith("/"));
        return String.format(string, l);
    }

    public void fG(long l) {
        if (this.aHT == l) {
            return;
        }
        this.aHT = l;
        if (this.aXF != null) {
            this.bZP = aaa_0.c(this.aXF, this.aHT);
        }
        this.brF();
    }

    public void cL(String string) {
        this.aXF = string;
        this.bZP = aaa_0.c(this.aXF, this.aHT);
        this.brF();
    }

    private void brF() {
        this.bZR = (byte)(this.bZR & 0xFFFFFFFD);
    }

    public void b(aaj_0 aaj_02, int n) {
        this.bZZ.clear();
        agb agb2 = aaj_02.byu();
        int n2 = this.bZO.size();
        for (int i = 0; i < n2; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            ArrayList<DisplayedScreenElement> arrayList = aay_02.bry();
            int n3 = arrayList.size();
            if (n3 == 0 || !aay_02.b(agb2) || !this.cad) continue;
            for (int j = 0; j < n3; ++j) {
                DisplayedScreenElement displayedScreenElement = arrayList.get(j);
                if (!displayedScreenElement.bYU.bss() || displayedScreenElement.bYW == null || this.bZZ.contains((Object)displayedScreenElement)) continue;
                displayedScreenElement.ar((short)n);
                this.bZZ.add((Object)displayedScreenElement);
            }
        }
    }

    public final void a(aci_1 aci_12) {
        this.j(aci_12.cuT, aci_12.cuQ, aci_12.cuS, aci_12.cuR);
    }

    private void j(int n, int n2, int n3, int n4) {
        assert (this.bZP != null) : "You must call setPath before";
        this.bZN.a(this.bZP, n, n2, n3, n4, this.bZQ);
        boolean bl = this.bZN.bsR();
        if (bl && this.brI()) {
            this.brJ();
        }
        this.bZY.a(this.bZN.bsS(), this.bZN.bsT(), 25, this.bZO);
        int n5 = this.bZO.size();
        if (n5 != 0) {
            if (!bl && this.brN()) {
                return;
            }
            this.cae = false;
            boolean bl2 = true;
            for (int i = 0; i < n5; ++i) {
                aay_0 aay_02 = this.bZO.get(i);
                if (aay_02 == null) continue;
                aay_02.aPc();
                boolean bl3 = aay_02.aLB();
                bl2 &= bl3;
            }
            if (bl2) {
                this.brG();
            } else {
                this.brH();
            }
        } else {
            this.brG();
            if (!this.cae) {
                this.cae = true;
                bZU.error((Object)("pas de maps \u00e0 charger (screen map=" + this.bZN.bsS() + ", " + this.bZN.bsT() + ") @" + this.aHT));
            }
        }
    }

    private void brG() {
        this.bZR = (byte)(this.bZR | 1);
    }

    private void brH() {
        this.bZR = (byte)(this.bZR & 0xFFFFFFFE);
    }

    public void a(aaq_0 aaq_02) {
        int n = GC.t(aaq_02.ccg, aaq_02.cch);
        aay_0 aay_02 = (aay_0)this.bZY.ry(n);
        if (aay_02 != null) {
            aay_02.a(this.bZV);
        }
    }

    public boolean brI() {
        aah_1<aaq_0> aah_12 = this.bZN.ccD;
        int n = aah_12.bTR();
        boolean bl = false;
        this.bZO.clear();
        for (int i = 0; i < n; ++i) {
            int n2 = aah_12.wa(i);
            aaq_0 aaq_02 = aah_12.vU(i);
            aay_0 aay_02 = (aay_0)this.bZY.rx(n2);
            if (aay_02 == null) {
                bl = true;
                aay_02 = new aay_0();
                aay_02.a(aaq_02, this.bZV, false);
                this.bZY.b(n2, aay_02);
            }
            this.bZO.add(aay_02);
        }
        return bl;
    }

    private void brJ() {
        for (int i = 0; i < this.bZX.size(); ++i) {
            this.bZX.get(i).bsb();
        }
    }

    public void a(aan_0 aan_02) {
        if (!this.bZX.contains(aan_02)) {
            this.bZX.add(aan_02);
        }
    }

    public void b(aan_0 aan_02) {
        this.bZX.remove(aan_02);
    }

    public boolean a(aaB aaB2) {
        return this.bZW.add(aaB2);
    }

    public boolean b(aaB aaB2) {
        return this.bZW.remove(aaB2);
    }

    public void brK() {
        int n;
        assert (this.bZO.size() == this.bZN.bsU());
        int n2 = this.bZO.size();
        for (n = 0; n < n2; ++n) {
            aay_0 aay_02 = this.bZO.get(n);
            aay_02.a(aay_02.brz(), this.bZV, true);
        }
        for (n = 0; n < this.bZW.size(); ++n) {
            this.bZW.get(n).brT();
        }
    }

    public void c(afV afV2) {
        int n = this.bZM.size();
        for (int i = 0; i < n; ++i) {
            this.bZM.get((int)i).bYZ = false;
        }
        this.bZM.clear();
        agb agb2 = afV2.byu();
        int n2 = this.bZO.size();
        for (n = 0; n < n2; ++n) {
            this.bZO.get(n).a(afV2, this.bZM, agb2);
        }
        n2 = this.cab.size();
        for (n = 0; n < n2; ++n) {
            this.cab.get(n).a(afV2, this.bZM, agb2);
        }
        afV2.n(this.bZM);
        this.brL();
    }

    private void brL() {
        this.bZR = (byte)(this.bZR | 2);
    }

    public final void b(int n, int n2, ArrayList<DisplayedScreenElement> arrayList, abd abd2) {
        int n3 = this.bZO.size();
        for (int i = 0; i < n3; ++i) {
            this.bZO.get(i).a(n, n2, arrayList, abd2);
        }
    }

    public final DisplayedScreenElement b(int n, int n2, abd abd2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n3 = this.bZO.size();
        for (int i = 0; i < n3; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            DisplayedScreenElement displayedScreenElement2 = aay_02.a(n, n2, abd2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement d(int n, int n2, int n3, abd abd2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.bZO.size();
        for (int i = 0; i < n4; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            DisplayedScreenElement displayedScreenElement2 = aay_02.a(n, n2, n3, abd2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement e(int n, int n2, int n3, abd abd2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.bZO.size();
        for (int i = 0; i < n4; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            DisplayedScreenElement displayedScreenElement2 = aay_02.b(n, n2, n3, abd2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement f(int n, int n2, int n3, abd abd2) {
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = this.bZO.size();
        for (int i = 0; i < n4; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            DisplayedScreenElement displayedScreenElement2 = aay_02.c(n, n2, n3, abd2);
            if (displayedScreenElement2 == null || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    public final DisplayedScreenElement g(int n, int n2, int n3, abd abd2) {
        short s = wa_0.w(n, n2, (short)n3);
        if (s == Short.MIN_VALUE) {
            return null;
        }
        return this.f(n, n2, s, abd2);
    }

    public final DisplayedScreenElement h(int n, int n2, int n3, abd abd2) {
        short s = wa_0.y(n, n2, (short)n3);
        if (s == Short.MIN_VALUE) {
            return null;
        }
        return this.e(n, n2, s, abd2);
    }

    public void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList) {
        int n3 = this.bZO.size();
        for (int i = 0; i < n3; ++i) {
            aay_0 aay_02 = this.bZO.get(i);
            aaq_0 aaq_02 = aay_02.brz();
            if (aaq_02 == null) continue;
            aay_02.a(n, n2, arrayList);
        }
    }

    public final ArrayList<aay_0> brM() {
        return this.bZO;
    }

    public final boolean brN() {
        return (this.bZR & 1) == 1;
    }

    public final boolean brO() {
        return (this.bZR & 2) == 2;
    }

    final boolean brP() {
        return this.bZR == 3;
    }

    public void a(wb_0 wb_02) {
        this.bZQ = wb_02;
    }

    public void rf(int n) {
        this.cac = n;
        this.cad = n != 0;
        byte by = (byte)(bZS & 0xFFFFFFF8 | aaa_0.rg(n));
        this.an(by);
        this.brK();
    }

    public int brQ() {
        return this.cac;
    }

    public void a(byte by, boolean bl) {
        byte by2 = bZS;
        by2 = bl ? (byte)(by2 | by) : (byte)(by2 & ~by);
        this.an(by2);
    }

    public static byte rg(int n) {
        switch (n) {
            case 2: {
                return 7;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 1;
            }
        }
        return 1;
    }

    private void an(byte by) {
        if (by > bZS) {
            this.bZV.am(by);
            acq_0.cge.btE();
        }
        bZS = by;
    }

    public static byte brR() {
        return bZS;
    }

    @Override
    public final void a(agb agb2, ArrayList<acx_0> arrayList) {
        for (DisplayedScreenElement displayedScreenElement : this.bZM) {
            if (displayedScreenElement.brk() == null) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    public boolean b(DisplayedScreenElement displayedScreenElement) {
        return this.cab.add(displayedScreenElement);
    }

    public boolean y(Object object) {
        return this.cab.remove(object);
    }

    public void brS() {
        this.cab.clear();
    }
}

