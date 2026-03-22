/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.opengl;

import org.apache.log4j.Logger;

public class FullscreenUtils {
    private static final Logger cxA = Logger.getLogger(FullscreenUtils.class);
    public static final FullscreenUtils cxB;

    private FullscreenUtils() {
    }

    public native void showMenuAndDock(boolean var1);

    static {
        try {
            if (ady_1.bZa()) {
                System.loadLibrary("fullscreenutils");
            }
        }
        catch (Throwable throwable) {
            cxA.error((Object)"Unable to load fullscreenutils library (So full screen management on mac isn't available :c)", throwable);
        }
        cxB = new FullscreenUtils();
    }
}

