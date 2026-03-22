/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

public class aaC {
    private static final Logger cag = Logger.getLogger(aaC.class);
    private static final Comparator<DisplayedScreenElement> cah = new aaD();
    int cai = Integer.MAX_VALUE;
    int caj = Integer.MAX_VALUE;
    final ArrayList<DisplayedScreenElement> cak = new ArrayList();

    void reset() {
        this.cai = Integer.MAX_VALUE;
        this.caj = Integer.MAX_VALUE;
        this.cak.clear();
    }

    private void a(aaa_0 aaa_02, int n, int n2) {
        if (n == this.cai && n2 == this.caj) {
            return;
        }
        this.cak.clear();
        aaa_02.b(n, n2, this.cak, abd.ccX);
        this.cai = n;
        this.caj = n2;
    }

    int b(aaa_0 aaa_02, int n, int n2, int n3) {
        DisplayedScreenElement displayedScreenElement = this.c(aaa_02, n, n2, n3);
        try {
            for (int i = this.cak.size() - 1; i >= 0; --i) {
                DisplayedScreenElement displayedScreenElement2 = this.cak.get(i);
                if (!displayedScreenElement2.brq() || displayedScreenElement == null || displayedScreenElement2.brl().cWM <= displayedScreenElement.brl().cWM) continue;
                displayedScreenElement = displayedScreenElement2;
            }
        }
        catch (Exception exception) {
            cag.warn((Object)"Probl\u00e8me dans le process d'affichage :", (Throwable)exception);
            return 0;
        }
        return displayedScreenElement != null && displayedScreenElement.bYU != null ? displayedScreenElement.bYU.bsF() : 0;
    }

    DisplayedScreenElement c(aaa_0 aaa_02, int n, int n2, int n3) {
        this.a(aaa_02, n, n2);
        int n4 = this.cak.size();
        if (n4 == 0) {
            return null;
        }
        if (n4 == 1) {
            return this.cak.get(0);
        }
        int n5 = Integer.MAX_VALUE;
        DisplayedScreenElement displayedScreenElement = null;
        try {
            this.cak.sort(cah);
            for (int i = 0; i < n4; ++i) {
                DisplayedScreenElement displayedScreenElement2 = this.cak.get(i);
                if (displayedScreenElement2.brq() || displayedScreenElement2.bYU == null) continue;
                short s = displayedScreenElement2.bcE();
                int n6 = s - displayedScreenElement2.bYU.bsw();
                boolean bl = n3 >= n6 && n3 <= s;
                int n7 = Math.abs(s - n3);
                if (n7 == 0 && n5 == 0 || bl) {
                    int n8;
                    int n9 = n8 = displayedScreenElement == null ? -1 : displayedScreenElement.bYU.bsF();
                    if (displayedScreenElement2.bYU.bsF() > n8) {
                        displayedScreenElement = displayedScreenElement2;
                    }
                }
                if (n7 >= n5) continue;
                n5 = (short)n7;
                displayedScreenElement = displayedScreenElement2;
            }
        }
        catch (Exception exception) {
            cag.warn((Object)"Probl\u00e8me dans le process d'affichage :", (Throwable)exception);
            return null;
        }
        return displayedScreenElement;
    }
}

