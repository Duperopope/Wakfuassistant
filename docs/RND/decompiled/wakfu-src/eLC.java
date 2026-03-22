/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import org.apache.log4j.Logger;

public class eLC {
    protected static final Logger qGZ = Logger.getLogger(eLC.class);
    private static final int qHa = 10;
    private static final int qHb = 30;
    private static final int qHc = 50;
    private static final int qHd = 100;
    private static final int qHe = 50;
    private static final int qHf = 100;
    public static final int qHg = 3;
    private static final int qHh = 5;
    private static final int qHi = 25;
    private static final TByteObjectHashMap<eLE> qHj = new TByteObjectHashMap();
    private static final eLE qHk = new eld_0();
    private static final eLE qHl = new eLG(10);
    private static final eLE qHm = new eLG(30);
    private static final eLE qHn = new eLG(50);
    private static final eLE qHo = new eLG(100);
    private static final eLE qHp = new eLF(5);
    private static final eLE qHq = new eLG(50, 3);
    private static final eLE qHr = new eLG(100, 3);
    private static final eLE qHs = new eLF(25);

    public static int a(elg_0 elg_02) {
        int n = 0;
        for (byte by = 0; by < 9; by = (byte)(by + 1)) {
            n += eLC.a(by, elg_02) ? 1 : 0;
        }
        return n;
    }

    public static boolean a(byte by, elg_0 elg_02) {
        eLE eLE2 = (eLE)qHj.get(by);
        if (eLE2 == null) {
            qGZ.error((Object)("Slot inconnu au bataillon d'index=" + by + " demand\u00e9"));
            return false;
        }
        return eLE2.b(elg_02);
    }

    static {
        qHj.put((byte)0, (Object)qHk);
        qHj.put((byte)1, (Object)qHl);
        qHj.put((byte)2, (Object)qHm);
        qHj.put((byte)3, (Object)qHn);
        qHj.put((byte)4, (Object)qHo);
        qHj.put((byte)5, (Object)qHp);
        qHj.put((byte)6, (Object)qHq);
        qHj.put((byte)7, (Object)qHr);
        qHj.put((byte)8, (Object)qHs);
    }
}

