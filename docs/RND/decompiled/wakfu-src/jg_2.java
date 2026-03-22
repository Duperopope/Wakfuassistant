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
 * Renamed from jG
 */
class jg_2
extends AbstractParser<jf_2> {
    jg_2() {
    }

    public jf_2 fU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jf_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fU(codedInputStream, extensionRegistryLite);
    }
}

