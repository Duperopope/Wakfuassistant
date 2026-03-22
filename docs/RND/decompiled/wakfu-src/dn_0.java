/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dn
 */
public final class dn_0 {
    private dn_0() {
    }

    public static fb_1 c(do_0 do_02) {
        fb_1 fb_12 = new fb_1();
        fb_12.j(do_02.aIz());
        byte by = do_02.aIy();
        if ((by & 1) == 1) {
            if ((by & 0x20) == 32) {
                fb_12.c((float)do_02.aIy() / 127.0f);
                fb_12.d((float)do_02.aIy() / 127.0f);
                fb_12.e((float)do_02.aIy() / 127.0f);
                fb_12.f((float)do_02.aIy() / 127.0f);
            } else {
                fb_12.c((float)do_02.aIz() / 256.0f);
                fb_12.d((float)do_02.aIz() / 256.0f);
                fb_12.e((float)do_02.aIz() / 256.0f);
                fb_12.f((float)do_02.aIz() / 256.0f);
            }
        }
        if ((by & 2) == 2) {
            if ((by & 0xFFFFFF80) == -128) {
                fb_12.g((float)do_02.aIy() * 16.0f / 127.0f);
                fb_12.h((float)do_02.aIy() * 16.0f / 127.0f);
            } else if ((by & 0x40) == 64) {
                fb_12.g((float)do_02.aIz() / 256.0f);
                fb_12.h((float)do_02.aIz() / 256.0f);
            } else {
                fb_12.g(do_02.aIB());
                fb_12.h(do_02.aIB());
            }
        }
        if ((by & 4) == 4) {
            fb_12.m((float)do_02.aIz() / 256.0f);
            fb_12.n((float)do_02.aIz() / 256.0f);
            fb_12.o((float)do_02.aIz() / 256.0f);
            fb_12.p((float)do_02.aIz() / 256.0f);
        }
        if ((by & 8) == 8) {
            fb_12.q((float)do_02.aIy() / 127.0f);
            fb_12.r((float)do_02.aIy() / 127.0f);
            fb_12.s((float)do_02.aIy() / 127.0f);
            fb_12.t((float)do_02.aIy() / 127.0f);
        }
        return fb_12;
    }
}

