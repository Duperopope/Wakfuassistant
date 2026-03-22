/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from DE
 */
final class de_0 {
    private de_0() {
    }

    public static void a(ey_1 ey_12, do_0 do_02) {
        ey_12.mF(do_02.aIA());
        if (ey_12.aJY()) {
            int n = do_02.aIz() & 0xFFFF;
            HashMap<Integer, Byte> hashMap = ey_12.aKa();
            for (int i = 0; i < n; ++i) {
                hashMap.put(do_02.aIA(), (byte)(do_02.aIy() - -1));
            }
        }
        if (ey_12.aJZ()) {
            ey_12.m(do_02.my(3));
        }
    }
}

