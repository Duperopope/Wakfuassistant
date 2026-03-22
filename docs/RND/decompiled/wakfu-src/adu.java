/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class adu {
    private static final Logger cjG = Logger.getLogger(adu.class);
    private static final adu cjH = new adu();
    private static final long cjI = 375L;
    private String awN;
    private final TIntHashSet cjJ = new TIntHashSet();
    final add_0 cjK = new add_0();

    private adu() {
    }

    public static adu buC() {
        return cjH;
    }

    public void reset() {
        this.cjK.reset();
        this.cjJ.clear();
    }

    public String bpu() {
        return this.awN;
    }

    public void cL(String string) {
        this.awN = string;
    }

    public boolean k(int[] nArray) {
        return this.cjJ.addAll(nArray);
    }

    public boolean rS(int n) {
        return this.cjJ.add(n);
    }

    public void fJ(long l) {
        assert (this.awN != null) : "PaperMapManager : Path undefined";
        String string = String.format(this.awN, l < 0L ? 375L : l);
        try {
            URL uRL = apr_1.bA(string);
            this.cjK.a(apl_1.gR(new BufferedInputStream(uRL.openStream())));
        }
        catch (MalformedURLException malformedURLException) {
            cjG.warn((Object)("Problem during PaperMapManager Load : invalid URL " + string));
        }
        catch (IOException iOException) {
            cjG.warn((Object)"Exception during PaperMapManager Load : ", (Throwable)iOException);
        }
    }

    public TIntHashSet rO(int n) {
        return this.cjK.rO(n);
    }

    public TIntArrayList buD() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        this.a(new adv(this, tIntArrayList));
        return tIntArrayList;
    }

    public void a(adz adz2) {
        if (this.cjJ == null) {
            return;
        }
        if (!this.cjJ.isEmpty()) {
            this.cjJ.forEach((TIntProcedure)new adw(this, adz2));
        }
    }

    public void a(ady ady2) {
        if (this.cjJ == null) {
            return;
        }
        if (!this.cjJ.isEmpty()) {
            this.cjJ.forEach((TIntProcedure)new adx(this, ady2));
        }
    }
}

