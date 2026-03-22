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
 * Renamed from nL
 */
class nl_2
extends AbstractParser<nk_2> {
    nl_2() {
    }

    public nk_2 iC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new nk_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iC(codedInputStream, extensionRegistryLite);
    }
}

