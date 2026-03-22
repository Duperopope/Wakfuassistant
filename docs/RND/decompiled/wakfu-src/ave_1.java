/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.util.VersionNumberString
 *  jogamp.opengl.GLVersionNumber
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.jogamp.common.util.VersionNumberString;
import jogamp.opengl.GLVersionNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from avE
 */
public class ave_1
extends ava_1 {
    private static final Logger dhV = LoggerFactory.getLogger(ave_1.class);

    @Override
    public boolean bMV() {
        if (!ady_1.bZb()) {
            dhV.debug("Doesn't have {} because OS is not Windows", (Object)this.bMW());
            return false;
        }
        if (!atj_2.dbA.h(this.dhU)) {
            dhV.debug("Doesn't have {} because vendor is not AMD", (Object)this.bMW());
            return false;
        }
        String string = this.dhU.glGetString(7938);
        VersionNumberString versionNumberString = GLVersionNumber.createVendorVersion((String)string);
        int n = versionNumberString.getMajor();
        int n2 = versionNumberString.getMinor();
        int n3 = versionNumberString.getSub();
        if (n != 22 && n != 23) {
            dhV.debug("Doesn't have {} because version major isn't 22 or 23 (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        if (n == 22 && n2 < 7) {
            dhV.debug("Doesn't have {} because version major is 22 and version minor are inferior to 7 (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        if (n == 22 && n2 == 7 && n3 < 1) {
            dhV.debug("Doesn't have {} because version major is 22 and version minor is 7 and version sub are inferior to 1 (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        if (n == 23 && n2 > 7) {
            dhV.debug("Doesn't have {} because version major is 23 and version minor are superior to 7 (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        if (n == 23 && n2 == 7 && n3 > 0) {
            dhV.debug("Doesn't have {} because version major is 23 and version minor is 7 and version sub are superior to 0 (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        String string2 = versionNumberString.getVersionString();
        if (string2.contains(".Q") || string2.contains(".q")) {
            dhV.debug("Doesn't have {} because vendor version version string contains q (PRO driver) (vendor version {})", (Object)this.bMW(), (Object)versionNumberString);
            return false;
        }
        return true;
    }

    @Override
    public avg_2 bMW() {
        return avg_2.dhq;
    }
}

