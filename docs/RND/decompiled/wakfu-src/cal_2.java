/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TByteObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from caL
 */
public class cal_2
extends fsx_0 {
    private static final Logger lHr = Logger.getLogger(cal_2.class);
    private cak_1[] lFC;
    private cay_2 lFB;
    private final azy_2<byte[]> lHs = new azy_2();

    public cal_2(int n) {
        super(n);
    }

    @Override
    public void r(apl_1 apl_12) {
        int n;
        super.r(apl_12);
        int n2 = apl_12.bFO();
        this.lFC = new cak_1[n2];
        for (n = 0; n < n2; ++n) {
            this.lFC[n] = cak_1.B(apl_12);
        }
        this.lFB = new cay_2((byte)this.getWidth(), (byte)this.getHeight());
        this.lFB.r(apl_12);
        n = apl_12.bFR();
        this.lHs.vS(n);
        for (int i = 0; i < n; ++i) {
            byte by = (byte)apl_12.aIz();
            byte[] byArray = this.C(apl_12);
            this.lHs.a(by, byArray);
        }
    }

    private byte[] C(apl_1 apl_12) {
        int n = apl_12.aIz();
        byte[] byArray = new byte[n];
        for (int i = 0; i < n; ++i) {
            byArray[i] = (byte)apl_12.aIz();
        }
        return byArray;
    }

    public cay_2 eqU() {
        return new cay_2(this.lFB);
    }

    public cak_1[] eqV() {
        return this.lFC;
    }

    public int bno() {
        return this.lHs.bTO();
    }

    public void a(TByteObjectProcedure<byte[]> tByteObjectProcedure) {
        int n = this.lHs.bTO();
        for (int i = 0; i < n; ++i) {
            if (tByteObjectProcedure.execute(this.lHs.vV(i), (Object)this.lHs.vW(i))) continue;
            return;
        }
    }
}

