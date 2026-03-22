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

public final class AP
extends GeneratedMessageV3.Builder<AP>
implements AW {
    private int an;
    private List<AS> apH = Collections.emptyList();
    private RepeatedFieldBuilderV3<AS, AU, AV> apK;

    public static final Descriptors.Descriptor aES() {
        return zS.apv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apw.ensureFieldAccessorsInitialized(an_0.class, AP.class);
    }

    AP() {
        this.D();
    }

    AP(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (an_0.ar()) {
            this.aBi();
        }
    }

    public AP aET() {
        super.clear();
        if (this.apK == null) {
            this.apH = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.apK.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apv;
    }

    public an_0 aER() {
        return an_0.aEQ();
    }

    public an_0 aEU() {
        an_0 an_02 = this.aEV();
        if (!an_02.isInitialized()) {
            throw AP.newUninitializedMessageException((Message)an_02);
        }
        return an_02;
    }

    public an_0 aEV() {
        an_0 an_02 = new an_0(this);
        int n = this.an;
        if (this.apK == null) {
            if ((this.an & 1) != 0) {
                this.apH = Collections.unmodifiableList(this.apH);
                this.an &= 0xFFFFFFFE;
            }
            an_02.apH = this.apH;
        } else {
            an_02.apH = this.apK.build();
        }
        this.onBuilt();
        return an_02;
    }

    public AP aEW() {
        return (AP)super.clone();
    }

    public AP gE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AP)super.setField(fieldDescriptor, object);
    }

    public AP cP(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AP)super.clearField(fieldDescriptor);
    }

    public AP cP(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AP)super.clearOneof(oneofDescriptor);
    }

    public AP cP(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AP)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AP gF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AP)super.addRepeatedField(fieldDescriptor, object);
    }

    public AP cP(Message message) {
        if (message instanceof an_0) {
            return this.e((an_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AP e(an_0 an_02) {
        if (an_02 == an_0.aEQ()) {
            return this;
        }
        if (this.apK == null) {
            if (!an_02.apH.isEmpty()) {
                if (this.apH.isEmpty()) {
                    this.apH = an_02.apH;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.aBe();
                    this.apH.addAll(an_02.apH);
                }
                this.onChanged();
            }
        } else if (!an_02.apH.isEmpty()) {
            if (this.apK.isEmpty()) {
                this.apK.dispose();
                this.apK = null;
                this.apH = an_02.apH;
                this.an &= 0xFFFFFFFE;
                this.apK = an_0.afu() ? this.aBi() : null;
            } else {
                this.apK.addAllMessages(an_02.apH);
            }
        }
        this.gF(an_0.d(an_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.aAT(); ++i) {
            if (this.lp(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public AP kv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        an_0 an_02 = null;
        try {
            an_02 = (an_0)an_0.aro.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            an_02 = (an_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (an_02 != null) {
                this.e(an_02);
            }
        }
        return this;
    }

    private void aBe() {
        if ((this.an & 1) == 0) {
            this.apH = new ArrayList<AS>(this.apH);
            this.an |= 1;
        }
    }

    @Override
    public List<AS> aAR() {
        if (this.apK == null) {
            return Collections.unmodifiableList(this.apH);
        }
        return this.apK.getMessageList();
    }

    @Override
    public int aAT() {
        if (this.apK == null) {
            return this.apH.size();
        }
        return this.apK.getCount();
    }

    @Override
    public AS lp(int n) {
        if (this.apK == null) {
            return this.apH.get(n);
        }
        return (AS)this.apK.getMessage(n);
    }

    public AP a(int n, AS aS) {
        if (this.apK == null) {
            if (aS == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.set(n, aS);
            this.onChanged();
        } else {
            this.apK.setMessage(n, (AbstractMessage)aS);
        }
        return this;
    }

    public AP a(int n, AU aU) {
        if (this.apK == null) {
            this.aBe();
            this.apH.set(n, aU.aFs());
            this.onChanged();
        } else {
            this.apK.setMessage(n, (AbstractMessage)aU.aFs());
        }
        return this;
    }

    public AP e(AS aS) {
        if (this.apK == null) {
            if (aS == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.add(aS);
            this.onChanged();
        } else {
            this.apK.addMessage((AbstractMessage)aS);
        }
        return this;
    }

    public AP b(int n, AS aS) {
        if (this.apK == null) {
            if (aS == null) {
                throw new NullPointerException();
            }
            this.aBe();
            this.apH.add(n, aS);
            this.onChanged();
        } else {
            this.apK.addMessage(n, (AbstractMessage)aS);
        }
        return this;
    }

    public AP c(AU aU) {
        if (this.apK == null) {
            this.aBe();
            this.apH.add(aU.aFs());
            this.onChanged();
        } else {
            this.apK.addMessage((AbstractMessage)aU.aFs());
        }
        return this;
    }

    public AP b(int n, AU aU) {
        if (this.apK == null) {
            this.aBe();
            this.apH.add(n, aU.aFs());
            this.onChanged();
        } else {
            this.apK.addMessage(n, (AbstractMessage)aU.aFs());
        }
        return this;
    }

    public AP aD(Iterable<? extends AS> iterable) {
        if (this.apK == null) {
            this.aBe();
            AbstractMessageLite.Builder.addAll(iterable, this.apH);
            this.onChanged();
        } else {
            this.apK.addAllMessages(iterable);
        }
        return this;
    }

    public AP aEX() {
        if (this.apK == null) {
            this.apH = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.apK.clear();
        }
        return this;
    }

    public AP lr(int n) {
        if (this.apK == null) {
            this.aBe();
            this.apH.remove(n);
            this.onChanged();
        } else {
            this.apK.remove(n);
        }
        return this;
    }

    public AU ls(int n) {
        return (AU)this.aBi().getBuilder(n);
    }

    @Override
    public AV lq(int n) {
        if (this.apK == null) {
            return this.apH.get(n);
        }
        return (AV)this.apK.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends AV> aAS() {
        if (this.apK != null) {
            return this.apK.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.apH);
    }

    public AU aEY() {
        return (AU)this.aBi().addBuilder((AbstractMessage)AS.aFn());
    }

    public AU lt(int n) {
        return (AU)this.aBi().addBuilder(n, (AbstractMessage)AS.aFn());
    }

    public List<AU> aBh() {
        return this.aBi().getBuilderList();
    }

    private RepeatedFieldBuilderV3<AS, AU, AV> aBi() {
        if (this.apK == null) {
            this.apK = new RepeatedFieldBuilderV3(this.apH, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.apH = null;
        }
        return this.apK;
    }

    public final AP gE(UnknownFieldSet unknownFieldSet) {
        return (AP)super.setUnknownFields(unknownFieldSet);
    }

    public final AP gF(UnknownFieldSet unknownFieldSet) {
        return (AP)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cP(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cP(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cP(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aET();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aEW();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cP(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aET();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cP(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aEW();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cP(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cP(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cP(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aEW();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aEV();
    }

    public /* synthetic */ Message build() {
        return this.aEU();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cP(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aET();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aEW();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aEV();
    }

    public /* synthetic */ MessageLite build() {
        return this.aEU();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aET();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aER();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aER();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aEW();
    }

    public /* synthetic */ Object clone() {
        return this.aEW();
    }
}

