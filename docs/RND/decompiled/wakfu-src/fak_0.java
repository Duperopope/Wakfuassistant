/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from faK
 */
public class fak_0 {
    private static final Logger rPS = Logger.getLogger(fak_0.class);

    public static byte[] f(faz_0 faz_02) {
        azg_1 azg_12 = new azg_1();
        faa_0.a(faz_02.eqJ(), azg_12);
        fcr fcr2 = new fcr();
        faz_02.O(fcr2);
        azg_12.vC(fcr2.fSx());
        azg_12.dH(fcr2.aKU());
        fct fct2 = new fct();
        faz_02.P(fct2);
        azg_12.vC(fct2.fSx());
        azg_12.dH(fct2.aKU());
        return azg_12.bTe();
    }

    public static faz_0 fQ(ByteBuffer byteBuffer) {
        int n;
        faa_0 faa_02 = faa_0.fO(byteBuffer);
        if (faa_02 == null) {
            rPS.error((Object)"Unable to decode HavenWorldBasicInfo");
            return null;
        }
        fah_0 fah_02 = (fah_0)fad_0.d(faa_02);
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            fah_02.d(fak_0.fS(byteBuffer));
        }
        n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            fah_02.b(fak_0.fR(byteBuffer));
        }
        return fah_02;
    }

    public static byte[] g(fao_0 fao_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putShort(fao_02.bsM());
        byteBuffer.putShort(fao_02.bsN());
        byteBuffer.putShort(fao_02.eAq());
        byteBuffer.putShort(fao_02.eAr());
        byteBuffer.putShort(fao_02.eAs());
        byteBuffer.putShort(fao_02.eAt());
        return byteBuffer.array();
    }

    public static byte[] i(fas_0 fas_02) {
        azg_1 azg_12 = new azg_1();
        azg_12.dH(fak_0.j(fas_02));
        fal_0 fal_02 = new fal_0();
        fas_02.z(fal_02);
        azg_12.vC(fal_02.getNumber());
        azg_12.a(fal_02.fRt());
        return azg_12.bTe();
    }

    public static byte[] j(fas_0 fas_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putShort(fas_02.erN().aIi());
        byteBuffer.putLong(fas_02.Lx());
        byteBuffer.putInt(fas_02.fRk());
        byteBuffer.putLong(fas_02.fRi());
        byteBuffer.putShort(fas_02.bsM());
        byteBuffer.putShort(fas_02.bsN());
        return byteBuffer.array();
    }

    public static byte[] b(fat_0 fat_02) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(fat_02.Lx());
        byteBuffer.putLong(fat_02.evy());
        return byteBuffer.array();
    }

    public static fao_0 fR(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        short s6 = byteBuffer.getShort();
        return new faq_0(s, s2, s3, s4, s5, s6);
    }

    public static fas_0 fS(ByteBuffer byteBuffer) {
        fav_0 fav_02 = (fav_0)fak_0.fT(byteBuffer);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            fau_0 fau_02 = fak_0.fU(byteBuffer);
            fav_02.a(fau_02);
        }
        return fav_02;
    }

    public static fas_0 fT(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        long l2 = byteBuffer.getLong();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        fbk_0 fbk_02 = fbw_0.rSQ.eE(s);
        return new fav_0(fbk_02, l, n, l2, s2, s3);
    }

    private static fau_0 fU(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        long l2 = byteBuffer.getLong();
        return new fau_0(l, l2);
    }
}

