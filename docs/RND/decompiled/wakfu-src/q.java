/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q
extends GeneratedMessageV3.Builder<q>
implements r_0 {
    private int an;
    private List<h> ak = Collections.emptyList();
    private RepeatedFieldBuilderV3<h, j_0, s_0> ao;

    public static final Descriptors.Descriptor as() {
        return g_0.K;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.L.ensureFieldAccessorsInitialized(o.class, q.class);
    }

    q() {
        this.D();
    }

    q(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (o.aq()) {
            this.aB();
        }
    }

    public q at() {
        super.clear();
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.ao.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.K;
    }

    public o ap() {
        return o.ao();
    }

    public o au() {
        o o2 = this.av();
        if (!o2.isInitialized()) {
            throw q.newUninitializedMessageException((Message)o2);
        }
        return o2;
    }

    public o av() {
        o o2 = new o(this);
        int n = this.an;
        if (this.ao == null) {
            if ((this.an & 1) != 0) {
                this.ak = Collections.unmodifiableList(this.ak);
                this.an &= 0xFFFFFFFE;
            }
            o2.ak = this.ak;
        } else {
            o2.ak = this.ao.build();
        }
        this.onBuilt();
        return o2;
    }

    public q aw() {
        return (q)super.clone();
    }

    public q e(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (q)super.setField(fieldDescriptor, object);
    }

    public q c(Descriptors.FieldDescriptor fieldDescriptor) {
        return (q)super.clearField(fieldDescriptor);
    }

    public q c(Descriptors.OneofDescriptor oneofDescriptor) {
        return (q)super.clearOneof(oneofDescriptor);
    }

    public q c(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (q)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public q f(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (q)super.addRepeatedField(fieldDescriptor, object);
    }

    public q c(Message message) {
        if (message instanceof o) {
            return this.c((o)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public q c(o o2) {
        if (o2 == o.ao()) {
            return this;
        }
        if (this.ao == null) {
            if (!o2.ak.isEmpty()) {
                if (this.ak.isEmpty()) {
                    this.ak = o2.ak;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ax();
                    this.ak.addAll(o2.ak);
                }
                this.onChanged();
            }
        } else if (!o2.ak.isEmpty()) {
            if (this.ao.isEmpty()) {
                this.ao.dispose();
                this.ao = null;
                this.ak = o2.ak;
                this.an &= 0xFFFFFFFE;
                this.ao = o.ar() ? this.aB() : null;
            } else {
                this.ao.addAllMessages(o2.ak);
            }
        }
        this.f(o.b(o2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public q i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        o o2 = null;
        try {
            o2 = (o)o.am.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            o2 = (o)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (o2 != null) {
                this.c(o2);
            }
        }
        return this;
    }

    private void ax() {
        if ((this.an & 1) == 0) {
            this.ak = new ArrayList<h>(this.ak);
            this.an |= 1;
        }
    }

    @Override
    public List<h> ai() {
        if (this.ao == null) {
            return Collections.unmodifiableList(this.ak);
        }
        return this.ao.getMessageList();
    }

    @Override
    public int ak() {
        if (this.ao == null) {
            return this.ak.size();
        }
        return this.ao.getCount();
    }

    @Override
    public h a(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (h)this.ao.getMessage(n);
    }

    public q a(int n, h h2) {
        if (this.ao == null) {
            if (h2 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.set(n, h2);
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)h2);
        }
        return this;
    }

    public q a(int n, j_0 j_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.set(n, j_02.F());
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)j_02.F());
        }
        return this;
    }

    public q f(h h2) {
        if (this.ao == null) {
            if (h2 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(h2);
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)h2);
        }
        return this;
    }

    public q b(int n, h h2) {
        if (this.ao == null) {
            if (h2 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(n, h2);
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)h2);
        }
        return this;
    }

    public q b(j_0 j_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(j_02.F());
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)j_02.F());
        }
        return this;
    }

    public q b(int n, j_0 j_02) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(n, j_02.F());
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)j_02.F());
        }
        return this;
    }

    public q a(Iterable<? extends h> iterable) {
        if (this.ao == null) {
            this.ax();
            AbstractMessageLite.Builder.addAll(iterable, this.ak);
            this.onChanged();
        } else {
            this.ao.addAllMessages(iterable);
        }
        return this;
    }

    public q ay() {
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ao.clear();
        }
        return this;
    }

    public q c(int n) {
        if (this.ao == null) {
            this.ax();
            this.ak.remove(n);
            this.onChanged();
        } else {
            this.ao.remove(n);
        }
        return this;
    }

    public j_0 d(int n) {
        return (j_0)this.aB().getBuilder(n);
    }

    @Override
    public s_0 b(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (s_0)this.ao.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends s_0> aj() {
        if (this.ao != null) {
            return this.ao.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ak);
    }

    public j_0 az() {
        return (j_0)this.aB().addBuilder((AbstractMessage)h.y());
    }

    public j_0 e(int n) {
        return (j_0)this.aB().addBuilder(n, (AbstractMessage)h.y());
    }

    public List<j_0> aA() {
        return this.aB().getBuilderList();
    }

    private RepeatedFieldBuilderV3<h, j_0, s_0> aB() {
        if (this.ao == null) {
            this.ao = new RepeatedFieldBuilderV3(this.ak, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ak = null;
        }
        return this.ao;
    }

    public final q e(UnknownFieldSet unknownFieldSet) {
        return (q)super.setUnknownFields(unknownFieldSet);
    }

    public final q f(UnknownFieldSet unknownFieldSet) {
        return (q)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.f(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.e(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.f(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.c(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.c(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.c(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.e(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.at();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.f(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.i(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.c(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.at();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.c(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.f(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.e(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.f(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.c(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.c(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.c(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.e(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.i(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.av();
    }

    public /* synthetic */ Message build() {
        return this.au();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.c(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.at();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.i(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.av();
    }

    public /* synthetic */ MessageLite build() {
        return this.au();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.at();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ap();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ap();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.i(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aw();
    }

    public /* synthetic */ Object clone() {
        return this.aw();
    }
}

