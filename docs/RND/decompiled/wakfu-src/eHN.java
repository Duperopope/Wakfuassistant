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

public final class eHN {
    private static final Logger qtf = Logger.getLogger(eHN.class);

    private eHN() {
    }

    public static byte[] e(ehy_0 ehy_02) {
        return eHN.g(ehy_02).um().uj().toByteArray();
    }

    public static byte[] f(ehy_0 ehy_02) {
        return eHN.g(ehy_02).uj().toByteArray();
    }

    @NotNull
    private static ec g(ehy_0 ehy_02) {
        ec ec2 = ea.ud().bj(ehy_02.fwc());
        ehy_02.g((n, s) -> ec2.a(dW.tN().bf((int)n).bg(s.shortValue())));
        return ec2;
    }

    public static ehy_0 c(byte[] byArray, long l) {
        ea ea2;
        try {
            ea2 = ea.af(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qtf.error((Object)("[Build] Unable to unserialize sheet set from protobuf: characterId=" + l + ", data=" + (byArray == null ? "null" : BH.de(byArray))), (Throwable)invalidProtocolBufferException);
            return new ehy_0();
        }
        return eHN.d(ea2);
    }

    @NotNull
    private static ehy_0 d(ea ea2) {
        ehy_0 ehy_02 = new ehy_0();
        if (ea2.tK()) {
            ehy_02.dz((short)ea2.tL());
        }
        List<dW> list = ea2.tZ();
        for (dW dW2 : list) {
            if (eHJ.qsV.Py(dW2.tJ()) == null) continue;
            ehy_02.p(dW2.tJ(), (short)dW2.tL());
        }
        return ehy_02;
    }

    public static byte[] b(eHZ eHZ2) {
        eg_0 eg_02 = ee_0.uy();
        eHZ2.uv().forEach((n, ehy_02) -> eg_02.b((int)n, eHN.g(ehy_02).uj()));
        return eg_02.uE().toByteArray();
    }

    public static eHZ ex(byte[] byArray) {
        ee_0 ee_02;
        try {
            ee_02 = ee_0.ag(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            qtf.error((Object)("[Build] Unable to parse data into aptitude sheet set, new SheetSet provided ; data = " + Arrays.toString(byArray)));
            return new eHZ();
        }
        eHZ eHZ2 = new eHZ();
        ee_02.uw().forEach((n, ea2) -> eHZ2.a((int)n, eHN.d(ea2)));
        return eHZ2;
    }
}

