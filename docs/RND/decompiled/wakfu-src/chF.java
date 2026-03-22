/*
 * Decompiled with CFR 0.152.
 */
public class chF {
    public static boolean a(fpP fpP2) {
        switch (fpP2) {
            case sQL: {
                break;
            }
            case sQN: {
                aPd.e("account.storage.result.maintenance", new Object[0]);
                return true;
            }
            default: {
                aPd.e("account.storage.result.error", new Object[0]);
                return true;
            }
        }
        return false;
    }
}

