/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.PrintStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ayd
 */
public class ayd_2 {
    protected static final Logger dsa = Logger.getLogger(ayd_2.class);
    final axx_1 dsb = new axx_1();
    final ArrayList<ayc_2> dsc = new ArrayList();
    final int dsd;
    final int dse;

    public ayd_2(int n, int n2) {
        this.dsd = n;
        this.dse = n2;
    }

    public void a(ayc_2 ayc_22) {
        this.dsc.add(ayc_22);
    }

    public void aPg() {
        aya_2 aya_22 = new aya_2();
        new Thread((Runnable)new aye_1(this, aya_22), "GLDebugCaptureThread").start();
        new Thread((Runnable)new ayf_1(this, aya_22), "GLDebugStatsUpdate").start();
    }

    public PrintStream bRQ() {
        return new PrintStream(this.dsb);
    }
}

