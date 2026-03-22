/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class WV
implements WW {
    private static final Logger bQj = Logger.getLogger(WV.class);
    private adk bQk;
    private aaa_0 bQl;
    private acj_0 bQm;
    private String bQn;
    private String bQo;
    private final wb_0 bQp = new wb_0();
    private final wb_0 bQq = new wb_0();
    private static final WV bQr = new WV();

    public static WV bnj() {
        return bQr;
    }

    protected WV() {
    }

    public aaa_0 bnk() {
        return this.bQl;
    }

    @Override
    public void a(adk adk2, aaa_0 aaa_02, acj_0 acj_02) {
        this.bQk = adk2;
        this.bQl = aaa_02;
        this.bQm = acj_02;
    }

    @Override
    public boolean m(short s, short s2) {
        return this.bQp.aI(s, s2);
    }

    @Override
    public void n(short s, short s2) {
        wa_0.i(s, s2);
        this.bQm.i(s, s2);
        try {
            this.bQk.i(s, s2);
        }
        catch (IOException iOException) {
            bQj.warn((Object)("Environnement map doesn't exists " + s + " " + s2), (Throwable)iOException);
        }
    }

    @Override
    public void fz(long l) {
        this.a(l, new aau_0());
    }

    public void a(long l, aau_0 aau_02) {
        assert (this.bQn != null) : "D'abord appler setValidMapsCoordFile";
        this.bQp.b(this.bQn, l);
        this.bQq.b(this.bQo, l);
        this.bQl.a(aau_02, this.bQq);
        WY.bnm().fB(l);
    }

    @Override
    public void clear() {
        this.bQp.clear();
        this.bQq.clear();
    }

    public wb_0 qx(int n) {
        wb_0 wb_02 = new wb_0();
        wb_02.b(this.bQo, n);
        return wb_02;
    }

    public void q(@NotNull String string, @NotNull String string2) {
        this.bQn = string;
        this.bQo = string2;
        this.bQl.a(this.bQq);
    }

    @NotNull
    public String bnl() {
        return this.bQo;
    }

    @Override
    public void fA(long l) {
        adg_0.bup().fy(l);
        adg_0.bup().buq();
    }
}

