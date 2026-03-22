/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bYl
 */
public class byl_2
implements frl {
    private static final Logger lyT = Logger.getLogger(byl_2.class);
    public static final byl_2 lyU = new byl_2();

    private byl_2() {
    }

    @Override
    public float a(frk frk2) {
        return frk2.sXJ;
    }

    @Override
    public void a(frk frk2, float f2) {
    }

    @Override
    public long a(fgv fgv2, frk frk2, long l) {
        return GC.A((float)l * this.a(frk2));
    }

    @Override
    public void a(frk frk2, int n) {
        lyT.info((Object)("[TAX] R\u00e9cup\u00e9ration de " + n + " kamas pour le context " + String.valueOf((Object)frk2)));
    }

    @Override
    public boolean a(fgv fgv2) {
        if (!(fgv2 instanceof bgt_0)) {
            return false;
        }
        long l = ((bgt_0)fgv2).aqZ();
        if (caf_2.lFq.rV(l)) {
            return true;
        }
        return bTj.eno().doD() == null && bTj.eno().enp() == null;
    }
}

