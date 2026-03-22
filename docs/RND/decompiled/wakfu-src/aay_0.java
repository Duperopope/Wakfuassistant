/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from aay
 */
public class aay_0 {
    private static final int bZx = 16;
    private static final ArrayList<DisplayedScreenElement> bZy = new ArrayList(64);
    private boolean aCx = false;
    private aaq_0 bZz;
    private DisplayedScreenElement[] bZA;
    private final ArrayList<DisplayedScreenElement> bZB = new ArrayList();
    private static final Comparator<DisplayedScreenElement> bZC = new aaz();

    public void a(aaq_0 aaq_02, aav aav2, boolean bl) {
        this.a(aav2);
        this.bZz = aaq_02;
        if (this.bZz == null) {
            return;
        }
        int n = this.bZz.ap(aaa_0.brR());
        this.bZA = new DisplayedScreenElement[n];
        int n2 = 0;
        int n3 = this.bZz.ccf.size();
        for (int i = 0; i < n3; ++i) {
            ScreenElement screenElement = this.bZz.ccf.get(i);
            byte by = screenElement.bsz().brR();
            if ((by & aaa_0.brR()) != by) continue;
            DisplayedScreenElement displayedScreenElement = aav2.fE(screenElement.cbS);
            if (bl || displayedScreenElement.bYU == null) {
                displayedScreenElement.a(screenElement);
            }
            this.bZA[n2] = displayedScreenElement;
            ++n2;
            if (!screenElement.bss()) continue;
            this.bZB.add(displayedScreenElement);
        }
    }

    final boolean b(agb agb2) {
        if (this.bZz == null) {
            return false;
        }
        return agb2.m(this.bZz.brr, this.bZz.bro, this.bZz.brp, this.bZz.brq);
    }

    ArrayList<DisplayedScreenElement> bry() {
        return this.bZB;
    }

    public void aPc() {
        if (this.aCx) {
            return;
        }
        if (this.bZA == null) {
            this.aCx = true;
            return;
        }
        for (int i = 0; i < this.bZA.length; ++i) {
            DisplayedScreenElement displayedScreenElement = this.bZA[i];
            if (displayedScreenElement.bYW == null || displayedScreenElement.bYW.bHg() == null || displayedScreenElement.bYW.bHg().bPe()) continue;
            return;
        }
        this.aCx = true;
    }

    public void a(afV afV2, ArrayList<DisplayedScreenElement> arrayList, agb agb2) {
        if (!this.b(agb2)) {
            return;
        }
        int n = this.bZA.length;
        for (int i = 0; i < n; ++i) {
            this.bZA[i].a(afV2, arrayList, agb2);
        }
    }

    public final aaq_0 brz() {
        return this.bZz;
    }

    public final DisplayedScreenElement[] brA() {
        return this.bZA;
    }

    public boolean aLB() {
        return this.aCx;
    }

