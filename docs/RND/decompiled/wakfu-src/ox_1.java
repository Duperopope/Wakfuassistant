/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ox
 */
public abstract class ox_1
implements gs_0 {
    public static ox_1 cw(ByteBuffer byteBuffer) {
        ox_1 ox_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                ox_12 = new wy_1();
                break;
            }
            case 1: {
                ox_12 = new ww_1();
                break;
            }
            case 2: {
                ox_12 = new wz_2();
                break;
            }
            case 3: {
                ox_12 = new wv_2();
                break;
            }
            case 4: {
                ox_12 = new wc_2();
                break;
            }
            case 5: {
                ox_12 = new wd_1();
                break;
            }
            case 6: {
                ox_12 = new wf_2();
                break;
            }
            case 7: {
                ox_12 = new we_2();
                break;
            }
            case 8: {
                ox_12 = new wb_2();
                break;
            }
            default: {
                return null;
            }
        }
        if (!ox_12.aG(byteBuffer)) {
            return null;
        }
        return ox_12;
    }

    public static ox_1 c(ByteBuffer byteBuffer, int n) {
        ox_1 ox_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                ox_12 = new wy_1();
                break;
            }
            case 1: {
                ox_12 = new ww_1();
                break;
            }
            case 2: {
                ox_12 = new wz_2();
                break;
            }
            case 3: {
                ox_12 = new wv_2();
                break;
            }
            case 4: {
                ox_12 = new wc_2();
                break;
            }
            case 5: {
                ox_12 = new wd_1();
                break;
            }
            case 6: {
                ox_12 = new wf_2();
                break;
            }
            case 7: {
                ox_12 = new we_2();
                break;
            }
            case 8: {
                ox_12 = new wb_2();
                break;
            }
            default: {
                return null;
            }
        }
        if (!ox_12.b(byteBuffer, n)) {
            return null;
        }
        return ox_12;
    }

    public abstract byte avV();

    public abstract void a(StringBuilder var1, String var2);
}

