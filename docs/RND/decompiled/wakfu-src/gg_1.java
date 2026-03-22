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
 * Renamed from gg
 */
class gg_1
extends AbstractParser<gf_2> {
    gg_1() {
    }

    public gf_2 dE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gf_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dE(codedInputStream, extensionRegistryLite);
    }
}

