/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUT
 */
class fut_2 {
    fut_2() {
    }

    static int acp(int n) {
        int n2 = 0;
        while (n != 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int acz(int n) {
        int n2 = 0;
        while (n > 1) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int acA(int n) {
        int n2 = 0;
        while (n != 0) {
            n2 += n & 1;
            n >>>= 1;
        }
        return n2;
    }
}

