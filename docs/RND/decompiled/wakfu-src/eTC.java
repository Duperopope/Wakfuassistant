/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class eTC
extends ff_1
implements ayx_2 {
    protected static final Logger rpK = Logger.getLogger(eTC.class);
    eTw jfO;
    static eTB rpL;
    private boolean rdF = false;
    private static final ObjectPool rpM;
    public final fi_1 rpN = new eTE(this);
    public final fi_1 rpO = new eTF(this);
    public final fi_1 rpP = new eTG(this);
    public final fi_1 rpQ = new eTH(this);
    public final fi_1 rpR = new eTI(this);
    public final fi_1 rpS = new eTJ(this);
    public final fi_1 rpT = new eTK(this);

    public static void a(eTB eTB2) {
        rpL = eTB2;
    }

    public static eTC fJn() {
        eTC eTC2;
        try {
            eTC2 = (eTC)rpM.borrowObject();
            eTC2.rdF = true;
        }
        catch (Exception exception) {
            eTC2 = new eTC();
            rpK.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuCalendarEventSerializable : " + exception.getMessage()));
        }
        return eTC2;
    }

    @Override
    public void aVI() {
        this.jfO = null;
    }

    @Override
    public void aVH() {
        this.jfO = null;
    }

    public void aZp() {
        if (this.rdF) {
            try {
                rpM.returnObject((Object)this);
                this.rdF = false;
            }
            catch (Exception exception) {
                rpK.error((Object)"Exception levee", (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    public void p(eTw eTw2) {
        this.jfO = eTw2;
    }

    public void fJo() {
        this.jfO = rpL.dFr();
    }

    public void fJp() {
        rpL.n(this.jfO);
    }

    public eTw dFm() {
        return this.jfO;
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.rpO, this.rpN, this.rpT, this.rpP, this.rpQ, this.rpS, this.rpR};
    }

    public void as(ByteBuffer byteBuffer) {
        fi_1[] fi_1Array = this.zj();
        for (int i = 0; i < fi_1Array.length; ++i) {
            fi_1 fi_12 = fi_1Array[i];
            fi_12.as(byteBuffer);
        }
    }

    public void eL(ByteBuffer byteBuffer) {
        fi_1[] fi_1Array = this.zj();
        for (int i = 0; i < fi_1Array.length; ++i) {
            fi_1 fi_12 = fi_1Array[i];
            fi_12.a(byteBuffer, exH.pdw);
        }
    }

    public void fC(ByteBuffer byteBuffer) {
        this.rpT.as(byteBuffer);
    }

    public void fD(ByteBuffer byteBuffer) {
        this.rpT.a(byteBuffer, exH.pdw);
    }

    public void fE(ByteBuffer byteBuffer) {
        this.rpO.as(byteBuffer);
        this.rpN.as(byteBuffer);
    }

    public void fF(ByteBuffer byteBuffer) {
        this.rpO.a(byteBuffer, exH.pdw);
        this.rpN.a(byteBuffer, exH.pdw);
    }

    public int zt() {
        fi_1[] fi_1Array = this.zj();
        int n = 0;
        for (int i = 0; i < fi_1Array.length; ++i) {
            fi_1 fi_12 = fi_1Array[i];
            n += fi_12.zt();
        }
        return n;
    }

    static {
        rpM = new ayv_2(new eTD());
    }
}

