/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.sentry.DefaultSentryClientFactory
 *  io.sentry.context.ContextManager
 *  io.sentry.context.SingletonContextManager
 *  io.sentry.dsn.Dsn
 */
package com.ankamagames.wakfu.client.core.sentry;

import io.sentry.DefaultSentryClientFactory;
import io.sentry.context.ContextManager;
import io.sentry.context.SingletonContextManager;
import io.sentry.dsn.Dsn;

public class WakfuSentryClientFactory
extends DefaultSentryClientFactory {
    protected ContextManager getContextManager(Dsn dsn) {
        return new SingletonContextManager();
    }
}

