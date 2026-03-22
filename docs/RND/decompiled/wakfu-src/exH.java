/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

public class exH {
    public static final byte pdm = 1;
    public static final short pdn = 91;
    public static final byte pdo = 2;
    public static final int pdp = -1;
    private static exH pdq;
    public static final String pdr;
    public static final String pds;
    public static final String pdt;
    public static final Date pdu;
    public static final byte[] pdv;
    public static final int pdw;
    public static final int pdx;
    protected static final Logger pdy;
    private static final exH pdz;
    private static final String pdA = "";
    private static final String pdB = "";

    protected exH() {
        pdq = this;
    }

    public static void dET() {
        pdy.info((Object)pds);
    }

    public static boolean er(byte[] byArray) {
        if (pdq != null) {
            return pdq.et(byArray);
        }
        pdy.error((Object)"Le v\u00e9rificateur de version n'a pas \u00e9t\u00e9 d\u00e9finit");
        return false;
    }

    public static byte[] aVW() {
        if (pdq != null) {
            return pdq.ffA();
        }
        pdy.error((Object)"Le v\u00e9rificateur de version n'a pas \u00e9t\u00e9 d\u00e9finit");
        return new byte[0];
    }

    public static String es(byte[] byArray) {
        if (byArray == null || byArray.length < 4) {
            return "<unknown>";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        int n3 = byteBuffer.get() & 0xFF;
        stringBuilder.append(n).append('.');
        if (n2 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n2).append('.');
        if (n3 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n3);
        int n4 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n4];
        byteBuffer.get(byArray2);
        String string = BH.dc(byArray2);
        int n5 = -1;
        try {
            n5 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            pdy.error((Object)("Num\u00e9ro de build au format incorrect: " + string));
        }
        if (n5 >= 0) {
            stringBuilder.append(" build ").append(string);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] stringArray) {
        System.out.println(pdw);
    }

    protected boolean et(byte[] byArray) {
        if (byArray == null) {
            pdy.error((Object)"[implCheckVersion] check null");
            return false;
        }
        if (byArray.length < 5) {
            pdy.error((Object)("[implCheckVersion] wrong data length: " + byArray.length));
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.get() != 1) {
            return false;
        }
        if (byteBuffer.getShort() != 91) {
            return false;
        }
        return byteBuffer.get() == 2;
    }

    protected byte[] ffA() {
        return pdv;
    }

    static {
        pdy = Logger.getLogger(exH.class);
        pdz = new exH();
        int n = -1;
        if ("".length() > 0) {
            try {
                n = Integer.parseInt("");
            }
            catch (NumberFormatException numberFormatException) {
                pdy.error((Object)"TEAMCITY_BUILD_VERSION invalide : ");
            }
        }
        pdt = Integer.toString(n);
        Date date = new Date();
        if ("".length() > 0) {
            try {
                date = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse("");
            }
            catch (ParseException parseException) {
                pdy.error((Object)"TEAMCITY_BUILD_DATE invalide : ");
            }
        }
        pdu = date;
        byte[] byArray = BH.aP(Integer.toString(-1));
        pdv = new byte[5 + byArray.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(pdv);
        byteBuffer.put((byte)1);
        byteBuffer.putShort((short)91);
        byteBuffer.put((byte)2);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        pdw = 0x99F9FA;
        pdx = 10091;
        Object object = String.format("%d.%02d.%d", 1, 91, 2);
        if (n != -1) {
            object = (String)object + String.format(" (build %s)", pdt);
        }
        pdr = object;
        pds = String.format("%d.%02d (build %s [%4$tY-%4$tm-%4$td @ %4$tHH%4$tMmin%4$tS])", 1, 91, pdt, pdu);
    }
}

