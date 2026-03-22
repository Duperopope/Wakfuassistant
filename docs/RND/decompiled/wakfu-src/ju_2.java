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
 * Renamed from jU
 */
class ju_2
extends AbstractParser<jt_2> {
    ju_2() {
    }

    public jt_2 gd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jt_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gd(codedInputStream, extensionRegistryLite);
    }
}

