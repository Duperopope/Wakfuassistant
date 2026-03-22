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
 * Renamed from jm
 */
class jm_1
extends AbstractParser<jl_1> {
    jm_1() {
    }

    public jl_1 fF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jl_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fF(codedInputStream, extensionRegistryLite);
    }
}

