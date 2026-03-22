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
 * Renamed from cj
 */
public final class cj_1
extends GeneratedMessageV3.Builder<cj_1>
implements ck_1 {
    private int an;
    private long fG;
    private List<az_2> hR = Collections.emptyList();
    private RepeatedFieldBuilderV3<az_2, bb_1, bd_1> hU;

    public static final Descriptors.Descriptor lS() {
        return ae_1.eY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eZ.ensureFieldAccessorsInitialized(ch_2.class, cj_1.class);
    }

    cj_1() {
        this.D();
    }

    cj_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ch_2.lQ()) {
            this.mc();
        }
    }

    public cj_1 lT() {
        super.clear();
        this.fG = 0L;
        if (this.hU == null) {
            this.hR = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.hU.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eY;
    }

    public ch_2 lP() {
        return ch_2.lO();
    }

    public ch_2 lU() {
        ch_2 ch_22 = this.lV();
        if (!ch_22.isInitialized()) {
            throw cj_1.newUninitializedMessageException((Message)ch_22);
        }
        return ch_22;
    }

    public ch_2 lV() {
        ch_2 ch_22 = new ch_2(this);
        int n = this.an;
        ch_22.fG = this.fG;
        if (this.hU == null) {
            if ((this.an & 1) != 0) {
                this.hR = Collections.unmodifiableList(this.hR);
                this.an &= 0xFFFFFFFE;
            }
            ch_22.hR = this.hR;
        } else {
            ch_22.hR = this.hU.build();
        }
        this.onBuilt();
        return ch_22;
    }

    public cj_1 lW() {
        return (cj_1)super.clone();
    }

    public cj_1 au(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cj_1)super.setField(fieldDescriptor, object);
    }

    public cj_1 K(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cj_1)super.clearField(fieldDescriptor);
    }

    public cj_1 K(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cj_1)super.clearOneof(oneofDescriptor);
    }

    public cj_1 K(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cj_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cj_1 av(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cj_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cj_1 K(Message message) {
        if (message instanceof ch_2) {
            return this.c((ch_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cj_1 c(ch_2 ch_22) {
        if (ch_22 == ch_2.lO()) {
            return this;
        }
        if (ch_22.fD() != 0L) {
            this.A(ch_22.fD());
        }
        if (this.hU == null) {
            if (!ch_22.hR.isEmpty()) {
                if (this.hR.isEmpty()) {
                    this.hR = ch_22.hR;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.lY();
                    this.hR.addAll(ch_22.hR);
                }
                this.onChanged();
            }
        } else if (!ch_22.hR.isEmpty()) {
            if (this.hU.isEmpty()) {
                this.hU.dispose();
                this.hU = null;
                this.hR = ch_22.hR;
                this.an &= 0xFFFFFFFE;
                this.hU = ch_2.lR() ? this.mc() : null;
            } else {
                this.hU.addAllMessages(ch_22.hR);
            }
        }
        this.av(ch_2.b(ch_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cj_1 bg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ch_2 ch_22 = null;
        try {
            ch_22 = (ch_2)ch_2.hT.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ch_22 = (ch_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ch_22 != null) {
                this.c(ch_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cj_1 A(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cj_1 lX() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    private void lY() {
        if ((this.an & 1) == 0) {
            this.hR = new ArrayList<az_2>(this.hR);
            this.an |= 1;
        }
    }

    @Override
    public List<az_2> lI() {
        if (this.hU == null) {
            return Collections.unmodifiableList(this.hR);
        }
        return this.hU.getMessageList();
    }

    @Override
    public int lK() {
        if (this.hU == null) {
            return this.hR.size();
        }
        return this.hU.getCount();
    }

    @Override
    public az_2 R(int n) {
        if (this.hU == null) {
            return this.hR.get(n);
        }
        return (az_2)this.hU.getMessage(n);
    }

    public cj_1 a(int n, az_2 az_22) {
        if (this.hU == null) {
            if (az_22 == null) {
                throw new NullPointerException();
            }
            this.lY();
            this.hR.set(n, az_22);
            this.onChanged();
        } else {
            this.hU.setMessage(n, (AbstractMessage)az_22);
        }
        return this;
    }

    public cj_1 a(int n, bb_1 bb_12) {
        if (this.hU == null) {
            this.lY();
            this.hR.set(n, bb_12.hs());
            this.onChanged();
        } else {
            this.hU.setMessage(n, (AbstractMessage)bb_12.hs());
        }
        return this;
    }

    public cj_1 f(az_2 az_22) {
        if (this.hU == null) {
            if (az_22 == null) {
                throw new NullPointerException();
            }
            this.lY();
            this.hR.add(az_22);
            this.onChanged();
        } else {
            this.hU.addMessage((AbstractMessage)az_22);
        }
        return this;
    }

    public cj_1 b(int n, az_2 az_22) {
        if (this.hU == null) {
            if (az_22 == null) {
                throw new NullPointerException();
            }
            this.lY();
            this.hR.add(n, az_22);
            this.onChanged();
        } else {
            this.hU.addMessage(n, (AbstractMessage)az_22);
        }
        return this;
    }

    public cj_1 b(bb_1 bb_12) {
        if (this.hU == null) {
            this.lY();
            this.hR.add(bb_12.hs());
            this.onChanged();
        } else {
            this.hU.addMessage((AbstractMessage)bb_12.hs());
        }
        return this;
    }

    public cj_1 b(int n, bb_1 bb_12) {
        if (this.hU == null) {
            this.lY();
            this.hR.add(n, bb_12.hs());
            this.onChanged();
        } else {
            this.hU.addMessage(n, (AbstractMessage)bb_12.hs());
        }
        return this;
    }

    public cj_1 f(Iterable<? extends az_2> iterable) {
        if (this.hU == null) {
            this.lY();
            AbstractMessageLite.Builder.addAll(iterable, this.hR);
            this.onChanged();
        } else {
            this.hU.addAllMessages(iterable);
        }
        return this;
    }

    public cj_1 lZ() {
        if (this.hU == null) {
            this.hR = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.hU.clear();
        }
        return this;
    }

    public cj_1 T(int n) {
        if (this.hU == null) {
            this.lY();
            this.hR.remove(n);
            this.onChanged();
        } else {
            this.hU.remove(n);
        }
        return this;
    }

    public bb_1 U(int n) {
        return (bb_1)this.mc().getBuilder(n);
    }

    @Override
    public bd_1 S(int n) {
        if (this.hU == null) {
            return this.hR.get(n);
        }
        return (bd_1)this.hU.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bd_1> lJ() {
        if (this.hU != null) {
            return this.hU.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.hR);
    }

    public bb_1 ma() {
        return (bb_1)this.mc().addBuilder((AbstractMessage)az_2.hm());
    }

    public bb_1 V(int n) {
        return (bb_1)this.mc().addBuilder(n, (AbstractMessage)az_2.hm());
    }

    public List<bb_1> mb() {
        return this.mc().getBuilderList();
    }

    private RepeatedFieldBuilderV3<az_2, bb_1, bd_1> mc() {
        if (this.hU == null) {
            this.hU = new RepeatedFieldBuilderV3(this.hR, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.hR = null;
        }
        return this.hU;
    }

    public final cj_1 au(UnknownFieldSet unknownFieldSet) {
        return (cj_1)super.setUnknownFields(unknownFieldSet);
    }

    public final cj_1 av(UnknownFieldSet unknownFieldSet) {
        return (cj_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.av(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.au(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.av(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.K(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.K(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.K(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.au(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.lT();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.lW();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.av(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.K(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.lT();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.K(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.lW();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.av(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.au(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.av(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.K(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.K(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.K(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.au(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.lW();
    }

    public /* synthetic */ Message buildPartial() {
        return this.lV();
    }

    public /* synthetic */ Message build() {
        return this.lU();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.K(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.lT();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.lW();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.lV();
    }

    public /* synthetic */ MessageLite build() {
        return this.lU();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.lT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.lP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.lP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bg(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.lW();
    }

    public /* synthetic */ Object clone() {
        return this.lW();
    }
}

