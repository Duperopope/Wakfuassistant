/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.IOException;
import org.apache.log4j.Logger;

public class aIq
extends acV {
    private static final Logger dXT = Logger.getLogger(aIq.class);
    public static final String dXU = "animatedElementViewer";
    public static final String dXV = "WorldLoading";
    private static final aIq dXW = new aIq();
    private String cin;
    private String cio;
    private int cip;

    public static aIq cgr() {
        return dXW;
    }

    private aIq() {
    }

    public final void a(int n, int n2, int n3, String string, String string2, int n4) {
        this.br(n, n2);
        this.rJ(n3);
        this.cin = string;
        this.cio = string2;
        this.cip = n4;
        this.cd(string != null || string2 != null);
    }

    public void cgs() {
        this.a(1000, 1000, 0, null, null, 0);
    }

    @Override
    protected WL btZ() {
        return aie_0.cfn();
    }

    private void cgt() {
        fhv_1 fhv_12 = ccj_2.g("progressDialog", 8448L);
        fax_1 fax_12 = (fax_1)fhv_12.getElementMap().uH(dXU);
        fax_12.setStyle(dXV);
        fax_12.setAnimName(this.cin);
    }

    private void cgu() {
        try {
            cyh_2.eYs().setVideoPath(aQd.eBx.jy(this.cio));
            cyh_2.eYs().h(this.bRH);
            aue_0.cVJ().a(cyh_2.eYs());
            asj_2 asj_22 = asj_2.bJt();
            dXT.info((Object)"darkscreen- Condition startVideoTransition");
            asj_22.a(new aIr(this, asj_22));
        }
        catch (fu_0 fu_02) {
            dXT.error((Object)"Unable to find video file path property", (Throwable)fu_02);
        }
        catch (IOException iOException) {
            dXT.error((Object)"Unable to find video file", (Throwable)iOException);
        }
    }

    @Override
    protected final void bub() {
        try {
            if (this.cin != null) {
                this.cgt();
            } else if (this.cio != null) {
                this.cgu();
            }
            if (this.cip != 0) {
                cAY.eHc().Ly(this.cip);
            }
        }
        catch (Exception exception) {
            dXT.error((Object)"", (Throwable)exception);
        }
    }

    private void cgv() {
        fyw_0.gqw().tl("progressDialog");
    }

    private void cgw() {
    }

    @Override
    protected final void bua() {
        try {
            this.cgv();
            this.cgw();
            cAY.eHc().eHo();
        }
        catch (Exception exception) {
            dXT.error((Object)"", (Throwable)exception);
        }
    }

    public void ia(long l) {
        ada ada2 = ada.buh();
        if (l == -32768L) {
            int n = 1000;
            int n2 = 1000;
            boolean bl = false;
            Object var6_9 = null;
            Object var7_11 = null;
            boolean bl2 = false;
        } else {
            int n = ada2.bui();
            int n3 = ada2.buj();
            int n4 = ada2.buk();
            String string = ada2.bul();
            String string2 = ada2.bum();
            int n5 = ada2.getSoundId();
        }
        this.cgs();
        ada2.reset();
    }
}

