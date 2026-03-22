/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aye
 */
class aye_1
implements Runnable {
    final /* synthetic */ aya_2 dsf;
    final /* synthetic */ ayd_2 dsg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aye_1(ayd_2 ayd_22, aya_2 aya_22) {
        this.dsg = ayd_22;
        this.dsf = aya_22;
    }

    @Override
    public void run() {
        while (true) {
            String string;
            if ((string = this.dsg.dsb.bRL()) != null && !string.isEmpty()) {
                String string2 = string.split("\\(")[0];
                if (string2.equals("glClear")) {
                    this.dsf.bMy();
                }
                this.dsf.gO(string2);
                continue;
            }
            try {
                Thread.sleep(this.dsg.dsd);
                continue;
            }
            catch (InterruptedException interruptedException) {
                ayd_2.dsa.error((Object)"Interrupted ", (Throwable)interruptedException);
                continue;
            }
            break;
        }
    }
}

