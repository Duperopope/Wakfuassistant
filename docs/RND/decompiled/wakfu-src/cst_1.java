/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cST
 */
class cst_1
extends Thread {
    public ArrayList<awk_1> nHw;
    private int nHx;
    private int nHy;
    final /* synthetic */ bfo_2[] nHz;
    final /* synthetic */ csp_1 nHA;

    cst_1(csp_1 csp_12, bfo_2[] bfo_2Array) {
        this.nHA = csp_12;
        this.nHz = bfo_2Array;
    }

    private void a(bfo_2 bfo_22, String string) {
        awk_1 awk_12 = fmu_1.gEF().vU((String)bfo_22.eu(string));
        if (awk_12 != null) {
            awk_12.bGY();
            this.nHw.add(awk_12);
            this.nHA.nHr.add(awk_12);
        }
    }

    @Override
    public void run() {
        this.nHw = new ArrayList();
        for (bfo_2 bfo_22 : this.nHz) {
            this.a(bfo_22, "maleIllustration");
            this.a(bfo_22, "femaleIllustration");
        }
        while (true) {
            if (this.nHw.isEmpty() || this.nHy >= 5000) {
                csp_1.nGQ.info((Object)"Creation dialog loading finish");
                this.nHw.clear();
                return;
            }
            for (int i = this.nHw.size() - 1; i >= 0; --i) {
                awk_1 awk_12 = this.nHw.get(i);
                if (awk_12 == null) {
                    this.nHw.remove(i);
                    continue;
                }
                if (!awk_12.bPe()) continue;
                this.nHw.remove(awk_12);
            }
            try {
                Thread.sleep(50L);
                this.nHy += 50;
                continue;
            }
            catch (InterruptedException interruptedException) {
                csp_1.nGQ.error((Object)"Texture load thread sleep", (Throwable)interruptedException);
                continue;
            }
            break;
        }
    }
}

