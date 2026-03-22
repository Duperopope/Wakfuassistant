/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from ewG
 */
public final class ewg_0 {
    private static final Logger oIN = Logger.getLogger(ewg_0.class);
    private static final aah_1<ewh_0> oIO = new aah_1();
    public static final int oIP = 40960;
    public static final byte oIQ = 6;
    public static final short oIR = 4;
    public static final byte oIS = 1;
    public static final byte oIT = 0;
    public static final byte oIU = 1;
    public static final byte oIV = 2;
    public static final byte oIW = 3;
    public static final byte oIX = 4;
    public static final byte oIY = 5;
    public static final int oIZ = 4;
    public static final int oJa = 10;
    public static final int oJb = 4;
    public static final int oJc = 1;
    public static final int oJd = 4;
    public static final int oJe = 8;
    public static final int oJf = 4;
    public static final int oJg = 6;
    public static final short oJh = 10;
    public static final short oJi = 10;
    public static final String oJj = "[\\p{L} '\\-]+";
    public static final String oJk = "[\\p{L} '\\-\\u00b7\\[\\]]+";
    public static final short oJl = 15;
    public static final short oJm = 25;
    public static final short oJn = 29;
    public static final short oJo = 3;
    public static final short oJp = 2;
    public static final short oJq = 10;
    public static final short oJr = 4;
    public static final short oJs = 4;
    public static final short oJt = 2;
    public static final short oJu = 1;
    public static final short oJv = 1;
    public static final short oJw = 2;
    public static final short oJx = 3;
    public static final byte oJy = 5;
    public static final float oJz = 1.25f;
    public static final int oJA = 4000;
    public static final byte oJB = 0;
    public static final byte oJC = 1;
    public static final byte oJD = 2;
    public static final int oJE = 2145;
    public static final int oJF = 219;
    public static final short oJG = 80;
    public static final short oJH = 6;
    public static final int oJI = 200;
    public static final int oJJ = 30;
    public static final int oJK = 10;
    public static final int oJL = 6;
    public static final float oJM = 0.75f;
    public static final float oJN = 0.8f;
    public static final int oJO = 75;
    public static final int oJP = 50;

    public static void a(int n, ewh_0 ewh_02) {
        oIO.b(n, ewh_02);
    }

    public static ewh_0 dd(short s) {
        List<Long> list = ewo_0.oBF.o(ewr_0.oEO);
        if (!list.isEmpty()) {
            return new ewh_0(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
        }
        ewh_0 ewh_02 = oIO.vK(s);
        if (ewh_02 == null) {
            oIN.error((Object)("Breed " + s + " n'a pas de StartPoint"));
            return ewg_0.ffe();
        }
        return ewh_02;
    }

    public static int ffd() {
        return ewo_0.oBF.i(ewr_0.oCj);
    }

    public static ewh_0 ffe() {
        List<Long> list = ewo_0.oBF.o(ewr_0.oCl);
        return new ewh_0(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
    }

    public static ewh_0 fff() {
        List<Long> list = ewo_0.oBF.o(ewr_0.oCm);
        return new ewh_0(list.get(0).intValue(), list.get(1).intValue(), list.get(2).intValue(), list.get(3));
    }
}

