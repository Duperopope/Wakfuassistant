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

/*
 * Renamed from gS
 */
public final class gs_1
extends GeneratedMessageV3.Builder<gs_1>
implements gx_0 {
    private int an;
    private List<gt_0> tq = Collections.emptyList();
    private RepeatedFieldBuilderV3<gt_0, gv_0, gw_0> tt;

    public static final Descriptors.Descriptor Gi() {
        return gl_0.sS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sT.ensureFieldAccessorsInitialized(gq_1.class, gs_1.class);
    }

    gs_1() {
        this.D();
    }

    gs_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (gq_1.el()) {
            this.Gr();
        }
    }

    public gs_1 Gj() {
        super.clear();
        if (this.tt == null) {
            this.tq = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.tt.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gl_0.sS;
    }

    public gq_1 Gh() {
        return gq_1.Gg();
    }

    public gq_1 Gk() {
        gq_1 gq_12 = this.Gl();
        if (!gq_12.isInitialized()) {
            throw gs_1.newUninitializedMessageException((Message)gq_12);
        }
        return gq_12;
    }

    public gq_1 Gl() {
        gq_1 gq_12 = new gq_1(this);
        int n = this.an;
        if (this.tt == null) {
            if ((this.an & 1) != 0) {
                this.tq = Collections.unmodifiableList(this.tq);
                this.an &= 0xFFFFFFFE;
            }
            gq_12.tq = this.tq;
        } else {
            gq_12.tq = this.tt.build();
        }
        this.onBuilt();
        return gq_12;
    }

    public gs_1 Gm() {
        return (gs_1)super.clone();
    }

    public gs_1 cq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gs_1)super.setField(fieldDescriptor, object);
    }

    public gs_1 aI(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gs_1)super.clearField(fieldDescriptor);
    }

    public gs_1 aI(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gs_1)super.clearOneof(oneofDescriptor);
    }

    public gs_1 aI(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gs_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gs_1 cr(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gs_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public gs_1 aI(Message message) {
        if (message instanceof gq_1) {
            return this.c((gq_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gs_1 c(gq_1 gq_12) {
        if (gq_12 == gq_1.Gg()) {
            return this;
        }
        if (this.tt == null) {
            if (!gq_12.tq.isEmpty()) {
                if (this.tq.isEmpty()) {
                    this.tq = gq_12.tq;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.Gn();
                    this.tq.addAll(gq_12.tq);
                }
                this.onChanged();
            }
        } else if (!gq_12.tq.isEmpty()) {
            if (this.tt.isEmpty()) {
                this.tt.dispose();
                this.tt = null;
                this.tq = gq_12.tq;
                this.an &= 0xFFFFFFFE;
                this.tt = gq_1.cs() ? this.Gr() : null;
            } else {
                this.tt.addAllMessages(gq_12.tq);
            }
        }
        this.cr(gq_1.b(gq_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.Gc(); ++i) {
            if (this.di(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gs_1 ea(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gq_1 gq_12 = null;
        try {
            gq_12 = (gq_1)gq_1.ts.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gq_12 = (gq_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gq_12 != null) {
                this.c(gq_12);
            }
        }
        return this;
    }

    private void Gn() {
        if ((this.an & 1) == 0) {
            this.tq = new ArrayList<gt_0>(this.tq);
            this.an |= 1;
        }
    }

    @Override
    public List<gt_0> Ga() {
        if (this.tt == null) {
            return Collections.unmodifiableList(this.tq);
        }
        return this.tt.getMessageList();
    }

    @Override
    public int Gc() {
        if (this.tt == null) {
            return this.tq.size();
        }
        return this.tt.getCount();
    }

    @Override
    public gt_0 di(int n) {
        if (this.tt == null) {
            return this.tq.get(n);
        }
        return (gt_0)this.tt.getMessage(n);
    }

    public gs_1 a(int n, gt_0 gt_02) {
        if (this.tt == null) {
            if (gt_02 == null) {
                throw new NullPointerException();
            }
            this.Gn();
            this.tq.set(n, gt_02);
            this.onChanged();
        } else {
            this.tt.setMessage(n, (AbstractMessage)gt_02);
        }
        return this;
    }

    public gs_1 a(int n, gv_0 gv_02) {
        if (this.tt == null) {
            this.Gn();
            this.tq.set(n, gv_02.GE());
            this.onChanged();
        } else {
            this.tt.setMessage(n, (AbstractMessage)gv_02.GE());
        }
        return this;
    }

    public gs_1 a(gt_0 gt_02) {
        if (this.tt == null) {
            if (gt_02 == null) {
                throw new NullPointerException();
            }
            this.Gn();
            this.tq.add(gt_02);
            this.onChanged();
        } else {
            this.tt.addMessage((AbstractMessage)gt_02);
        }
        return this;
    }

    public gs_1 b(int n, gt_0 gt_02) {
        if (this.tt == null) {
            if (gt_02 == null) {
                throw new NullPointerException();
            }
            this.Gn();
            this.tq.add(n, gt_02);
            this.onChanged();
        } else {
            this.tt.addMessage(n, (AbstractMessage)gt_02);
        }
        return this;
    }

    public gs_1 a(gv_0 gv_02) {
        if (this.tt == null) {
            this.Gn();
            this.tq.add(gv_02.GE());
            this.onChanged();
        } else {
            this.tt.addMessage((AbstractMessage)gv_02.GE());
        }
        return this;
    }

    public gs_1 b(int n, gv_0 gv_02) {
        if (this.tt == null) {
            this.Gn();
            this.tq.add(n, gv_02.GE());
            this.onChanged();
        } else {
            this.tt.addMessage(n, (AbstractMessage)gv_02.GE());
        }
        return this;
    }

    public gs_1 z(Iterable<? extends gt_0> iterable) {
        if (this.tt == null) {
            this.Gn();
            AbstractMessageLite.Builder.addAll(iterable, this.tq);
            this.onChanged();
        } else {
            this.tt.addAllMessages(iterable);
        }
        return this;
    }

    public gs_1 Go() {
        if (this.tt == null) {
            this.tq = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.tt.clear();
        }
        return this;
    }

    public gs_1 dk(int n) {
        if (this.tt == null) {
            this.Gn();
            this.tq.remove(n);
            this.onChanged();
        } else {
            this.tt.remove(n);
        }
        return this;
    }

    public gv_0 dl(int n) {
        return (gv_0)this.Gr().getBuilder(n);
    }

    @Override
    public gw_0 dj(int n) {
        if (this.tt == null) {
            return this.tq.get(n);
        }
        return (gw_0)this.tt.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gw_0> Gb() {
        if (this.tt != null) {
            return this.tt.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.tq);
    }

    public gv_0 Gp() {
        return (gv_0)this.Gr().addBuilder((AbstractMessage)gt_0.GA());
    }

    public gv_0 dm(int n) {
        return (gv_0)this.Gr().addBuilder(n, (AbstractMessage)gt_0.GA());
    }

    public List<gv_0> Gq() {
        return this.Gr().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gt_0, gv_0, gw_0> Gr() {
        if (this.tt == null) {
            this.tt = new RepeatedFieldBuilderV3(this.tq, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.tq = null;
        }
        return this.tt;
    }

    public final gs_1 cq(UnknownFieldSet unknownFieldSet) {
        return (gs_1)super.setUnknownFields(unknownFieldSet);
    }

    public final gs_1 cr(UnknownFieldSet unknownFieldSet) {
        return (gs_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cr(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cr(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aI(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aI(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aI(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Gj();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Gm();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cr(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ea(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aI(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Gj();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aI(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Gm();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cr(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cr(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aI(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aI(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aI(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ea(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Gm();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Gl();
    }

    public /* synthetic */ Message build() {
        return this.Gk();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aI(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Gj();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ea(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Gm();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Gl();
    }

    public /* synthetic */ MessageLite build() {
        return this.Gk();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Gj();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Gh();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Gh();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ea(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Gm();
    }

    public /* synthetic */ Object clone() {
        return this.Gm();
    }
}

