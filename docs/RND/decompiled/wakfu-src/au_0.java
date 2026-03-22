/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from Au
 */
class au_0
extends AbstractParser<ar_0> {
    au_0() {
    }

    public ar_0 kf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ar_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kf(codedInputStream, extensionRegistryLite);
    }
}

