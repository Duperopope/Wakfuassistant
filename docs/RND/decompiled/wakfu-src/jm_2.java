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
 * Renamed from jM
 */
class jm_2
extends AbstractParser<jl_2> {
    jm_2() {
    }

    public jl_2 fX(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jl_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fX(codedInputStream, extensionRegistryLite);
    }
}

