/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.Nullable;

public final class biK {
    private biK() {
    }

    @Nullable
    public static String a(@Nullable exx_2 exx_22) {
        Object object;
        exx_2 exx_23 = exx_22;
        int n = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"HP", "AP", "MP", "WP", "DMG_IN_PERCENT", "RES_IN_PERCENT", "DMG_FIRE_PERCENT", "RES_FIRE_PERCENT", "DMG_WATER_PERCENT", "RES_WATER_PERCENT", "DMG_EARTH_PERCENT", "RES_EARTH_PERCENT", "DMG_AIR_PERCENT", "RES_AIR_PERCENT"}, (exx_2)exx_23, n)) {
            case -1: {
                return null;
            }
            case 0: {
                object = "HPShort";
                break;
            }
            case 1: {
                object = "APShort";
                break;
            }
            case 2: {
                object = "MPShort";
                break;
            }
            case 3: {
                object = "WPShort";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                fja fja2 = fja.swg.get(exx_22);
                object = "market.characteristics." + fja2.name();
                break;
            }
            default: {
                object = exx_22.name();
            }
        }
        return aum_0.cWf().c((String)object, new Object[0]);
    }

    @Nullable
    public static String g(@Nullable exx_2 exx_22) {
        String string;
        exx_2 exx_23 = exx_22;
        int n = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"HP", "AP", "MP", "WP", "DMG_IN_PERCENT", "MELEE_DMG", "RANGED_DMG", "BACKSTAB_BONUS", "BERSERK_DMG", "HEAL_IN_PERCENT", "RES_FIRE_PERCENT", "RES_WATER_PERCENT", "RES_EARTH_PERCENT", "RES_AIR_PERCENT"}, (exx_2)exx_23, n)) {
            case -1: {
                Object object = null;
                break;
            }
            case 0: {
                Object object = "HPShort";
                break;
            }
            case 1: {
                Object object = "APShort";
                break;
            }
            case 2: {
                Object object = "MPShort";
                break;
            }
            case 3: {
                Object object = "WPShort";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                Object object = "short." + exx_22.name();
                break;
            }
            default: {
                Object object = string = exx_22.name();
            }
        }
        if (string == null) {
            return null;
        }
        return aum_0.cWf().c(string, new Object[0]);
    }
}

