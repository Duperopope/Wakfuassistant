/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eMI
 */
public class emi_0<T extends exP>
implements eIk,
eIo,
fhl {
    private static final Logger qMY = Logger.getLogger(emi_0.class);
    private static final int qMZ = Integer.MIN_VALUE;
    protected final T qNa;
    private int qNb = Integer.MIN_VALUE;
    private int qNc = Integer.MIN_VALUE;

    public emi_0(T t) {
        this.qNa = t;
    }

    public void bkZ() {
        eIj eIj2 = ((exP)this.qNa).dnK().fwt();
        if (eIj2 != null) {
            this.qNc = eIj2.wp();
            this.qNb = eIj2.tL();
        }
    }

    @Override
    public void a(eIm eIm2) {
        try {
            this.RA(eIm2.fwt().tL());
        }
        catch (Exception exception) {
            qMY.error((Object)"Exception raised", (Throwable)exception);
        }
        this.e(eIm2);
    }

    @Override
    public void c(eIj eIj2) {
        eIm eIm2 = ((exP)this.qNa).dnK();
        if (eIm2.fwt() != eIj2) {
            return;
        }
        try {
            this.RA(eIj2.tL());
        }
        catch (Exception exception) {
            qMY.error((Object)"Exception raised", (Throwable)exception);
        }
        this.k(eIj2);
    }

    @Override
    public void d(eIj eIj2) {
        eIm eIm2 = ((exP)this.qNa).dnK();
        if (eIm2.fwt() != eIj2) {
            return;
        }
        try {
            this.RA(eIj2.tL());
        }
        catch (Exception exception) {
            qMY.error((Object)"Exception raised", (Throwable)exception);
        }
        this.k(eIj2);
    }

    @Override
    public void b(fhk fhk2) {
        fhk fhk3 = ((exP)this.qNa).dmL();
        if (fhk3 != fhk2) {
            return;
        }
        eIm eIm2 = ((exP)this.qNa).dnK();
        eIj eIj2 = eIm2.fwt();
        if (eIj2 == null) {
            return;
        }
        try {
            this.RA(eIj2.tL());
        }
        catch (Exception exception) {
            qMY.error((Object)"Exception raised", (Throwable)exception);
        }
        this.k(eIj2);
    }

    @Override
    public void i(eIj eIj2) {
        emk_0.ay(this.qNa);
    }

    @Override
    public void j(eIj eIj2) {
        emk_0.ax(this.qNa);
    }

    @Override
    public void c(eIm eIm2, eIj eIj2) {
    }

    private void RA(int n) {
        ((exP)this.qNa).fhn();
        try {
            fhk fhk2 = ((exP)this.qNa).CL(this.qNc);
            emk_0.a(this.qNa, fhk2, this.qNb, n);
            emk_0.ay(this.qNa);
        }
        finally {
            ((exP)this.qNa).fho();
        }
    }

    private void e(eIm eIm2) {
        this.k(eIm2.fwt());
    }

    private void k(eIj eIj2) {
        this.qNc = eIj2 == null ? Integer.MIN_VALUE : eIj2.wp();
        this.qNb = eIj2 == null ? Integer.MIN_VALUE : eIj2.tL();
    }

    @Override
    public void a(eIm eIm2, eIj eIj2) {
    }

    @Override
    public void b(eIj eIj2) {
    }

    @Override
    public void a(ffS ffS2, Long l) {
    }

    @Override
    public void b(ffS ffS2, Long l) {
    }
}

