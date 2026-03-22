/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eIl {
    private static final Logger qvU = Logger.getLogger(eIl.class);

    private eIl() {
    }

    public static byte[] d(eIm eIm2) {
        eL eL2 = eJ.wT();
        eL2.bA(eIm2.wM());
        eL2.bE(eIm2.wR());
        for (eIj eIj2 : eIm2.uv().values()) {
            eL2.a(eIl.f(eIj2));
        }
        return eL2.wZ().toByteArray();
    }

    public static byte[] e(eIj eIj2) {
        eH eH2 = eIl.f(eIj2);
        return eH2.wC().toByteArray();
    }

    public static byte[] a(eIj eIj2, int n) {
        eH eH2 = eIl.f(eIj2);
        eH2.bv(n);
        return eH2.wC().toByteArray();
    }

    public static eIm ey(byte[] byArray) {
        eJ eJ2;
        try {
            eJ2 = eJ.an(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qvU.fatal((Object)("Unable to unserialize build sheet set from protobuf, new BuildSheetSet provided:" + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            return new eIm();
        }
        eIm eIm2 = new eIm();
        eIm2.PU(eJ2.wR());
        List<eF> list = eJ2.wN();
        for (eF eF2 : list) {
            eIj eIj2 = eIl.e(eF2);
            eIm2.g(eIj2);
        }
        eIm2.PS(eJ2.wM());
        return eIm2;
    }

    public static eIj ez(byte[] byArray) {
        eF eF2;
        try {
            eF2 = eF.am(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qvU.fatal((Object)("Unable to unserialize build sheet set from protobuf: " + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            throw new IllegalArgumentException(invalidProtocolBufferException);
        }
        return eIl.e(eF2);
    }

    @NotNull
    private static eH f(eIj eIj2) {
        eH eH2 = eF.ww();
        String string = eIj2.getName();
        eH2.w(string == null ? "Default name" : string).bw(eIj2.tL()).bv(eIj2.wp()).bx(eIj2.ws()).f(eIj2.dhe());
        return eH2;
    }

    @NotNull
    private static eIj e(eF eF2) {
        eIj eIj2 = new eIj(eF2.getName(), eF2.tL(), eF2.wp(), eF2.wu());
        eIj2.PQ(eF2.ws());
        return eIj2;
    }
}

