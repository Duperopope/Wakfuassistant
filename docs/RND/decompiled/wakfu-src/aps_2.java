/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;

/*
 * Renamed from aps
 */
public class aps_2
implements apq_2 {
    private Hashtable<String, apr_2> cNo = null;
    private apn_2 cNp = null;
    private int cNq = 0;
    private apl_2 cNr = null;
    private boolean cNs = false;
    apu_2 cNt = null;
    apv_2 cNu = null;
    apx_2 cNv = null;
    apt_2 cNw = null;

    public aps_2(apn_2 apn_22) {
        this.cNp = apn_22;
        this.cNo = new Hashtable();
        this.bFm();
    }

    private void bFm() {
        this.cNt = new apu_2();
        this.cNu = new apv_2();
        this.cNu.a(this.cNp);
        this.cNv = new apx_2();
        this.cNw = new apt_2();
    }

    @Override
    public aph_1 bFi() {
        ++this.cNq;
        char c2 = '\u0000';
        while (this.cNp.bFd()) {
            c2 = this.cNp.bFf();
            if (this.cNs) {
                apb_2 apb_22 = this.bFn();
                apb_22.tr(this.cNq);
                return apb_22;
            }
            if (c2 == '<') {
                char c3 = this.cNp.tq(this.cNp.bFc() + 1);
                if (c3 == '!') {
                    apa_2 apa_22 = this.bFp();
                    apa_22.tr(this.cNq);
                    return apa_22;
                }
                apc_2 apc_22 = this.bFo();
                if (apc_22 != null) {
                    if (!apc_22.bEZ()) {
                        this.cNr = apc_22;
                        if (this.a(apc_22)) {
                            this.cNs = true;
                        }
                    } else if (this.cNr != null && this.cNr.bEX().equalsIgnoreCase(apc_22.bEX())) {
                        this.cNr = null;
                    }
                }
                apc_22.tr(this.cNq);
                return apc_22;
            }
            if (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t') {
                this.cNp.bFe();
                continue;
            }
            if (this.cNr != null) {
                if (this.cNr.bEX().equalsIgnoreCase("script") || this.cNr.bEX().equalsIgnoreCase("style")) {
                    apb_2 apb_23 = this.bFn();
                    apb_23.tr(this.cNq);
                    return apb_23;
                }
                apd_2 apd_22 = this.b(null);
                apd_22.tr(this.cNq);
                return apd_22;
            }
            apd_2 apd_23 = this.b(null);
            apd_23.tr(this.cNq);
            return apd_23;
        }
        return null;
    }

    private boolean a(apl_2 apl_22) {
        String string = apl_22.bEX();
        return string.equalsIgnoreCase("script") || string.equalsIgnoreCase("style");
    }

    private apb_2 bFn() {
        this.cNs = false;
        this.cNt.a(this.cNp);
        this.cNt.c(this.cNr);
        apb_2 apb_22 = null;
        try {
            apb_22 = (apb_2)this.cNt.bFl();
        }
        catch (apf_2 apf_22) {
            apf_22.printStackTrace();
        }
        return apb_22;
    }

    public apc_2 bFo() {
        this.cNu.a(this.cNp);
        apc_2 apc_22 = null;
        try {
            apc_22 = (apc_2)this.cNu.bFr();
        }
        catch (apf_2 apf_22) {
            apf_22.printStackTrace();
        }
        return apc_22;
    }

    public apd_2 b(apl_2 apl_22) {
        this.cNv.a(this.cNp);
        this.cNv.d(apl_22);
        apd_2 apd_22 = null;
        try {
            apd_22 = (apd_2)this.cNv.bFw();
        }
        catch (apf_2 apf_22) {
            apf_22.printStackTrace();
        }
        return apd_22;
    }

    private apa_2 bFp() {
        this.cNw.a(this.cNp);
        aph_1 aph_12 = null;
        try {
            aph_12 = this.cNw.bFl();
        }
        catch (apf_2 apf_22) {
            apf_22.printStackTrace();
        }
        return (apa_2)aph_12;
    }

    @Override
    public apn_2 bET() {
        return this.cNp;
    }

    @Override
    public boolean bFj() {
        return this.cNp.bFd();
    }

    @Override
    public void a(apr_2 apr_22) {
    }
}

