/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from j
 */
public final class j_0
extends GeneratedMessageV3.Builder<j_0>
implements s_0 {
    private Object P = "";
    private Object R = "";
    private long T;
    private Object V = "";
    private bw_2 X;
    private SingleFieldBuilderV3<bw_2, by_1, cj_2> ab;

    public static final Descriptors.Descriptor C() {
        return g_0.I;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.J.ensureFieldAccessorsInitialized(h.class, j_0.class);
    }

    j_0() {
        this.D();
    }

    j_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (h.B()) {
            // empty if block
        }
    }

    public j_0 E() {
        super.clear();
        this.P = "";
        this.R = "";
        this.T = 0L;
        this.V = "";
        if (this.ab == null) {
            this.X = null;
        } else {
            this.X = null;
            this.ab = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.I;
    }

    public h A() {
        return h.y();
    }

    public h F() {
        h h2 = this.G();
        if (!h2.isInitialized()) {
            throw j_0.newUninitializedMessageException((Message)h2);
        }
        return h2;
    }

    public h G() {
        h h2 = new h(this);
        h2.P = this.P;
        h2.R = this.R;
        h2.T = this.T;
        h2.V = this.V;
        h2.X = this.ab == null ? this.X : (bw_2)this.ab.build();
        this.onBuilt();
        return h2;
    }

    public j_0 H() {
        return (j_0)super.clone();
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (j_0)super.setField(fieldDescriptor, object);
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (j_0)super.clearField(fieldDescriptor);
    }

    public j_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (j_0)super.clearOneof(oneofDescriptor);
    }

    public j_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (j_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public j_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (j_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public j_0 a(Message message) {
        if (message instanceof h) {
            return this.c((h)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public j_0 c(h h2) {
        if (h2 == h.y()) {
            return this;
        }
        if (!h2.l().isEmpty()) {
            this.P = h2.P;
            this.onChanged();
        }
        if (!h2.n().isEmpty()) {
            this.R = h2.R;
            this.onChanged();
        }
        if (h2.p() != 0L) {
            this.a(h2.p());
        }
        if (!h2.q().isEmpty()) {
            this.V = h2.V;
            this.onChanged();
        }
        if (h2.s()) {
            this.b(h2.t());
        }
        this.b(h.b(h2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public j_0 c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        h h2 = null;
        try {
            h2 = (h)h.aa.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            h2 = (h)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (h2 != null) {
                this.c(h2);
            }
        }
        return this;
    }

    @Override
    public String l() {
        Object object = this.P;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.P = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString m() {
        Object object = this.P;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.P = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public j_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.P = string;
        this.onChanged();
        return this;
    }

    public j_0 I() {
        this.P = h.y().l();
        this.onChanged();
        return this;
    }

    public j_0 e(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        h.b(byteString);
        this.P = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public String n() {
        Object object = this.R;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.R = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString o() {
        Object object = this.R;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.R = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public j_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.R = string;
        this.onChanged();
        return this;
    }

    public j_0 J() {
        this.R = h.y().n();
        this.onChanged();
        return this;
    }

    public j_0 f(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        h.c(byteString);
        this.R = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public long p() {
        return this.T;
    }

    public j_0 a(long l) {
        this.T = l;
        this.onChanged();
        return this;
    }

    public j_0 K() {
        this.T = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public String q() {
        Object object = this.V;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.V = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString r() {
        Object object = this.V;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.V = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public j_0 c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.V = string;
        this.onChanged();
        return this;
    }

    public j_0 L() {
        this.V = h.y().q();
        this.onChanged();
        return this;
    }

    public j_0 g(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        h.d(byteString);
        this.V = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return this.ab != null || this.X != null;
    }

    @Override
    public bw_2 t() {
        if (this.ab == null) {
            return this.X == null ? bw_2.kP() : this.X;
        }
        return (bw_2)this.ab.getMessage();
    }

    public j_0 a(bw_2 bw_22) {
        if (this.ab == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.X = bw_22;
            this.onChanged();
        } else {
            this.ab.setMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public j_0 a(by_1 by_12) {
        if (this.ab == null) {
            this.X = by_12.kU();
            this.onChanged();
        } else {
            this.ab.setMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public j_0 b(bw_2 bw_22) {
        if (this.ab == null) {
            this.X = this.X != null ? bw_2.i(this.X).k(bw_22).kV() : bw_22;
            this.onChanged();
        } else {
            this.ab.mergeFrom((AbstractMessage)bw_22);
        }
        return this;
    }

    public j_0 M() {
        if (this.ab == null) {
            this.X = null;
            this.onChanged();
        } else {
            this.X = null;
            this.ab = null;
        }
        return this;
    }

    public by_1 N() {
        this.onChanged();
        return (by_1)this.O().getBuilder();
    }

    @Override
    public cj_2 u() {
        if (this.ab != null) {
            return (cj_2)this.ab.getMessageOrBuilder();
        }
        return this.X == null ? bw_2.kP() : this.X;
    }

    private SingleFieldBuilderV3<bw_2, by_1, cj_2> O() {
        if (this.ab == null) {
            this.ab = new SingleFieldBuilderV3((AbstractMessage)this.t(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.X = null;
        }
        return this.ab;
    }

    public final j_0 a(UnknownFieldSet unknownFieldSet) {
        return (j_0)super.setUnknownFields(unknownFieldSet);
    }

    public final j_0 b(UnknownFieldSet unknownFieldSet) {
        return (j_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.E();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.H();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.c(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.E();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.H();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.c(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.H();
    }

    public /* synthetic */ Message buildPartial() {
        return this.G();
    }

    public /* synthetic */ Message build() {
        return this.F();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.c(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.H();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.G();
    }

    public /* synthetic */ MessageLite build() {
        return this.F();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.A();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.A();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.c(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.H();
    }

    public /* synthetic */ Object clone() {
        return this.H();
    }
}

