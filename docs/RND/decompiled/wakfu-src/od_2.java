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
 * Renamed from od
 */
public final class od_2
extends GeneratedMessageV3.Builder<od_2>
implements oe_2 {
    private int an;
    private List<ny_2> Qk = Collections.emptyList();
    private RepeatedFieldBuilderV3<ny_2, oa_2, of_2> Qn;

    public static final Descriptors.Descriptor aut() {
        return nx_2.PG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PH.ensureFieldAccessorsInitialized(ob_2.class, od_2.class);
    }

    od_2() {
        this.D();
    }

    od_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ob_2.ju()) {
            this.auC();
        }
    }

    public od_2 auu() {
        super.clear();
        if (this.Qn == null) {
            this.Qk = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.Qn.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nx_2.PG;
    }

    public ob_2 aus() {
        return ob_2.aur();
    }

    public ob_2 auv() {
        ob_2 ob_22 = this.auw();
        if (!ob_22.isInitialized()) {
            throw od_2.newUninitializedMessageException((Message)ob_22);
        }
        return ob_22;
    }

    public ob_2 auw() {
        ob_2 ob_22 = new ob_2(this);
        int n = this.an;
        if (this.Qn == null) {
            if ((this.an & 1) != 0) {
                this.Qk = Collections.unmodifiableList(this.Qk);
                this.an &= 0xFFFFFFFE;
            }
            ob_22.Qk = this.Qk;
        } else {
            ob_22.Qk = this.Qn.build();
        }
        this.onBuilt();
        return ob_22;
    }

    public od_2 auxx() {
        return (od_2)super.clone();
    }

    public od_2 fA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (od_2)super.setField(fieldDescriptor, object);
    }

    public od_2 cn(Descriptors.FieldDescriptor fieldDescriptor) {
        return (od_2)super.clearField(fieldDescriptor);
    }

    public od_2 cn(Descriptors.OneofDescriptor oneofDescriptor) {
        return (od_2)super.clearOneof(oneofDescriptor);
    }

    public od_2 cn(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (od_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public od_2 fB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (od_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public od_2 cn(Message message) {
        if (message instanceof ob_2) {
            return this.c((ob_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public od_2 c(ob_2 ob_22) {
        if (ob_22 == ob_2.aur()) {
            return this;
        }
        if (this.Qn == null) {
            if (!ob_22.Qk.isEmpty()) {
                if (this.Qk.isEmpty()) {
                    this.Qk = ob_22.Qk;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.auy();
                    this.Qk.addAll(ob_22.Qk);
                }
                this.onChanged();
            }
        } else if (!ob_22.Qk.isEmpty()) {
            if (this.Qn.isEmpty()) {
                this.Qn.dispose();
                this.Qn = null;
                this.Qk = ob_22.Qk;
                this.an &= 0xFFFFFFFE;
                this.Qn = ob_2.Y() ? this.auC() : null;
            } else {
                this.Qn.addAllMessages(ob_22.Qk);
            }
        }
        this.fB(ob_2.b(ob_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.aun(); ++i) {
            if (this.jH(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public od_2 iP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ob_2 ob_22 = null;
        try {
            ob_22 = (ob_2)ob_2.Qm.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ob_22 = (ob_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ob_22 != null) {
                this.c(ob_22);
            }
        }
        return this;
    }

    private void auy() {
        if ((this.an & 1) == 0) {
            this.Qk = new ArrayList<ny_2>(this.Qk);
            this.an |= 1;
        }
    }

    @Override
    public List<ny_2> aul() {
        if (this.Qn == null) {
            return Collections.unmodifiableList(this.Qk);
        }
        return this.Qn.getMessageList();
    }

    @Override
    public int aun() {
        if (this.Qn == null) {
            return this.Qk.size();
        }
        return this.Qn.getCount();
    }

    @Override
    public ny_2 jH(int n) {
        if (this.Qn == null) {
            return this.Qk.get(n);
        }
        return (ny_2)this.Qn.getMessage(n);
    }

    public od_2 a(int n, ny_2 ny_22) {
        if (this.Qn == null) {
            if (ny_22 == null) {
                throw new NullPointerException();
            }
            this.auy();
            this.Qk.set(n, ny_22);
            this.onChanged();
        } else {
            this.Qn.setMessage(n, (AbstractMessage)ny_22);
        }
        return this;
    }

    public od_2 a(int n, oa_2 oa_22) {
        if (this.Qn == null) {
            this.auy();
            this.Qk.set(n, oa_22.atR());
            this.onChanged();
        } else {
            this.Qn.setMessage(n, (AbstractMessage)oa_22.atR());
        }
        return this;
    }

    public od_2 d(ny_2 ny_22) {
        if (this.Qn == null) {
            if (ny_22 == null) {
                throw new NullPointerException();
            }
            this.auy();
            this.Qk.add(ny_22);
            this.onChanged();
        } else {
            this.Qn.addMessage((AbstractMessage)ny_22);
        }
        return this;
    }

    public od_2 b(int n, ny_2 ny_22) {
        if (this.Qn == null) {
            if (ny_22 == null) {
                throw new NullPointerException();
            }
            this.auy();
            this.Qk.add(n, ny_22);
            this.onChanged();
        } else {
            this.Qn.addMessage(n, (AbstractMessage)ny_22);
        }
        return this;
    }

    public od_2 a(oa_2 oa_22) {
        if (this.Qn == null) {
            this.auy();
            this.Qk.add(oa_22.atR());
            this.onChanged();
        } else {
            this.Qn.addMessage((AbstractMessage)oa_22.atR());
        }
        return this;
    }

    public od_2 b(int n, oa_2 oa_22) {
        if (this.Qn == null) {
            this.auy();
            this.Qk.add(n, oa_22.atR());
            this.onChanged();
        } else {
            this.Qn.addMessage(n, (AbstractMessage)oa_22.atR());
        }
        return this;
    }

    public od_2 an(Iterable<? extends ny_2> iterable) {
        if (this.Qn == null) {
            this.auy();
            AbstractMessageLite.Builder.addAll(iterable, this.Qk);
            this.onChanged();
        } else {
            this.Qn.addAllMessages(iterable);
        }
        return this;
    }

    public od_2 auz() {
        if (this.Qn == null) {
            this.Qk = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.Qn.clear();
        }
        return this;
    }

    public od_2 jJ(int n) {
        if (this.Qn == null) {
            this.auy();
            this.Qk.remove(n);
            this.onChanged();
        } else {
            this.Qn.remove(n);
        }
        return this;
    }

    public oa_2 jK(int n) {
        return (oa_2)this.auC().getBuilder(n);
    }

    @Override
    public of_2 jI(int n) {
        if (this.Qn == null) {
            return this.Qk.get(n);
        }
        return (of_2)this.Qn.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends of_2> aum() {
        if (this.Qn != null) {
            return this.Qn.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Qk);
    }

    public oa_2 auA() {
        return (oa_2)this.auC().addBuilder((AbstractMessage)ny_2.atN());
    }

    public oa_2 jL(int n) {
        return (oa_2)this.auC().addBuilder(n, (AbstractMessage)ny_2.atN());
    }

    public List<oa_2> auB() {
        return this.auC().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ny_2, oa_2, of_2> auC() {
        if (this.Qn == null) {
            this.Qn = new RepeatedFieldBuilderV3(this.Qk, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Qk = null;
        }
        return this.Qn;
    }

    public final od_2 fA(UnknownFieldSet unknownFieldSet) {
        return (od_2)super.setUnknownFields(unknownFieldSet);
    }

    public final od_2 fB(UnknownFieldSet unknownFieldSet) {
        return (od_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cn(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cn(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cn(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.auu();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.auxx();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cn(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.auu();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cn(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.auxx();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cn(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cn(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cn(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.auxx();
    }

    public /* synthetic */ Message buildPartial() {
        return this.auw();
    }

    public /* synthetic */ Message build() {
        return this.auv();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cn(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.auu();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.auxx();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.auw();
    }

    public /* synthetic */ MessageLite build() {
        return this.auv();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.auu();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aus();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aus();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iP(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.auxx();
    }

    public /* synthetic */ Object clone() {
        return this.auxx();
    }
}

