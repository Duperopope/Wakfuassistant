/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableCollection
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableCollection;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fhj {
    public static final int soe = 10000;
    private static final Logger sof = Logger.getLogger(fhj.class);

    private fhj() {
    }

    public static byte[] f(fhk fhk2) {
        return fhj.h(fhk2).Lu().Lp().toByteArray();
    }

    public static byte[] g(fhk fhk2) {
        return fhj.h(fhk2).Lp().toByteArray();
    }

    public static ib h(fhk fhk2) {
        ffS[] ffSArray;
        ib ib2 = hZ.Lj();
        ib2.ei(fhk2.cmL());
        for (ffS ffS2 : ffSArray = ffS.values()) {
            Long l = fhk2.t(ffS2);
            if (l == null) continue;
            ib2.a(ic.LB().ej(ffS2.aJr()).ad(l));
        }
        return ib2;
    }

    public static fhk eN(byte[] byArray) {
        hZ hZ2;
        try {
            hZ2 = hZ.aW(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sof.error((Object)("[Build] Unable to parse equipment sheet data " + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            return new fhk();
        }
        return fhj.d(hZ2);
    }

    @NotNull
    private static fhk d(hZ hZ2) {
        fhk fhk2 = new fhk();
        if (hZ2.tK()) {
            fhk2.bw((short)hZ2.tL());
        }
        List<ic> list = hZ2.ot();
        for (ic ic2 : list) {
            ffS ffS2 = ffS.gj((byte)ic2.Lz());
            if (!ffS.sha.contains(ffS2)) continue;
            fhk2.c(ffS2, ic2.Lx());
        }
        return fhk2;
    }

    public static hU b(fhm fhm2) {
        hW hW2 = hU.KW().ac(fhm2.KU());
        Map<Integer, fhk> map = fhm2.uv();
        map.forEach((n, fhk2) -> hW2.b((int)n, fhj.h(fhk2).Lp()));
        return hW2.Lc();
    }

    public static byte[] Q(Collection<fhm> collection) {
        hO hO2 = hM.Kr();
        for (fhm fhm2 : collection) {
            hO2.a(fhj.b(fhm2));
        }
        return hO2.Kx().toByteArray();
    }

    private static fhm e(hU hU2) {
        fhm fhm2 = new fhm(hU2.KU());
        Map<Integer, hZ> map = hU2.uw();
        map.forEach((n, hZ2) -> fhm2.a((int)n, fhj.d(hZ2)));
        return fhm2;
    }

    public static List<fhm> eO(byte[] byArray) {
        hM hM2;
        ArrayList<fhm> arrayList = new ArrayList<fhm>();
        try {
            hM2 = hM.aT(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sof.error((Object)("Unable to parse ProtoEquipmentAccount from data: " + Arrays.toString(byArray)), (Throwable)invalidProtocolBufferException);
            return arrayList;
        }
        List<hU> list = hM2.Kn();
        for (hU hU2 : list) {
            fhm fhm2 = fhj.e(hU2);
            arrayList.add(fhm2);
        }
        return arrayList;
    }

    public static byte[] c(fhe fhe2) {
        hS hS2 = hQ.KH();
        if (fhe2.fXF() > 0) {
            ImmutableCollection immutableCollection = fhe2.fXE().values();
            for (ffV ffV2 : immutableCollection) {
                if (ffV2 == null) {
                    sof.fatal((Object)("Null item during EquipmentInventory serialization, inventory characterId : " + fhe2.KU()));
                    continue;
                }
                hS2.a(fga_0.cK(ffV2));
            }
        }
        return hS2.KN().toByteArray();
    }

    public static hQ eP(byte[] byArray) {
        try {
            return hQ.aU(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            sof.error((Object)"Unable to decode EquipmentInventory", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    @Nullable
    public static fhe e(long l, byte[] byArray) {
        hQ hQ2 = fhj.eP(byArray);
        if (hQ2 == null) {
            sof.error((Object)("Can't parse EquipmentInventory for character " + l));
            return null;
        }
        return fhj.a(l, hQ2);
    }

    @NotNull
    public static fhe a(long l, @NotNull hQ hQ2) {
        fhe fhe2 = new fhe(l);
        List<kW> list = hQ2.ot();
        for (kW kW2 : list) {
            ffV ffV2 = fga_0.w(kW2);
            if (ffV2 == null) {
                sof.error((Object)("Null item unserializing EquipmentInventory, uniqueId " + kW2.LV() + ", refId " + kW2.acs()));
                continue;
            }
            fhe2.aW(ffV2);
        }
        return fhe2;
    }
}