    final void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList, abd abd2) {
        ScreenElement screenElement;
        if (this.bZA == null) {
            return;
        }
        if (!this.bf(n, n2)) {
            return;
        }
        int n3 = this.bZA.length;
        if (n3 <= 16) {
            for (int i = 0; i < n3; ++i) {
                DisplayedScreenElement displayedScreenElement = this.bZA[i];
                ScreenElement screenElement2 = displayedScreenElement.bYU;
                if (screenElement2.cbL != n || screenElement2.cbM != n2 || !abd2.c(displayedScreenElement) || arrayList.contains(displayedScreenElement)) continue;
                arrayList.add(displayedScreenElement);
            }
            return;
        }
        int n4 = 0;
        int n5 = n3 - 1;
        int n6 = -1;
        do {
            ScreenElement screenElement3;
            int n7 = n5 + n4 >>> 1;
            if (n4 + 1 == n5) {
                screenElement3 = this.bZA[n4].bYU;
                if (screenElement3.cbL == n && screenElement3.cbM == n2) {
                    n6 = n4;
                    break;
                }
                screenElement3 = this.bZA[n5].bYU;
                if (screenElement3.cbL == n && screenElement3.cbM == n2) {
                    n6 = n5;
                    break;
                }
                return;
            }
            screenElement3 = this.bZA[n7].bYU;
            if (screenElement3.cbM > n2) {
                n5 = n7;
                continue;
            }
            if (screenElement3.cbM < n2) {
                n4 = n7;
                continue;
            }
            if (screenElement3.cbL > n) {
                n5 = n7;
                continue;
            }
            if (screenElement3.cbL < n) {
                n4 = n7;
                continue;
            }
            n6 = n7;
        } while (n6 == -1);
        n4 = n6;
        int n8 = 1;
        while (n4 - n8 >= 0) {
            screenElement = this.bZA[n4 - n8].bYU;
            if (screenElement.cbL != n || screenElement.cbM != n2) break;
            ++n8;
        }
        n4 = n4 + 1 - n8;
        while (n6 + 1 < n3) {
            screenElement = this.bZA[++n6].bYU;
            if (screenElement.cbL != n || screenElement.cbM != n2) break;
            ++n8;
        }
        for (int i = 0; i < n8; ++i) {
            DisplayedScreenElement displayedScreenElement = this.bZA[n4 + i];
            if (!abd2.c(displayedScreenElement) || arrayList.contains(displayedScreenElement)) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    final DisplayedScreenElement a(int n, int n2, abd abd2) {
        if (!this.bf(n, n2)) {
            return null;
        }
        bZy.clear();
        this.a(n, n2, bZy, abd2);
        DisplayedScreenElement displayedScreenElement = null;
        int n3 = bZy.size();
        for (int i = 0; i < n3; ++i) {
            DisplayedScreenElement displayedScreenElement2 = bZy.get(i);
            if (displayedScreenElement2.bYU.cbL != n || displayedScreenElement2.bYU.cbM != n2 || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    final DisplayedScreenElement a(int n, int n2, int n3, abd abd2) {
        if (!this.bf(n2, n3)) {
            return null;
        }
        bZy.clear();
        this.a(n2, n3, bZy, abd2);
        for (int i = bZy.size() - 1; i >= 0; --i) {
            DisplayedScreenElement displayedScreenElement = bZy.get(i);
            if (displayedScreenElement.bYU.cbL == n2 && displayedScreenElement.bYU.cbM == n3) continue;
            bZy.remove(i);
        }
        if (bZy.size() <= n) {
            return null;
        }
        bZy.sort(bZC);
        return bZy.get(bZy.size() - 1 - n);
    }

    DisplayedScreenElement b(int n, int n2, int n3, abd abd2) {
        if (!this.H(n, n2, (short)n3)) {
            return null;
        }
        bZy.clear();
        this.a(n, n2, bZy, abd2);
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = bZy.size();
        for (int i = 0; i < n4; ++i) {
            DisplayedScreenElement displayedScreenElement2 = bZy.get(i);
            ScreenElement screenElement = displayedScreenElement2.bYU;
            if (screenElement.cbL != n || screenElement.cbM != n2 || screenElement.cbK != n3 && (!screenElement.cbP.bwZ() || screenElement.cbK - screenElement.aXR != n3) || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > screenElement.cbQ) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    final DisplayedScreenElement c(int n, int n2, int n3, abd abd2) {
        if (!this.H(n, n2, (short)n3)) {
            return null;
        }
        bZy.clear();
        this.a(n, n2, bZy, abd2);
        DisplayedScreenElement displayedScreenElement = null;
        int n4 = bZy.size();
        for (int i = 0; i < n4; ++i) {
            DisplayedScreenElement displayedScreenElement2 = bZy.get(i);
            assert (displayedScreenElement2.bYU.cbL == n);
            assert (displayedScreenElement2.bYU.cbM == n2);
            if (displayedScreenElement2.bYU.cbK != n3 || displayedScreenElement != null && displayedScreenElement.bYU.cbQ > displayedScreenElement2.bYU.cbQ || !displayedScreenElement2.bYU.cbP.bxc()) continue;
            displayedScreenElement = displayedScreenElement2;
        }
        return displayedScreenElement;
    }

    void a(int n, int n2, ArrayList<DisplayedScreenElement> arrayList) {
        if (!this.aq(n, n2)) {
            return;
        }
        for (int i = 0; i < this.bZA.length; ++i) {
            DisplayedScreenElement displayedScreenElement = this.bZA[i];
            EntitySprite entitySprite = displayedScreenElement.bYW;
            if (n2 < entitySprite.brp || n2 >= entitySprite.brr || n < entitySprite.bro || n >= entitySprite.brq || displayedScreenElement.bYU.cbP.bwZ() || !displayedScreenElement.brn() || !displayedScreenElement.be(n, n2) || arrayList.contains(displayedScreenElement)) continue;
            arrayList.add(displayedScreenElement);
        }
    }

    private boolean bf(int n, int n2) {
        return this.bZz == null || this.bZz.aK(n, n2);
    }

    private boolean H(int n, int n2, short s) {
        return this.bZz == null || this.bZz.K(n, n2, s);
    }

    private boolean aq(int n, int n2) {
        if (this.bZz == null) {
            return false;
        }
        if (n > this.bZz.brq) {
            return false;
        }
        if (n < this.bZz.bro) {
            return false;
        }
        if (n2 > this.bZz.brr) {
            return false;
        }
        return n2 >= this.bZz.brp;
    }

    public void a(aav aav2) {
        if (this.bZz == null) {
            return;
        }
        for (int i = 0; i < this.bZA.length; ++i) {
            DisplayedScreenElement displayedScreenElement = this.bZA[i];
            displayedScreenElement.a(aav2);
        }
        this.bZB.clear();
        this.bZA = null;
        this.bZz = null;
        this.aCx = false;
    }

    public final String toString() {
        return "DisplayedScreenMap {" + String.valueOf(this.bZz) + "}";
    }
}

