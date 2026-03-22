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
 * Renamed from yR
 */
class yr_2
extends AbstractParser<yq_2> {
    yr_2() {
    }

    public yq_2 jd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new yq_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jd(codedInputStream, extensionRegistryLite);
    }
}

