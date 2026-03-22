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
 * Renamed from ci
 */
class ci_2
extends AbstractParser<ch_2> {
    ci_2() {
    }

    public ch_2 bf(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ch_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bf(codedInputStream, extensionRegistryLite);
    }
}

