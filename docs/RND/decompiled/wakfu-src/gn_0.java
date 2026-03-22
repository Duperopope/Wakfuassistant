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
 * Renamed from gN
 */
class gn_0
extends AbstractParser<gm_0> {
    gn_0() {
    }

    public gm_0 dW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gm_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dW(codedInputStream, extensionRegistryLite);
    }
}

