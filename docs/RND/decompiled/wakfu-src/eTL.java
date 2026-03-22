/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eTL
extends ff_1
implements ayx_2 {
    private static final Logger rqb = Logger.getLogger(eTL.class);
    eTu<eTw> rqc;
    private boolean rdF;
    private static final ObjectPool rqd = new ayv_2(new eTM());
    public final fi_1 rqe = new eTN(this);

    eTL() {
    }

    public static eTL a(eTu<eTw> eTu2) {
        eTL eTL2;
        try {
            eTL2 = (eTL)rqd.borrowObject();
            eTL2.mD(true);
            eTL2.b(eTu2);
        }
        catch (Exception exception) {
            eTL2 = new eTL();
            rqb.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuEventsCalendarSerializable : " + exception.getMessage()));
        }
        return eTL2;
    }

    public void aZp() {
        if (this.rdF) {
            try {
                rqd.returnObject((Object)this);
                this.rdF = false;
            }
            catch (Exception exception) {
                rqb.error((Object)"Exception during release WakfuEventsCalendarSerializer", (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    @Override
    public void aVI() {
        this.rqc = null;
    }

    @Override
    public void aVH() {
        this.rqc = null;
    }

    private void mD(boolean bl) {
        this.rdF = bl;
    }

    public eTL(eTu<eTw> eTu2) {
        this.rqc = eTu2;
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.rqe};
    }

    public eTu<eTw> fJr() {
        return this.rqc;
    }

    public void b(eTu<eTw> eTu2) {
        this.rqc = eTu2;
    }

    public byte[] fJs() {
        return this.a(this.zj());
    }

    public int zt() {
        return this.rqe.zt();
    }
}

