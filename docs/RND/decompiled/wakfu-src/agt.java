/*
 * Decompiled with CFR 0.152.
 */
class agt
implements Runnable {
    final /* synthetic */ ags ctR;

    agt(ags ags2) {
        this.ctR = ags2;
    }

    @Override
    public void run() {
        if (this.ctR.ctQ.ctL != null) {
            this.ctR.ctQ.ctL.b(this.ctR.ctQ.ctM, this.ctR.ctQ.ctN);
        }
        String string = "PSys Debug  Part.: " + this.ctR.ctQ.ctM.size() + " (max " + this.ctR.ctQ.ctO + ") Lights: " + this.ctR.ctQ.ctN.size() + " (max " + this.ctR.ctQ.ctP + ")";
        this.ctR.ctQ.bXt.setTitle(string);
    }
}

