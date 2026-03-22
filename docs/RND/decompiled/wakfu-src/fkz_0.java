/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fkZ
 */
public abstract class fkz_0
extends fkx_0<fkB> {
    protected static final Logger sCY = Logger.getLogger(fkz_0.class);
    private final List<fkB> sCZ = new ArrayList<fkB>();
    short sDa;
    final flB sDb = this.gcL();
    private final fla_0 sDc = new fla_0(this);
    private final flb_0 sDd = new flb_0(this);
    short sDe;
    int sDf;
    int sDg;

    protected fkz_0(fjo_0 fjo_02) {
        super(fjo_02);
    }

    @Override
    public void gbf() {
        this.sDb.a(this.ems(), this.sCZ);
    }

    protected flB gcL() {
        return new flB();
    }

    public void c(fkB fkB2) {
        this.sCZ.add(fkB2);
    }

    public void d(fkB fkB2) {
        this.sCZ.remove(fkB2);
    }

    public void mg(long l) {
        throw new UnsupportedOperationException("Impossible \u00e0 partir de ce Client/server");
    }

    public void mh(long l) {
        throw new UnsupportedOperationException("Impossible \u00e0 partir de ce Client/server");
    }

    public flB gbo() {
        return this.sDb;
    }

    public void b(short s, short s2, int n, int n2) {
        this.sDa = s;
        this.sDe = s2;
        this.sDf = n;
        this.sDg = n2;
    }

    public short gbp() {
        return this.sDa;
    }

    public short gbq() {
        return this.sDe;
    }

    public int gbr() {
        return this.sDf;
    }

    public int gbs() {
        return this.sDg;
    }

    public fla_0 gcM() {
        return this.sDc;
    }

    public flb_0 gcN() {
        return this.sDd;
    }

    @Override
    public /* synthetic */ void a(fkA fkA2) {
        this.d((fkB)fkA2);
    }

    @Override
    public /* synthetic */ void b(fkA fkA2) {
        this.c((fkB)fkA2);
    }
}

