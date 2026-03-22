/*
 * Decompiled with CFR 0.152.
 */
public class fsE {
    public static boolean a(fsd_0 fsd_02, Object object) {
        if (fsd_02 == object) {
            return true;
        }
        if (object == null || fsd_02.getClass() != object.getClass()) {
            return false;
        }
        fsd_0 fsd_03 = (fsd_0)object;
        return fsd_02.Lx() == fsd_03.Lx();
    }

    public static int l(fsd_0 fsd_02) {
        return (int)fsd_02.Lx();
    }
}

