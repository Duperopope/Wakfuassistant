/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public class bJM
extends biq_1 {
    private static final Logger kmx = Logger.getLogger(bJM.class);
    private static int kmy = 0;
    private long aHT;
    private boolean kih = false;

    public bJM() {
        super(kmy++, null, null, null);
    }

    public long aqZ() {
        return this.aHT;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    @Override
    public short dZr() {
        if (!this.kih) {
            this.fR(bzp_2.eqt().mA((long)this.aHT).lEG);
            this.kih = true;
        }
        return super.dZr();
    }

    @Override
    public axb_2 dYq() {
        List<ffq_2> list = this.bFA();
        if (list.isEmpty()) {
            return bJN.kmC;
        }
        ffq_2 ffq_22 = list.get(0);
        return ffq_22.dYq();
    }

    @Override
    public void a(bip_2 bip_22) {
        throw new UnsupportedOperationException("On ne devrait pas charger depuis cette zone");
    }

    @Override
    public boolean dYs() {
        bzq_2 bzq_22 = (bzq_2)((fsf)fsf.gkM()).mC(this.aHT);
        return bzq_22 != null && bzq_22.lEH;
    }

    @Override
    public boolean dXU() {
        return false;
    }

    @Override
    public void b(bip_2 bip_22) {
    }
}

